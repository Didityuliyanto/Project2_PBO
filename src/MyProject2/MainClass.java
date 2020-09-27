/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyProject2;

/**
 *
 * @author ASUS
 */
public class MainClass {
    public static void main(String[] args) {
        // TODO code application logic here
        //
        Keramik x = new Keramik(100);
        //Keramik A
        System.out.println("Keramik A");
        System.out.println("Ukuran : 30 cm x 30 cm");
        System.out.println("Harga Per box (isi 10) : Rp. 54.000");
        System.out.println("Total harga Rp. " +  x.keramik_A());
        System.out.println("--------------------------------------------------------");
        //keramik B
        System.out.println("Keramik B");
        System.out.println("Ukuran : 40 cm x 40 cm");
        System.out.println("Harga Per box (isi 5) : Rp. 65.000");
        System.out.println("Total harga Rp. " + x.keramik_B());
        System.out.println("--------------------------------------------------------");
        //keramik C
        System.out.println("Keramik B");
        System.out.println("Ukuran : 40 cm x 40 cm");
        System.out.println("Harga Per box (isi 5) : Rp. 65.000");
        System.out.println("Total harga Rp. " + x.keramik_C());
        System.out.println("--------------------------------------------------------");
        
        
}
}
