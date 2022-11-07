import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] a = new double[2][2];
        for (int i = 0; i < a.length; i++){
            for(int j = 0; j < a.length; j++){
                a[i][j] = sc.nextDouble();
            }
        }
        Matrix a1 = new Matrix(a);
        Matrix a2 = new Matrix(a);
        // Сумма двух матриц
        Matrix a3 = a1.sum(a1,a2);
        for (int i = 0; i < a.length; i++){
            for(int j = 0; j < a.length; j++){
                System.out.print(a3.a[i][j]);
            }
            System.out.println();
        }
        // Разность двух матриц
        a3 = a1.diff(a1,a2);
        for (int i = 0; i < a.length; i++){
            for(int j = 0; j < a.length; j++){
                System.out.print(a3.a[i][j]);
            }
            System.out.println();
        }
        // Произведение двух матриц
        a3 = a1.pr(a1,a2);
        for (int i = 0; i < a.length; i++){
            for(int j = 0; j < a.length; j++){
                System.out.print(a3.a[i][j]);
            }
            System.out.println();
        }
        //Определитель матрицы
        double opr = a1.opr();
        a1.trans();
        for (int i = 0; i < a.length; i++){
            for(int j = 0; j < a.length; j++){
                System.out.print(a1.a[i][j]);
            }
            System.out.println();
        }
        //Нормы матрицы
        System.out.println("NormM = " + a2.normM());
        System.out.println("NormL = " + a2.normL());
        System.out.println("NormK = " + a2.normK());
    }
}