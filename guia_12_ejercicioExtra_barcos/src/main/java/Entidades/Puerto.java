
package Entidades;

import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author Mariano Benegas
 */
public class Puerto {
    
    private HashMap<Integer,Amarre> Amarres ;

    public Puerto(HashMap<Integer, Amarre> Amarres) {
        this.Amarres = Amarres;
    }

    public Puerto() {
    }
    
    public HashMap<Integer, Amarre> getAmarres() {
        return Amarres;
    }

    public void setAmarres(HashMap<Integer, Amarre> Amarres) {
        this.Amarres = Amarres;
    }
    
    
    
    
}
