/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.usbbog.is.basico.controlador;

import co.edu.usbbog.is.cliente.modelo.Operacion;

/**
 *
 * @author 204
 */
public class Operador {
    
    public Operacion operar(Operacion o){
        if(o.getOpe()=='w'){
            return null;
        }else{
            switch(o.getOpe()){
                case '+':
                    o.setRes(sumar(o.getNum1(),o.getNum2()));
                    break;
                case '-':
                    o.setRes(restar(o.getNum1(),o.getNum2()));
                    break;
                case '*':
                    o.setRes(multiplicar(o.getNum1(),o.getNum2()));
                    break;
                default:
                    System.out.println("operacion no valida");
                    return null;
            }
        }
        return o;
    }

    private double sumar(double num1, double num2) {
        return num1+num2;
    }

    private double restar(double num1, double num2) {
        return num1-num2;
    }

    private double multiplicar(double num1, double num2) {
        return num1*num2;
    }
    
}
