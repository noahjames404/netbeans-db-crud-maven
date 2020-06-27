/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.db_demo;

import com.mycompany.db_demo.Database.EmployeeTable;
import com.mycompany.db_demo.Database.EmployeeModel;
import java.util.ArrayList;

/**
 *
 * @author JASON
 */
public class Main {
    
    public static void main(String [] ara){
        
        EmployeeTable table = new EmployeeTable();
        
//        table.addEmployee(new EmployeeModel(
//                1,
//                "bob",
//                "martinez"
//        ));

        table.updateEmployee(new EmployeeModel(
                3,
                1,
                "aaron",
                "john"
        ));
        
        for(EmployeeModel data : table.getEmployeeList()){
            pln(data.getFirst_name());
            pln(data.getLast_name());
            pln(data.getStatus());
            pln(data.getId());
            pln("========");
        }
        
        
        
    }
    
    //method overloading
    public static void pln(String value){
        System.out.println(value);
    }
    
    public static void pln(int value){
        System.out.println(value);
    }
    
    
}
