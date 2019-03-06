/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Deking
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Tabel tabel = new Tabel();
        String [][] array =new String[10][];
        array = tabel.getDatabase();
        System.out.println(array[0][0]);
        String iday = "iday, ganteng, sekali";
        String[] b = iday.split(", ");
        System.out.println(b[0]);
        
    }
    
}
