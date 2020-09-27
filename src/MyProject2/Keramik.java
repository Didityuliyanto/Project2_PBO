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
public class Keramik {
    //Atribut
    int Luaslantai;
    
    //Constuctor
    Keramik (int luas){
        this.Luaslantai = luas;
    }
    
    //Methods non void
    double keramik_A(){
        double ukurankeramik = 0.3 * 0.3; //satuan diubah ke dalam bentuk meter
        int pcs = 10;  //isi perbox
        int harga = 54000; //harga perbox
        double total = ((this.Luaslantai / ukurankeramik) / pcs)* harga;
        return total;
    }

    double keramik_B(){
        double ukurankeramik = 0.4 * 0.4;  //satuan diubah ke dalam bentuk meter
        int pcs = 5; //isi perbox
        int harga = 65000; //harga perbox
        double total = ((this.Luaslantai / ukurankeramik) / pcs)* harga;
        return total;
    }
    
    double keramik_C(){
        double ukurankeramik = 0.3 * 0.4;  //satuan diubah ke dalam bentuk meter
        int pcs = 8; //isi perbox
        int harga = 60000; //harga perbox
        double total = ((this.Luaslantai / ukurankeramik) / pcs)* harga;
        return total;
    }
    

}
    