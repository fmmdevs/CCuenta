/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.fmmdevs.ccuenta;


/**
 *
 * @author Francisco Martínez Marín
 * @version 1.0 19/4/2023
 */


/**
 * 
 * La clase CCuenta representa una cuenta bancaria con los atributos nombre 
 * del titular (String), número de cuenta (String con 20 digitos), saldo (double)
 * y tipo de interés (double que equivale el tipo de interés porcentual).
 */
 
public class CCuenta {


    // Propiedades de la Clase Cuenta
     private String nombre;
     private String cuenta;
     private double saldo;
     private double tipoInterés;

    /**
     * Constructor sin argumentos para la clase CCuenta.
     */
    public CCuenta ()
    {
    }
    
    /**
     * Constructor con parámetros para inicializar todos los atributos de la
     * clase CCuenta.
     * @param nom String con el nombre del titular.
     * @param cue String con el número de cuenta.
     * @param sal double con el saldo actual de la cuenta.
     * @param tipo double con el tipo de interés de la cuenta.
     */
    public CCuenta (String nom, String cue, double sal, double tipo)
    {
        nombre=nom;
        cuenta=cue;
        saldo=sal;
    }
    /**
     * Método para asignar el nombre del titular de la cuenta.
     * @param nom String con el nombre del titular de la cuenta
     */
    public void setNombre(String nom)
    {
        nombre=nom;
    }
    /**
     * Método que devuelve el nombre del titular de la cuenta.
     * @return El nombre del titular de la cuenta.
     */
    public String getNombre()
    {
        return nombre;
    }

    /**
     * Método que devuelve el saldo disponible en cada momento.
     * @return El saldo actual de la cuenta.
     */
     public double getEstado ()
    {
        return getSaldo();
    }

    /**
     * Método para ingresar en la cuenta. Modifica el saldo.
     * 
     * @param cantidad double cantidad a ingresar en la cuenta.
     * @throws Exception Si se intenta ingresar una cantidad negativa.
     */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        saldo = getSaldo() + cantidad;
    }



    /**
     * Método para retirar cantidades de la cuenta. Modifica el saldo.
     * 
     * @param cantidad double cantidad a retirar de la cuenta.
     * @throws Exception Si se intenta retirar una cantidad negativa o si no hay
     * suficiente saldo en la cuenta.
     */
    public void retirar (double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (getEstado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        saldo = getSaldo() - cantidad;
    }

    /**
     * Método que devuelve el número de cuenta.
     * @return El numero de cuenta.
     */
    public String getCuenta ()
    {
        return cuenta;
    }

    /**
     * Método que devuelve el saldo de la cuenta.
     * @return the saldo
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * Método que devuelve el tipo de interes asociado a la cuenta.
     * @return the tipoInterés
     */
    public double getTipoInterés() {
        return tipoInterés;
    }
}
