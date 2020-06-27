/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.db_demo.Database;

/**
 *
 * @author JASON
 */
public class EmployeeModel {
    
    private int id, status;
    private String first_name, last_name;

    public EmployeeModel(int id, int status, String first_name, String last_name) {
        this.id = id;
        this.status = status;
        this.first_name = first_name;
        this.last_name = last_name;
    }

    public EmployeeModel(int status, String first_name, String last_name) {
        this.status = status;
        this.first_name = first_name;
        this.last_name = last_name;
    }
    
    
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }
    
    
    
}
