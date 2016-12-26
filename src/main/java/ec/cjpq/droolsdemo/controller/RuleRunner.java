package ec.cjpq.droolsdemo.controller;

import org.kie.api.KieServices;
import org.kie.api.builder.KieBuilder;
import org.kie.api.builder.KieFileSystem;
import org.kie.api.builder.KieRepository;
import org.kie.api.builder.Message.Level;
import org.kie.api.io.KieResources;
import org.kie.api.io.Resource;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

/**
 * Drools and MVEL examples
 * RuleRunner controller class
 * @author carper, carlosjulioperez@gmail.com
 * 2016-12-25
 */
public class RuleRunner{

	public void runRules(String rules[], Object[] objects){

		KieServices kieServices = KieServices.Factory.get();
		KieResources kieResources = kieServices.getResources();
		KieFileSystem kieFileSystem = kieServices.newKieFileSystem();
		KieRepository kieRepository = kieServices.getRepository();

		for (String ruleFile: rules){
			Resource resource = kieResources.newClassPathResource(ruleFile);

			// path has to start with src/main/resources
			// append it with the package from the rule
			kieFileSystem.write("src/main/resources/ec/cjpq/droolsdemo/drools/"+ruleFile, resource);
		}

		KieBuilder kieBuilder = kieServices.newKieBuilder(kieFileSystem);
		kieBuilder.buildAll();

		if (kieBuilder.getResults().hasMessages(Level.ERROR))
			throw new RuntimeException("Build errors: \n" + kieBuilder.getResults().toString());
	
		KieContainer kieContainer = kieServices.newKieContainer(kieRepository.getDefaultReleaseId());
		KieSession kieSession = kieContainer.newKieSession();

		for (Object object: objects)
			kieSession.insert(object);

		kieSession.fireAllRules();

	}

}

