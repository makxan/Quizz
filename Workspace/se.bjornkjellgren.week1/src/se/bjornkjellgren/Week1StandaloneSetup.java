
package se.bjornkjellgren;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class Week1StandaloneSetup extends Week1StandaloneSetupGenerated{

	public static void doSetup() {
		new Week1StandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

