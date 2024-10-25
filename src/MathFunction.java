public class MathFunction {

    public int  add(int a,int b){
        return a + b;
    }
    public int sub(int a,int b){
        if(a>b){
            return a - b;
        }
        return b - a;
    }
    public int multiyplay(int a,int b){
        return a * b;
    }
    public int div(int a,int b){
        return a / b;
    }
    public int abs(int a){
        if(a >= 0){
            return a;
        }
        return a * -1;
    }
    public int pow(int a){
        return a*a;
    }

    public static void main(String[] args) {
        MathFunction mathFunction = new MathFunction();
        System.out.println(mathFunction.add(1,3));
        System.out.println(mathFunction.sub(33,4));
        System.out.println(mathFunction.multiyplay(2,4));
        System.out.println(mathFunction.div(4,2));
        System.out.println(mathFunction.abs(4));
        System.out.println(mathFunction.pow(4));

    }
}
