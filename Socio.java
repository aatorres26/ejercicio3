/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modularidadejer3;

/**
 *
 * @author User
 */
public  class Socio {
     private String nombre;
     private int tipoPlan;

    public Socio() {
    }

    public Socio(String nombre, int tipoPlan) {
        this.nombre = nombre;
        this.tipoPlan = tipoPlan;
    }

     
     
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTipoPlan() {
        return tipoPlan;
    }

    public void setTipoPlan(int tipoPlan) {
        this.tipoPlan = tipoPlan;
    }

    
  
}
