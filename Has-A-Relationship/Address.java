public class Address {
	String street;
	String city;
	String state;
	String pin;
	public Address(String street, String city, String state, String pin) {
		this.street = street;
		this.city = city;
		this.state = state;
		this.pin = pin;
	}
	
	String printDetails()
	{
		return street+" "+city+" "+state+" "+pin;
	}
	
}
