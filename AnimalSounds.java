class Animal
{
	void sound()
	{
	System.out.println("Animal sound");
	}
}

class Dog extends Animal
{
	void sound(){
	System.out.println("Dog Bark");
	}
}
class Cat extends Animal
{
	void sound(){
	System.out.println("Cat Meow Meow");
	}
}
class Cow extends Animal
{
	void sound(){
	System.out.println("Cow moos");
	}
}

class AnimalSounds
{
	public static void main(String[] args) {
		Cat o=new Cat();
		o.sound();
		Dog p=new Dog();
		p.sound();
	}
}