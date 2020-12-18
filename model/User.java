/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author brener
 */
public class User {
   
   int id;
   public String idBarber;
   public String full_name;
   public String email;
   public String phone;
   public String location;
   public String password;
   
   public String first_name;
   public String last_name;
   public String time;
   public String date;
    
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    } 
    
    public String getFull_name() { 
        return full_name;
    } 
    public void setFull_name(String full_name) { 
        this.full_name = full_name;
    } 
    
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    
    public String getPhone() { 
        return phone;
    } 
    public void setPhone(String phone) { 
        this.phone = phone;
    }    
    
    public String getLocation() {
        return location;
    }
    public void setLocation(String location) {
        this.location = location;
    }

    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    
    
    public String getFirst_Name() {
        return first_name;
    }
    public void setFirst_Name(String first_name) {
        this.first_name = first_name;
    }
    
    public String getLast_Name() {
        return last_name;
    }
    public void setLast_Name(String last_name) {
        this.last_name = last_name;
    }
    
    public String getTime() {
        return time;
    }
    public void setTime(String time) {
        this.time = time;
    }
    
    public String getDate() {
        return date;
    }
    public void setDate(String date) {
        this.date = date;
    }
    
   
}
