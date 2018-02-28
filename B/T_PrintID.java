package B;

public class T_PrintID extends Thread{
    
    int ID, n;
    
    
    //CONSTRUCTOR
    T_PrintID(int ID, int n){
        this.ID = ID;
        this.n = n;
    }
    
    
    
    //METHOD
    public void run(){
        for (int i = 0; i < n; i++) {
            System.out.println("I'm process: " + ID);
        }
    }
    
    
    
}
