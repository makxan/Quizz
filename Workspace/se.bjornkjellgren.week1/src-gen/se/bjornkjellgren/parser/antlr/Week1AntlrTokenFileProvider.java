/*
* generated by Xtext
*/
package se.bjornkjellgren.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class Week1AntlrTokenFileProvider implements IAntlrTokenFileProvider {
	
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
    	return classLoader.getResourceAsStream("se/bjornkjellgren/parser/antlr/internal/InternalWeek1.tokens");
	}
}