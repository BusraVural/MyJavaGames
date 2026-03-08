import java.util.Scanner;

public class ToDo {
    public static void main(String[] args) {
        

        String[] tasks = new String[3];
        int size = 0;

        Scanner sc = new Scanner(System.in);

        while(size<3){
        System.out.print("Enter new task : ");
        tasks[size] = sc.nextLine();
        size++;
        }

        System.out.println("Tasks : ");
        for (int i = 0; i < size; i++) {
            System.out.println(i+ " = "+tasks[i]);
        
        }
       sc.close();

    }
}
