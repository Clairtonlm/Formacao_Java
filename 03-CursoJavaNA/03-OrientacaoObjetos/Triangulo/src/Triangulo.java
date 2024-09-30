public class Triangulo {

    public double lado1;
    public double lado2;
    public double lado3;


    public double area(){
        double s = (lado1 + lado2 + lado3)/2;
        return Math.sqrt(s*(s-lado1)*(s-lado2)*(s-lado3));
    }
}
