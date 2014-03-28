package se.bjornkjellgren.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import se.bjornkjellgren.services.Week1GrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalWeek1Parser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'+'", "'-'", "'*'", "'('", "')'"
    };
    public static final int RULE_ID=5;
    public static final int RULE_STRING=6;
    public static final int T__15=15;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=4;
    public static final int RULE_WS=9;
    public static final int RULE_SL_COMMENT=8;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=7;

    // delegates
    // delegators


        public InternalWeek1Parser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalWeek1Parser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalWeek1Parser.tokenNames; }
    public String getGrammarFileName() { return "../se.bjornkjellgren.week1.ui/src-gen/se/bjornkjellgren/ui/contentassist/antlr/internal/InternalWeek1.g"; }


     
     	private Week1GrammarAccess grammarAccess;
     	
        public void setGrammarAccess(Week1GrammarAccess grammarAccess) {
        	this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected Grammar getGrammar() {
        	return grammarAccess.getGrammar();
        }
        
        @Override
        protected String getValueForTokenName(String tokenName) {
        	return tokenName;
        }




    // $ANTLR start "entryRuleWeek1"
    // ../se.bjornkjellgren.week1.ui/src-gen/se/bjornkjellgren/ui/contentassist/antlr/internal/InternalWeek1.g:60:1: entryRuleWeek1 : ruleWeek1 EOF ;
    public final void entryRuleWeek1() throws RecognitionException {
        try {
            // ../se.bjornkjellgren.week1.ui/src-gen/se/bjornkjellgren/ui/contentassist/antlr/internal/InternalWeek1.g:61:1: ( ruleWeek1 EOF )
            // ../se.bjornkjellgren.week1.ui/src-gen/se/bjornkjellgren/ui/contentassist/antlr/internal/InternalWeek1.g:62:1: ruleWeek1 EOF
            {
             before(grammarAccess.getWeek1Rule()); 
            pushFollow(FOLLOW_ruleWeek1_in_entryRuleWeek161);
            ruleWeek1();

            state._fsp--;

             after(grammarAccess.getWeek1Rule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleWeek168); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleWeek1"


    // $ANTLR start "ruleWeek1"
    // ../se.bjornkjellgren.week1.ui/src-gen/se/bjornkjellgren/ui/contentassist/antlr/internal/InternalWeek1.g:69:1: ruleWeek1 : ( ( rule__Week1__ElementsAssignment )* ) ;
    public final void ruleWeek1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../se.bjornkjellgren.week1.ui/src-gen/se/bjornkjellgren/ui/contentassist/antlr/internal/InternalWeek1.g:73:2: ( ( ( rule__Week1__ElementsAssignment )* ) )
            // ../se.bjornkjellgren.week1.ui/src-gen/se/bjornkjellgren/ui/contentassist/antlr/internal/InternalWeek1.g:74:1: ( ( rule__Week1__ElementsAssignment )* )
            {
            // ../se.bjornkjellgren.week1.ui/src-gen/se/bjornkjellgren/ui/contentassist/antlr/internal/InternalWeek1.g:74:1: ( ( rule__Week1__ElementsAssignment )* )
            // ../se.bjornkjellgren.week1.ui/src-gen/se/bjornkjellgren/ui/contentassist/antlr/internal/InternalWeek1.g:75:1: ( rule__Week1__ElementsAssignment )*
            {
             before(grammarAccess.getWeek1Access().getElementsAssignment()); 
            // ../se.bjornkjellgren.week1.ui/src-gen/se/bjornkjellgren/ui/contentassist/antlr/internal/InternalWeek1.g:76:1: ( rule__Week1__ElementsAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_INT||LA1_0==14) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../se.bjornkjellgren.week1.ui/src-gen/se/bjornkjellgren/ui/contentassist/antlr/internal/InternalWeek1.g:76:2: rule__Week1__ElementsAssignment
            	    {
            	    pushFollow(FOLLOW_rule__Week1__ElementsAssignment_in_ruleWeek194);
            	    rule__Week1__ElementsAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getWeek1Access().getElementsAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleWeek1"


    // $ANTLR start "entryRuleExpression"
    // ../se.bjornkjellgren.week1.ui/src-gen/se/bjornkjellgren/ui/contentassist/antlr/internal/InternalWeek1.g:88:1: entryRuleExpression : ruleExpression EOF ;
    public final void entryRuleExpression() throws RecognitionException {
        try {
            // ../se.bjornkjellgren.week1.ui/src-gen/se/bjornkjellgren/ui/contentassist/antlr/internal/InternalWeek1.g:89:1: ( ruleExpression EOF )
            // ../se.bjornkjellgren.week1.ui/src-gen/se/bjornkjellgren/ui/contentassist/antlr/internal/InternalWeek1.g:90:1: ruleExpression EOF
            {
             before(grammarAccess.getExpressionRule()); 
            pushFollow(FOLLOW_ruleExpression_in_entryRuleExpression122);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getExpressionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpression129); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // ../se.bjornkjellgren.week1.ui/src-gen/se/bjornkjellgren/ui/contentassist/antlr/internal/InternalWeek1.g:97:1: ruleExpression : ( ( rule__Expression__Group__0 ) ) ;
    public final void ruleExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../se.bjornkjellgren.week1.ui/src-gen/se/bjornkjellgren/ui/contentassist/antlr/internal/InternalWeek1.g:101:2: ( ( ( rule__Expression__Group__0 ) ) )
            // ../se.bjornkjellgren.week1.ui/src-gen/se/bjornkjellgren/ui/contentassist/antlr/internal/InternalWeek1.g:102:1: ( ( rule__Expression__Group__0 ) )
            {
            // ../se.bjornkjellgren.week1.ui/src-gen/se/bjornkjellgren/ui/contentassist/antlr/internal/InternalWeek1.g:102:1: ( ( rule__Expression__Group__0 ) )
            // ../se.bjornkjellgren.week1.ui/src-gen/se/bjornkjellgren/ui/contentassist/antlr/internal/InternalWeek1.g:103:1: ( rule__Expression__Group__0 )
            {
             before(grammarAccess.getExpressionAccess().getGroup()); 
            // ../se.bjornkjellgren.week1.ui/src-gen/se/bjornkjellgren/ui/contentassist/antlr/internal/InternalWeek1.g:104:1: ( rule__Expression__Group__0 )
            // ../se.bjornkjellgren.week1.ui/src-gen/se/bjornkjellgren/ui/contentassist/antlr/internal/InternalWeek1.g:104:2: rule__Expression__Group__0
            {
            pushFollow(FOLLOW_rule__Expression__Group__0_in_ruleExpression155);
            rule__Expression__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getExpressionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleTerminalExpression"
    // ../se.bjornkjellgren.week1.ui/src-gen/se/bjornkjellgren/ui/contentassist/antlr/internal/InternalWeek1.g:116:1: entryRuleTerminalExpression : ruleTerminalExpression EOF ;
    public final void entryRuleTerminalExpression() throws RecognitionException {
        try {
            // ../se.bjornkjellgren.week1.ui/src-gen/se/bjornkjellgren/ui/contentassist/antlr/internal/InternalWeek1.g:117:1: ( ruleTerminalExpression EOF )
            // ../se.bjornkjellgren.week1.ui/src-gen/se/bjornkjellgren/ui/contentassist/antlr/internal/InternalWeek1.g:118:1: ruleTerminalExpression EOF
            {
             before(grammarAccess.getTerminalExpressionRule()); 
            pushFollow(FOLLOW_ruleTerminalExpression_in_entryRuleTerminalExpression182);
            ruleTerminalExpression();

            state._fsp--;

             after(grammarAccess.getTerminalExpressionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTerminalExpression189); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTerminalExpression"


    // $ANTLR start "ruleTerminalExpression"
    // ../se.bjornkjellgren.week1.ui/src-gen/se/bjornkjellgren/ui/contentassist/antlr/internal/InternalWeek1.g:125:1: ruleTerminalExpression : ( ( rule__TerminalExpression__Alternatives ) ) ;
    public final void ruleTerminalExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../se.bjornkjellgren.week1.ui/src-gen/se/bjornkjellgren/ui/contentassist/antlr/internal/InternalWeek1.g:129:2: ( ( ( rule__TerminalExpression__Alternatives ) ) )
            // ../se.bjornkjellgren.week1.ui/src-gen/se/bjornkjellgren/ui/contentassist/antlr/internal/InternalWeek1.g:130:1: ( ( rule__TerminalExpression__Alternatives ) )
            {
            // ../se.bjornkjellgren.week1.ui/src-gen/se/bjornkjellgren/ui/contentassist/antlr/internal/InternalWeek1.g:130:1: ( ( rule__TerminalExpression__Alternatives ) )
            // ../se.bjornkjellgren.week1.ui/src-gen/se/bjornkjellgren/ui/contentassist/antlr/internal/InternalWeek1.g:131:1: ( rule__TerminalExpression__Alternatives )
            {
             before(grammarAccess.getTerminalExpressionAccess().getAlternatives()); 
            // ../se.bjornkjellgren.week1.ui/src-gen/se/bjornkjellgren/ui/contentassist/antlr/internal/InternalWeek1.g:132:1: ( rule__TerminalExpression__Alternatives )
            // ../se.bjornkjellgren.week1.ui/src-gen/se/bjornkjellgren/ui/contentassist/antlr/internal/InternalWeek1.g:132:2: rule__TerminalExpression__Alternatives
            {
            pushFollow(FOLLOW_rule__TerminalExpression__Alternatives_in_ruleTerminalExpression215);
            rule__TerminalExpression__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTerminalExpressionAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTerminalExpression"


    // $ANTLR start "entryRuleOperator"
    // ../se.bjornkjellgren.week1.ui/src-gen/se/bjornkjellgren/ui/contentassist/antlr/internal/InternalWeek1.g:144:1: entryRuleOperator : ruleOperator EOF ;
    public final void entryRuleOperator() throws RecognitionException {
        try {
            // ../se.bjornkjellgren.week1.ui/src-gen/se/bjornkjellgren/ui/contentassist/antlr/internal/InternalWeek1.g:145:1: ( ruleOperator EOF )
            // ../se.bjornkjellgren.week1.ui/src-gen/se/bjornkjellgren/ui/contentassist/antlr/internal/InternalWeek1.g:146:1: ruleOperator EOF
            {
             before(grammarAccess.getOperatorRule()); 
            pushFollow(FOLLOW_ruleOperator_in_entryRuleOperator242);
            ruleOperator();

            state._fsp--;

             after(grammarAccess.getOperatorRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOperator249); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleOperator"


    // $ANTLR start "ruleOperator"
    // ../se.bjornkjellgren.week1.ui/src-gen/se/bjornkjellgren/ui/contentassist/antlr/internal/InternalWeek1.g:153:1: ruleOperator : ( ( rule__Operator__Alternatives ) ) ;
    public final void ruleOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../se.bjornkjellgren.week1.ui/src-gen/se/bjornkjellgren/ui/contentassist/antlr/internal/InternalWeek1.g:157:2: ( ( ( rule__Operator__Alternatives ) ) )
            // ../se.bjornkjellgren.week1.ui/src-gen/se/bjornkjellgren/ui/contentassist/antlr/internal/InternalWeek1.g:158:1: ( ( rule__Operator__Alternatives ) )
            {
            // ../se.bjornkjellgren.week1.ui/src-gen/se/bjornkjellgren/ui/contentassist/antlr/internal/InternalWeek1.g:158:1: ( ( rule__Operator__Alternatives ) )
            // ../se.bjornkjellgren.week1.ui/src-gen/se/bjornkjellgren/ui/contentassist/antlr/internal/InternalWeek1.g:159:1: ( rule__Operator__Alternatives )
            {
             before(grammarAccess.getOperatorAccess().getAlternatives()); 
            // ../se.bjornkjellgren.week1.ui/src-gen/se/bjornkjellgren/ui/contentassist/antlr/internal/InternalWeek1.g:160:1: ( rule__Operator__Alternatives )
            // ../se.bjornkjellgren.week1.ui/src-gen/se/bjornkjellgren/ui/contentassist/antlr/internal/InternalWeek1.g:160:2: rule__Operator__Alternatives
            {
            pushFollow(FOLLOW_rule__Operator__Alternatives_in_ruleOperator275);
            rule__Operator__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getOperatorAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOperator"


    // $ANTLR start "entryRuleNumber"
    // ../se.bjornkjellgren.week1.ui/src-gen/se/bjornkjellgren/ui/contentassist/antlr/internal/InternalWeek1.g:172:1: entryRuleNumber : ruleNumber EOF ;
    public final void entryRuleNumber() throws RecognitionException {
        try {
            // ../se.bjornkjellgren.week1.ui/src-gen/se/bjornkjellgren/ui/contentassist/antlr/internal/InternalWeek1.g:173:1: ( ruleNumber EOF )
            // ../se.bjornkjellgren.week1.ui/src-gen/se/bjornkjellgren/ui/contentassist/antlr/internal/InternalWeek1.g:174:1: ruleNumber EOF
            {
             before(grammarAccess.getNumberRule()); 
            pushFollow(FOLLOW_ruleNumber_in_entryRuleNumber302);
            ruleNumber();

            state._fsp--;

             after(grammarAccess.getNumberRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumber309); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleNumber"


    // $ANTLR start "ruleNumber"
    // ../se.bjornkjellgren.week1.ui/src-gen/se/bjornkjellgren/ui/contentassist/antlr/internal/InternalWeek1.g:181:1: ruleNumber : ( RULE_INT ) ;
    public final void ruleNumber() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../se.bjornkjellgren.week1.ui/src-gen/se/bjornkjellgren/ui/contentassist/antlr/internal/InternalWeek1.g:185:2: ( ( RULE_INT ) )
            // ../se.bjornkjellgren.week1.ui/src-gen/se/bjornkjellgren/ui/contentassist/antlr/internal/InternalWeek1.g:186:1: ( RULE_INT )
            {
            // ../se.bjornkjellgren.week1.ui/src-gen/se/bjornkjellgren/ui/contentassist/antlr/internal/InternalWeek1.g:186:1: ( RULE_INT )
            // ../se.bjornkjellgren.week1.ui/src-gen/se/bjornkjellgren/ui/contentassist/antlr/internal/InternalWeek1.g:187:1: RULE_INT
            {
             before(grammarAccess.getNumberAccess().getINTTerminalRuleCall()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleNumber335); 
             after(grammarAccess.getNumberAccess().getINTTerminalRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNumber"


    // $ANTLR start "rule__TerminalExpression__Alternatives"
    // ../se.bjornkjellgren.week1.ui/src-gen/se/bjornkjellgren/ui/contentassist/antlr/internal/InternalWeek1.g:200:1: rule__TerminalExpression__Alternatives : ( ( ( rule__TerminalExpression__Group_0__0 ) ) | ( ruleNumber ) );
    public final void rule__TerminalExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../se.bjornkjellgren.week1.ui/src-gen/se/bjornkjellgren/ui/contentassist/antlr/internal/InternalWeek1.g:204:1: ( ( ( rule__TerminalExpression__Group_0__0 ) ) | ( ruleNumber ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==14) ) {
                alt2=1;
            }
            else if ( (LA2_0==RULE_INT) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../se.bjornkjellgren.week1.ui/src-gen/se/bjornkjellgren/ui/contentassist/antlr/internal/InternalWeek1.g:205:1: ( ( rule__TerminalExpression__Group_0__0 ) )
                    {
                    // ../se.bjornkjellgren.week1.ui/src-gen/se/bjornkjellgren/ui/contentassist/antlr/internal/InternalWeek1.g:205:1: ( ( rule__TerminalExpression__Group_0__0 ) )
                    // ../se.bjornkjellgren.week1.ui/src-gen/se/bjornkjellgren/ui/contentassist/antlr/internal/InternalWeek1.g:206:1: ( rule__TerminalExpression__Group_0__0 )
                    {
                     before(grammarAccess.getTerminalExpressionAccess().getGroup_0()); 
                    // ../se.bjornkjellgren.week1.ui/src-gen/se/bjornkjellgren/ui/contentassist/antlr/internal/InternalWeek1.g:207:1: ( rule__TerminalExpression__Group_0__0 )
                    // ../se.bjornkjellgren.week1.ui/src-gen/se/bjornkjellgren/ui/contentassist/antlr/internal/InternalWeek1.g:207:2: rule__TerminalExpression__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__TerminalExpression__Group_0__0_in_rule__TerminalExpression__Alternatives370);
                    rule__TerminalExpression__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTerminalExpressionAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../se.bjornkjellgren.week1.ui/src-gen/se/bjornkjellgren/ui/contentassist/antlr/internal/InternalWeek1.g:211:6: ( ruleNumber )
                    {
                    // ../se.bjornkjellgren.week1.ui/src-gen/se/bjornkjellgren/ui/contentassist/antlr/internal/InternalWeek1.g:211:6: ( ruleNumber )
                    // ../se.bjornkjellgren.week1.ui/src-gen/se/bjornkjellgren/ui/contentassist/antlr/internal/InternalWeek1.g:212:1: ruleNumber
                    {
                     before(grammarAccess.getTerminalExpressionAccess().getNumberParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleNumber_in_rule__TerminalExpression__Alternatives388);
                    ruleNumber();

                    state._fsp--;

                     after(grammarAccess.getTerminalExpressionAccess().getNumberParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalExpression__Alternatives"


    // $ANTLR start "rule__Operator__Alternatives"
    // ../se.bjornkjellgren.week1.ui/src-gen/se/bjornkjellgren/ui/contentassist/antlr/internal/InternalWeek1.g:222:1: rule__Operator__Alternatives : ( ( '+' ) | ( '-' ) | ( '*' ) );
    public final void rule__Operator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../se.bjornkjellgren.week1.ui/src-gen/se/bjornkjellgren/ui/contentassist/antlr/internal/InternalWeek1.g:226:1: ( ( '+' ) | ( '-' ) | ( '*' ) )
            int alt3=3;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt3=1;
                }
                break;
            case 12:
                {
                alt3=2;
                }
                break;
            case 13:
                {
                alt3=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // ../se.bjornkjellgren.week1.ui/src-gen/se/bjornkjellgren/ui/contentassist/antlr/internal/InternalWeek1.g:227:1: ( '+' )
                    {
                    // ../se.bjornkjellgren.week1.ui/src-gen/se/bjornkjellgren/ui/contentassist/antlr/internal/InternalWeek1.g:227:1: ( '+' )
                    // ../se.bjornkjellgren.week1.ui/src-gen/se/bjornkjellgren/ui/contentassist/antlr/internal/InternalWeek1.g:228:1: '+'
                    {
                     before(grammarAccess.getOperatorAccess().getPlusSignKeyword_0()); 
                    match(input,11,FOLLOW_11_in_rule__Operator__Alternatives421); 
                     after(grammarAccess.getOperatorAccess().getPlusSignKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../se.bjornkjellgren.week1.ui/src-gen/se/bjornkjellgren/ui/contentassist/antlr/internal/InternalWeek1.g:235:6: ( '-' )
                    {
                    // ../se.bjornkjellgren.week1.ui/src-gen/se/bjornkjellgren/ui/contentassist/antlr/internal/InternalWeek1.g:235:6: ( '-' )
                    // ../se.bjornkjellgren.week1.ui/src-gen/se/bjornkjellgren/ui/contentassist/antlr/internal/InternalWeek1.g:236:1: '-'
                    {
                     before(grammarAccess.getOperatorAccess().getHyphenMinusKeyword_1()); 
                    match(input,12,FOLLOW_12_in_rule__Operator__Alternatives441); 
                     after(grammarAccess.getOperatorAccess().getHyphenMinusKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../se.bjornkjellgren.week1.ui/src-gen/se/bjornkjellgren/ui/contentassist/antlr/internal/InternalWeek1.g:243:6: ( '*' )
                    {
                    // ../se.bjornkjellgren.week1.ui/src-gen/se/bjornkjellgren/ui/contentassist/antlr/internal/InternalWeek1.g:243:6: ( '*' )
                    // ../se.bjornkjellgren.week1.ui/src-gen/se/bjornkjellgren/ui/contentassist/antlr/internal/InternalWeek1.g:244:1: '*'
                    {
                     before(grammarAccess.getOperatorAccess().getAsteriskKeyword_2()); 
                    match(input,13,FOLLOW_13_in_rule__Operator__Alternatives461); 
                     after(grammarAccess.getOperatorAccess().getAsteriskKeyword_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operator__Alternatives"


    // $ANTLR start "rule__Expression__Group__0"
    // ../se.bjornkjellgren.week1.ui/src-gen/se/bjornkjellgren/ui/contentassist/antlr/internal/InternalWeek1.g:258:1: rule__Expression__Group__0 : rule__Expression__Group__0__Impl rule__Expression__Group__1 ;
    public final void rule__Expression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../se.bjornkjellgren.week1.ui/src-gen/se/bjornkjellgren/ui/contentassist/antlr/internal/InternalWeek1.g:262:1: ( rule__Expression__Group__0__Impl rule__Expression__Group__1 )
            // ../se.bjornkjellgren.week1.ui/src-gen/se/bjornkjellgren/ui/contentassist/antlr/internal/InternalWeek1.g:263:2: rule__Expression__Group__0__Impl rule__Expression__Group__1
            {
            pushFollow(FOLLOW_rule__Expression__Group__0__Impl_in_rule__Expression__Group__0493);
            rule__Expression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Expression__Group__1_in_rule__Expression__Group__0496);
            rule__Expression__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group__0"


    // $ANTLR start "rule__Expression__Group__0__Impl"
    // ../se.bjornkjellgren.week1.ui/src-gen/se/bjornkjellgren/ui/contentassist/antlr/internal/InternalWeek1.g:270:1: rule__Expression__Group__0__Impl : ( ruleTerminalExpression ) ;
    public final void rule__Expression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../se.bjornkjellgren.week1.ui/src-gen/se/bjornkjellgren/ui/contentassist/antlr/internal/InternalWeek1.g:274:1: ( ( ruleTerminalExpression ) )
            // ../se.bjornkjellgren.week1.ui/src-gen/se/bjornkjellgren/ui/contentassist/antlr/internal/InternalWeek1.g:275:1: ( ruleTerminalExpression )
            {
            // ../se.bjornkjellgren.week1.ui/src-gen/se/bjornkjellgren/ui/contentassist/antlr/internal/InternalWeek1.g:275:1: ( ruleTerminalExpression )
            // ../se.bjornkjellgren.week1.ui/src-gen/se/bjornkjellgren/ui/contentassist/antlr/internal/InternalWeek1.g:276:1: ruleTerminalExpression
            {
             before(grammarAccess.getExpressionAccess().getTerminalExpressionParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleTerminalExpression_in_rule__Expression__Group__0__Impl523);
            ruleTerminalExpression();

            state._fsp--;

             after(grammarAccess.getExpressionAccess().getTerminalExpressionParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group__0__Impl"


    // $ANTLR start "rule__Expression__Group__1"
    // ../se.bjornkjellgren.week1.ui/src-gen/se/bjornkjellgren/ui/contentassist/antlr/internal/InternalWeek1.g:287:1: rule__Expression__Group__1 : rule__Expression__Group__1__Impl ;
    public final void rule__Expression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../se.bjornkjellgren.week1.ui/src-gen/se/bjornkjellgren/ui/contentassist/antlr/internal/InternalWeek1.g:291:1: ( rule__Expression__Group__1__Impl )
            // ../se.bjornkjellgren.week1.ui/src-gen/se/bjornkjellgren/ui/contentassist/antlr/internal/InternalWeek1.g:292:2: rule__Expression__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Expression__Group__1__Impl_in_rule__Expression__Group__1552);
            rule__Expression__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group__1"


    // $ANTLR start "rule__Expression__Group__1__Impl"
    // ../se.bjornkjellgren.week1.ui/src-gen/se/bjornkjellgren/ui/contentassist/antlr/internal/InternalWeek1.g:298:1: rule__Expression__Group__1__Impl : ( ( rule__Expression__Group_1__0 )? ) ;
    public final void rule__Expression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../se.bjornkjellgren.week1.ui/src-gen/se/bjornkjellgren/ui/contentassist/antlr/internal/InternalWeek1.g:302:1: ( ( ( rule__Expression__Group_1__0 )? ) )
            // ../se.bjornkjellgren.week1.ui/src-gen/se/bjornkjellgren/ui/contentassist/antlr/internal/InternalWeek1.g:303:1: ( ( rule__Expression__Group_1__0 )? )
            {
            // ../se.bjornkjellgren.week1.ui/src-gen/se/bjornkjellgren/ui/contentassist/antlr/internal/InternalWeek1.g:303:1: ( ( rule__Expression__Group_1__0 )? )
            // ../se.bjornkjellgren.week1.ui/src-gen/se/bjornkjellgren/ui/contentassist/antlr/internal/InternalWeek1.g:304:1: ( rule__Expression__Group_1__0 )?
            {
             before(grammarAccess.getExpressionAccess().getGroup_1()); 
            // ../se.bjornkjellgren.week1.ui/src-gen/se/bjornkjellgren/ui/contentassist/antlr/internal/InternalWeek1.g:305:1: ( rule__Expression__Group_1__0 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( ((LA4_0>=11 && LA4_0<=13)) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../se.bjornkjellgren.week1.ui/src-gen/se/bjornkjellgren/ui/contentassist/antlr/internal/InternalWeek1.g:305:2: rule__Expression__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Expression__Group_1__0_in_rule__Expression__Group__1__Impl579);
                    rule__Expression__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getExpressionAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group__1__Impl"


    // $ANTLR start "rule__Expression__Group_1__0"
    // ../se.bjornkjellgren.week1.ui/src-gen/se/bjornkjellgren/ui/contentassist/antlr/internal/InternalWeek1.g:319:1: rule__Expression__Group_1__0 : rule__Expression__Group_1__0__Impl rule__Expression__Group_1__1 ;
    public final void rule__Expression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../se.bjornkjellgren.week1.ui/src-gen/se/bjornkjellgren/ui/contentassist/antlr/internal/InternalWeek1.g:323:1: ( rule__Expression__Group_1__0__Impl rule__Expression__Group_1__1 )
            // ../se.bjornkjellgren.week1.ui/src-gen/se/bjornkjellgren/ui/contentassist/antlr/internal/InternalWeek1.g:324:2: rule__Expression__Group_1__0__Impl rule__Expression__Group_1__1
            {
            pushFollow(FOLLOW_rule__Expression__Group_1__0__Impl_in_rule__Expression__Group_1__0614);
            rule__Expression__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Expression__Group_1__1_in_rule__Expression__Group_1__0617);
            rule__Expression__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group_1__0"


    // $ANTLR start "rule__Expression__Group_1__0__Impl"
    // ../se.bjornkjellgren.week1.ui/src-gen/se/bjornkjellgren/ui/contentassist/antlr/internal/InternalWeek1.g:331:1: rule__Expression__Group_1__0__Impl : ( ruleOperator ) ;
    public final void rule__Expression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../se.bjornkjellgren.week1.ui/src-gen/se/bjornkjellgren/ui/contentassist/antlr/internal/InternalWeek1.g:335:1: ( ( ruleOperator ) )
            // ../se.bjornkjellgren.week1.ui/src-gen/se/bjornkjellgren/ui/contentassist/antlr/internal/InternalWeek1.g:336:1: ( ruleOperator )
            {
            // ../se.bjornkjellgren.week1.ui/src-gen/se/bjornkjellgren/ui/contentassist/antlr/internal/InternalWeek1.g:336:1: ( ruleOperator )
            // ../se.bjornkjellgren.week1.ui/src-gen/se/bjornkjellgren/ui/contentassist/antlr/internal/InternalWeek1.g:337:1: ruleOperator
            {
             before(grammarAccess.getExpressionAccess().getOperatorParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleOperator_in_rule__Expression__Group_1__0__Impl644);
            ruleOperator();

            state._fsp--;

             after(grammarAccess.getExpressionAccess().getOperatorParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group_1__0__Impl"


    // $ANTLR start "rule__Expression__Group_1__1"
    // ../se.bjornkjellgren.week1.ui/src-gen/se/bjornkjellgren/ui/contentassist/antlr/internal/InternalWeek1.g:348:1: rule__Expression__Group_1__1 : rule__Expression__Group_1__1__Impl ;
    public final void rule__Expression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../se.bjornkjellgren.week1.ui/src-gen/se/bjornkjellgren/ui/contentassist/antlr/internal/InternalWeek1.g:352:1: ( rule__Expression__Group_1__1__Impl )
            // ../se.bjornkjellgren.week1.ui/src-gen/se/bjornkjellgren/ui/contentassist/antlr/internal/InternalWeek1.g:353:2: rule__Expression__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Expression__Group_1__1__Impl_in_rule__Expression__Group_1__1673);
            rule__Expression__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group_1__1"


    // $ANTLR start "rule__Expression__Group_1__1__Impl"
    // ../se.bjornkjellgren.week1.ui/src-gen/se/bjornkjellgren/ui/contentassist/antlr/internal/InternalWeek1.g:359:1: rule__Expression__Group_1__1__Impl : ( ruleTerminalExpression ) ;
    public final void rule__Expression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../se.bjornkjellgren.week1.ui/src-gen/se/bjornkjellgren/ui/contentassist/antlr/internal/InternalWeek1.g:363:1: ( ( ruleTerminalExpression ) )
            // ../se.bjornkjellgren.week1.ui/src-gen/se/bjornkjellgren/ui/contentassist/antlr/internal/InternalWeek1.g:364:1: ( ruleTerminalExpression )
            {
            // ../se.bjornkjellgren.week1.ui/src-gen/se/bjornkjellgren/ui/contentassist/antlr/internal/InternalWeek1.g:364:1: ( ruleTerminalExpression )
            // ../se.bjornkjellgren.week1.ui/src-gen/se/bjornkjellgren/ui/contentassist/antlr/internal/InternalWeek1.g:365:1: ruleTerminalExpression
            {
             before(grammarAccess.getExpressionAccess().getTerminalExpressionParserRuleCall_1_1()); 
            pushFollow(FOLLOW_ruleTerminalExpression_in_rule__Expression__Group_1__1__Impl700);
            ruleTerminalExpression();

            state._fsp--;

             after(grammarAccess.getExpressionAccess().getTerminalExpressionParserRuleCall_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group_1__1__Impl"


    // $ANTLR start "rule__TerminalExpression__Group_0__0"
    // ../se.bjornkjellgren.week1.ui/src-gen/se/bjornkjellgren/ui/contentassist/antlr/internal/InternalWeek1.g:380:1: rule__TerminalExpression__Group_0__0 : rule__TerminalExpression__Group_0__0__Impl rule__TerminalExpression__Group_0__1 ;
    public final void rule__TerminalExpression__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../se.bjornkjellgren.week1.ui/src-gen/se/bjornkjellgren/ui/contentassist/antlr/internal/InternalWeek1.g:384:1: ( rule__TerminalExpression__Group_0__0__Impl rule__TerminalExpression__Group_0__1 )
            // ../se.bjornkjellgren.week1.ui/src-gen/se/bjornkjellgren/ui/contentassist/antlr/internal/InternalWeek1.g:385:2: rule__TerminalExpression__Group_0__0__Impl rule__TerminalExpression__Group_0__1
            {
            pushFollow(FOLLOW_rule__TerminalExpression__Group_0__0__Impl_in_rule__TerminalExpression__Group_0__0733);
            rule__TerminalExpression__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TerminalExpression__Group_0__1_in_rule__TerminalExpression__Group_0__0736);
            rule__TerminalExpression__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalExpression__Group_0__0"


    // $ANTLR start "rule__TerminalExpression__Group_0__0__Impl"
    // ../se.bjornkjellgren.week1.ui/src-gen/se/bjornkjellgren/ui/contentassist/antlr/internal/InternalWeek1.g:392:1: rule__TerminalExpression__Group_0__0__Impl : ( '(' ) ;
    public final void rule__TerminalExpression__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../se.bjornkjellgren.week1.ui/src-gen/se/bjornkjellgren/ui/contentassist/antlr/internal/InternalWeek1.g:396:1: ( ( '(' ) )
            // ../se.bjornkjellgren.week1.ui/src-gen/se/bjornkjellgren/ui/contentassist/antlr/internal/InternalWeek1.g:397:1: ( '(' )
            {
            // ../se.bjornkjellgren.week1.ui/src-gen/se/bjornkjellgren/ui/contentassist/antlr/internal/InternalWeek1.g:397:1: ( '(' )
            // ../se.bjornkjellgren.week1.ui/src-gen/se/bjornkjellgren/ui/contentassist/antlr/internal/InternalWeek1.g:398:1: '('
            {
             before(grammarAccess.getTerminalExpressionAccess().getLeftParenthesisKeyword_0_0()); 
            match(input,14,FOLLOW_14_in_rule__TerminalExpression__Group_0__0__Impl764); 
             after(grammarAccess.getTerminalExpressionAccess().getLeftParenthesisKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalExpression__Group_0__0__Impl"


    // $ANTLR start "rule__TerminalExpression__Group_0__1"
    // ../se.bjornkjellgren.week1.ui/src-gen/se/bjornkjellgren/ui/contentassist/antlr/internal/InternalWeek1.g:411:1: rule__TerminalExpression__Group_0__1 : rule__TerminalExpression__Group_0__1__Impl rule__TerminalExpression__Group_0__2 ;
    public final void rule__TerminalExpression__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../se.bjornkjellgren.week1.ui/src-gen/se/bjornkjellgren/ui/contentassist/antlr/internal/InternalWeek1.g:415:1: ( rule__TerminalExpression__Group_0__1__Impl rule__TerminalExpression__Group_0__2 )
            // ../se.bjornkjellgren.week1.ui/src-gen/se/bjornkjellgren/ui/contentassist/antlr/internal/InternalWeek1.g:416:2: rule__TerminalExpression__Group_0__1__Impl rule__TerminalExpression__Group_0__2
            {
            pushFollow(FOLLOW_rule__TerminalExpression__Group_0__1__Impl_in_rule__TerminalExpression__Group_0__1795);
            rule__TerminalExpression__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TerminalExpression__Group_0__2_in_rule__TerminalExpression__Group_0__1798);
            rule__TerminalExpression__Group_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalExpression__Group_0__1"


    // $ANTLR start "rule__TerminalExpression__Group_0__1__Impl"
    // ../se.bjornkjellgren.week1.ui/src-gen/se/bjornkjellgren/ui/contentassist/antlr/internal/InternalWeek1.g:423:1: rule__TerminalExpression__Group_0__1__Impl : ( ruleExpression ) ;
    public final void rule__TerminalExpression__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../se.bjornkjellgren.week1.ui/src-gen/se/bjornkjellgren/ui/contentassist/antlr/internal/InternalWeek1.g:427:1: ( ( ruleExpression ) )
            // ../se.bjornkjellgren.week1.ui/src-gen/se/bjornkjellgren/ui/contentassist/antlr/internal/InternalWeek1.g:428:1: ( ruleExpression )
            {
            // ../se.bjornkjellgren.week1.ui/src-gen/se/bjornkjellgren/ui/contentassist/antlr/internal/InternalWeek1.g:428:1: ( ruleExpression )
            // ../se.bjornkjellgren.week1.ui/src-gen/se/bjornkjellgren/ui/contentassist/antlr/internal/InternalWeek1.g:429:1: ruleExpression
            {
             before(grammarAccess.getTerminalExpressionAccess().getExpressionParserRuleCall_0_1()); 
            pushFollow(FOLLOW_ruleExpression_in_rule__TerminalExpression__Group_0__1__Impl825);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getTerminalExpressionAccess().getExpressionParserRuleCall_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalExpression__Group_0__1__Impl"


    // $ANTLR start "rule__TerminalExpression__Group_0__2"
    // ../se.bjornkjellgren.week1.ui/src-gen/se/bjornkjellgren/ui/contentassist/antlr/internal/InternalWeek1.g:440:1: rule__TerminalExpression__Group_0__2 : rule__TerminalExpression__Group_0__2__Impl ;
    public final void rule__TerminalExpression__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../se.bjornkjellgren.week1.ui/src-gen/se/bjornkjellgren/ui/contentassist/antlr/internal/InternalWeek1.g:444:1: ( rule__TerminalExpression__Group_0__2__Impl )
            // ../se.bjornkjellgren.week1.ui/src-gen/se/bjornkjellgren/ui/contentassist/antlr/internal/InternalWeek1.g:445:2: rule__TerminalExpression__Group_0__2__Impl
            {
            pushFollow(FOLLOW_rule__TerminalExpression__Group_0__2__Impl_in_rule__TerminalExpression__Group_0__2854);
            rule__TerminalExpression__Group_0__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalExpression__Group_0__2"


    // $ANTLR start "rule__TerminalExpression__Group_0__2__Impl"
    // ../se.bjornkjellgren.week1.ui/src-gen/se/bjornkjellgren/ui/contentassist/antlr/internal/InternalWeek1.g:451:1: rule__TerminalExpression__Group_0__2__Impl : ( ')' ) ;
    public final void rule__TerminalExpression__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../se.bjornkjellgren.week1.ui/src-gen/se/bjornkjellgren/ui/contentassist/antlr/internal/InternalWeek1.g:455:1: ( ( ')' ) )
            // ../se.bjornkjellgren.week1.ui/src-gen/se/bjornkjellgren/ui/contentassist/antlr/internal/InternalWeek1.g:456:1: ( ')' )
            {
            // ../se.bjornkjellgren.week1.ui/src-gen/se/bjornkjellgren/ui/contentassist/antlr/internal/InternalWeek1.g:456:1: ( ')' )
            // ../se.bjornkjellgren.week1.ui/src-gen/se/bjornkjellgren/ui/contentassist/antlr/internal/InternalWeek1.g:457:1: ')'
            {
             before(grammarAccess.getTerminalExpressionAccess().getRightParenthesisKeyword_0_2()); 
            match(input,15,FOLLOW_15_in_rule__TerminalExpression__Group_0__2__Impl882); 
             after(grammarAccess.getTerminalExpressionAccess().getRightParenthesisKeyword_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalExpression__Group_0__2__Impl"


    // $ANTLR start "rule__Week1__ElementsAssignment"
    // ../se.bjornkjellgren.week1.ui/src-gen/se/bjornkjellgren/ui/contentassist/antlr/internal/InternalWeek1.g:477:1: rule__Week1__ElementsAssignment : ( ruleExpression ) ;
    public final void rule__Week1__ElementsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../se.bjornkjellgren.week1.ui/src-gen/se/bjornkjellgren/ui/contentassist/antlr/internal/InternalWeek1.g:481:1: ( ( ruleExpression ) )
            // ../se.bjornkjellgren.week1.ui/src-gen/se/bjornkjellgren/ui/contentassist/antlr/internal/InternalWeek1.g:482:1: ( ruleExpression )
            {
            // ../se.bjornkjellgren.week1.ui/src-gen/se/bjornkjellgren/ui/contentassist/antlr/internal/InternalWeek1.g:482:1: ( ruleExpression )
            // ../se.bjornkjellgren.week1.ui/src-gen/se/bjornkjellgren/ui/contentassist/antlr/internal/InternalWeek1.g:483:1: ruleExpression
            {
             before(grammarAccess.getWeek1Access().getElementsExpressionParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleExpression_in_rule__Week1__ElementsAssignment924);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getWeek1Access().getElementsExpressionParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Week1__ElementsAssignment"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleWeek1_in_entryRuleWeek161 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWeek168 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Week1__ElementsAssignment_in_ruleWeek194 = new BitSet(new long[]{0x0000000000004012L});
    public static final BitSet FOLLOW_ruleExpression_in_entryRuleExpression122 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpression129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression__Group__0_in_ruleExpression155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTerminalExpression_in_entryRuleTerminalExpression182 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTerminalExpression189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TerminalExpression__Alternatives_in_ruleTerminalExpression215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperator_in_entryRuleOperator242 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOperator249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operator__Alternatives_in_ruleOperator275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumber_in_entryRuleNumber302 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumber309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleNumber335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TerminalExpression__Group_0__0_in_rule__TerminalExpression__Alternatives370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumber_in_rule__TerminalExpression__Alternatives388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__Operator__Alternatives421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Operator__Alternatives441 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Operator__Alternatives461 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression__Group__0__Impl_in_rule__Expression__Group__0493 = new BitSet(new long[]{0x0000000000003800L});
    public static final BitSet FOLLOW_rule__Expression__Group__1_in_rule__Expression__Group__0496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTerminalExpression_in_rule__Expression__Group__0__Impl523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression__Group__1__Impl_in_rule__Expression__Group__1552 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression__Group_1__0_in_rule__Expression__Group__1__Impl579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression__Group_1__0__Impl_in_rule__Expression__Group_1__0614 = new BitSet(new long[]{0x0000000000004010L});
    public static final BitSet FOLLOW_rule__Expression__Group_1__1_in_rule__Expression__Group_1__0617 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperator_in_rule__Expression__Group_1__0__Impl644 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression__Group_1__1__Impl_in_rule__Expression__Group_1__1673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTerminalExpression_in_rule__Expression__Group_1__1__Impl700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TerminalExpression__Group_0__0__Impl_in_rule__TerminalExpression__Group_0__0733 = new BitSet(new long[]{0x0000000000004010L});
    public static final BitSet FOLLOW_rule__TerminalExpression__Group_0__1_in_rule__TerminalExpression__Group_0__0736 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__TerminalExpression__Group_0__0__Impl764 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TerminalExpression__Group_0__1__Impl_in_rule__TerminalExpression__Group_0__1795 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__TerminalExpression__Group_0__2_in_rule__TerminalExpression__Group_0__1798 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__TerminalExpression__Group_0__1__Impl825 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TerminalExpression__Group_0__2__Impl_in_rule__TerminalExpression__Group_0__2854 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__TerminalExpression__Group_0__2__Impl882 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__Week1__ElementsAssignment924 = new BitSet(new long[]{0x0000000000000002L});

}