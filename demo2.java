
class Animal {
   
    String name;

    public Animal(String name) {
        this.name = name;
    }

    public void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

class Cow extends Animal {
   
    public Cow(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println(name + " moos");
    }
}

public class demo2 {

    public static void main(String[] args) {
     
        Dog myDog = new Dog("Zayn");
        
        myDog.makeSound();
    }
}
