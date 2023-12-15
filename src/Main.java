
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        String name;
        try(Scanner scanner = new Scanner(System.in)){
            System.out.print("Please enter youre name: ");
            name = scanner.nextLine();
            System.out.println("welcome to this app Mr " + name);


         }
    }
}
