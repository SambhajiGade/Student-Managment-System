package com.student.manage;

import java.sql.*;

public class demo {

    public static void in(student sam){
        try {
        Connection con = ConnectionProvidersam.CreateC();

        String q = "insert into student(sname,sph,scity) value(?,?,?)";


            PreparedStatement ps = con.prepareStatement(q);

            ps.setString(1,sam.getName());
            ps.setString(2,sam.getPhone());
            ps.setString(3,sam.getCity());

            ps.executeUpdate();



        } catch (SQLException e) {
            e.printStackTrace();
        }


    }


}
