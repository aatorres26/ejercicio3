/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modularidadejer3;

/**
 *
 * @author User
 */
public class GestorSuscripcion {
    CalculadoraCuota calculadora;
    Descuento descuento;
    Notificador notificador;

    public GestorSuscripcion(CalculadoraCuota calculadora, Descuento descuento, Notificador notificador) {
        this.calculadora = calculadora;
        this.descuento = descuento;
        this.notificador = notificador;
    }


    
    
    public void procesarSocio(Socio socio, boolean esEstudiante) {
        double precio = calculadora.obtenerPrecioBase(socio.getTipoPlan());
        
        if (esEstudiante) {
            precio = descuento.descuento(precio);
        }
        
       
    }


    
    
}
