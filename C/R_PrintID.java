package C;

import B.*;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

public class R_PrintID extends Thread implements Runnable{
    
    int ID, n;
    Random r = new Random();
    
    //CONSTRUCTOR
    R_PrintID(int ID, int n){
        this.ID = ID;
        this.n = n;
    }
    
    
    
    //METHOD
    @Override
    public void run(){
        for (int i = 0; i < n; i++) {
            try {
                Thread.sleep(r.nextInt(1000));
                System.out.println("I'm process: " + ID);
            } catch (InterruptedException ex) {
                Logger.getLogger(R_PrintID.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
    }
    
    
    
}
