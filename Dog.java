package day1;

public class Dog {
	public String name = "LUCKY";
	public String breed = "LABRADOUR";
	public String weight = "35.8";
	public String height = "10";

	public static void main(String[] args) {
		Dog dog = new Dog();
		System.out.println(dog.name);
		System.out.println(dog.breed);
		System.out.println(dog.weight);
		System.out.println(dog.height);
	}
}
