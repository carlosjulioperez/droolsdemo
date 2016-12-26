package ec.cjpq.droolsdemo.model;

/**
 * Drools and MVEL examples
 * Person model class
 * @author carper, carlosjulioperez@gmail.com
 * 2016-12-25
 */
public class Person{

	private String name;
	private int age;

	public Person(String name, int age){
		this.name = name;
		this.age = age;
	}

	public String getName(){
		return name;
	}

	public void setName(String name){
		this.name = name;
	}

	public int getAge(){
		return age;
	}

	public void setAge(int age){
		this.age = age;
	}
}
