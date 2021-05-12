package java.react.camp.day3.task2;

public class Users {
	
	private int id;
	private String firstName;
	private String lastName;
	private String telephone;
        private String email;
        
        public Users() {
	
        }
	
	public Users(int id, String firstName, String lastName, String telephone, String email) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
                this.telephone = telephone;
		this.email = email;	
	}
	
	public int GetId() {
		return id;
	}
	public void SetId(int id) {
		this.id = id;
	}
	public String GetFirstName() {
		return firstName;
	}
	public void SetFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String GetLastName() {
		return lastName;
	}
	public void SetLastName(String lastName) {
		this.lastName = lastName;
	}
        public String GetTelephone() {
		return telephone;
	}
	public void SetTelephone(String telephone) {
		this.telephone = telephone;
	}
	public String GetEmail() {
		return email;
	}
	public void SetEmail(String email) {
		this.email = email;
	}
}

