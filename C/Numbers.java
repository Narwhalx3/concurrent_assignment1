package C;

import C.*;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Numbers {
    
    public static void main(String[] args) throws InterruptedException{
        
        int N=10;
        
        Thread h = Thread.currentThread();
       
        R_PrintID h1 = new R_PrintID(1, N);
        R_PrintID h2 = new R_PrintID(2, N);
        R_PrintID h3 = new R_PrintID(3, N);
        R_PrintID h4 = new R_PrintID(4, N);
        R_PrintID h5 = new R_PrintID(5, N);
        
        h1.start();
        h2.start();
        h3.start();
        h4.start();
        h5.start();
        
        
    }
    
}
