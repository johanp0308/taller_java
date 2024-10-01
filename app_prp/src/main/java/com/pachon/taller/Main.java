package com.pachon.taller;

import java.net.Socket;
import java.util.Scanner;

import com.pachon.taller.functions.CipherUtility;
import com.pachon.taller.functions.ReaderCSV;

public class Main {
    public static void main(String[] args) {
        
        String fileName = "usuarios.csv";

        System.out.println(ReaderCSV.readlinesCSV(fileName).toString());

        System.out.println("Sistem de Confirmacion de Contraseña usando Hash");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el username");
        String username = scanner.nextLine();
        System.out.println("Ingrese la contraseña");
        String password = scanner.nextLine();

        

    }
}