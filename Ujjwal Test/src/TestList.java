import java.util.Collections;
import java.util.Comparator;

class Student {
	String name;
	int age;
	int id;
//	Defining the Constructor
	Student(String name , int age , int id){
		this.name = name;
		this.age = age;
		this.id = id;
	}
//	toString Method
	public String toString() {
		return this.name+" "+this.age+" "+this.id;
	}
	
//	Equals ko overriding function
	public boolean equals(Object o) {
		Student s = (Student)o;
//		if(this.name.compareTo(s.name)==0)
		if(this.id==s.id)	
			return true;
		else
			return false;
	}
	public boolean equalsTo(Object o1 , Object o2) {
		Student s = (Student)o1;
		Student t = (Student)o2;
//		if(this.name.compareTo(s.name)==0)
		if(t.id==s.id)	
			return true;
		else
			return false;
	}
	
//	Overriding the Hashcode.
	public int hashCode() {
		return this.id;
	}
}
class Helper implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
//		Typecasting the Objects;
		Student s = (Student) o1;
		Student t = (Student) o2;
		if(s.age>t.age)
			return 1;
		else if(s.age<t.age)
			return -1;
		return 0;
	}
	
}
public class TestList {
	public static void main(String[] args) {
		java.util.ArrayList<Student> obj = new java.util.ArrayList<>();
		obj.add(new Student("Ujjwal" , 12, 21));			// 123 
		
		obj.add(new Student("Ananya" , 6969 , 999));
		obj.add(new Student("Saloni" , 34 , 12));
		obj.add(new Student("Shivam" , 69 , 12));
		
//		for(Student x : obj) {
//			System.out.println(x);
//		}
//		
////		Collections.sort(obj , new Helper());
////		System.out.println("After Sorting in terms of Age");
////		for(Student x : obj) {
////			System.out.println(x);
////		}
//		
////		And here is one more concept using Lambda Expression...
//		Collections.sort(obj, (p1 , p2)->{
//			if(p1.age>p2.age) return 1;
//			if(p1.age<p2.age) return -1;
//			else return 0;
//		});		
//		System.out.println("After Sorting in terms of Age");
//		for(Student x : obj) {
//			System.out.println(x);
//		}
//		Searching the Shivam
		System.out.println(obj.contains(new Student("Ananya" , 6969 , 999)));
		
		
	}
}
