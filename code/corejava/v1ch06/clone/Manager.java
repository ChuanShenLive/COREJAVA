package clone;

public class Manager extends Employee {
	private Employee heeler;

	public Manager(String name, double salary, Employee heeler) {
		super(name, salary);
		this.heeler = heeler;
	}
	
	public void setHeeler(Employee heeler) {
		this.heeler = heeler;
	}
	
	public Employee getHeeler() {
		return this.heeler;
	}
	
	public Manager clone() throws CloneNotSupportedException {
		Manager cloned = (Manager)super.clone();
		cloned.setHeeler(this.getHeeler().clone());
		return cloned;
	}

	public String toString() {
		return "Manager[" + super.toString() + ", heeler=" + heeler + "]";
	}
}
