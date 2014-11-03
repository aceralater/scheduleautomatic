package com.a.axeralate.scheduleautomatification;

/**
 * Created by th on 2014/11/02.
 */
public class Info{
    public class Station{
        String name;
        String departure_time;
        String arrival_time;

        // コンストラクタ
        Station(String name) {
            this.name = name;
            this.departure_time = null;
            this.arrival_time = null;
        }
        // セッター
        void departureSet(String time) {
            this.departure_time = time;
        }

        void arrivalSet(String time) {
            this.arrival_time = time;
        }

        // ゲッター
        String departureGet() {
            return this.departure_time;
        }

        String arrivalGet() {
            return this.arrival_time;
        }

    }
    public class Route{
        String departure_station;
        String route_name;
        String arrival_station;
        // コンストラクタ
        Route(String departure_station, String route_name, String arrival_station) {
            this.departure_station = departure_station;
            this.route_name = route_name;
            this.arrival_station = arrival_station;
        }

    }
    public void RouteList(Station departure, Station arrival, Station Route){


    }
}
/*
public class routeInfo {
    String routeName;
    String charge;
    String plannedTime;

    class station {


        String name;
        String depatureTime;
        String arrivalTime;

        // コンストラクタ
        station(String name) {
            this.name = null;
            this.depatureTime = null;
            this.arrivalTime = null;
        }

    }



//station a = new station()
}
*/