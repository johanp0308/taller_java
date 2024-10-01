package com.pachon.taller.functions;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;

public class ReaderCSV {
    
    private static BufferedReader lector;

    public static List<String> readlinesCSV(String filename){
        String linea;
        ArrayList<String> lista = new ArrayList<>();
        try {
            InputStream inputStream = getFileCsvPath(filename);
            if (inputStream == null) {
                System.out.println("no existe el Archivo: " + filename);
            }
            lector = new BufferedReader(new InputStreamReader(inputStream));
            while ((linea = lector.readLine()) != null) {
                lista.add(linea);
            }  
            lector.close();
            // return lista;
        } catch (Exception e) {
            System.out.println(e);
        }     
        return lista;

    }
    
    private static InputStream getFileCsvPath(String filename) {
        return ReaderCSV.class.getClassLoader().getResourceAsStream(filename);
    }
}
