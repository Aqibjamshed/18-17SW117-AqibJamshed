class Task4{
	public static void main(String args[]){
		Student std=new Student("Aqib","18-17SW117","Software Engineering",19);
		std.showDetails();
	}
}
class Student{
	String stdname;
	String rollno;
	String department;
	int age;
	Student(String stdname,String rollno,String department,int age){
		this.stdname=stdname;
		this.rollno=rollno;
		this.department=department;
		this.age=age;
	}
	void setDetails(String stdname,String rollno,String department,int age){
		this.stdname=stdname;
		this.rollno=rollno;
		this.department=department;
		this.age=age;
	}
	void showDetails(){
		System.out.println("Student Name:"+stdname+"\nRoll No:"+rollno+"\nDepartment:"+department+"\nAge:"+age);
	}
}
