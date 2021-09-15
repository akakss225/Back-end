class Student{
	String name;
	String major;
	
	public Student(){}
	public Student(String name, String major){
		this.name = name;
		this.major = major;
	}
	
	void getInfo() {
		System.out.println("name : " + this.name);
		System.out.println("major : " + this.major);
		System.out.println("-------------------------");
	}
}

public class Practice2 {

	public static void main(String[] args) {
		
//		2. 이름과 학과를 저장할 수 있는 Student클래스를 만들어서
//		   객체를 생성하고 출력하기.
		
		Student s1 = new Student("song", "bio");
		Student s2 = new Student("kim", "bio");
		Student s3 = new Student("yoo", "bio");
		Student s4 = new Student("lee", "bio");
		Student s5 = new Student("la", "bio");
		
		s1.getInfo();
		s2.getInfo();
		s3.getInfo();
		s4.getInfo();
		s5.getInfo();
	}

}
