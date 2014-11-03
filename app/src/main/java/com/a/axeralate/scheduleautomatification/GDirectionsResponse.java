package com.a.axeralate.scheduleautomatification;

/**
 * Created by th on 2014/11/03.
 */
import java.util.List;

public class GDirectionsResponse {

    private String status;
    private List<GRoute> routes;

    public final String getStatus() {
        return status;
    }

    public int getRouteCount() {
        return routes.size();
    }

    public final GRoute getRoute(int index) {
        return routes.get(index);
    }

    public final String getOverviewPolyline(int routeIndex) {
        GRoute route = routes.get(routeIndex);
        GPolyline polyline = route.getOverviewPolyline();
        return polyline.getPoints();
    }

    public final List<GRoute> getRoutes() {
        return routes;
    }

    public class GRoute {
        private String summary;
        private List<GLeg> legs;
        private List<String> waypoint_order;
        private GPolyline overview_polyline;
        private GBounds bounds;
        private String copyrights;
        private List<String> warnings;

        public final String getSummary() {
            return summary;
        }
        public final List<GLeg> getLegs() {
            return legs;
        }
        public final List<String> getWaypointOrder() {
            return waypoint_order;
        }
        public final GPolyline getOverviewPolyline() {
            return overview_polyline;
        }
        public final GBounds getBounds() {
            return bounds;
        }
        public final String getCopyrights() {
            return copyrights;
        }
        public final List<String> getWarnings() {
            return warnings;
        }
    }
    public class GLeg {
        private List<GStep> steps;
        private GDistance distance;
        private GDuration duration;
        private GLocation start_location;
        private GLocation end_location;
        private String start_address;
        private String end_address;
        private GArrivalTime arrival_time;
        private GDepartureTime departure_time;

        public final List<GStep> getSteps() {
            return steps;
        }
        public final GDistance getDistance() {
            return distance;
        }
        public final GDuration getDuration() {
            return duration;
        }
        public final GLocation getStartLocation() {
            return start_location;
        }
        public final GLocation getEndLocation() {
            return end_location;
        }
        public final String getStartAddress() {
            return start_address;
        }
        public final String getEndAddress() {
            return end_address;
        }
        public final GArrivalTime  getArrivalTime(){ return arrival_time; }
        public final GDepartureTime getDepartureTime(){ return departure_time; }
    }
    public class GBounds {
        private GLocation southwest;
        private GLocation northeast;

        public final GLocation getSouthWest() {
            return southwest;
        }
        public final GLocation getNorthEast() {
            return northeast;
        }
    }
    public class GPolyline {
        private String points;
        private String levels;

        public final String getPoints() {
            return points;
        }

        public final String getLevels() {
            return levels;
        }
    }
    public class GStep {
        private String html_instructions;
        private GDistance distance;
        private GDuration duration;
        private GLocation start_location;
        private GLocation end_location;
        private GPolyline polyline;
        private String travel_mode;
    }
    public class GDistance {
        private int value;
        private String text;

        public final int getValue() {
            return value;
        }
        public final String getText() {
            return text;
        }
    }
    public class GArrivalTime{
        private int value;
        private String text;
        private String time_zone;

        public final int getValue(){ return value; }
        public final String getText(){ return  text; }
        public final String getTimeZone(){ return  time_zone; }
    }
    public class GDepartureTime{
        private int value;
        private String text;
        private String time_zone;

        public final int getValue(){ return value; }
        public final String getText(){ return  text; }
        public final String getTimeZone(){ return  time_zone; }
    }
    public class GDuration {
        private int value;
        private String text;

        public final int getValue() {
            return value;
        }
        public final String getText() {
            return text;
        }
    }
    public class GStatus {
        public static final String OK = "OK";
        public static final String NOT_FOUND = "NOT_FOUND";
        public static final String ZERO_RESULTS = "ZERO_RESULTS";
        public static final String MAX_WAYPOINTS_EXCEEDED = "MAX_WAYPOINTS_EXCEEDED";
        public static final String INVALID_REQUEST = "INVALID_REQUEST";
        public static final String OVER_QUERY_LIMIT = "OVER_QUERY_LIMIT";
        public static final String REQUEST_DENIED = "REQUEST_DENIED";
        public static final String UNKNOWN_ERROR = "UNKNOWN_ERROR";
    }
}

