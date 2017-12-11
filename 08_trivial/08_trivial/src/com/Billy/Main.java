package com.Billy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Random r = new Random();
        int aleatorio, contador = 0, aciertos = 0, fallos = 0;
        char menu, SioNo;
        boolean controlador = true;

        String[] preguntas = {"¿Cuándo se instaló el primer semáforo?", "¿Cuánto cuesta fabricar un euro?", "¿Puedo quedarme con los objetos perdidos que me encuentre en la calle?", "¿Por qué los buceadores se tiran de espaldas de la lancha?", "¿Hay radares de velocidad en las pistas de esquí?"};
        String[] respuestas = {"1868", "4,5 céntimos", "No. El Código Penal lo deja claro en su artículo 253", "Si se lanzaran de frente, la inercia de la botella de oxígeno podría golpearles en el cuello, la cabeza o la espalda.", "En los Alpes suizos, se han establecido radares para evitar que los esquiadores superen los 30 km/h"};


        do {
            aleatorio = r.nextInt(5);
            contador++;
            System.out.print("\n-----------------\n         Menú\nRonda: " + contador + " | Aciertos: " + aciertos + " | Fallos: " + fallos + "\n-----------------\na)Preguntame!\nb)Salir\nEscribe: ");
            menu = br.readLine().toLowerCase().charAt(0);

            if (menu == 'a') {
                System.out.println("Pregunta: " + preguntas[aleatorio]);
                System.out.println("Pulse cualquier tecla para ver la respuesta");
                br.readLine();
                System.out.println("\nRespuesta: " + respuestas[aleatorio]);

                do {
                    System.out.println("¿Ha acertado?\na)Si\nb)No");
                    SioNo = br.readLine().toLowerCase().charAt(0);
                    if (SioNo == 'a') {
                        aciertos++;
                    } else if (SioNo == 'b') {
                        fallos++;
                    } else {
                        System.out.println("El carácter introducido no es válido");
                        controlador = false;
                    }
                } while (controlador == false);
                controlador = true;
            }


        } while (menu != 'b');

        System.out.println("\n-----------------\n FIN \n-----------------");


    }
}
