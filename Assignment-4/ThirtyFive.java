import java.lang.Math;
class MathOperation{
    static int add(int a,int b){
        return a+b;
    }
    static int subtract(int p,int q){
        return p-q;
    }
    static int product(int x,int y){
        return x*y;
    }
    static double power(double n1,double n2){
        return Math.pow(n1,n2);
    }
}
class ThirtyFive{
    public static void main(String args[]){
        int addition=MathOperation.add(5,62);
        int subtraction=MathOperation.subtract(25,51);
        int multiplication=MathOperation.product(10,5);
        double pow=MathOperation.power(2,33);

        System.out.println(addition);
        System.out.println(subtraction);
        System.out.println(multiplication);
        System.out.println(pow);
    }
}