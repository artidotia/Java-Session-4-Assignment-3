
public class EmployeeDetails {
	private String eName, eAddress, eMobile;
	private int eAge;
	private char eGender;
	
	//default constructor ... we will set N.A. 
	public EmployeeDetails(){
		eName = "N.A.";
		eAddress = "N.A.";
		eMobile = "N.A.";
		eAge = 0;
		eGender = 'M';
	}
	
	public String geteName() {
		return eName;
	}
	public void seteName(String eName) {
		this.eName = eName;
	}
	public String geteAddress() {
		return eAddress;
	}
	public void seteAddress(String eAddress) {
		this.eAddress = eAddress;
	}
	public String geteMobile() {
		return eMobile;
	}
	public void seteMobile(String eMobile) {
		this.eMobile = eMobile;
	}
	public int geteAge() {
		return eAge;
	}
	public void seteAge(int eAge) {
		this.eAge = eAge;
	}
	public char geteGender() {
		return eGender;
	}
	public void seteGender(char eGender) {
		this.eGender = eGender;
	}
}
