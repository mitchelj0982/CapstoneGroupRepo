/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.classes;

/**
 *
 * @author Justin
 */
public class Item {
    
        String ID;
        String name;
        String type;
    
    
    public Item(String id, String n, String t ){
        ID = id;
        name = n;
        type = t;
    
    }
    
    //GETTERS
    
    public String getID(){
        return ID;
    }
    
    public String getName(){
        return name;
    }
    
    public String getType(){
        return type;
    }
    
    
    //SETTERS
    
    public void setID(String id){
        ID = id;
    }
    
    public void setName(String n){
        name = n;
    }
    
    public void setType(String t){
        type = t;
    }
    
    
    
    
    
    
    
}
