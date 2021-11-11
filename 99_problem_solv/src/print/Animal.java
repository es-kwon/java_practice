package print;

public class Animal {
	String name;
	int age;

	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal cat = new Animal();
		cat.setName("boby");
		cat.setAge(10);
		System.out.println(cat.name);
		System.out.println(cat.age);
		
		Animal dog = new Animal();
		dog.setName("happy");
		dog.setAge(9);
		System.out.println(dog.name);
		System.out.println(dog.age);
	}

}
