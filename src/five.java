import java.util.Scanner;

public class five {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("enter number");
        int a =Integer.parseInt(scanner.nextLine());
        if (a%3==0&&a%5==0){
            System.out.println("FIZZBUZZ");
        }else if (a%5==0){
            System.out.println("BUZZ");
        }else if (a%3==0){
            System.out.println("FIZZ");
        }else {
            System.out.println("errol");
        }
    }
}
