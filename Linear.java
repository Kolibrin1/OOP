public class Linear implements Root{
    int a;
    int b;
    public Linear(int a, int b) {
        this.a = a;
        this.b = b;
    }
    public double []roots(){
        double []roots = new double[1];
        roots[0] = (-1)* a / b;
        return roots;
    }
    public void print(){
        System.out.println("Уравнение имеет вид: " + a + "x+" + b + " = 0");
    }
}
