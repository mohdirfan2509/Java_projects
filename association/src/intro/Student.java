package intro;

public class Student {
	private String name;
	private int roll_no;
	private boolean backlogs;
	private Address addr;
	public Student(String name, int roll_no, boolean backlogs, Address addr) {
		
		this.name = name;
		this.roll_no = roll_no;
		this.backlogs = backlogs;
		this.addr = addr;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRoll_no() {
		return roll_no;
	}
	public void setRoll_no(int roll_no) {
		this.roll_no = roll_no;
	}
	public boolean isBacklogs() {
		return backlogs;
	}
	public void setBacklogs(boolean backlogs) {
		this.backlogs = backlogs;
	}
	public Address getAddr() {
		return addr;
	}
	public void setAddr(Address addr) {
		this.addr = addr;
	}
	
	public String toString() {
		
		String str= "name:"+name+"\n"+"roll_no:"+roll_no+"\n"+"backlogs:"+backlogs+"\n"+"Address:"+"\n"+"door_no:"+addr.getDoor_no()+"\n"+
		"Locality:"+addr.getLocality()+"\n"+"pincode:"+addr.getPincode()+"\n"+"City:"+addr.getCity()+"\n"+"State:"+addr.getState();
		
				return str;
		

	}

}
