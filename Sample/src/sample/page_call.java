/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sample;

/**
 *
 * @author Brandon
 */
public class page_call {
    public void login(){
        new login_page_frame().setVisible(true);
    }
    public void build(){
        new build_page_frame().setVisible(true);
    }
    public void reg(){
        new reg_page_frame().setVisible(true);
    }
}
