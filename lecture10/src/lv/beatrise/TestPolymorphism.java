package lv.beatrise;

import lv.beatrise.polymorphism.Animal;
import lv.beatrise.polymorphism.Cat;
import lv.beatrise.polymorphism.Dog;

public class TestPolymorphism {

	
	public static void main(String[] args) {
		Animal myAnimal = new Animal();
		Animal myDog = new Dog();
		Animal myCat = new Cat();
		
		myAnimal.animalSound();
		myDog.animalSound();
		myCat.animalSound();
		
		

	}

}
