package co.lambdas.Demo;
//functional interface
interface CourseDetails{
	//function declaration
	void Courses(String course1,String course2);
}
public class Lambda_Interface_Method_demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CourseDetails obj3 = 
				(String course1,String course2) -> 
						{System.out.println(course1 + " " + course2);
						 System.out.println("Testdata");};
						 // call the method
		                 obj3.Courses("Java", "C#");

	}

}




