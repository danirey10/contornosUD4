/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cuentas;

/**
 *
 * @author Dani
 */
public class Main {
    
    public static void main(String[] args) {
        operativa_cuenta();
    }

    /**
     * Este método se encarga mostrar el dinero del usuario
     * @author Dani
    */
    public static void operativa_cuenta() {
        CCuenta cuenta1;
        double saldoActual;
        float cantidad;

        cuenta1 = new CCuenta("Antonio LÃ³pez","1000-2365-85-1230456789",2500,0);
        saldoActual = cuenta1.estado();
        System.out.println("El saldo actual es"+ saldoActual );


        try {
            cuenta1.retirar(2300);
        } catch (Exception e) {
            System.out.print("Fallo al retirar");
        }
        try {
            System.out.println("Ingreso en cuenta");
            cuenta1.ingresar(695);
        } catch (Exception e) {
            System.out.print("Fallo al ingresar");
        }

    }
    
}
