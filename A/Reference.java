package A;





public class Exercise1 {
    
    public static void main(String[] args) {
        Thread h = Thread.currentThread();
        System.out.println(h.getName());
        h.setName("OddThread");
        System.out.println(h.getName());
        Odd();
    }
    
    
    
    public static void Odd(){
        Thread h =  Thread.currentThread();
        int i=1, num=0;
        while(i <= 50){
            if(num%2 != 0){
                System.out.println(num);
                i++;
                num++;
            }
            
            else{
                num++;
            }
        }
        
    }
    
    
    
    
}
