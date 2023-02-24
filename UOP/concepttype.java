public class concepttype {
    // encapsulation wrraping up data in single unit 
    // -------------class ke andar data AND METHODS .kul milakar access specifiers
    // inheritance 
    // abstraction
    // polymorphism

//--------------------------------------------------------------------------------------------------------------
    // constructor invoked at time of object cration
    // like pen p1= new Pen();
    // pen name ka constructor
    // only function pen name ka 
    // memory allocation after contructor called
    /**
    * studentss
     */
    public static void main(String[] args) {
        studentss s1= new studentss("Gaurav");
        studentss s2= new studentss(1234);
        System.out.println(s1.name);
        System.out.println(s2.Roll);
    }
}
class studentss {
    String name;
    int Roll;
    float age;
    studentss(String name ){
        this.name= name;
        // System.out.println();
    }
    studentss(int Roll){
        this.Roll=Roll;
    }
    //constructor overloading = konsi object ke liye konsa constructor called(or polymorfism)
    // types of constructor
    // 1. non-parametrized
    // 2. parameterized
    // 3. Copy constructor
}