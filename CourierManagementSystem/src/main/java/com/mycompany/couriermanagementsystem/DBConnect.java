
package com.mycompany.couriermanagementsystem;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

public class DBConnect {
    
       String CourierInfo(long courier_id,String s_name,String s_address,long s_phone,String r_name, String r_address, long r_phone, String Updatable, String Status, long amount,long emp_id){
             try{
             Class.forName("com.mysql.jdbc.Driver");
             Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/empadb","root","");
             String query = "Insert into courier_details(courier_id,s_name,s_address,s_phone,r_name,r_address,r_phone,Updatable,Status,amount,emp_id)values(?,?,?,?,?,?,?,?,?,?,?)";
             PreparedStatement preparedStmt = conn.prepareStatement(query);
              preparedStmt.setLong(1, courier_id);
              preparedStmt.setString(2, s_name);
              preparedStmt.setString(3, s_address);
              preparedStmt.setLong(4, s_phone);
              preparedStmt.setString(5, r_name);
              preparedStmt.setString(6, r_address);
              preparedStmt.setLong(7, r_phone);
              preparedStmt.setString(8, Updatable);
              preparedStmt.setString(9, Status);
              preparedStmt.setLong(10, amount);
              preparedStmt.setLong(11, emp_id);
              
              
              int i = preparedStmt.executeUpdate();
              if(i>=1){
                  
                   
                  return "Data inserted successfukky";
              }
              else{
                  return "Data not inserted";
              }
        }
        catch(Exception e){
            
            return e.toString();
            
        }
        
       }
       String calculation(String destination, long charge_per_gram){
        
          try{
             Class.forName("com.mysql.jdbc.Driver");
             Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/empadb","root","");
             String query = "Insert into calculation(destination,charge_per_gram)values(?,?)";
             PreparedStatement preparedStmt = conn.prepareStatement(query);
              preparedStmt.setString(1, destination);
              preparedStmt.setLong(2, charge_per_gram);
              
              int i = preparedStmt.executeUpdate();
              if(i>=1){
                  
                   
                  return "Data inserted successfully";
              }
              else{
                  return "Data not inserted";
              }
        }
        catch(Exception e){
            
            return e.toString();
            
        }
    }
    String connectAndInsert(int Emp_id,String emp_name,String emp_address,long Emp_phone){
        try{
             Class.forName("com.mysql.jdbc.Driver");
             Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/empadb","root","");
             String query = "Insert into c_emp(Emp_id,emp_name,emp_address,Emp_phone)values(?,?,?,?)";
             PreparedStatement preparedStmt = conn.prepareStatement(query);
              preparedStmt.setInt(1, Emp_id);
              preparedStmt.setString(2, emp_name);
              preparedStmt.setString(3, emp_address);
              preparedStmt.setLong(4, Emp_phone);
              
              int i = preparedStmt.executeUpdate();
              if(i>=1){
                  
                   
                  return "Data inserted successfukky";
              }
              else{
                  return "Data not inserted";
              }
        }
        catch(Exception e){
            
            return e.toString();
            
        }
        
    }
    
    
}
