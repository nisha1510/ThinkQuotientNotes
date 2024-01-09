package assignmentConstructor;
//10)Create one class Employee (emp_id, name, sal) with private access specifier and create getter and setter
public class Q10Employee {

	private int emp_id;
	private String name;
	private double sal;
	
	public Q10Employee() {
		
	}
	
	public Q10Employee(int emp_id, String name, double sal) {
		this.emp_id = emp_id;
		this.name = name;
		this.sal = sal;
	}

	public int getEmp_id() {
		return emp_id;
	}
	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSal() {
		return sal;
	}
	public void setSal(double sal) {
		this.sal = sal;
	}

	public String toString() {
		return "Q10Employee [emp_id=" + emp_id + ", name=" + name + ", sal=" + sal + "]";
	}

	public static void main(String[] args) {
		Q10Employee emp1 = new Q10Employee();
		emp1.setEmp_id(102);
		emp1.setName("isha");
		emp1.setSal(35000);
		System.out.println("Using getter setter");
		System.out.println(emp1.getEmp_id()+" "+emp1.getName()+" "+emp1.getSal());
		
		System.out.println("\nUsing Constructor");
		Q10Employee emp = new Q10Employee(101, "Nisha", 50000);
		System.out.println(emp);
		
	}
}
