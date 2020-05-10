package jms;


public class Person  {
	private String firstName;
	private String lastName;
	private String state;

	public Person() {
	}

	public Person(String firstName, String lastName,String state) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.state=state;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
}
