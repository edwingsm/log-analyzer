package com.credi.suise.assignement.adapter;

import com.credi.suise.assignement.doamin.DBConnector;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnectorAdapter implements DBConnector{
    @Override
    public void connect() {
        try  {
            Connection c = DriverManager.getConnection("jdbc:hsqldb:file:/opt/db/testdb", "SA", "");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
