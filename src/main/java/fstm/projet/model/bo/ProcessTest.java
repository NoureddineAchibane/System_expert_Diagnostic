package fstm.projet.model.bo;

import java.io.Serializable;

import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

/**
 * This is a sample file to launch a process.
 */
public class ProcessTest implements Serializable {

    public static void main(String[] args) {
        try {
            // load up the knowledge base
	        KieServices ks = KieServices.Factory.get();
    	    KieContainer kContainer = ks.getKieClasspathContainer();
        	KieSession kSession = kContainer.newKieSession("ksession-process");

            // start a new process instance
            kSession.startProcess("com.sample.bpmn.hello");
        } catch (Throwable t) {
            t.printStackTrace();
        }
    }

}
