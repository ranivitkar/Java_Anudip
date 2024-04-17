
class Cat extends Animal {

    public void makeSound() {
        System.out.println("Meow Meow");
    }

    public static void main(String[] args) {
        Animal a = new Animal();
        a.makeSound();

        Cat c = new Cat();
        c.makeSound();
    }
}
