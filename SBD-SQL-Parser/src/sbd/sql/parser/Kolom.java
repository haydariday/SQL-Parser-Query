/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sbd.sql.parser;

import java.util.*;

/**
 *
 * @author Deking
 */
public class Kolom {
    public boolean isKolom(List<String> tabel,String s){
        if (s.equalsIgnoreCase("*"))
            return true;
        else{
            String[] kata = s.split(",");
            boolean bol = false;
            int count = 0;
            for (int i =0;i<kata.length;i++){
                count = 0;
                for (int k =1;k<tabel.size();k++){
//                    System.out.print(tabel.get(k)+" ");
//                    System.out.println(kata[i]);
                    if (tabel.get(k).equalsIgnoreCase(kata[i]))
                        bol = true;
                    else
                        count++;
                }if (count>=tabel.size())
                    return false;
            }
            return bol;
        }
    }
}
