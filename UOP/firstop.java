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
        System.out.println(p1.getColor());
    }
}
// /**
//  * Bank
//  */
// // access modifiers ya specifiers 
// // jaha 4 types ke access specifiers he 
// // jes 
// // private default protected public 
// within class | within packege | outside packege by subclass| outside packege
// private   y          n                       n                    n
// default   y          y                       n                    n
// protected y          y                       y                    n
// public    y          y                       y                    y 
class Bank {

}
/**
 * Pen
 */
class Pen {

    //prperties + functions
    private String color;
    private int tip;
    String getColor(){
        return this.color;
    }
    int getTip(){
        return this.tip;
    }
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