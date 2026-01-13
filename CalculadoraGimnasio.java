/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modularidadejer3;

/**
 *
 * @author User
 */
public class CalculadoraGimnasio extends Socio implements CalculadoraCuota{

    @Override
    public double obtenerPrecioBase(int tipoPlan) {
    return (tipoPlan == 1) ? 30.0 : 60.0;
        }
    
}
