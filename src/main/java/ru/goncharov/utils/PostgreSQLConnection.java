package ru.goncharov.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class PostgreSQLConnection {
    //на windows без этого не работало
    final static String forWin = "?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
    private static Connection getConnection(String hostName, String dbName, String userName, String password){
        Connection connection = null;
        try {
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException e){
            System.err.println("Error:Driver hasn't been loaded");
            e.printStackTrace();
        }
        String URL = "jdbc:postgresql://" + hostName +":5432/" + dbName;// + forWin;
        try {
            connection = DriverManager.getConnection(URL, userName, password);
        } catch (SQLException e){
            System.err.println("Error: get connection error");
            e.printStackTrace();
        }
        return connection;
    }
    public static Connection getConnection(){
        return getConnection("localhost","postgres","postgres","postgres");
    }
    public static void closeConnection(Connection connection){
        try{
            connection.close();
        } catch (SQLException e ){
            System.err.println("Error: close connection");
            e.printStackTrace();
        }
    }
    public static void rollback(Connection connection){
        try{
            connection.rollback();
        } catch (SQLException e ){
            System.err.println("Error: rollback connection");
            e.printStackTrace();
        }
    }
}
