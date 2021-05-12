package java.react.camp.day3.task2;

public class JavaReactCampDay3Task2 {

	public static void Main(String[] args) {

		Users user = new Users();
		user.SetId(0);
		user.SetFirstName("Ceylan");
		user.SetLastName("Yoncacı");
                user.SetTelephone("0(555)5555555");
		user.SetEmail("ceylanabc@gmail.com");
		
		
		Courses course = new Courses();
		course.SetId(0);
		course.SetCourseName("JAVA+REACT Kampı");
		course.SetİnstructorName("Engin Demirog");
		
		Students student = new Students();
		student.SetId(0);
		student.SetName("Ceylan Yoncacı");
		student.SetCourse("JAVA+REACT Kampı");
		
	
		UsersManager userManager = new UsersManager();
		userManager.Add(user);
		
		CoursesManager courseManager = new CoursesManager();
		courseManager.Add(course);
		
		StudentsManager studentManager = new StudentsManager();
		studentManager.AddCourse(student);
	}
}
    

