package com.a.axeralate.scheduleautomatification;

import android.os.AsyncTask;

import com.google.gson.Gson;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.InputMismatchException;

/**
 * Created by th on 2014/11/02.
 */
public class GetDirectionTask extends AsyncTask<String,Void,GDirectionsResponse> {
    private OnGetDirectionFinishListener mListener;

    public GetDirectionTask(OnGetDirectionFinishListener listener) {
        super();
        mListener = listener;
    }

    @Override
    protected void onPreExecute() {
        super.onPreExecute();

        // タスク開始前に呼ばれます
    }

    @Override
    protected GDirectionsResponse doInBackground(String... params) {

       InputStream stream;
       String str = null;

        try {
            stream = new URL(params[0]).openStream();
            str = convertString(stream);
            stream.close();

        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        Gson gson = new Gson();
        GDirectionsResponse result = gson.fromJson(str, GDirectionsResponse.class);
        return result;
    }

    public String convertString(InputStream stream)
        throws IOException {
            BufferedReader reader =
                    new BufferedReader(new InputStreamReader(stream, "UTF-8"));
            StringBuilder sb = new StringBuilder();
            String line;
            while (null != (line = reader.readLine())){
                sb.append(line);
            }
        return sb.toString();
    }

    @Override
    protected void onPostExecute(GDirectionsResponse result) {
        super.onPostExecute(result);

        // タスク終了後に呼ばれます

        mListener.onGetDirectionFinish(result);
        mListener = null;
    }

    public static interface OnGetDirectionFinishListener {
        public void onGetDirectionFinish(GDirectionsResponse result);
    }
}
