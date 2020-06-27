/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.db_demo.Database;

import java.sql.*;
/**
 *
 * @author JASON
 */
public class CRUD {
    
    //database config
    protected String database_name = "employeedb";
    protected String database_user = "root";
    protected String database_pass = "";
    
    public Connection conn;
    
    public CRUD(){
        //create a connection on instance
        try {
             Class.forName("com.mysql.jdbc.Driver");
             conn = DriverManager.getConnection("jdbc:mysql://localhost/"+database_name+"?serverTimezone=UTC", database_user, database_pass);
        } catch(Exception ex){
             ex.printStackTrace();
        }
    }
    
    
    
}
