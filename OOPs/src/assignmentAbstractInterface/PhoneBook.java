package assignmentAbstractInterface;

//You have to build a phone book. The phone book has the name and contact of a person. 
//This is an openly accessible book so it should be designed accordingly.
//Public
abstract class PhoneBookEntry {
	 
	private String name;
	 private String contact;

	 public PhoneBookEntry(){
		 
	 }
	 public PhoneBookEntry(String name, String contact) {
	     this.name = name;
	     this.contact = contact;
	 }

	 public abstract String getName();
	 public abstract String getContact();
}


public class PhoneBook extends PhoneBookEntry{

	public PhoneBook() {
		
	}
	public PhoneBook(String name, String contact) {
	     super(name, contact);
	 }   

	@Override
	public String getContact() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}
}


