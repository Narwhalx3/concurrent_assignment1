
package D;


public class Hurry {

    public static Boolean fin = false;
    
    public static void main(String[] args) throws InterruptedException {
        int n=0;
        Thread h = Thread.currentThread();
        h.setName("Hurry: ");
        System.out.println(h.getName()+"Aren't you ready yet?");
        Thread Lazy;
        
        Lazy = new Thread(new Lazy()); //Creates the Lazy thread
        Lazy.start();
        
        while(!fin){    //Waits to Lazy to finish. Each second shows the message and checks if it is finished
            h.sleep(1000);
            System.out.println(h.getName()+"Aren't you ready yet?");
            n++;
            if((n==5) && !fin){    //If Lazy no finish after 5 seconds Hurry will claim
                System.out.println(h.getName()+"You are resting in your laurels... and I am leaving!"); 
                Lazy.interrupt(); //and interrupts Lazy
                fin = true;
            }
        }
        Lazy.join();
        if(n<5) 
            System.out.println(h.getName()+"At last, a turtle runs rings round you!");
    }
    
}
