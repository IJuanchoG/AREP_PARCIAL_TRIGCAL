package edu.eci.arep.sparkwebapp;


import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import spark.Request;
import spark.Response;

import static spark.Spark.get;
import static spark.Spark.port;

/**
 * The type Spark web app.
 */
public class SparkWebApp {


    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        port(getPort());

        get("/datos", SparkWebApp::inputDataPage);

    }



    /**
     * Input Data on the server
     * @param req request on the server
     * @param res response on the server
     * @return String HTML info
     */
    private static String inputDataPage(Request req, Response res) {
        String data = req.queryParams("rad");
        String function = req.queryParams("func");

        HttpResponse<String> jsonResponse
                = null;
        try {
            jsonResponse = Unirest.get("https://ancient-chamber-26329.herokuapp.com/getResults?rad="+data+"&func="+function).asString();
        } catch (UnirestException e) {
            e.printStackTrace();
        }
        assert jsonResponse != null;
        return jsonResponse.getBody();
    }



    /**
     * Gets port.
     *
     * @return the port
     */
    public static int getPort() {
        if (System.getenv("PORT") != null) {
            return Integer.parseInt(System.getenv("PORT"));
        }
        return 4567; //returns default port if heroku-port isn't set (i.e. on localhost)
    }


}