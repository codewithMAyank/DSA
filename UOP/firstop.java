// oops ke topic ka diffrent type 
// 1. encapesulation
// 2. constructors 
// 3.destructor
// 4.inheritors 
// starting of classes and objects
/**
 * firstop
 */
public class firstop {
    public static void main(String[] args) {
        Pen p1 = new Pen();
        p1.setcolor("blue");
        System.out.println(p1.color);
    }
}
/**
 * Pen
 */
class Pen {

    //prperties + functions
    String color;
    int tip;
    void setcolor (String newcolor ){
        color= newcolor;
    }    
    void settip (int newtip){
        tip= newtip;
    }
}
/**
 * student
 */
class student {
    String name;
    int age;
    float percentage;//cgpa
    void clcmarks (int phy,int chem,int math){
        percentage= ( phy+ chem + math)/3;
    }
    
}