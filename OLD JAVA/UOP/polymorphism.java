//compile time method overloading
//complie time par iske functions ke kam ka pata chal jata he 
//polymorphism is of two types:- overloading
//                             - overriding

//this is overloading


public class polymorphism {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println(calc.sum(1,2,3));
        System.out.println(calc.sum(1,2));
        System.out.println(calc.sum(1.5f, 2.5f));
    }
}

class Calculator {
    int sum(int a, int b) {
        return a + b;
    }

    float sum(float a, float b) {
        return a + b;
    }

    int sum(int a, int b, int c) {
        return a + b + c;
    }
}
