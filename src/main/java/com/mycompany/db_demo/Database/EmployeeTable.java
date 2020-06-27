/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.db_demo.Database;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author JASON
 */
public class EmployeeTable extends CRUD {
    
    
    public ArrayList<EmployeeModel> getEmployeeList(){
        ArrayList<EmployeeModel> list = new ArrayList<>();
        try{
            ResultSet rs = conn.createStatement().executeQuery("SELECT * FROM employee");
            //while has row, loop again
            while(rs.next()){
                list.add(new EmployeeModel(
                        rs.getInt("id"),
                        rs.getInt("status"),
                        rs.getString("first_name"),
                        rs.getString("last_name")
                ));
            }
        } catch(Exception ex) {
                ex.printStackTrace();
        }
        
        return list;
    }
    
    public void addEmployee(EmployeeModel model){
        try {
            Statement stmt = conn.createStatement();
            stmt.executeUpdate("INSERT INTO employee (first_name, last_name, status) VALUES ('"+model.getFirst_name()+"','"+model.getLast_name()+"','"+model.getStatus()+"')");
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }
    
    public void updateEmployee(EmployeeModel model){
        try {
            Statement stmt = conn.createStatement();
            stmt.executeUpdate("UPDATE employee SET first_name = '"+model.getFirst_name()+"', last_name = '"+model.getLast_name()+"', status = '"+model.getStatus()+"' WHERE id='"+model.getId()+"'");
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }
    
    public void deleteEmployee(int id){
        try {
            Statement stmt = conn.createStatement();
            stmt.executeUpdate("DELETE FROM employee WHERE id='"+id+"'");
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }
}
