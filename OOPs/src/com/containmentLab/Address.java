package com.containmentLab;

public class Address {

	private int roomNo;
	private String city;
	private int pincode;
	
	Address(){
		
	}
	Address(int roomNo, String city, int pincode){
		this.roomNo = roomNo;
		this.city = city;
		this.pincode = pincode;		
	}
	
	public int getRoomNo() {
		return roomNo;
	}
	public void setRoomNo(int roomNo) {
		this.roomNo = roomNo;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	@Override
	public String toString() {
		return "[roomNo=" + roomNo + ", city=" + city + ", pincode=" + pincode + "]";
	}
	

}
