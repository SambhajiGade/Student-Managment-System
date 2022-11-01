package com.student.manage;


import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionProvidersam {

     static Connection con;

    public static Connection CreateC(){

        try {

            // Load driver :

            Class.forName("com.mysql.cj.jdbc.Driver");

            System.out.println("class loaded------------------------------------------------------------------------");
            String user = "root";
            String password = "2002";
            String url = "jdbc:mysql://localhost:3306/student_manage?autoReconnection=true&useSSL=false";
            System.out.println("set strings------------------------------------------------------------------------------");
            con = DriverManager.getConnection(url,user,password);


        }
        catch (Exception e){
            e.printStackTrace();
            System.out.println("Error in connectton-----------------------------------------------------------------");
        }


        return con;
    }
}

