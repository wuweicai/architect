package com.ysx.architect.test.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class testJdbc {

    public static void main(String args[])
    {

        String url = "jdbc:mysql://localhost:3306/mysql?serverTimezone=UTC";
        String driver = "com.mysql.cj.jdbc.Driver";
        try{
            Class.forName(driver);
        }catch(Exception e){
            System.out.println("无法加载驱动");
        }

        try {
            Connection con = DriverManager.getConnection(url,"root","CentOS@6.6");
            if(!con.isClosed())
                System.out.println("success");
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
