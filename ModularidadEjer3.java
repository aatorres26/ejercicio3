/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package modularidadejer3;
import java.util.*;
/**
 *
 * @author User
 */
public class ModularidadEjer3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
Scanner sc = new Scanner(System.in);

        // 1. Instanciamos los servicios (Las "piezas" del sistema)
        CalculadoraCuota calculadora = new CalculadoraGimnasio();
        Descuento descuento = new DescuentoEstudiante();
        Notificador notificador = new Notificador();

        // 2. Inyectamos las dependencias en el orquestador
        GestorSuscripcion gestor = new GestorSuscripcion(calculadora, descuento, notificador);

        // 3. Captura de datos por consola
        System.out.println("=== REGISTRO DE NUEVO SOCIO ===");
        
        System.out.print("Ingrese el nombre del socio: ");
        String nombre = sc.nextLine();

        System.out.print("Seleccione el plan (1: Básico [$30] / 2: Premium [$60]): ");
        int tipoPlan = sc.nextInt();

        System.out.print("¿Es estudiante? (1: Sí / 0: No): ");
        boolean esEstudiante = sc.nextInt() == 1;

        // 4. Creación del objeto de modelo con los datos ingresados
        Socio socioIngresado = new Socio(nombre, tipoPlan);

        // 5. Procesamiento
        System.out.println("\nProcesando pago...");
        gestor.procesarSocio(socioIngresado, esEstudiante);

        sc.close();
    }
    
}
