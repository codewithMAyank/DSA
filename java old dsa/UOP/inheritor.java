public class inheritor {
    public static void main(String[] args) {
        Fish shark = new Fish();
        shark.eat();
        shark.fins = 7;
        System.out.println(shark.fins);
    }
}

// base or parent class
class Animal {
    void eat(){
        System.out.println("eating");
    }
    void breathe(){
        System.out.println("breathing");
    }
}

// inherit class 
class Fish extends Animal{
    int fins;

    void swim(){
        System.out.println("swims in water");
    }

    // fix: remove the fins() method with incorrect signature
}
