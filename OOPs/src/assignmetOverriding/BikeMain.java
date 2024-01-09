package assignmetOverriding;
//WAP to create class Bike with fields color ,speed and  method bikeInfo() 
//which is show color and speed of bike .
//create class Pulsar which extends Bike implement bikeInfo() differently child 

public class BikeMain {
	 public static void main(String[] args) {
	   
	     Bike regularBike = new Bike("Red", 50);
	     System.out.println("Regular Bike Information:");
	     regularBike.bikeInfo();

	     
	     Pulsar pulsarBike = new Pulsar("Black", 100);
	     pulsarBike.bikeInfo();
	 }
}

class Bike {
	
	private String color;
	private int speed;
	
	public Bike() {
		
	}
	public Bike(String color, int speed) {
		this.color = color;
		this.speed = speed;
	}

	public void bikeInfo() {
		System.out.println("Color: " + color);
		System.out.println("Speed: " + speed + " mph");
	}
}

class Pulsar extends Bike {
	
	public Pulsar(){
		
	}
	public Pulsar(String color, int speed) {
		super(color, speed);
	}

	@Override
	public void bikeInfo() {
		System.out.println("Pulsar information:");
		super.bikeInfo(); 
	}
}

