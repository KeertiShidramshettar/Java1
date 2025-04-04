
class Animal {
   
    String name;

    public Animal(String name) {
        this.name = name;
    }

    public void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

class Cat extends Animal {
   
    public Cat(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println(name + " meows");
    }
}

public class demo1 {
    public static void main(String[] args) {
     
        Dog myDog = new Dog("Joey");
        
        myDog.makeSound();
    }
}
