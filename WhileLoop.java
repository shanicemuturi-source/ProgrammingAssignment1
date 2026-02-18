import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();

        int i = 1;

        while(i <= num){
            System.out.println(i);
            i++;
        }
    }
}
