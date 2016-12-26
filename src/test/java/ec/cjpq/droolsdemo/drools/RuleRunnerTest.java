package ec.cjpq.droolsdemo.drools;

import junit.framework.TestCase;

import ec.cjpq.droolsdemo.controller.RuleRunner;
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

		String[] rules = {"person.drl"};
		Object[] objects = { new Person("Carlos Julio Perez", 37)};
		ruleRunner.runRules(rules, objects);
	}
}
