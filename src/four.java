import java.util.Scanner;

public class four {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("enter ");
        double a = scanner.nextDouble();
        System.out.println("enter ");
        double b = scanner.nextDouble();
        System.out.println("enter ");
        double c = scanner.nextDouble();
        if (c*c==a*a+b*b||a*a==b*b+c*c||b*b==c*c+a*a){
            System.out.println("là tam giác vuông");
        }else {
            System.out.println("ko la tam giac vuong");
        }
    }
}

