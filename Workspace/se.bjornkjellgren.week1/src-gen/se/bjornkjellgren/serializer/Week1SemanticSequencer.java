package se.bjornkjellgren.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import se.bjornkjellgren.services.Week1GrammarAccess;
import se.bjornkjellgren.week1.Week1;
import se.bjornkjellgren.week1.Week1Package;

@SuppressWarnings("all")
public class Week1SemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private Week1GrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == Week1Package.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case Week1Package.WEEK1:
				if(context == grammarAccess.getWeek1Rule()) {
					sequence_Week1(context, (Week1) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     elements+=Expression*
	 */
	protected void sequence_Week1(EObject context, Week1 semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
