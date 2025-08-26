package intro;

public class Address {
	private int door_no;
	private String street;
	private String locality;
	private int pincode;
	private String city;
	private String state;
	public Address(int door_no, String street, String locality, int pincode, String city, String state) {
		super();
		this.door_no = door_no;
		this.street = street;
		this.locality = locality;
		this.pincode = pincode;
		this.city = city;
		this.state = state;
	}
	public int getDoor_no() {
		return door_no;
	}
	public void setDoor_no(int door_no) {
		this.door_no = door_no;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getLocality() {
		return locality;
	}
	public void setLocality(String locality) {
		this.locality = locality;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	
	
	

}
