import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the matrix");
        int n = sc.nextInt();
        System.out.println("Enter elements");
        double[][] a = new double[n][n];
        for (int i = 0; i < a.length; i++){
            for(int j = 0; j < a.length; j++){
                a[i][j] = sc.nextDouble();
            }
        }
        Matrix a1 = new Matrix(a);
        Matrix a2 = new Matrix(a);
        // Сумма двух матриц
//        Matrix matrix12 = a1.sum(a1,a2);
        // Разность двух матриц
//        Matrix matrix12 = a1.diff(a1,a2);
        // Произведение двух матриц
//        Matrix matrix12 = a1.pr(a2);
//        for (int i = 0; i < a.length; i++){
//            for(int j = 0; j < a.length; j++){
//                System.out.print(matrix12.a[i][j] + " ");
//            }
//            System.out.println();
//        }
//        //Определитель матрицы
//        double opr = a1.opr();
//        System.out.println(opr);
        a1.trans(); //Транспонированная матрциа
        for (int i = 0; i < a.length; i++){
            for(int j = 0; j < a.length; j++){
                System.out.print(a1.a[i][j] + " ");
            }
            System.out.println();
        }
        a2.rev(a1); // Обратная матрица
        for (int i = 0; i < a.length; i++){
            for(int j = 0; j < a.length; j++){
                System.out.print(a2.a[i][j] + " ");
            }
            System.out.println();
        }

        //Нормы матрицы
//        System.out.println("NormM = " + a1.normM());
//        System.out.println("NormL = " + a1.normL());
//        System.out.println("NormK = " + a1.normK());
    }
}