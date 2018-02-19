package concurrent_assignment1.A;

/**
 * Get the reference of the main thread */

public class Reference {
  int i=1, num=0;
        while(i<=50){
            if(num%2 != 0){
                System.out.println("Odd numer " + i + ": " + num + "\n");
                i++;
                num++;
            }
            else{
                num++;
            }
        }
}
