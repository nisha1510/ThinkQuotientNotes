package com.loosecoupling;

interface Message{
	void sendMessage(String msg);
	
	default void messagesStatus(String s) {
		System.out.println(s);
	}
}

class Whatsapp implements Message{
	
	String rName;
	
	public Whatsapp(String rName) {
		this.rName = rName;
	}
	
	@Override
	public void sendMessage(String msg) {
		System.out.println("WhatsApp "+msg);
	}
	
	public void status() {
		System.out.println("SEEN");
	}
}

class Facebook implements Message{

	@Override
	public void sendMessage(String msg) {
		System.out.println("Facebook "+msg);
	}
}


public class TightCoupling {
	
	//tight coupling
	public void messageType(Whatsapp w, String msg) {
		w.sendMessage(msg);
	}
	
	//loose coupling
	public void sendMessage(Message m, String msg) {
		m.sendMessage(msg);
		m.messagesStatus("send");
	}
	
	public static void main(String[] args) {
		
		TightCoupling obj1 = new TightCoupling();
		Whatsapp w1 = new Whatsapp("rutuja");
		obj1.messageType(w1, "Whasapp");
		
//		Facebook f1 = new Facebook();
//		obj1.messageType(f1, "facebook");//error; because of tight coupling

		System.out.println("---------");
		Message m1;
		m1 = new Whatsapp("nisha");
		obj1.sendMessage(m1, "welcome");
		
		m1 = new Facebook();
		obj1.sendMessage(m1, "Hello");
		
		
	}

}
