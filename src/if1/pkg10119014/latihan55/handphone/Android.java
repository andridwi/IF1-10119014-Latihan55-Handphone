package if1.pkg10119014.latihan55.handphone;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Andri
 * Nama : Andri Dwi P
 * Kelas: IF-1
 * NIM  : 10119014
 */
public class Android extends Handphone {
   private String keyStore;
    
    public Android(String man, String os, String model, int harga, String keyStore) {
        super(man, os, model, harga);
        this.keyStore = keyStore;
    }
    
    public String getKeyStore(){
        return this.keyStore;
    }
    
    public void setKeyStore(String keyStore){
        this.keyStore = keyStore;
    } 
}
