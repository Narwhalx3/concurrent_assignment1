package D;

import java.util.logging.Logger;

public class Lazy implements Runnable {
    
    @Override
    public void run() {
        
        Thread Lazy = Thread.currentThread();
        Lazy.setName("Lazy: ");
        double random;
        int r, r2;
        
        random = (int) (Math.random()*6+2); //random number between 2 to 8
        r=(int)random;
        
        try {
            while(r!=0){
                random = Math.random()*6+2; //para frase
                r2=(int)random;
                if(Lazy.isInterrupted()){
                    System.out.println(Lazy.getName()+"That's no cricket, please play the game!");
                    return;
                }

                if(r2<=3) System.out.println(Lazy.getName()+"I am dressing up...");
                if(r2>3 && r<=6) System.out.println(Lazy.getName()+"Just a sec, please...");
                if(r2>6) System.out.println(Lazy.getName()+"These clothes do not suit me...");
                Lazy.sleep(1000);
                r--;
                
                if(r==0) {System.out.println(Lazy.getName()+"I am ready, the early bird catches the worm!"); Hurry.fin=true;  return;}
            }
            return;
        } catch (InterruptedException ex) {
            
        }
    }
}
