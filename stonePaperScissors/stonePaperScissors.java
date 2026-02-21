import java.util.Random;
import java.util.Scanner;

public class stonePaperScissors{
 public static void main(String[] args){
 Random rnd = new Random();
 Scanner sc = new Scanner(System.in);

 int pc = rnd.nextInt(3) + 1;

 System.out.println("1=Stone, 2=Paper, 3=Scissors");

 System.out.print("Enter your choice:");
 int user = sc.nextInt();
 

 if(user==pc){
    System.out.println("Draw");
 }else if((user==1 && pc==3) || (user==2 && pc==1) || (user==3 && pc==2)){
    System.out.println("You win");
 }else{
        System.out.println("You lose");

        
 }

 }
}

 

