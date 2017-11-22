package com.Billy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int contador = 0;
        double temperaturahora, mayor = 0, menor = 999999999;

        double[] temperaturas;
        temperaturas = new double[24];

        for (int vueltas = 0; vueltas < 24; vueltas++) {
            System.out.print("Introduzca la temperatura de la hora " + vueltas + ": ");
            temperaturahora = Double.parseDouble(br.readLine());
            if (mayor < temperaturahora) {
                mayor = temperaturahora;
            } else if (menor > temperaturahora) {
                menor = temperaturahora;
            }
            temperaturas[vueltas] = temperaturahora;
        }

        System.out.println("------------------------------");


        for (int vueltas = 0; vueltas < 23; vueltas++) {
            contador++;

            if (contador < 10) {                                   //ALINEAR LOS NUMEROS
                System.out.print(" " + contador + "  ");
            } else {
                System.out.print(contador + "  ");
            }


            for (int vueltaspuntos = 1; vueltaspuntos < temperaturas[vueltas]; vueltaspuntos++) {   //;PUNTOS
                System.out.print("*");
            }

            System.out.print("  " + temperaturas[contador] + "º  ");

            if (temperaturas[contador] == mayor) {
                System.out.print("-----> Max");
            } else if (temperaturas[contador] == menor) {
                System.out.print("-----> Min");
            }
            System.out.print("\n");


        }


    }
}
