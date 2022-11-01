package com.student.manage;

import com.mysql.cj.jdbc.ConnectionImpl;
import com.mysql.cj.jdbc.result.ResultSetImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class Student_Operations {

    public static boolean InsertStudent(student sam){

        boolean b = false;

        try {


            Connection con = ConnectionProvidersam.CreateC();

            String q = "insert into student(sname,sphone,scity) value(?,?,?)";

            PreparedStatement ps = con.prepareStatement(q);

            ps.setString(1,sam.getName());
            ps.setString(2,sam.getPhone());
            ps.setString(3,sam.getCity());

            ps.executeUpdate();

            b = true;

        }
        catch (Exception e){
            e.printStackTrace();
        }


        return b;
    }


    public static boolean DeleteStudent(int userid){
        boolean f = false;

        try {

            Connection con = ConnectionProvidersam.CreateC();

            String q = "delete from student where sid=?";

            PreparedStatement ps = con.prepareStatement(q);

            ps.setString(1, String.valueOf(userid));

            ps.executeUpdate();

            f = true;

        }
        catch (Exception e){
            e.printStackTrace();
        }



        return f;
    }

    public static void ShowAll(){

        try {
            System.out.println("inside show all--------------------------------------------------------------------------------");
        Connection con = ConnectionProvidersam.CreateC();
            System.out.println("get con =======================================================================================");
        String q = "select * from student;";

            Statement s = con.createStatement();

            ResultSet Rset = s.executeQuery(q);

            while (Rset.next()){

                int id = Rset.getInt(1);
                String name = Rset.getString(2);
                String ph = Rset.getString(3);
                String city = Rset.getString(4);

                System.out.println("ID : " + id);
                System.out.println("NAME  : " + name);
                System.out.println("Phone Number : " + ph);
                System.out.println("City  : " + city);
                System.out.println("+++++++++++++++++++++++++++++++++");

            }

        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
