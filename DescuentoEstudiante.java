/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modularidadejer3;

/**
 *
 * @author User
 */
public class DescuentoEstudiante implements Descuento {

    @Override
    public double descuento(double montoOrg) {
        
     // Aplica un 20% de descuento 
return montoOrg * 0.80;
    }
}
