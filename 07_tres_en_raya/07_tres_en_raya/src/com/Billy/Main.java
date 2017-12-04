package com.Billy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void visualizarTablero(char[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.format("%4c", matriz[i][j]);
            }
            System.out.println("\n");
        }
    }

    public static boolean comprobarGanador(char[][] tablero, int jugador) {
        boolean piso1 = false, piso2 = false, piso3 = false, fin = false;
        int controlador = 0;

        if (jugador == 1) {
            for (int vueltasy = 0; vueltasy < 3; vueltasy++) {//VERTICAL X

                for (int vueltasx = 0; vueltasx < 3; vueltasx++) {

                    if (tablero[vueltasx][vueltasy] == 'X' && controlador == 0) {
                        piso1 = true;
                    }
                    if (tablero[vueltasx][vueltasy] == 'X' && controlador == 1) {
                        piso2 = true;
                    }
                    if (tablero[vueltasx][vueltasy] == 'X' && controlador == 2) {
                        piso3 = true;
                    }
                    controlador++;
                }
                controlador = 0;

                if (piso1 == true && piso2 == true && piso3 == true) {
                    fin = true;
                }
            }

            piso1 = false;
            piso2 = false;
            piso3 = false;
            for (int vueltasy = 0; vueltasy < 3; vueltasy++) {//HORIZONTAL X

                for (int vueltasx = 0; vueltasx < 3; vueltasx++) {

                    if (tablero[vueltasy][vueltasx] == 'X' && controlador == 0) {
                        piso1 = true;
                    }
                    if (tablero[vueltasy][vueltasx] == 'X' && controlador == 1) {
                        piso2 = true;
                    }
                    if (tablero[vueltasy][vueltasx] == 'X' && controlador == 2) {
                        piso3 = true;
                    }
                    controlador++;
                }
                controlador = 0;

                if (piso1 == true && piso2 == true && piso3 == true) {
                    fin = true;
                }
            }

            piso1 = false;
            piso2 = false;
            piso3 = false;
            if (tablero[0][0] == 'X' && controlador == 0) {
                piso1 = true;
            }
            if (tablero[1][1] == 'X' && controlador == 1) {
                piso2 = true;
            }
            if (tablero[2][2] == 'X' && controlador == 2) {
                piso3 = true;
            }
            if (piso1 == true && piso2 == true && piso3 == true) {
                fin = true;
            }

            piso1 = false;
            piso2 = false;
            piso3 = false;
            if (tablero[0][2] == 'X' && controlador == 0) {
                piso1 = true;
            }
            if (tablero[1][1] == 'X' && controlador == 1) {
                piso2 = true;
            }
            if (tablero[2][0] == 'X' && controlador == 2) {
                piso3 = true;
            }
            if (piso1 == true && piso2 == true && piso3 == true) {
                fin = true;
            }


        } else {
            piso1 = false;
            piso2 = false;
            piso3 = false;
            for (int vueltasy = 0; vueltasy < 3; vueltasy++) {//VERTICAL Y

                for (int vueltasx = 0; vueltasx < 3; vueltasx++) {

                    if (tablero[vueltasx][vueltasy] == 'O' && controlador == 0) {
                        piso1 = true;
                    }
                    if (tablero[vueltasx][vueltasy] == 'O' && controlador == 1) {
                        piso2 = true;
                    }
                    if (tablero[vueltasx][vueltasy] == 'O' && controlador == 2) {
                        piso3 = true;
                    }
                    controlador++;
                }
                controlador = 0;

                if (piso1 == true && piso2 == true && piso3 == true) {
                    fin = true;
                }
            }


            piso1 = false;
            piso2 = false;
            piso3 = false;
            for (int vueltasy = 0; vueltasy < 3; vueltasy++) {//VERTICAL Y

                for (int vueltasx = 0; vueltasx < 3; vueltasx++) { //VERTICAL

                    if (tablero[vueltasy][vueltasx] == 'O' && controlador == 0) {
                        piso1 = true;
                    }
                    if (tablero[vueltasy][vueltasx] == 'O' && controlador == 1) {
                        piso2 = true;
                    }
                    if (tablero[vueltasy][vueltasx] == 'O' && controlador == 2) {
                        piso3 = true;
                    }
                    controlador++;
                }
                controlador = 0;

                if (piso1 == true && piso2 == true && piso3 == true) {
                    fin = true;
                }
            }

            piso1 = false;
            piso2 = false;
            piso3 = false;
            if (tablero[0][0] == 'O' && controlador == 0) {
                piso1 = true;
            }
            if (tablero[1][1] == 'O' && controlador == 1) {
                piso2 = true;
            }
            if (tablero[2][2] == 'O' && controlador == 2) {
                piso3 = true;
            }
            if (piso1 == true && piso2 == true && piso3 == true) {
                fin = true;
            }

            piso1 = false;
            piso2 = false;
            piso3 = false;
            if (tablero[0][2] == 'O' && controlador == 0) {
                piso1 = true;
            }
            if (tablero[1][1] == 'O' && controlador == 1) {
                piso2 = true;
            }
            if (tablero[2][0] == 'O' && controlador == 2) {
                piso3 = true;
            }
            if (piso1 == true && piso2 == true && piso3 == true) {
                fin = true;
            }

        }
        return fin;
    }


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int controlador = 0, resto = 0, fila = 0, columna = 0, jugador = 0;
        boolean fin = false, turno;
        char[][] tablero = {{'N', 'N', 'N'}, {'N', 'N', 'N'}, {'N', 'N', 'N'}};


        do {
            controlador++;
            System.out.println("------------------------\n" + "----TRES EN RAYA----" + "\n------------------------");


            do {
                do {

                    if (resto == 0) {
                        System.out.print("Jugador 1: \n");
                        turno = true;
                        jugador = 1;

                    } else {
                        System.out.print("Jugador 2: \n");
                        turno = false;
                        jugador = 2;
                    }


                    System.out.println("Turno: " + controlador + "\n");
                    visualizarTablero(tablero);
                    System.out.print("\n------------------------\n" + "Fila: ");
                    fila = Integer.parseInt(br.readLine());
                    System.out.print("Columna: ");
                    columna = Integer.parseInt(br.readLine());

                    if (tablero[fila][columna] != 'N') {
                        System.out.print("-------------------\nLa casilla elejida ya está en uso\n-------------------\n");
                    }

                    if (fila > 3 && columna > 3) {
                        System.out.print("-------------------\nLa casilla elejida no existe\n-------------------\n");
                    }
                } while (fila > 3 && columna > 3);

            }while(tablero[fila][columna] != 'N');





            System.out.println("\n\n");

            fila--;
            columna--;

            if (turno == true) {
                tablero[fila][columna] = 'X';
            } else {

                tablero[fila][columna] = 'O';
            }

            fin = comprobarGanador(tablero, jugador);


            resto = controlador % 2;
        } while (fin == false);
        System.out.print("\n-------------------\n");
        visualizarTablero(tablero);
        System.out.println("FIN DEL JUEGO");


    }
}
