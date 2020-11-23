/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10119014.latihan55.handphone;

/**
 *
 * @author USER
 */
public class WindowsPhone extends Handphone {

    public WindowsPhone(String nokia, String win8, String model, int i, String uuuqijworj) {
    }
    private String wpKeyStore;
    
    public WindowsPhone(String man, String os, String model, int harga, String wpKeyStore) {
        super(man, os, model, harga);
        this.wpKeyStore = wpKeyStore;
    }
    
    public String getWpKeyStore() {
        return this.wpKeyStore;
    }
    
    public void setWpKeyStore(String wpKeyStore) {
        this.wpKeyStore = wpKeyStore;
     
}
}

