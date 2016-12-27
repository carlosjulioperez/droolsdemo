package ec.cjpq.droolsdemo.drools;

import junit.framework.TestCase;

import ec.cjpq.droolsdemo.controller.RuleRunner;
import ec.cjpq.droolsdemo.model.Employee;
import ec.cjpq.droolsdemo.model.Message;
import ec.cjpq.droolsdemo.model.Person;

/**
 * Drools and MVEL examples
 * RuleRunner controller class
 * @author carper, carlosjulioperez@gmail.com
 * 2016-12-25, 26
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

		//Third example
		//When writing Rules you have the option to use Java Language and MVEL syntax 
		//to modify objects passed to the Working memory.

		System.out.println("\n\nExecuting third example...\n");
		String[] rules3 = {"message.drl"};

		Message message1 = new Message("Hello world!", Message.HELLO);
		Message message2 = new Message("Other message", Message.GOODBYE);
		//Object[] messages = {message1};
		Message[] messages = {message1, message2};
		ruleRunner.runRules(rules3, messages);

		for (Message message: messages){
			System.out.println( "Message modified: " + message.getMessage() + " status: " + message.getStatus() );
		}

	}
}
