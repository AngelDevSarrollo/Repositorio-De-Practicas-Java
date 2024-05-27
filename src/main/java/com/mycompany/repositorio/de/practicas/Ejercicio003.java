/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.repositorio.de.practicas;

/**
Declara dos variables numéricas (con el valor que desees), muestra por consola la suma, 
resta, multiplicación, división y módulo (resto de la división)
 */
public class Ejercicio003 {
    public static void main(String[]args){
        int a = 3;
        int b = 7;
        int suma = a + b;
        int resta = a - b;
        int multiplicacion = a * b;
        double division = a / b;
        double resto = a%b;
        System.out.println("El resultado de la suma es: "+suma+".");
        System.out.println("El resultado de la resta es: "+resta+".");
        System.out.println("El resultado de la multiplicacion es: "+multiplicacion+".");
        System.out.println("El resultado de la division es: "+division+".");
        System.out.println("El resto de la division es: "+resto+".");
                
    }
    
}
