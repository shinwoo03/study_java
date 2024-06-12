package student;

public class StudentDTO {
	private String name, gender, phone;

	public StudentDTO(String name, String gender, String phone) {
		super();
		this.name = name;
		this.gender = gender;
		this.phone = phone;
	}

	public String getName() {
		return name;
	}

	public String getGender() {
		return gender;
	}

	public String getPhone() {
		return phone;
	}

}
