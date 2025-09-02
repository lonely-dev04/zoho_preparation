class Animal {
    Animal() {
        System.out.println("I am a Animal");
    }
}

public class Dog extends Animal {
    Dog() {
        System.out.println("I am a Dog");
    }

    public static void main(String[] args) {
        Animal dog = new Dog();
    }
}