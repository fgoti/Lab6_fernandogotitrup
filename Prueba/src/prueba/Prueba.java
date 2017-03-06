/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

/**
 *
 * @author Fernando Goti
 */
public class Prueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        String[] a = {"20", "40", "50", "10", "90", "23"};

// Validamos si existe el fichero, le ponemos el directorio que queremos 
        String sFichero = "rubros.txt";
        File fichero = new File(sFichero);

        if (fichero.exists()) {
            System.out.println("El fichero " + sFichero + " ya existe");
        } else {
            try {
                BufferedWriter bw = new BufferedWriter(new FileWriter(sFichero));

// Escribimos el array 
                for (int x = 0; x < a.length; x++) {
                    bw.write(a[x]);
                    bw.newLine();
                }

// Hay que cerrar el fichero 
                bw.close();

            } catch (Exception e) {

            }
        }

    }

}
