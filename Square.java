public class Square implements Root{
    int a;
    int b;
    int c;

    public Square(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double[] roots() {
        if(Math.sqrt(b*b - 4 * a * c) == 0) {
            double[] roots = new double[1];
            roots[0] = (double) ((-1) * b) / (2 * a);
            return roots;
        } else if (Math.sqrt(b*b - 4 * a * c) > 0) {
            double[] roots = new double[2];
            roots[0] = (double) (((-1)* b + Math.sqrt(b*b - 4 * a * c)) / (2 * a));
            roots[1] = (double) (((-1)* b - Math.sqrt(b*b - 4 * a * c)) / (2 * a));
            return roots;
        }
        else{
            double[] roots = new double[1];
            roots[0] = 999999;
            return roots;
        }
    }

    public void print() {
        System.out.println("Уравнение имеет вид: " + a + "x^2+" + b + "x+" + c +" = 0");
    }
}
