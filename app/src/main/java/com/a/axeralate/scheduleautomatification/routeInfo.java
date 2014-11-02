package com.a.axeralate.scheduleautomatification;

/**
 * Created by th on 2014/11/02.
 */
public class routeInfo {
    String routeName;
    String charge;
    String plannedTime;


    String name;
    String depatureTime;
    String arrivalTime;

    // コンストラクタ
    routeInfo() {
        this.name = null;
        this.depatureTime = null;
        this.arrivalTime = null;
    }

    // セッター
    void depatureSet(String time) {
        this.depatureTime = time;
    }

    void arrivalSet(String time) {
        this.arrivalTime = time;
    }

    // ゲッター
    String depatureGet() {
        return this.depatureTime;
    }

    String arrivalGet() {
        return this.arrivalTime;
    }

//station a = new station()
}