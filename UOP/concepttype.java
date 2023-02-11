public class concepttype {
    // encapsulation wrraping up data in single unit 
    // -------------class ke andar data AND METHODS .kul milakar access specifiers
    // inheritance 
    // abstraction
    // polymorphism

//--------------------------------------------------------------------------------------------------------------
    // constructor invoked at time of object cration
    // like pen p1= new Pen();
    //pen name ka constructor
    //only function pen name ka 
    //memory allocation after contructor called
    /**
    * studentss
     */
    public static void main(String[] args) {
        studentss s1= new studentss("Gaurav");
        System.out.println(s1.name);
    }
}
class studentss {
    String name;
    int Roll;
    int age;
    studentss(String name ){
        this.name= name;
        // System.out.println();
    }

}