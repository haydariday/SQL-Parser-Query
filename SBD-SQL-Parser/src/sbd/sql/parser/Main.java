/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sbd.sql.parser;
import java.io.FileNotFoundException; 
import java.io.FileReader; 
import java.io.IOException; 
/**
 *
 * @author Deking
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Kolom kolom;
       Menu menu = new Menu();
       Tabel tabel = new Tabel();
       String kalimat = menu.kalimat;
       String[] kata = kalimat.split(" ");
       boolean bol1 = false;
       boolean bol2 = false;
       boolean bol3 = false;
       if (kata[kata.length-1].endsWith(";")){
            if(kata.length>=4){
                if (kata[0].equalsIgnoreCase("SELECT")){
                    kolom = new Kolom();
                    bol1 = tabel.isTabel1(kata[3]);
                    bol2 = tabel.isTabel2(kata[3]);
                    bol3 = tabel.isTabel3(kata[3]);
                    if(bol1||bol2||bol3){
                        if(bol1){
                            if (kolom.isKolom(tabel.tabel1,kata[1])){    
                                if (kata[2].equalsIgnoreCase("FROM")){
                                   tabel.viewTabel1(kata[1], bol1);
                                }
                                else{
                                    System.out.println("Syntax Error.(FROM, not "+kata[2]+")");
                                }
                            }else {
                                System.out.println("Column  Not Found.");
                            }
                        }
                        if(bol2){
                            if (kolom.isKolom(tabel.tabel2,kata[1])){    
                                if (kata[2].equalsIgnoreCase("FROM")){
                                   tabel.viewTabel2(kata[1], bol2);
                                }
                                else{
                                    System.out.println("Syntax Error.(FROM, not "+kata[2]+")");
                                }
                            }else {
                                System.out.println("Column  Not Found.");
                            }
                        }
                        if(bol3){
                            if (kolom.isKolom(tabel.tabel3,kata[1])){    
                                if (kata[2].equalsIgnoreCase("FROM")){
                                   tabel.viewTabel3(kata[1], bol3);
                                }
                                else{
                                    System.out.println("Syntax Error.(FROM, not "+kata[2]+")");
                                }
                            }else {
                                System.out.println("Column  Not Found.");
                            }
                        }
                    }else{
                        System.out.println("Tabel Not Found.");
                    }
                }else{
                    System.out.println("Syntax Error.(SELECT, not "+kata[0]+")");
                }
            }else {
                System.out.println("Syntax Error.");
            }
       }else{
           System.out.println("Syntax Error.(';' not found.)");
       }
    }
}
