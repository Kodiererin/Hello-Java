//Write a Java program to create a class called Employee with methods called work() and getSalary(). Create a subclass called HRManager that overrides the work() method and adds a new method called addEmployee()
public class Assignment_1 {
	public static void main(String[] args) {
		 Employee emp = new Employee();
	        emp.setSalary(50000);
	        System.out.println("Employee's Salary: " + emp.getSalary());
	        emp.work();

	        HRManager hrManager = new HRManager();
	        hrManager.setSalary(60000);
	        System.out.println("HR Manager's Salary: " + hrManager.getSalary());
	        hrManager.work();
	        hrManager.addEmployee();
	}
}
class Employee {
    private double salary;

    public void work() {
        System.out.println("Employee is working.");
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}

// HRManager class (subclass of Employee)
class HRManager extends Employee {
    public void work() {
        System.out.println("HR Manager is managing HR tasks.");
    }

    public void addEmployee() {
        System.out.println("HR Manager is adding a new employee.");
    }
}
