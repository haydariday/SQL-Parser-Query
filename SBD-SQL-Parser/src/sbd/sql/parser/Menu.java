/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sbd.sql.parser;

import java.util.Scanner;

/**
 *
 * @author Deking
 */
public class Menu {
    String kalimat;
    public Menu() {
        Scanner reader = new Scanner(System.in); 
        System.out.print("Masukan perintah sql : ");
        kalimat = reader.nextLine();
    }
}
