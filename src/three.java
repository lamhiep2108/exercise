import java.util.Scanner;

public class three {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a");
        double a=sc.nextDouble();
        System.out.println("enter b");
        double b=sc.nextDouble();
        System.out.println("enter c");
        double c=sc.nextDouble();
        if(a+b>c && b+c>a && c+a>b){
            System.out.println("la tam giac");
        }else {
            System.out.println("ko la tam giac");
        }
    }
}
