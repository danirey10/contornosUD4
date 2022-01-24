/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cuentas;

/**
 *
 * @author Dani
 */
public class CCuenta {

    /**
     * @return the nombre
     * @version primera versión
     * @since v1
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Este método se encarga de coger el nombre del usuario
     * @author Dani
    */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Este método se encarga de coger la cuenta del usuario
     * @author Dani
     * @return cuenta
    */
    public String getCuenta() {
        return cuenta;
    }

    /**
     * Este método se encarga de definitir la cuenta del usuario
     * @author Dani
    */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /**
     * Este método se encarga de recoger el saldo del usuario
     * @author Dani
     * @return Saldo del usuario
    */
    public double getSaldo() {
        return saldo;
    }

    /**
     * Este método se encarga de definir el saldo del usuario
     * @author Dani
    */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * Este método se encarga de recoger el tipo de interés del usuario
     * @author Dani
     * @return Tipo de interes
    */
    public double getTipoInteres() {
        return tipoInteres;
    }

    /**
     * Este método se encarga de definitir el tipo de interés del usuario
     * @author Dani
    */
    public void setTipoInteres(double tipoInteres) {
        this.tipoInteres = tipoInteres;
    }


    /**
     * Atributos
    */
    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInteres;

    public CCuenta()
    {
    }

    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
    }

    public double estado()
    {
        return getSaldo();
    }

    /**
     * Método de ingresar
     * @author Dani
    */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        setSaldo(getSaldo() + cantidad);
    }

    /**
     * Método de retirar
     * @author Dani
    */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        setSaldo(getSaldo() - cantidad);
    }
}
