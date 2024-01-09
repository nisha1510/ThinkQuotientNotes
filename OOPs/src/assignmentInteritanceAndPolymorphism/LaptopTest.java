package assignmentInteritanceAndPolymorphism;
/*
Create Class Laptop which has variables noOfUSBPort, processorSpeed of
type int. Create getter, setter methods for the variables. In main method,
1> create Laptop object 2> set values of variables noOfUSBPort,
processorSpeed using setter methods. 3> print variables noOfUSBPort,
processorSpeed using getter methods.
*/
public class LaptopTest {

	public static void main(String[] args) {
		Laptop laptop = new Laptop();
		
		laptop.setNoOfUSBPort(4);
		laptop.setProcessorSpeed(2500);
		
		System.out.println("No Of USB Port : "+laptop.getNoOfUSBPort());
		System.out.println("ProcessorSpeed : "+laptop.getProcessorSpeed());

	}

}
class Laptop{
	
	private int noOfUSBPort;
	private int processorSpeed;
	
	public int getNoOfUSBPort() {
		return noOfUSBPort;
	}
	public void setNoOfUSBPort(int noOfUSBPort) {
		this.noOfUSBPort = noOfUSBPort;
	}
	public int getProcessorSpeed() {
		return processorSpeed;
	}
	public void setProcessorSpeed(int processorSpeed) {
		this.processorSpeed = processorSpeed;
	}
}