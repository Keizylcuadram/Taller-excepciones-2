package com.mycompany.archivotercerpunto;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ArchivoTERCERPUNTO {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese el nombre del archivo: ");
        String nombreArchivo = entrada.nextLine();

        File archivo = new File(nombreArchivo);

        // Ejemplo para crear un archivo
        try {
            if (archivo.createNewFile()) {
                System.out.println("Archivo creado exitosamente");
            } else {
                System.out.println("El archivo ya existe");
            }
        } catch (IOException e) {
            System.out.println("Error al crear el archivo");
        }

        // Ejemplo para abrir un archivo
        try {
            try (Scanner lectorArchivo = new Scanner(archivo)) {
                while (lectorArchivo.hasNextLine()) {
                    String linea = lectorArchivo.nextLine();
                    System.out.println(linea);
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("El archivo no existe");
        }
    }
}
