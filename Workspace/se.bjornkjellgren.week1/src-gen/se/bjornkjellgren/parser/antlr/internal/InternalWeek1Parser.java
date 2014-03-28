package se.bjornkjellgren.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import se.bjornkjellgren.services.Week1GrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalWeek1Parser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'('", "')'", "'+'", "'-'", "'*'"
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
    public String getGrammarFileName() { return "../se.bjornkjellgren.week1/src-gen/se/bjornkjellgren/parser/antlr/internal/InternalWeek1.g"; }



     	private Week1GrammarAccess grammarAccess;
     	
        public InternalWeek1Parser(TokenStream input, Week1GrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Week1";	
       	}
       	
       	@Override
       	protected Week1GrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleWeek1"
    // ../se.bjornkjellgren.week1/src-gen/se/bjornkjellgren/parser/antlr/internal/InternalWeek1.g:67:1: entryRuleWeek1 returns [EObject current=null] : iv_ruleWeek1= ruleWeek1 EOF ;
    public final EObject entryRuleWeek1() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWeek1 = null;


        try {
            // ../se.bjornkjellgren.week1/src-gen/se/bjornkjellgren/parser/antlr/internal/InternalWeek1.g:68:2: (iv_ruleWeek1= ruleWeek1 EOF )
            // ../se.bjornkjellgren.week1/src-gen/se/bjornkjellgren/parser/antlr/internal/InternalWeek1.g:69:2: iv_ruleWeek1= ruleWeek1 EOF
            {
             newCompositeNode(grammarAccess.getWeek1Rule()); 
            pushFollow(FOLLOW_ruleWeek1_in_entryRuleWeek175);
            iv_ruleWeek1=ruleWeek1();

            state._fsp--;

             current =iv_ruleWeek1; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleWeek185); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleWeek1"


    // $ANTLR start "ruleWeek1"
    // ../se.bjornkjellgren.week1/src-gen/se/bjornkjellgren/parser/antlr/internal/InternalWeek1.g:76:1: ruleWeek1 returns [EObject current=null] : ( (lv_elements_0_0= ruleExpression ) )* ;
    public final EObject ruleWeek1() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_elements_0_0 = null;


         enterRule(); 
            
        try {
            // ../se.bjornkjellgren.week1/src-gen/se/bjornkjellgren/parser/antlr/internal/InternalWeek1.g:79:28: ( ( (lv_elements_0_0= ruleExpression ) )* )
            // ../se.bjornkjellgren.week1/src-gen/se/bjornkjellgren/parser/antlr/internal/InternalWeek1.g:80:1: ( (lv_elements_0_0= ruleExpression ) )*
            {
            // ../se.bjornkjellgren.week1/src-gen/se/bjornkjellgren/parser/antlr/internal/InternalWeek1.g:80:1: ( (lv_elements_0_0= ruleExpression ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_INT||LA1_0==11) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../se.bjornkjellgren.week1/src-gen/se/bjornkjellgren/parser/antlr/internal/InternalWeek1.g:81:1: (lv_elements_0_0= ruleExpression )
            	    {
            	    // ../se.bjornkjellgren.week1/src-gen/se/bjornkjellgren/parser/antlr/internal/InternalWeek1.g:81:1: (lv_elements_0_0= ruleExpression )
            	    // ../se.bjornkjellgren.week1/src-gen/se/bjornkjellgren/parser/antlr/internal/InternalWeek1.g:82:3: lv_elements_0_0= ruleExpression
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getWeek1Access().getElementsExpressionParserRuleCall_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleExpression_in_ruleWeek1130);
            	    lv_elements_0_0=ruleExpression();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getWeek1Rule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"elements",
            	            		lv_elements_0_0, 
            	            		"Expression");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleWeek1"


    // $ANTLR start "entryRuleExpression"
    // ../se.bjornkjellgren.week1/src-gen/se/bjornkjellgren/parser/antlr/internal/InternalWeek1.g:106:1: entryRuleExpression returns [String current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final String entryRuleExpression() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleExpression = null;


        try {
            // ../se.bjornkjellgren.week1/src-gen/se/bjornkjellgren/parser/antlr/internal/InternalWeek1.g:107:2: (iv_ruleExpression= ruleExpression EOF )
            // ../se.bjornkjellgren.week1/src-gen/se/bjornkjellgren/parser/antlr/internal/InternalWeek1.g:108:2: iv_ruleExpression= ruleExpression EOF
            {
             newCompositeNode(grammarAccess.getExpressionRule()); 
            pushFollow(FOLLOW_ruleExpression_in_entryRuleExpression167);
            iv_ruleExpression=ruleExpression();

            state._fsp--;

             current =iv_ruleExpression.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpression178); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // ../se.bjornkjellgren.week1/src-gen/se/bjornkjellgren/parser/antlr/internal/InternalWeek1.g:115:1: ruleExpression returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_TerminalExpression_0= ruleTerminalExpression (this_Operator_1= ruleOperator this_TerminalExpression_2= ruleTerminalExpression )? ) ;
    public final AntlrDatatypeRuleToken ruleExpression() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_TerminalExpression_0 = null;

        AntlrDatatypeRuleToken this_Operator_1 = null;

        AntlrDatatypeRuleToken this_TerminalExpression_2 = null;


         enterRule(); 
            
        try {
            // ../se.bjornkjellgren.week1/src-gen/se/bjornkjellgren/parser/antlr/internal/InternalWeek1.g:118:28: ( (this_TerminalExpression_0= ruleTerminalExpression (this_Operator_1= ruleOperator this_TerminalExpression_2= ruleTerminalExpression )? ) )
            // ../se.bjornkjellgren.week1/src-gen/se/bjornkjellgren/parser/antlr/internal/InternalWeek1.g:119:1: (this_TerminalExpression_0= ruleTerminalExpression (this_Operator_1= ruleOperator this_TerminalExpression_2= ruleTerminalExpression )? )
            {
            // ../se.bjornkjellgren.week1/src-gen/se/bjornkjellgren/parser/antlr/internal/InternalWeek1.g:119:1: (this_TerminalExpression_0= ruleTerminalExpression (this_Operator_1= ruleOperator this_TerminalExpression_2= ruleTerminalExpression )? )
            // ../se.bjornkjellgren.week1/src-gen/se/bjornkjellgren/parser/antlr/internal/InternalWeek1.g:120:5: this_TerminalExpression_0= ruleTerminalExpression (this_Operator_1= ruleOperator this_TerminalExpression_2= ruleTerminalExpression )?
            {
             
                    newCompositeNode(grammarAccess.getExpressionAccess().getTerminalExpressionParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleTerminalExpression_in_ruleExpression225);
            this_TerminalExpression_0=ruleTerminalExpression();

            state._fsp--;


            		current.merge(this_TerminalExpression_0);
                
             
                    afterParserOrEnumRuleCall();
                
            // ../se.bjornkjellgren.week1/src-gen/se/bjornkjellgren/parser/antlr/internal/InternalWeek1.g:130:1: (this_Operator_1= ruleOperator this_TerminalExpression_2= ruleTerminalExpression )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( ((LA2_0>=13 && LA2_0<=15)) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../se.bjornkjellgren.week1/src-gen/se/bjornkjellgren/parser/antlr/internal/InternalWeek1.g:131:5: this_Operator_1= ruleOperator this_TerminalExpression_2= ruleTerminalExpression
                    {
                     
                            newCompositeNode(grammarAccess.getExpressionAccess().getOperatorParserRuleCall_1_0()); 
                        
                    pushFollow(FOLLOW_ruleOperator_in_ruleExpression253);
                    this_Operator_1=ruleOperator();

                    state._fsp--;


                    		current.merge(this_Operator_1);
                        
                     
                            afterParserOrEnumRuleCall();
                        
                     
                            newCompositeNode(grammarAccess.getExpressionAccess().getTerminalExpressionParserRuleCall_1_1()); 
                        
                    pushFollow(FOLLOW_ruleTerminalExpression_in_ruleExpression280);
                    this_TerminalExpression_2=ruleTerminalExpression();

                    state._fsp--;


                    		current.merge(this_TerminalExpression_2);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleTerminalExpression"
    // ../se.bjornkjellgren.week1/src-gen/se/bjornkjellgren/parser/antlr/internal/InternalWeek1.g:160:1: entryRuleTerminalExpression returns [String current=null] : iv_ruleTerminalExpression= ruleTerminalExpression EOF ;
    public final String entryRuleTerminalExpression() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTerminalExpression = null;


        try {
            // ../se.bjornkjellgren.week1/src-gen/se/bjornkjellgren/parser/antlr/internal/InternalWeek1.g:161:2: (iv_ruleTerminalExpression= ruleTerminalExpression EOF )
            // ../se.bjornkjellgren.week1/src-gen/se/bjornkjellgren/parser/antlr/internal/InternalWeek1.g:162:2: iv_ruleTerminalExpression= ruleTerminalExpression EOF
            {
             newCompositeNode(grammarAccess.getTerminalExpressionRule()); 
            pushFollow(FOLLOW_ruleTerminalExpression_in_entryRuleTerminalExpression328);
            iv_ruleTerminalExpression=ruleTerminalExpression();

            state._fsp--;

             current =iv_ruleTerminalExpression.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTerminalExpression339); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTerminalExpression"


    // $ANTLR start "ruleTerminalExpression"
    // ../se.bjornkjellgren.week1/src-gen/se/bjornkjellgren/parser/antlr/internal/InternalWeek1.g:169:1: ruleTerminalExpression returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '(' this_Expression_1= ruleExpression kw= ')' ) | this_Number_3= ruleNumber ) ;
    public final AntlrDatatypeRuleToken ruleTerminalExpression() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_Expression_1 = null;

        AntlrDatatypeRuleToken this_Number_3 = null;


         enterRule(); 
            
        try {
            // ../se.bjornkjellgren.week1/src-gen/se/bjornkjellgren/parser/antlr/internal/InternalWeek1.g:172:28: ( ( (kw= '(' this_Expression_1= ruleExpression kw= ')' ) | this_Number_3= ruleNumber ) )
            // ../se.bjornkjellgren.week1/src-gen/se/bjornkjellgren/parser/antlr/internal/InternalWeek1.g:173:1: ( (kw= '(' this_Expression_1= ruleExpression kw= ')' ) | this_Number_3= ruleNumber )
            {
            // ../se.bjornkjellgren.week1/src-gen/se/bjornkjellgren/parser/antlr/internal/InternalWeek1.g:173:1: ( (kw= '(' this_Expression_1= ruleExpression kw= ')' ) | this_Number_3= ruleNumber )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==11) ) {
                alt3=1;
            }
            else if ( (LA3_0==RULE_INT) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../se.bjornkjellgren.week1/src-gen/se/bjornkjellgren/parser/antlr/internal/InternalWeek1.g:173:2: (kw= '(' this_Expression_1= ruleExpression kw= ')' )
                    {
                    // ../se.bjornkjellgren.week1/src-gen/se/bjornkjellgren/parser/antlr/internal/InternalWeek1.g:173:2: (kw= '(' this_Expression_1= ruleExpression kw= ')' )
                    // ../se.bjornkjellgren.week1/src-gen/se/bjornkjellgren/parser/antlr/internal/InternalWeek1.g:174:2: kw= '(' this_Expression_1= ruleExpression kw= ')'
                    {
                    kw=(Token)match(input,11,FOLLOW_11_in_ruleTerminalExpression378); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getTerminalExpressionAccess().getLeftParenthesisKeyword_0_0()); 
                        
                     
                            newCompositeNode(grammarAccess.getTerminalExpressionAccess().getExpressionParserRuleCall_0_1()); 
                        
                    pushFollow(FOLLOW_ruleExpression_in_ruleTerminalExpression400);
                    this_Expression_1=ruleExpression();

                    state._fsp--;


                    		current.merge(this_Expression_1);
                        
                     
                            afterParserOrEnumRuleCall();
                        
                    kw=(Token)match(input,12,FOLLOW_12_in_ruleTerminalExpression418); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getTerminalExpressionAccess().getRightParenthesisKeyword_0_2()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../se.bjornkjellgren.week1/src-gen/se/bjornkjellgren/parser/antlr/internal/InternalWeek1.g:198:5: this_Number_3= ruleNumber
                    {
                     
                            newCompositeNode(grammarAccess.getTerminalExpressionAccess().getNumberParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleNumber_in_ruleTerminalExpression447);
                    this_Number_3=ruleNumber();

                    state._fsp--;


                    		current.merge(this_Number_3);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTerminalExpression"


    // $ANTLR start "entryRuleOperator"
    // ../se.bjornkjellgren.week1/src-gen/se/bjornkjellgren/parser/antlr/internal/InternalWeek1.g:216:1: entryRuleOperator returns [String current=null] : iv_ruleOperator= ruleOperator EOF ;
    public final String entryRuleOperator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOperator = null;


        try {
            // ../se.bjornkjellgren.week1/src-gen/se/bjornkjellgren/parser/antlr/internal/InternalWeek1.g:217:2: (iv_ruleOperator= ruleOperator EOF )
            // ../se.bjornkjellgren.week1/src-gen/se/bjornkjellgren/parser/antlr/internal/InternalWeek1.g:218:2: iv_ruleOperator= ruleOperator EOF
            {
             newCompositeNode(grammarAccess.getOperatorRule()); 
            pushFollow(FOLLOW_ruleOperator_in_entryRuleOperator493);
            iv_ruleOperator=ruleOperator();

            state._fsp--;

             current =iv_ruleOperator.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOperator504); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOperator"


    // $ANTLR start "ruleOperator"
    // ../se.bjornkjellgren.week1/src-gen/se/bjornkjellgren/parser/antlr/internal/InternalWeek1.g:225:1: ruleOperator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '+' | kw= '-' | kw= '*' ) ;
    public final AntlrDatatypeRuleToken ruleOperator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../se.bjornkjellgren.week1/src-gen/se/bjornkjellgren/parser/antlr/internal/InternalWeek1.g:228:28: ( (kw= '+' | kw= '-' | kw= '*' ) )
            // ../se.bjornkjellgren.week1/src-gen/se/bjornkjellgren/parser/antlr/internal/InternalWeek1.g:229:1: (kw= '+' | kw= '-' | kw= '*' )
            {
            // ../se.bjornkjellgren.week1/src-gen/se/bjornkjellgren/parser/antlr/internal/InternalWeek1.g:229:1: (kw= '+' | kw= '-' | kw= '*' )
            int alt4=3;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt4=1;
                }
                break;
            case 14:
                {
                alt4=2;
                }
                break;
            case 15:
                {
                alt4=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // ../se.bjornkjellgren.week1/src-gen/se/bjornkjellgren/parser/antlr/internal/InternalWeek1.g:230:2: kw= '+'
                    {
                    kw=(Token)match(input,13,FOLLOW_13_in_ruleOperator542); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getOperatorAccess().getPlusSignKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../se.bjornkjellgren.week1/src-gen/se/bjornkjellgren/parser/antlr/internal/InternalWeek1.g:237:2: kw= '-'
                    {
                    kw=(Token)match(input,14,FOLLOW_14_in_ruleOperator561); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getOperatorAccess().getHyphenMinusKeyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../se.bjornkjellgren.week1/src-gen/se/bjornkjellgren/parser/antlr/internal/InternalWeek1.g:244:2: kw= '*'
                    {
                    kw=(Token)match(input,15,FOLLOW_15_in_ruleOperator580); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getOperatorAccess().getAsteriskKeyword_2()); 
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOperator"


    // $ANTLR start "entryRuleNumber"
    // ../se.bjornkjellgren.week1/src-gen/se/bjornkjellgren/parser/antlr/internal/InternalWeek1.g:257:1: entryRuleNumber returns [String current=null] : iv_ruleNumber= ruleNumber EOF ;
    public final String entryRuleNumber() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNumber = null;


        try {
            // ../se.bjornkjellgren.week1/src-gen/se/bjornkjellgren/parser/antlr/internal/InternalWeek1.g:258:2: (iv_ruleNumber= ruleNumber EOF )
            // ../se.bjornkjellgren.week1/src-gen/se/bjornkjellgren/parser/antlr/internal/InternalWeek1.g:259:2: iv_ruleNumber= ruleNumber EOF
            {
             newCompositeNode(grammarAccess.getNumberRule()); 
            pushFollow(FOLLOW_ruleNumber_in_entryRuleNumber621);
            iv_ruleNumber=ruleNumber();

            state._fsp--;

             current =iv_ruleNumber.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumber632); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNumber"


    // $ANTLR start "ruleNumber"
    // ../se.bjornkjellgren.week1/src-gen/se/bjornkjellgren/parser/antlr/internal/InternalWeek1.g:266:1: ruleNumber returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_INT_0= RULE_INT ;
    public final AntlrDatatypeRuleToken ruleNumber() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;

         enterRule(); 
            
        try {
            // ../se.bjornkjellgren.week1/src-gen/se/bjornkjellgren/parser/antlr/internal/InternalWeek1.g:269:28: (this_INT_0= RULE_INT )
            // ../se.bjornkjellgren.week1/src-gen/se/bjornkjellgren/parser/antlr/internal/InternalWeek1.g:270:5: this_INT_0= RULE_INT
            {
            this_INT_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleNumber671); 

            		current.merge(this_INT_0);
                
             
                newLeafNode(this_INT_0, grammarAccess.getNumberAccess().getINTTerminalRuleCall()); 
                

            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNumber"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleWeek1_in_entryRuleWeek175 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWeek185 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleWeek1130 = new BitSet(new long[]{0x0000000000000812L});
    public static final BitSet FOLLOW_ruleExpression_in_entryRuleExpression167 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpression178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTerminalExpression_in_ruleExpression225 = new BitSet(new long[]{0x000000000000E002L});
    public static final BitSet FOLLOW_ruleOperator_in_ruleExpression253 = new BitSet(new long[]{0x0000000000000810L});
    public static final BitSet FOLLOW_ruleTerminalExpression_in_ruleExpression280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTerminalExpression_in_entryRuleTerminalExpression328 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTerminalExpression339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleTerminalExpression378 = new BitSet(new long[]{0x0000000000001810L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleTerminalExpression400 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleTerminalExpression418 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumber_in_ruleTerminalExpression447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperator_in_entryRuleOperator493 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOperator504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleOperator542 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleOperator561 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleOperator580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumber_in_entryRuleNumber621 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumber632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleNumber671 = new BitSet(new long[]{0x0000000000000002L});

}