package com.a.axeralate.scheduleautomatification;

import android.os.AsyncTask;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by th on 2014/11/02.
 */
public class GetDirectionTask extends AsyncTask<String,Void,String> {
    private OnImageGetFinishListener mListener;

    public GetDirectionTask(OnImageGetFinishListener listener) {
        super();
        mListener = listener;
    }

    @Override
    protected void onPreExecute() {
        super.onPreExecute();

        // タスク開始前に呼ばれます
    }

    @Override
    protected String doInBackground(String... params) {

        InputStream stream;
       String str = null;

        try {
            stream = new URL(params[0]).openStream();
            /*
            bitmap = BitmapFactory.decodeStream(stream);
            */
            stream.close();

        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return str;
    }
/*
    @Override
    protected void onPostExecute(Bitmap bitmap) {
        super.onPostExecute(bitmap);

        // タスク終了後に呼ばれます

        mListener.onImageGetFinish(bitmap);
        mListener = null;
    }
*/
    public static interface OnImageGetFinishListener {
        public void onImageGetFinish(Bitmap bitmap);
    }
}
