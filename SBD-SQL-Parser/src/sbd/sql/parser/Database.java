/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sbd.sql.parser;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author Deking
 */
public class Database {
    public String[][] getDatabase() {
        String file = "C:\\Tugas\\SBD\\Dictionary.txt";
        String[][] Tabel = new String[3][];
        //buat scan file sama cek kepotong array nya atau ngga
        try {
            FileReader liatdaleman = new FileReader(file);
            BufferedReader BR = new BufferedReader(liatdaleman);
            String cek;
            int i = 0;
            while ((cek = BR.readLine()) != null) { 
                    String[] array = cek.split("\\;");
                    Tabel[i] = array;
                    i++; 
            }

        } catch (FileNotFoundException fnfe) {
            fnfe.getMessage();
        } catch (IOException ioe) {
            ioe.getMessage();
        }
        //balikin table
        return Tabel;
    }
}
