package assignmentAbstractInterface;

//You have been assigned to create a wifi which can be accessed by the employees 
//inside a room as well as the admin staff from the adjacent room.
//Protected

public class Wifi {
	
	protected String employeeAccess;
	private String adminAccess;

	public Wifi() {
		
	}	
	public Wifi(String employeeAccess, String adminAccess) {
		this.employeeAccess = employeeAccess;
		this.adminAccess = adminAccess;
	}

	protected void accessForEmployees(String employeeLocation) {
		if (employeeLocation.equalsIgnoreCase("inside")) 
		{
			System.out.println("You are connected to the WiFi. Access granted for employees inside the room.");
			System.out.println("WiFi Password: " + employeeAccess);
		} 
		else 
		{
			System.out.println("You are not allowed to access WiFi from this location.");
		}
	}

	public void accessForAdmin(String adminLocation) {
		if (adminLocation.equalsIgnoreCase("adjacent")) 
		{
			System.out.println("You are connected to the WiFi. Access granted for admin staff from the adjacent room.");
			System.out.println("WiFi Password: " + adminAccess);
		} 
		else 
		{
			System.out.println("You are not allowed to access WiFi from this location.");
		}
	}

	public static void main(String[] args) {
		
		Wifi wifi = new Wifi("EmployeePass123", "AdminPass456");

		wifi.accessForEmployees("inside");
		wifi.accessForAdmin("adjacent");
	}
}

