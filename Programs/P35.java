import java.util.Scanner;
class Mobile{
	static Scanner sc = new Scanner(System.in);
	String name;
	String brand;
	String model;
	String color;

	Mobile(Mobile obj){
		this.name = obj.name;
		this.brand = obj.brand;
		this.model = obj.model;
		this.color = obj.color;
	}
	Mobile(String name, String brand, String model, String color){
		this.name= name;
		this.brand= brand;
		this.model = model;
		this.color = color;
	}

	void display(){
		System.out.println(name);
		System.out.println(brand);
		System.out.println(model);
		System.out.println(color);
	}

	public static void main(String[] args){
		Mobile obj = new Mobile(sc.next(),sc.next(),sc.next(),sc.next());
		Mobile obj1 = new Mobile(obj);
		System.out.println("original details");
		obj.display();
		System.out.println("copied details");
		obj1.display();
	}
}