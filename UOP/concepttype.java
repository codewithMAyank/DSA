public class concepttype {
    // encapsulation-wrraping up data in single unit 
    //              -class ke andar data AND METHODS .kul milakar access specifiers
    // inheritance 
    // abstraction
    // polymorphism

//--------------------------------------------------------------------------------------------------------------
    // constructor invoked at time of object creation
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
        s1.name = "gaurav";
        s1.Roll=456;
        s1.password="abcd";
        s1.marks[0]=100;
        s1.marks[1]=90;
        s1.marks[2]=80;


        studentss s3 = new studentss(s1);//copy constructor
        s3.password="xyz";//copy constructor
        
        
        s1.marks[2]=100;
        
        for (int i=0;i<3;i++){
            System.out.println(s3.marks[i]);
        }

    }
}
class studentss {
    String name;
    int Roll;
    String password;
    int[] marks;
    // //shallow copy constructor
    // //copy constructor
    // //deep copy
    // studentss(studentss s1){
    //     marks= new int[3];
    //     this.name= s1.name;
    //     this.Roll= s1.Roll;
    //     this.marks=s1.marks;
    // }

    //deep copy constructor
    studentss(studentss s1){
        marks= new int[3];
        this.name= s1.name;
        this.Roll= s1.Roll;
        for (int i=0;i<marks.length;i++){
            this.marks[i]=s1.marks[i];

        }
    }
    studentss(String name ){
        marks= new int[3];
        this.name= name;
        // System.out.println();
    }
    studentss(int Roll){
        marks= new int[3];
        this.Roll=Roll;
    }
    //constructor overloading = konsi object ke liye konsa constructor called(or polymorfism)
    // types of constructor
    // 1. non-parametrized
    // 2. parameterized
    // 3. Copy constructor
}


// NOTE----->>>> THE PROBLEM OCCUR IN COPY CONTRUCTOR IS SOLVED BY "SHALLOW AND DEEP COPY"
// shallow refrence and deep copy is new copy
