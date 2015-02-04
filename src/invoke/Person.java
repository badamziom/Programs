package invoke;

import java.io.Serializable;

public class Person implements Serializable {

	private static final long serialVersionUID = 2894149342243986849L;

	private static transient int cnt = 0;
	
	private int id;
	private String name;
	private String surname;
	private int age;
	private EmpCat employment;
	private String phoneNumber;
	
	public Person() {
		
		this.id = cnt;
		cnt++;
	}
	
	public Person(int id, String name, String surname, int age,
			EmpCat employment, String phoneNumber) {
		
		this();
		this.name = name;
		this.surname = surname;
		this.age = age;
		this.employment = employment;
		this.phoneNumber = phoneNumber;
	}

	public static int getCnt() {
		return cnt;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getSurname() {
		return surname;
	}

	public int getAge() {
		return age;
	}

	public EmpCat getEmployment() {
		return employment;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public static void setCnt(int cnt) {
		Person.cnt = cnt;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setEmployment(EmpCat employment) {
		this.employment = employment;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result
				+ ((employment == null) ? 0 : employment.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result
				+ ((phoneNumber == null) ? 0 : phoneNumber.hashCode());
		result = prime * result + ((surname == null) ? 0 : surname.hashCode());
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (age != other.age)
			return false;
		if (employment != other.employment)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (phoneNumber == null) {
			if (other.phoneNumber != null)
				return false;
		} else if (!phoneNumber.equals(other.phoneNumber))
			return false;
		if (surname == null) {
			if (other.surname != null)
				return false;
		} else if (!surname.equals(other.surname))
			return false;
		return true;
	}
	
	
}
