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
public class Tabel {
    String[][] tabelmaster;
    List<String> tabel1;
    List<String> tabel2;
    List<String> tabel3;

    public Tabel() {
        tabel1= new ArrayList<>();
        tabel2= new ArrayList<>();
        tabel3= new ArrayList<>();
        Database db = new Database();
        tabelmaster = db.getDatabase();
        int i = 0;
        while (i<tabelmaster.length){
            int k = 0;
            while (k<tabelmaster[i].length){
                if (i==0){
                    tabel1.add(tabelmaster[i][k]);
                }else if (i==1){
                    tabel2.add(tabelmaster[i][k]);
                }else{
                    tabel3.add(tabelmaster[i][k]);
                }
                k++;
            }
            i++;
        }
    }public void viewTabel1(String s,boolean bol){
        if (bol != false){
            StringBuilder sb = new StringBuilder();
            if(s.equalsIgnoreCase("*")){
                for(int i = 1;i<tabel1.size();i++){
                    if (sb.length()>0)
                        sb.append(",");
                    sb.append(tabel1.get(i));
                }
                sb.append(".");
            }else {
                String[] kata = s.split(",");
                System.out.println("masuk biasa");
                int i = 1;
                while (i<tabel1.size()){
                    int n = kata.length; 
                    for(int k = 0; k < n; k++) 
                    { 
                        if(tabel1.get(i).equalsIgnoreCase(kata[k])){
                            System.out.println(sb.length());
                            if(sb.length()>0)
                                sb.append(",");
                            sb.append(tabel1.get(i));
                            System.out.println(sb.length());
                        }
                    }
                    i++;
                    if (i>=tabel1.size())
                        sb.append(".");
                }
            }
            System.out.println("Tabel(2) : "+tabel1.get(0));
            System.out.println("  Kolom : "+sb.toString());
        }
    }
    
    public void viewTabel2(String s,boolean bol){
        if (bol != false){
            StringBuilder sb = new StringBuilder();
            if(s.equalsIgnoreCase("*")){
                for(int i = 1;i<tabel2.size();i++){
                    if (sb.length()>0)
                        sb.append(",");
                    sb.append(tabel2.get(i));
                }
                sb.append(".");
            }else {
                String[] kata = s.split(",");
                System.out.println("masuk biasa");
                int i = 1;
                while (i<tabel2.size()){
                    int n = kata.length; 
                    for(int k = 0; k < n; k++) 
                    { 
                        if(tabel2.get(i).equalsIgnoreCase(kata[k])){
                            System.out.println(sb.length());
                            if(sb.length()>0)
                                sb.append(",");
                            sb.append(tabel2.get(i));
                            System.out.println(sb.length());
                        }
                    }
                    i++;
                    if (i>=tabel2.size())
                        sb.append(".");
                }
            }
            System.out.println("Tabel(2) : "+tabel2.get(0));
            System.out.println("  Kolom : "+sb.toString());
        }
    }
    public void viewTabel3(String s,boolean bol){
        if (bol != false){
            StringBuilder sb = new StringBuilder();
            System.out.println(s);
            if(s.equalsIgnoreCase("*")){
                for(int i = 1;i<tabel3.size();i++){
                    System.out.println("masuk*");
                    if (sb.length()>0)
                        sb.append(",");
                    sb.append(tabel3.get(i));
                }
                sb.append(".");
            }else {
                String[] kata = s.split(",");
                System.out.println("masuk biasa");
                int i = 1;
                while (i<tabel3.size()){
                    int n = kata.length; 
                    for(int k = 0; k < n; k++) 
                    { 
                        if(tabel3.get(i).equalsIgnoreCase(kata[k])){
                            System.out.println(sb.length());
                            if(sb.length()>0)
                                sb.append(",");
                            sb.append(tabel3.get(i));
                            System.out.println(sb.length());
                        }
                    }
                    i++;
                    if (i>=tabel3.size())
                        sb.append(".");
                }
            }
            System.out.println("Tabel(2) : "+tabel3.get(0));
            System.out.println("  Kolom : "+sb.toString());
        }
    }
    public boolean isTabel1(String s){
        if(s.endsWith(";"))
            s=s.replace(";","");
        if(tabel1.get(0).equalsIgnoreCase(s))
            return true;
        else
            return false;
    }public boolean isTabel2(String s){
        if(s.endsWith(";"))
            s=s.replace(";","");
        if(tabel2.get(0).equalsIgnoreCase(s))
            return true;
        else
            return false;
    }public boolean isTabel3(String s){
        if(s.endsWith(";"))
            s=s.replace(";","");
        if(tabel3.get(0).equalsIgnoreCase(s))
            return true;
        else
            return false;
    }
}
