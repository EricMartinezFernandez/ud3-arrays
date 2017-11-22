package com.Billy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        int numeroalumnos, contador = 0, jaimito = 0;
        char letra, primeraletra;
        String fin;

        System.out.print("Introduzca el número de alumnos: ");
        numeroalumnos = Integer.parseInt(br.readLine());

        String[] nombresalumnos = new String[numeroalumnos];
        String[] apellido1alumnos = new String[numeroalumnos];
        String[] apellido21alumnos = new String[numeroalumnos];


        for (int vueltas = 0; vueltas < numeroalumnos; vueltas++) {
            contador++;
            System.out.print("Nombre alumno numero " + contador + ": ");
            nombresalumnos[vueltas] = br.readLine();

            System.out.print("Primer apellido alumno numero " + contador + ": ");
            apellido1alumnos[vueltas] = br.readLine();

            System.out.print("Segundo apellido alumno numero " + contador + ": ");
            apellido21alumnos[vueltas] = br.readLine();
            System.out.println("-----------------------------");
        }

        do {
            System.out.print("Introduzca la letra o FIN: ");
            fin = br.readLine();
            if (!fin.equalsIgnoreCase("fin")) {
                letra = fin.charAt(0);
                for (int vueltas = 0; vueltas < numeroalumnos; vueltas++) {

                    primeraletra = nombresalumnos[vueltas].charAt(0);
                    if (primeraletra == letra) {
                        System.out.println(nombresalumnos[vueltas] + " | " + apellido1alumnos[vueltas] + " | " + apellido21alumnos[vueltas]);
                    } else {
                        jaimito++;
                    }

                }
                if (jaimito == numeroalumnos) {
                    System.out.println("Ningun alumno, comienza con esa letra." + "\n");
                }

            }
        } while (!fin.equalsIgnoreCase("fin"));
        System.out.println("-------------------" + "\n" + "FIN");


    }
}
