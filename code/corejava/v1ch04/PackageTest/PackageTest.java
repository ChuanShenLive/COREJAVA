import com.chuanshen.corejava.Employee;
// the Employee class is defined in that package

import static java.lang.System.out;
/**
 * This program demonstrates the use of packages.
 * @version 1.00 2018-08-22
 * @author ChuanShen
 * 4-6
 */
public class PackageTest {
	public static void main(String[] args) {
		// because of the import statement, we don't have to use
		// com.chuanshen.corejava.Employee here
		Employee harry = new Employee("Harry Hacker", 50000, 1989, 10, 1);
		
		harry.raiseSalary(5);
		// because of the import statement, we don't have to use System.out here
		out.println("name = " + harry.getName() + ", salary = " + harry.getSalary());;
	}
}
