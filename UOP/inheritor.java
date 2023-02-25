public class inheritor {
    public static void main(String[] args) {
        fish shark = new fish();
        shark.eat();
        shark.fins=7;
        System.out.println(shark.fins);
    }
}

//base or parent class
class animal {
    void eat(){
        System.out.println("eating");
    }
    void breath(){
        System.out.println("breath");
    }
}

//inherit class 
class fish extends animal{
    int fins;

    void swim(){
        System.out.println("swims in water");
    }

    public void fins(int i) {
    }
}
