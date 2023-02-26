public class abstraction {
    public static void main(String[] args) {
        //object banate he
        //ab horse ke liye kuch bhi neche diye gye option se call kr sakte he 
        horse h = new horse();
        h.eat();
        h.walk();
        chicken ch = new chicken();
        ch.eat();
        ch.walk();
        //abstract class ko implement yaha nahi kr skte
        System.out.println(h.color);
    }
}
//abstarct me constructor bna sakte he
abstract class animal {
    String color;
    animal(){
        color = "brown";
    }
    void eat(){
        System.out.println("animal can eats");
    }

    // animal walk nahi batayega 
    abstract void walk();
}

class horse extends animal{
    //nahi krne par essa result aata he 
    // @Override
    // void walk() {
    //     // TODO Auto-generated method stub
    //     throw new UnsupportedOperationException("Unimplemented method 'walk'");
    // }

    void changecolor(){
        color="dark brown";
    }

    void walk(){
        System.out.println("horse - walk with 4 legs");
    }
}

class chicken extends animal{
    void changecolor(){
        color="dark yellow-skin";
    }
    void walk(){
        System.out.println("horse - walk with 2 legs");
    }
}