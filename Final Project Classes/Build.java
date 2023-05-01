/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.classes;

/**
 *
 * @author Justin
 */
public class Build {
    
    Item CPU;
    Item GPU;
    Item Motherboard;
    Item RAM;
    
    public Build(Item cpu, Item gpu, Item mobo, Item ram){
        CPU = cpu;
        GPU = gpu;
        Motherboard = mobo;
        RAM = ram;
    
    }
    
    //GETTERS
    
    public Item getCPU(){
        return CPU;
    }
    
    public Item getGPU(){
        return GPU;
    }
    
    public Item getMobo(){
        return Motherboard;
    }
    
    public Item getRAM(){
        return RAM;
    }
    
    
    //SETTERS
    
    public void setCPU(Item cpu){
        CPU = cpu;
    }
    
    public void setGPU(Item gpu){
        GPU = gpu;
    }
    
    public void setMOBO(Item mobo){
        Motherboard = mobo;
    }
    
    public void setRAM(Item ram){
        RAM = ram;
    }
    
}
