package com.Billy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int controlador = 0, columna = 0, filas = 0;
        int[][] matriz = new int[3][3];

        for (int vueltas = 0; vueltas < 9; vueltas++) {
            controlador++;
            System.out.println("----------------------" + "\n" + "POSICION" + "\n" + "Columnas: " + columna + " | " + "Filas: " + filas + "\n" + "----------------------");
            System.out.print("Escribe: ");
            matriz[filas][columna] = Integer.parseInt(br.readLine());
            System.out.println("\n");
            columna++;
            if (controlador == 3) {
                controlador = controlador - 3;
                columna = columna - 3;
                filas++;
            }


        }
        System.out.println("-----------------" + "\n" + "RESULTADO" + "\n" + "-----------------");

        System.out.println(matriz[0][0] + " | " + matriz[0][1] + " | " + matriz[0][2] + "\n" + matriz[1][0] + " | " + matriz[1][1] + " | " + matriz[1][2] + "\n" + matriz[2][0] + " | " + matriz[2][1] + " | " + matriz[2][2]);

        //Intento de format
        //System.out.format("%i +  |  + %i +  |  + %i + \n + %i +  |  + %i +  |  + %i + \n + %i +  |  + %i +  |  + %i", matriz[0][1], matriz[0][2], matriz[0][3], matriz[1][1], matriz[1][2], matriz[1][3], matriz[2][1], matriz[2][2], matriz[2][3]);


    }
}
