package ec.cjpq.droolsdemo.drools;

import junit.framework.TestCase;

import ec.cjpq.droolsdemo.controller.RuleRunner;
import ec.cjpq.droolsdemo.model.Employee;
import ec.cjpq.droolsdemo.model.Person;

/**
 * Drools and MVEL examples
 * RuleRunner controller class
 * @author carper, carlosjulioperez@gmail.com
 * 2016-12-25
 */
public class RuleRunnerTest extends TestCase{

	public void test(){
		RuleRunner ruleRunner = new RuleRunner();

		// First example
		System.out.println("\n\nExecuting first example...\n");
		String[] rules1 = {"person.drl"};
		Object[] objects = { new Person("Carlos Julio Perez", 37)};
		ruleRunner.runRules(rules1, objects);

		//Second example
		System.out.println("\n\nExecuting second example...\n");
		String[] rules2 = {"employee.drl"};

		Employee naren = new Employee("Narendar", "onsite");
		Employee karthi = new Employee("KarthiK", "offshore");
		Employee ehfaj = new Employee("Ehfaj", "onsite");
		Employee bala = new Employee("Bala", "offshore");
		Employee pintu = new Employee("Pintu", "offshore");	
		Object[] employees = {naren, karthi, ehfaj, bala, pintu};
		ruleRunner.runRules(rules2, employees);

	}
}
