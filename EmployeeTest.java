
public class EmployeeTest {
	
	public static void main(String[] args) {
		
		
		Employee employee1 = new Employee("Veysyal", "Mustafov", 1000);
		Employee employee2 = new Employee("Adam", "Siver", 2000);
		
		employee1.getFirstName();
		employee1.getSalary();
		employee2.getFirstName();
		employee2.getSalary();
		employee1.incrSalary(1.10);
		employee2.incrSalary(1.10);
		employee1.getSalary();
		employee2.getSalary();
		
	}

}
