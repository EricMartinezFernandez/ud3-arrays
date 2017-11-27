package com.Billy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void visualizarRecuento(int[] valorLetras) {
        char[] abecedario = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};


        System.out.println("------------------");
        for (int vueltas = 0; vueltas < 25; vueltas++) {
            if (valorLetras[vueltas] != 0) {
                System.out.println("Letra: " + abecedario[vueltas] + " | Numero de veces repetida: " + valorLetras[vueltas]);
            }
        }
    }

    public static int[] contarLetras(String texto) {
        String textosinespacios = texto.replaceAll(" ", "");
        char letra;
        int[] valorLetras = new int[26];
        int tamañotexto = textosinespacios.length();
        for (int vueltas = 0; vueltas < tamañotexto; vueltas++) {
            letra = textosinespacios.charAt(vueltas);
            switch (letra) {
                case 'a':
                    valorLetras[0]++;
                    break;
                case 'b':
                    valorLetras[1]++;
                    break;
                case 'c':
                    valorLetras[2]++;
                    break;
                case 'd':
                    valorLetras[3]++;
                    break;
                case 'e':
                    valorLetras[4]++;
                    break;
                case 'f':
                    valorLetras[5]++;
                    break;
                case 'g':
                    valorLetras[6]++;
                    break;
                case 'h':
                    valorLetras[7]++;
                    break;
                case 'i':
                    valorLetras[8]++;
                    break;
                case 'j':
                    valorLetras[9]++;
                    break;
                case 'k':
                    valorLetras[10]++;
                    break;
                case 'l':
                    valorLetras[11]++;
                    break;
                case 'm':
                    valorLetras[12]++;
                    break;
                case 'n':
                    valorLetras[13]++;
                    break;
                case 'o':
                    valorLetras[14]++;
                    break;
                case 'p':
                    valorLetras[15]++;
                    break;
                case 'q':
                    valorLetras[16]++;
                    break;
                case 'r':
                    valorLetras[17]++;
                    break;
                case 's':
                    valorLetras[18]++;
                    break;
                case 't':
                    valorLetras[19]++;
                    break;
                case 'u':
                    valorLetras[20]++;
                    break;
                case 'v':
                    valorLetras[21]++;
                    break;
                case 'w':
                    valorLetras[22]++;
                    break;
                case 'x':
                    valorLetras[23]++;
                    break;
                case 'y':
                    valorLetras[24]++;
                    break;
                case 'z':
                    valorLetras[25]++;
                    break;
            }
        }

        return valorLetras;

    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] valorLetras = new int[26];
        String texto;


        System.out.print("Introduzca un texto: ");
        texto = br.readLine();

        valorLetras = contarLetras(texto);
        visualizarRecuento(valorLetras);


    }
}
