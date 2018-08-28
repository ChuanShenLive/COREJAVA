package equals;

public class Manager extends Employee {

	private double bouns;
	
	public Manager(String name, double salary, int year, int month, int day) {
		super(name, salary, year, month, day);
		bouns = 0;
	}
	
	public double getSalary() {
		double baseSalary = super.getSalary();
		return baseSalary + bouns;
	}
	
	public void setBouns(double bouns) {
		this.bouns = bouns;
	}
	
	public boolean equals(Object otherObject) {
		if(!super.equals(otherObject)) return false;
		
		Manager other = (Manager) otherObject;
		// super.equals checked that this and other belong to the same class
		return bouns == other.bouns;
	}
	
	public int hashCode() {
		return super.hashCode() + 17 * new Double(bouns).hashCode();
	}
	
	public String toString() {
		return super.toString() + "[bouns=" + bouns + "]";
	}
}
