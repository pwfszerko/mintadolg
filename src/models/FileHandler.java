/*
 * File: FileHandler.java
 * Created Date: 2020-09-15
 * Author: Nagy János
 * Github: https://github.com/andteki
 * Copyright (c) 2020-2022 Nagy János
 * 
 * GNU GPL v2
 */
package models;
//Az importáló sorok
//törlés
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

// A FileHandler osztály létrehozása
//törlés
public class FileHandler {
    String fileName;
    public FileHandler() {
        this.fileName = "adat.txt";
    }
    /* TODO: A fájlbaírás mellet szükség lesz egy
     * adatbázisba író osztályra is. 
     */
    /* Fájlbaírás */
    //törlés
    public void writeFile(String line) {
        try {
            trywriteFile(line);
        }  catch (IOException e) {
            System.err.println("Hiba a fájlba írás rossz");
            System.err.println(e.getMessage());

        }
    }

    
    
    
        
    public void trywriteFile(String line) throws IOException{
        // hiba próba:
        //törlés
        try {
            FileWriter f = new FileWriter(this.fileName, true);
            PrintWriter p = new PrintWriter(f);
            p.println(line);
            p.close();
        } catch (IOException e) {
            System.err.println("Hiba! A fájlbaírás sikertelen!");
        }
    }
}
