package main;

import java.util.Scanner;

public class VariableReferencia {
    public static void main(String[] args) {
        Scanner  leer = new Scanner(System.in);
        String nombre = leer.nextLine();
        System.out.println("El nombre es: " + nombre);
        leer.next();
    }
}
