import java.util.Random;
import java.util.Scanner;

public class predictGame{
  public static void main(String[] args){
  
    Random rnd = new Random();
    int number=rnd.nextInt(100)+1;

    Scanner sc = new Scanner(System.in);
    int predict=0;

    

    while(predict != number){
     
System.out.print("Enter predict:");
        predict=sc.nextInt();
        if(predict < number)
            System.out.println("bigger");
        else if(predict > number)
            System.out.println("smaller");
        else
            System.out.print("congrats!");
        
    }
  }

}