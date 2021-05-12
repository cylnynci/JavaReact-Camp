package java.react.camp.day3.task2;

public class Students {
	private int id;
	private String name;
	private String course;
	
        public Students() {
	
        }
	public Students(int id, String name, String course) {
		super();
		this.id = id;
		this.name = name;
		this.course = course;
	}
	
	public int GetId() {
		return id;
	}
	public void SetId(int id) {
		this.id = id;
	}
	public String GetName() {
		return name;
	}
	public void SetName(String name) {
		this.name = name;
	}
	public String GetCourse() {
		return course;
	}
	public void SetCourse(String course) {
		this.course = course;
	}
}


