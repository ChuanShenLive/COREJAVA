package clone;

/**
 * This program demonstrates cloning.
 * @version 1.00 2018-09-11
 * @author ChuanShen
 * 6-4
 */
public class CloneTest {
	public static void main(String[] args) {
		try {
			Employee original = new Employee("John Q. Public", 50000);
			original.setHireDay(2000, 1, 1);
			Employee copy = original.clone();
			copy.raiseSalary(10);
			copy.setHireDay(2002, 12, 31);
			System.out.println("original=" + original);
			System.out.println("copy=" + copy);
			
			Employee ep1 = new Employee("lv", 30000);
			Employee ep2 = new Employee("chen", 30000);
			Manager m1 = new Manager("sh", 30000, ep1);
			Employee ep3 = m1;
			Manager m2 = (Manager)m1.clone();
			m2.getHeeler().setHireDay(2017, 1, 1);
			Employee ep4 = ep3.clone();
			Manager m3 = (Manager)ep4;
			m3.getHeeler().setHireDay(2016, 1, 1);
			m1.setHireDay(2011, 3, 1);
			ep1.setHireDay(2012, 1, 1);
			System.out.println("m1=" + m1);
			System.out.println("m2=" + m2);
			System.out.println("ep3=" + ep3);
			System.out.println("ep4=" + ep4);
			System.out.println("m3=" + m3);
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
	}
}
