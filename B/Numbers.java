package B;

import java.util.logging.Level;
import java.util.logging.Logger;


public class Numbers {
    
    public static void main(String[] args) throws InterruptedException{
        
        int N=10;
        
        Thread h = Thread.currentThread();
        
        T_PrintID h1 = new T_PrintID(1, N);
        T_PrintID h2 = new T_PrintID(2, N);
        T_PrintID h3 = new T_PrintID(3, N);
        T_PrintID h4 = new T_PrintID(4, N);
        T_PrintID h5 = new T_PrintID(5, N);
        
        h1.start();
        h2.start();
        h3.start();
        h4.start();
        h5.start();
        
        
    }
    
}
