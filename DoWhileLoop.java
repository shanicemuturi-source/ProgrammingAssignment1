import java.util.Scanner;

public class DoWhileLoop {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String correctnum = "220354";
        String correctpass = "2030";


        String studentnum, pass;

        do {
            System.out.print("Enter student number: ");
            studentnum = input.next();

            System.out.print("Enter password: ");
            pass = input.next();

        } while (!studentnum.equals(correctnum) || !pass.equals(correctpass));

        System.out.println("Access Granted");
    }
}
