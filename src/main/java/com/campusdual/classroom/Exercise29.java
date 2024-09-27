package com.campusdual.classroom;

public class Exercise29 {
    public static void main(String[] args) {
        try {
            int prueba = 123 / 0;
            System.out.println("El resultado es: " + prueba);
        } catch (ArithmeticException e) {
            System.err.println("No se pueden dividir números entre cero.");
        }
    }
}
