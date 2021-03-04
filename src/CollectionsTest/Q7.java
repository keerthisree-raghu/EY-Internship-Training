package CollectionsTest;

// OPTION B. Change Herbivore interface to Herbivore<E extends Animal> extends Hungry<E>

public class Q7 {
	
}

interface Hungry<E> {
	void munch(E x);
}

interface Carnivore<E extends Animal> extends Hungry<E> {
}

interface Herbivore<E extends Animal> extends Hungry<E> {
}

abstract class Plant {
}

class Grass extends Plant {
}

abstract class Animal {
}

class Sheep extends Animal implements Herbivore<Sheep> {
	public void munch(Sheep x) {
	}
}

class Wolf extends Animal implements Carnivore<Sheep> {
	public void munch(Sheep x) {
	}
}