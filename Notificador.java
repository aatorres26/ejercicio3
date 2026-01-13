/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modularidadejer3;

/**
 *
 * @author User
 */
public class Notificador {
    public void enviarRecibo(Socio socio, double total) {
        System.out.println("--- RECIBO DE PAGO GYM ---");
        System.out.println("Socio: " + socio.getNombre());
        System.out.println("Total a pagar: $" + total);
        System.out.println("--------------------------");
    }
}
