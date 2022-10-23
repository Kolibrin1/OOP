import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        Linear lin = new Linear(a, b);
        lin.print();
        System.out.println("Корень линейного уравнения = " + lin.roots()[0]);


        a = sc.nextInt();
        b = sc.nextInt();
        int c = sc.nextInt();
        Square sq = new Square(a, b, c);
        sq.print();
        System.out.println("Корни квадратного уравнения : ");
        if(sq.roots()[0] == 999999)
            System.out.println("Корней нет");
        else {
            for (int i = 0; i < sq.roots().length; i++) {
                System.out.println(sq.roots()[i]);
            }
        }
    }
}