package allprogram;

public class Student {

	String name;
	int age;
	String address;	
	public Student(String name,int age,String address) {
		this.age=age;
		this.name=name;
		this.address=address;
		}
	public void setname(String name) {
		this.name=name;
	}
	public void setage(int age) {
		this.age=age;
	}
	public void setaddress(String address) {
		this.address=address;
	}
	public int getage() {
		return age;
	}
	public String getname() {
		return name;
	}
	public String getaddress() {
		return address;
	}
	@Override
	public String toString() {
		return("student name is"+this.getname()+"student age is"+this.getage()+
				"student address is"+this.getaddress());
	}
	public static void main(String[] args) {
		Student student=new Student("balaji", 23, "india");
		System.out.println(student.age);
		System.out.println(student.name);
		System.out.println(student.address);
		
			}
}
