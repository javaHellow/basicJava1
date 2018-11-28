package E_OOP;

public class CarTestjava {
	public static void main(String[] args) {
		
		Car c1 = new Car();
		Car c2 = new Car("Red", "Auto" , 2);
		Car c3 = new Car("yellow", "auto");
	}
}

class Car{
	String color;
	String gearType;
	int door;
	
	
	Car() {
		color = "black";
		gearType = "stick";
		door = 4;
	}

	Car(String color, String gearType){
		this();
		this.color = color;
		this.gearType = gearType;
		
	}
	Car(String color, String gearType, int door){
		this.color = color;
		this.gearType = gearType;
		this.door = door;
	}
}