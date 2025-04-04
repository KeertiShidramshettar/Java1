

class Animal {
   
    String name;

    public Animal(String name) {
        this.name = name;
    }

    public void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
   
    public Dog(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println(name + " barks");
    }
}

public class demo {
    public static void main(String[] args) {
     
        Dog myDog = new Dog("Buddy");
        
        myDog.makeSound();
    }
}
