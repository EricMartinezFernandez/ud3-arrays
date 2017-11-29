package com.Billy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Random r = new Random();
        int aleatorio = 0, resto = 1, prueba = 0;

        int controlador = 0, columna = 0, filas = 0;
        int[][] matriz = new int[10][10];

        for (int vueltas = 0; vueltas < 100; vueltas++) {
            aleatorio = r.nextInt(100);
            controlador++;
            if (controlador == 11) {
                controlador -= 10;
                columna -= 10;
                filas++;
            }
            matriz[filas][columna] = aleatorio;
            columna++;
        }

        filas = 0;
        columna = 0;
        controlador = 0;


        for (int vueltas = 0; vueltas < 100; vueltas++) {
            controlador++;
            if (controlador == 11) {
                controlador -= 10;
                columna -= 10;
                filas++;
            }
            if (columna == 9) {
                if (matriz[filas][columna] < 10) {
                    System.out.print(" ");
                }
                System.out.print(matriz[filas][columna]);
            } else {
                if (columna == 0) {
                    System.out.print("\n");
                    if (matriz[filas][columna] < 10) {
                        System.out.print(" ");
                    }
                    System.out.print(matriz[filas][columna] + " | ");
                } else {
                    if (matriz[filas][columna] < 10) {
                        System.out.print(" ");
                    }
                    System.out.print(matriz[filas][columna] + " | ");
                }
            }
            columna++;
        }
    }
}