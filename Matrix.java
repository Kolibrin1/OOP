public class Matrix {
    double[][] a;

    public Matrix(double[][] a) {
        this.a = a;
    }

    public Matrix sum(Matrix a1, Matrix a2){
        Matrix a3 = new Matrix(a1.a);
        for(int i = 0; i < a1.a.length; i ++){
            for (int j = 0; j < a1.a.length; j ++){
                a3.a[i][j] = a1.a[i][j] + a2.a[i][j];
            }
        }
        return a3;
    }

    public Matrix diff(Matrix a1, Matrix a2){
        Matrix a3 = new Matrix(a1.a);
        for(int i = 0; i < a1.a.length; i ++){
            for (int j = 0; j < a1.a.length; j ++){
                a3.a[i][j] = a1.a[i][j] - a2.a[i][j];
            }
        }
        return a3;
    }

    public Matrix pr(Matrix a2){
        double [][]a4;
        if(a2.a.length == 3){
            a4 = new double[3][3];
        }
        else{
            a4 = new double[2][2];
        }
        for(int i = 0; i < a2.a.length; i++) {
            for (int j = 0; j < a2.a.length; j++) {
                a4[i][j] = 0;
            }
        }

        for(int i = 0; i < a.length; i ++) {
            for (int j = 0; j < a.length; j++) {
                a4[i][j] = 0;
                for (int k = 0; k < a.length; k++)
                    a4[i][j] += a[i][k] * a2.a[k][j];
            }
        }
        Matrix a3 = new Matrix(a4);
        return a3;
    }

    public double opr() {
        double d = 0;
        if (a.length == 3){
            d = (a[0][0] *a[1][1]*a[2][2]) +(a[0][2] *a[1][0]*a[2][1]) + (a[0][1] *a[1][2]*a[2][0]) - (a[0][2] *a[1][1]*a[2][0]) - (a[0][0] *a[1][2]*a[2][1]) - (a[2][2] *a[0][1]*a[1][0]);
        }
        if (a.length == 2){
            d = (a[0][0] * a[1][1]) - (a[0][1] * a[1][0]);
        }
        return d;
    }

    public void trans(){
        for (int i = 0; i < a.length; i ++) {
            for (int j = 0; j <= i; j++) {
                double t = a[i][j];
                a[i][j] = a[j][i];
                a[j][i] = t;
            }
        }
    }

    public void rev(Matrix tr){
        double [][]a4; // Обратная матрица
        if(a.length == 3){
            a4 = new double[3][3];
        }
        else{
            a4 = new double[2][2];
        }
        for(int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                a4[i][j] = 0;
            }
        }
        double d = opr();
        System.out.println(d);
        if(d != 0) {
            if (a.length == 3) { //Для матрицы 3х3
                double[][] b = new double[2][2];
                for (int i = 0; i < 2; i++) {
                    for (int j = 0; j < 2; j++) {
                        b[i][j] = 0;//Матрица для миноров
                    }
                }
                for (int i = 0; i < a4.length; i++) {
                    for (int j = 0; j < a4.length; j++) {
                        int k = 0, k1 = 0;
                        int l = 0, l1 = 0;
                        while (k < a4.length ) {
                            if (k == i && k != 2)
                                k++;
                            else if(k == 2 && k == i)
                                break;
                            while (l < a4.length ) {
                                if (l == j && l != 2)
                                    l++;
                                else if (l == j)
                                    break;
                                b[k1][l1] = tr.a[k][l];
                                l++;
                                l1++;
                            }
                            k++;
                            k1++;
                            l = 0;
                            l1 = 0;
                        }
//                        for(int g = 0; g < b.length; g++){
//                            for(int h = 0; h < b.length; h++){
//                                System.out.print(b[g][h] + " ");
//                            }
//                            System.out.println();
//                        }
                        Matrix a2 = new Matrix(b);
                        if ((i + j) % 2 == 0) {
                            a4[i][j] = a2.opr() / d;
                        } else {
                            a4[i][j] = (-1) * a2.opr() / d;
                        }
                    }
                }
            }
            if (a.length == 2) {//Для матрицы 2х2
                a4[0][0] = tr.a[1][1] / d;
                a4[0][1] = (-1) * tr.a[1][0] / d;
                a4[1][0] = (-1) * tr.a[0][1] / d;
                a4[1][1] = tr.a[0][0] / d;
            }
        }
        else{ //Если определитель 0, то матрица нулевая
            for(int i = 0; i < a4.length; i++)
                for(int j = 0; j < a4.length; j++)
                    a4[i][j] = 999;
        }
        for(int i = 0; i < a.length; i++)
            for(int j = 0; j < a.length; j++)
                a[i][j] = a4[i][j];
    }

    public double normM(){
        double max = 0;
        for (int i = 0;i < a.length;i ++){
            double sum = 0;
            for(int j = 0;j < a.length;j ++){
                sum += a[i][j];
            }
            if(max < sum)
                max = sum;
        }
        return max;
    }

    public double normL(){
        double max = 0;
        for (int i = 0;i < a.length;i ++){
            double sum = 0;
            for(int j = 0;j < a.length;j ++){
                sum += a[j][i];
            }
            if(max < sum)
                max = sum;
        }
        return max;
    }

    public double normK(){
        double norm = 0;
        for (int i = 0;i < a.length;i ++){
            for(int j = 0;j < a.length;j ++) {
                norm += a[i][j] * a[i][j];
            }
        }
        norm = Math.sqrt(norm);
        return norm;
    }
}
