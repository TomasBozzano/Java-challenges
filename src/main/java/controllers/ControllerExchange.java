package controllers;

import com.google.gson.Gson;
import models.Connection;
import models.Exchange;

public class ControllerExchange {
    private Connection connection;
    private Exchange exchange;

    public ControllerExchange() {
        this.connection = new Connection();
        this.exchange = new Exchange();
    }

    public Exchange getExchangeConnection(){
        String jsonResponse = this.connection.getConnection();
        Gson gson = new Gson();
        return gson.fromJson(jsonResponse, Exchange.class);
    }

    public Connection getConnection() {
        return connection;
    }

    public void setConnection(Connection connection) {
        this.connection = connection;
    }

    public Exchange getExchange() {
        return exchange;
    }

    public void setExchange(Exchange exchange) {
        this.exchange = exchange;
    }
}
