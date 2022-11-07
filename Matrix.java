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

    public Matrix pr(Matrix a1, Matrix a2){
        Matrix a3 = new Matrix(a1.a);
        for(int i = 0; i < a1.a.length; i ++) {
            for (int j = 0; j < a1.a.length; j++) {
                for (int k = 0; k < a1.a.length; k++)
                    a3.a[i][j] += a1.a[i][k] * a2.a[k][j];
            }
        }
        return a3;
    }

    public double opr() {
        double d = 0;
        if (a.length == 3){
            d = (a[1][1] +a[2][2]+a[3][3]) +(a[1][3] +a[2][1]+a[3][2]) + (a[1][2] +a[2][3]+a[3][1]) - (a[1][3] +a[2][2]+a[3][1]) - (a[1][1] +a[2][3]+a[3][2]) - (a[3][3] +a[1][2]+a[2][1]);
        }
        if (a.length == 2){
            d = (a[1][1] + a[2][2]) - (a[1][2] + a[2][1]);
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

//    public Matrix rev(Matrix a1){
//        Matrix a3 = new Matrix(a1.a);
//        double d = a1.opr();
//        for(int i = 0; i < a1.a.length; i ++){
//            for (int j = 0; j < a1.a.length; j ++){
//                a3.a[i][j] = a1.a[i][j];
//            }
//        }
//        a1.trans();
//        if(a1.a.length == 3){
//            double[][] b = new double[2][2];
//            for(int i = 0; i < 2; i++){
//                for (int j = 0; j < 2; j++){
//                    b[i][j] = 0;
//                }
//            }
//            b[0][0] = a1.a[1][1];
//            b[0][1] = a1.a[1][2];
//            b[1][0] = a1.a[2][1];
//            b[1][1] = a1.a[2][2];
//            Matrix a2 = new Matrix(b);
//            double d1 = a2.opr();
//            a3.a[0][0] = d1;
//        }
//        return a3;
//    }

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
