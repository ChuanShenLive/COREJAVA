package inheritance;

/**
 * This program demonstrates inheritance.
 * @version 1.00 2018-08-24
 * @author ChuanShen
 */
public class ManagerTest {
	public static void main(String[] args) {
		// construct a Manager object 
		Manager boss = new Manager("Carl Cracker", 80000, 1987, 12, 15);
		boss.setBonus(5000);
		
		Employee[] staff = new Employee[3];
		
		// fill the staff array with Manager and Employee objects
		
		staff[0] = boss;
		staff[1] = new Employee("Harry Hacker", 50000, 1989, 10, 1);
		staff[2] = new Employee("Tommy Tester", 40000, 1990, 3, 15);
		
		for (Employee e : staff) {
			System.out.println(e.getClass());
		}
		
		for (Employee e: staff) {
			System.out.println(e instanceof Employee);
		}
		
		// Manager[] managers = new Manager[10];
		// Employee[] employees = managers;
		
		// employees[0] = new Employee("Harry Hacker", 50000, 1989, 10, 1);
		
		// print out information about all Employee objects
		for (Employee e : staff) {
			System.out.println("name = " + e.getName() + ", salary = " + e.getSalary());
		}
	}
}
