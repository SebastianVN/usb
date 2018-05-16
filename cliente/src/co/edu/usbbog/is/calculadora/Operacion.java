/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.usbbog.is.calculadora;

import java.io.Serializable;

/**
 *
 * @author 204
 */
public class Operacion implements Serializable {
    //Atributos
    /**
     * este numero representa el primer numero a operar
     */
    private double num1;
    /**
     * este numero representa el primer numero a operar
     */
    private double num2;
    /**
     * este numero representa el primer numero a operar
     */
    private double base;
    /**
     * este numero representa el segundo numero a operar
     */
    private double exp;
    /**
     * este numero representa el resultado de la operacion
     */
    private double res;
    /**
     * representa la operacion a ejecutarse 
    */
    private char ope;
    //constructoras
    /**
     * constructora por defecto que limpia los atributos
     */
    public Operacion() {
        this.base = 0.0;
        this.exp = 0.0;
        this.res = 0.0;
        this.ope = 'e';
    }
    /**
     * constructora que da los valores base y exp y la operacion ope a realizar.
     * @param base representa el primer numero
     * @param exp representa el segundo numero
     * @param ope representa la operacion
     */
    public Operacion(double base, double exp, char ope) {
        this.base = base;
        this.exp = exp;
        this.num1 = 0.0;
        this.num2 = 0.0;
        this.res = 0.0;
        this.ope = ope;
    }
    
    /**
     * metodo para obtener el primer numero
     * @return el valor del primer numero
     */
    public double getNum1() {
        return base;
    }
    
    /**
     * metodo para cambiar el valor del primer numero
     * @param base el nuevo valor del primer numero
     */
    public void setNum1(double base) {
        this.base = base;
    }
    /**
     * metodo para obtener el primer numero
     * @return el valor del primer numero
     */
    public double getNum2() {
        return base;
    }
    
    /**
     * metodo para cambiar el valor del primer numero
     * @param base el nuevo valor del primer numero
     */
    public void setNum2(double base) {
        this.base = base;
    }
    /**
     * metodo para obtener el primer numero
     * @return el valor del primer numero
     */
    public double getBase() {
        return base;
    }
    
    /**
     * metodo para cambiar el valor del primer numero
     * @param base el nuevo valor del primer numero
     */
    public void setBase(double base) {
        this.base = base;
    }

    /**
     * metodo para obtener el segundo numero
     * @return el valor del primer numero
     */
    public double getExp() {
        return exp;
    }
    
    /**
     * metodo para cambiar el valor del segundo numero
     * @param base el nuevo valor del primer numero
     */
    public void setExp(double exp) {
        this.exp = exp;
    }

    /**
     * metodo para obtener el resultado de la operacion
     * @return el valor del primer numero
     */
    public double getRes() {
        return res;
    }

    /**
     * metodo para cambiar el valor del resultado de la operacion
     * @param base el nuevo valor del primer numero
     */
    public void setRes(double res) {
        this.res = res;
    }

    /**
     * metodo para obtener la operacion a realizar
     * @return el valor del primer numero
     */
    public char getOpe() {
        return ope;
    }

    /**
     * metodo para cambiar la operacion a realizar
     * @param base el nuevo valor del primer numero
     */
    public void setOpe(char ope) {
        this.ope = ope;
    }

    @Override
    public String toString() {
        return "Operacion{" + "base=" + base + ", exp=" + exp + ", res=" + res + ", ope=" + ope + '}';
    }  
    

}