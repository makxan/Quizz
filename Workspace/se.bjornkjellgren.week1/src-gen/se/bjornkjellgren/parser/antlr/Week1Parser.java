/*
* generated by Xtext
*/
package se.bjornkjellgren.parser.antlr;

import com.google.inject.Inject;

import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import se.bjornkjellgren.services.Week1GrammarAccess;

public class Week1Parser extends org.eclipse.xtext.parser.antlr.AbstractAntlrParser {
	
	@Inject
	private Week1GrammarAccess grammarAccess;
	
	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	
	@Override
	protected se.bjornkjellgren.parser.antlr.internal.InternalWeek1Parser createParser(XtextTokenStream stream) {
		return new se.bjornkjellgren.parser.antlr.internal.InternalWeek1Parser(stream, getGrammarAccess());
	}
	
	@Override 
	protected String getDefaultRuleName() {
		return "Week1";
	}
	
	public Week1GrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(Week1GrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
}