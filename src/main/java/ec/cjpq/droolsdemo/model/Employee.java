package ec.cjpq.droolsdemo.model;

/**
 * Drools and MVEL examples
 * Employee model class
 * @author carper, carlosjulioperez@gmail.com
 * 2016-12-25
 */
public class Employee {

	private String name;
	private String type;

	public Employee(String name, String type) {
		this.name = name;
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setAge(String type) {
		this.type = type;
	}

}
