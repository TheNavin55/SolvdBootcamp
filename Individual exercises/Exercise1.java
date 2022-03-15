import java.util.Scanner;

public class Exercise1 {
    private static final Scanner SCANNER = new Scanner( System.in );

    public static void main(String[] args) {
        Scanner Name = SCANNER;
        String User;

        System.out.println("Enter username: ");
        User = Name.nextLine();

        System.out.println("Hello " + User); 
    }
}
