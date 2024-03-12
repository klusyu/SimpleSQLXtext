package org.xtext.example.simple_sql.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.simple_sql.services.SQLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSQLParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'CREATE'", "'TABLE'", "'('", "')'", "','", "'INT'", "'VARCHAR'", "'BOOLEAN'", "'TINYINT'", "'NOT'", "'NULL'", "'PRIMARY'", "'KEY'", "'SELECT'", "'FROM'", "'WHERE'", "'OR'", "'AND'", "'='", "'<>'", "'<'", "'<='", "'>'", "'>='", "'true'", "'false'"
    };
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__35=35;
    public static final int T__14=14;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalSQLParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalSQLParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalSQLParser.tokenNames; }
    public String getGrammarFileName() { return "InternalSQL.g"; }



     	private SQLGrammarAccess grammarAccess;

        public InternalSQLParser(TokenStream input, SQLGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Model";
       	}

       	@Override
       	protected SQLGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModel"
    // InternalSQL.g:64:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalSQL.g:64:46: (iv_ruleModel= ruleModel EOF )
            // InternalSQL.g:65:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalSQL.g:71:1: ruleModel returns [EObject current=null] : ( (lv_statements_0_0= ruleStatement ) )* ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_statements_0_0 = null;



        	enterRule();

        try {
            // InternalSQL.g:77:2: ( ( (lv_statements_0_0= ruleStatement ) )* )
            // InternalSQL.g:78:2: ( (lv_statements_0_0= ruleStatement ) )*
            {
            // InternalSQL.g:78:2: ( (lv_statements_0_0= ruleStatement ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11||LA1_0==24) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalSQL.g:79:3: (lv_statements_0_0= ruleStatement )
            	    {
            	    // InternalSQL.g:79:3: (lv_statements_0_0= ruleStatement )
            	    // InternalSQL.g:80:4: lv_statements_0_0= ruleStatement
            	    {

            	    				newCompositeNode(grammarAccess.getModelAccess().getStatementsStatementParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_3);
            	    lv_statements_0_0=ruleStatement();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getModelRule());
            	    				}
            	    				add(
            	    					current,
            	    					"statements",
            	    					lv_statements_0_0,
            	    					"org.xtext.example.simple_sql.SQL.Statement");
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
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleStatement"
    // InternalSQL.g:100:1: entryRuleStatement returns [EObject current=null] : iv_ruleStatement= ruleStatement EOF ;
    public final EObject entryRuleStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatement = null;


        try {
            // InternalSQL.g:100:50: (iv_ruleStatement= ruleStatement EOF )
            // InternalSQL.g:101:2: iv_ruleStatement= ruleStatement EOF
            {
             newCompositeNode(grammarAccess.getStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStatement=ruleStatement();

            state._fsp--;

             current =iv_ruleStatement; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleStatement"


    // $ANTLR start "ruleStatement"
    // InternalSQL.g:107:1: ruleStatement returns [EObject current=null] : (this_CreateTableStatement_0= ruleCreateTableStatement | this_SelectStatement_1= ruleSelectStatement ) ;
    public final EObject ruleStatement() throws RecognitionException {
        EObject current = null;

        EObject this_CreateTableStatement_0 = null;

        EObject this_SelectStatement_1 = null;



        	enterRule();

        try {
            // InternalSQL.g:113:2: ( (this_CreateTableStatement_0= ruleCreateTableStatement | this_SelectStatement_1= ruleSelectStatement ) )
            // InternalSQL.g:114:2: (this_CreateTableStatement_0= ruleCreateTableStatement | this_SelectStatement_1= ruleSelectStatement )
            {
            // InternalSQL.g:114:2: (this_CreateTableStatement_0= ruleCreateTableStatement | this_SelectStatement_1= ruleSelectStatement )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==11) ) {
                alt2=1;
            }
            else if ( (LA2_0==24) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalSQL.g:115:3: this_CreateTableStatement_0= ruleCreateTableStatement
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getCreateTableStatementParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_CreateTableStatement_0=ruleCreateTableStatement();

                    state._fsp--;


                    			current = this_CreateTableStatement_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalSQL.g:124:3: this_SelectStatement_1= ruleSelectStatement
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getSelectStatementParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_SelectStatement_1=ruleSelectStatement();

                    state._fsp--;


                    			current = this_SelectStatement_1;
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
    // $ANTLR end "ruleStatement"


    // $ANTLR start "entryRuleCreateTableStatement"
    // InternalSQL.g:136:1: entryRuleCreateTableStatement returns [EObject current=null] : iv_ruleCreateTableStatement= ruleCreateTableStatement EOF ;
    public final EObject entryRuleCreateTableStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCreateTableStatement = null;


        try {
            // InternalSQL.g:136:61: (iv_ruleCreateTableStatement= ruleCreateTableStatement EOF )
            // InternalSQL.g:137:2: iv_ruleCreateTableStatement= ruleCreateTableStatement EOF
            {
             newCompositeNode(grammarAccess.getCreateTableStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCreateTableStatement=ruleCreateTableStatement();

            state._fsp--;

             current =iv_ruleCreateTableStatement; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleCreateTableStatement"


    // $ANTLR start "ruleCreateTableStatement"
    // InternalSQL.g:143:1: ruleCreateTableStatement returns [EObject current=null] : (otherlv_0= 'CREATE' otherlv_1= 'TABLE' ( (lv_tableName_2_0= RULE_STRING ) ) otherlv_3= '(' ( (lv_columns_4_0= ruleColumnDefinition ) )* otherlv_5= ')' ) ;
    public final EObject ruleCreateTableStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_tableName_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_columns_4_0 = null;



        	enterRule();

        try {
            // InternalSQL.g:149:2: ( (otherlv_0= 'CREATE' otherlv_1= 'TABLE' ( (lv_tableName_2_0= RULE_STRING ) ) otherlv_3= '(' ( (lv_columns_4_0= ruleColumnDefinition ) )* otherlv_5= ')' ) )
            // InternalSQL.g:150:2: (otherlv_0= 'CREATE' otherlv_1= 'TABLE' ( (lv_tableName_2_0= RULE_STRING ) ) otherlv_3= '(' ( (lv_columns_4_0= ruleColumnDefinition ) )* otherlv_5= ')' )
            {
            // InternalSQL.g:150:2: (otherlv_0= 'CREATE' otherlv_1= 'TABLE' ( (lv_tableName_2_0= RULE_STRING ) ) otherlv_3= '(' ( (lv_columns_4_0= ruleColumnDefinition ) )* otherlv_5= ')' )
            // InternalSQL.g:151:3: otherlv_0= 'CREATE' otherlv_1= 'TABLE' ( (lv_tableName_2_0= RULE_STRING ) ) otherlv_3= '(' ( (lv_columns_4_0= ruleColumnDefinition ) )* otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getCreateTableStatementAccess().getCREATEKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getCreateTableStatementAccess().getTABLEKeyword_1());
            		
            // InternalSQL.g:159:3: ( (lv_tableName_2_0= RULE_STRING ) )
            // InternalSQL.g:160:4: (lv_tableName_2_0= RULE_STRING )
            {
            // InternalSQL.g:160:4: (lv_tableName_2_0= RULE_STRING )
            // InternalSQL.g:161:5: lv_tableName_2_0= RULE_STRING
            {
            lv_tableName_2_0=(Token)match(input,RULE_STRING,FOLLOW_6); 

            					newLeafNode(lv_tableName_2_0, grammarAccess.getCreateTableStatementAccess().getTableNameSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCreateTableStatementRule());
            					}
            					setWithLastConsumed(
            						current,
            						"tableName",
            						lv_tableName_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_3=(Token)match(input,13,FOLLOW_7); 

            			newLeafNode(otherlv_3, grammarAccess.getCreateTableStatementAccess().getLeftParenthesisKeyword_3());
            		
            // InternalSQL.g:181:3: ( (lv_columns_4_0= ruleColumnDefinition ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==RULE_ID) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalSQL.g:182:4: (lv_columns_4_0= ruleColumnDefinition )
            	    {
            	    // InternalSQL.g:182:4: (lv_columns_4_0= ruleColumnDefinition )
            	    // InternalSQL.g:183:5: lv_columns_4_0= ruleColumnDefinition
            	    {

            	    					newCompositeNode(grammarAccess.getCreateTableStatementAccess().getColumnsColumnDefinitionParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_7);
            	    lv_columns_4_0=ruleColumnDefinition();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getCreateTableStatementRule());
            	    					}
            	    					add(
            	    						current,
            	    						"columns",
            	    						lv_columns_4_0,
            	    						"org.xtext.example.simple_sql.SQL.ColumnDefinition");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            otherlv_5=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getCreateTableStatementAccess().getRightParenthesisKeyword_5());
            		

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
    // $ANTLR end "ruleCreateTableStatement"


    // $ANTLR start "entryRuleColumnDefinition"
    // InternalSQL.g:208:1: entryRuleColumnDefinition returns [EObject current=null] : iv_ruleColumnDefinition= ruleColumnDefinition EOF ;
    public final EObject entryRuleColumnDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleColumnDefinition = null;


        try {
            // InternalSQL.g:208:57: (iv_ruleColumnDefinition= ruleColumnDefinition EOF )
            // InternalSQL.g:209:2: iv_ruleColumnDefinition= ruleColumnDefinition EOF
            {
             newCompositeNode(grammarAccess.getColumnDefinitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleColumnDefinition=ruleColumnDefinition();

            state._fsp--;

             current =iv_ruleColumnDefinition; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleColumnDefinition"


    // $ANTLR start "ruleColumnDefinition"
    // InternalSQL.g:215:1: ruleColumnDefinition returns [EObject current=null] : ( ( (lv_columnName_0_0= RULE_ID ) ) ( (lv_columnType_1_0= ruleColumnType ) ) ( (lv_constraints_2_0= ruleConstraint ) )* (otherlv_3= ',' )? ) ;
    public final EObject ruleColumnDefinition() throws RecognitionException {
        EObject current = null;

        Token lv_columnName_0_0=null;
        Token otherlv_3=null;
        EObject lv_columnType_1_0 = null;

        AntlrDatatypeRuleToken lv_constraints_2_0 = null;



        	enterRule();

        try {
            // InternalSQL.g:221:2: ( ( ( (lv_columnName_0_0= RULE_ID ) ) ( (lv_columnType_1_0= ruleColumnType ) ) ( (lv_constraints_2_0= ruleConstraint ) )* (otherlv_3= ',' )? ) )
            // InternalSQL.g:222:2: ( ( (lv_columnName_0_0= RULE_ID ) ) ( (lv_columnType_1_0= ruleColumnType ) ) ( (lv_constraints_2_0= ruleConstraint ) )* (otherlv_3= ',' )? )
            {
            // InternalSQL.g:222:2: ( ( (lv_columnName_0_0= RULE_ID ) ) ( (lv_columnType_1_0= ruleColumnType ) ) ( (lv_constraints_2_0= ruleConstraint ) )* (otherlv_3= ',' )? )
            // InternalSQL.g:223:3: ( (lv_columnName_0_0= RULE_ID ) ) ( (lv_columnType_1_0= ruleColumnType ) ) ( (lv_constraints_2_0= ruleConstraint ) )* (otherlv_3= ',' )?
            {
            // InternalSQL.g:223:3: ( (lv_columnName_0_0= RULE_ID ) )
            // InternalSQL.g:224:4: (lv_columnName_0_0= RULE_ID )
            {
            // InternalSQL.g:224:4: (lv_columnName_0_0= RULE_ID )
            // InternalSQL.g:225:5: lv_columnName_0_0= RULE_ID
            {
            lv_columnName_0_0=(Token)match(input,RULE_ID,FOLLOW_8); 

            					newLeafNode(lv_columnName_0_0, grammarAccess.getColumnDefinitionAccess().getColumnNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getColumnDefinitionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"columnName",
            						lv_columnName_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalSQL.g:241:3: ( (lv_columnType_1_0= ruleColumnType ) )
            // InternalSQL.g:242:4: (lv_columnType_1_0= ruleColumnType )
            {
            // InternalSQL.g:242:4: (lv_columnType_1_0= ruleColumnType )
            // InternalSQL.g:243:5: lv_columnType_1_0= ruleColumnType
            {

            					newCompositeNode(grammarAccess.getColumnDefinitionAccess().getColumnTypeColumnTypeParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_9);
            lv_columnType_1_0=ruleColumnType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getColumnDefinitionRule());
            					}
            					set(
            						current,
            						"columnType",
            						lv_columnType_1_0,
            						"org.xtext.example.simple_sql.SQL.ColumnType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSQL.g:260:3: ( (lv_constraints_2_0= ruleConstraint ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==20||LA4_0==22) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalSQL.g:261:4: (lv_constraints_2_0= ruleConstraint )
            	    {
            	    // InternalSQL.g:261:4: (lv_constraints_2_0= ruleConstraint )
            	    // InternalSQL.g:262:5: lv_constraints_2_0= ruleConstraint
            	    {

            	    					newCompositeNode(grammarAccess.getColumnDefinitionAccess().getConstraintsConstraintParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_9);
            	    lv_constraints_2_0=ruleConstraint();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getColumnDefinitionRule());
            	    					}
            	    					add(
            	    						current,
            	    						"constraints",
            	    						lv_constraints_2_0,
            	    						"org.xtext.example.simple_sql.SQL.Constraint");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            // InternalSQL.g:279:3: (otherlv_3= ',' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==15) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalSQL.g:280:4: otherlv_3= ','
                    {
                    otherlv_3=(Token)match(input,15,FOLLOW_2); 

                    				newLeafNode(otherlv_3, grammarAccess.getColumnDefinitionAccess().getCommaKeyword_3());
                    			

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
    // $ANTLR end "ruleColumnDefinition"


    // $ANTLR start "entryRuleColumnType"
    // InternalSQL.g:289:1: entryRuleColumnType returns [EObject current=null] : iv_ruleColumnType= ruleColumnType EOF ;
    public final EObject entryRuleColumnType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleColumnType = null;


        try {
            // InternalSQL.g:289:51: (iv_ruleColumnType= ruleColumnType EOF )
            // InternalSQL.g:290:2: iv_ruleColumnType= ruleColumnType EOF
            {
             newCompositeNode(grammarAccess.getColumnTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleColumnType=ruleColumnType();

            state._fsp--;

             current =iv_ruleColumnType; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleColumnType"


    // $ANTLR start "ruleColumnType"
    // InternalSQL.g:296:1: ruleColumnType returns [EObject current=null] : ( ( () otherlv_1= 'INT' ) | (otherlv_2= 'VARCHAR' otherlv_3= '(' ( (lv_length_4_0= RULE_INT ) ) otherlv_5= ')' ) | ( () otherlv_7= 'BOOLEAN' ) | ( () otherlv_9= 'TINYINT' ) ) ;
    public final EObject ruleColumnType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_length_4_0=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;


        	enterRule();

        try {
            // InternalSQL.g:302:2: ( ( ( () otherlv_1= 'INT' ) | (otherlv_2= 'VARCHAR' otherlv_3= '(' ( (lv_length_4_0= RULE_INT ) ) otherlv_5= ')' ) | ( () otherlv_7= 'BOOLEAN' ) | ( () otherlv_9= 'TINYINT' ) ) )
            // InternalSQL.g:303:2: ( ( () otherlv_1= 'INT' ) | (otherlv_2= 'VARCHAR' otherlv_3= '(' ( (lv_length_4_0= RULE_INT ) ) otherlv_5= ')' ) | ( () otherlv_7= 'BOOLEAN' ) | ( () otherlv_9= 'TINYINT' ) )
            {
            // InternalSQL.g:303:2: ( ( () otherlv_1= 'INT' ) | (otherlv_2= 'VARCHAR' otherlv_3= '(' ( (lv_length_4_0= RULE_INT ) ) otherlv_5= ')' ) | ( () otherlv_7= 'BOOLEAN' ) | ( () otherlv_9= 'TINYINT' ) )
            int alt6=4;
            switch ( input.LA(1) ) {
            case 16:
                {
                alt6=1;
                }
                break;
            case 17:
                {
                alt6=2;
                }
                break;
            case 18:
                {
                alt6=3;
                }
                break;
            case 19:
                {
                alt6=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalSQL.g:304:3: ( () otherlv_1= 'INT' )
                    {
                    // InternalSQL.g:304:3: ( () otherlv_1= 'INT' )
                    // InternalSQL.g:305:4: () otherlv_1= 'INT'
                    {
                    // InternalSQL.g:305:4: ()
                    // InternalSQL.g:306:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getColumnTypeAccess().getColumnTypeAction_0_0(),
                    						current);
                    				

                    }

                    otherlv_1=(Token)match(input,16,FOLLOW_2); 

                    				newLeafNode(otherlv_1, grammarAccess.getColumnTypeAccess().getINTKeyword_0_1());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalSQL.g:318:3: (otherlv_2= 'VARCHAR' otherlv_3= '(' ( (lv_length_4_0= RULE_INT ) ) otherlv_5= ')' )
                    {
                    // InternalSQL.g:318:3: (otherlv_2= 'VARCHAR' otherlv_3= '(' ( (lv_length_4_0= RULE_INT ) ) otherlv_5= ')' )
                    // InternalSQL.g:319:4: otherlv_2= 'VARCHAR' otherlv_3= '(' ( (lv_length_4_0= RULE_INT ) ) otherlv_5= ')'
                    {
                    otherlv_2=(Token)match(input,17,FOLLOW_6); 

                    				newLeafNode(otherlv_2, grammarAccess.getColumnTypeAccess().getVARCHARKeyword_1_0());
                    			
                    otherlv_3=(Token)match(input,13,FOLLOW_10); 

                    				newLeafNode(otherlv_3, grammarAccess.getColumnTypeAccess().getLeftParenthesisKeyword_1_1());
                    			
                    // InternalSQL.g:327:4: ( (lv_length_4_0= RULE_INT ) )
                    // InternalSQL.g:328:5: (lv_length_4_0= RULE_INT )
                    {
                    // InternalSQL.g:328:5: (lv_length_4_0= RULE_INT )
                    // InternalSQL.g:329:6: lv_length_4_0= RULE_INT
                    {
                    lv_length_4_0=(Token)match(input,RULE_INT,FOLLOW_11); 

                    						newLeafNode(lv_length_4_0, grammarAccess.getColumnTypeAccess().getLengthINTTerminalRuleCall_1_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getColumnTypeRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"length",
                    							lv_length_4_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }

                    otherlv_5=(Token)match(input,14,FOLLOW_2); 

                    				newLeafNode(otherlv_5, grammarAccess.getColumnTypeAccess().getRightParenthesisKeyword_1_3());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalSQL.g:351:3: ( () otherlv_7= 'BOOLEAN' )
                    {
                    // InternalSQL.g:351:3: ( () otherlv_7= 'BOOLEAN' )
                    // InternalSQL.g:352:4: () otherlv_7= 'BOOLEAN'
                    {
                    // InternalSQL.g:352:4: ()
                    // InternalSQL.g:353:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getColumnTypeAccess().getColumnTypeAction_2_0(),
                    						current);
                    				

                    }

                    otherlv_7=(Token)match(input,18,FOLLOW_2); 

                    				newLeafNode(otherlv_7, grammarAccess.getColumnTypeAccess().getBOOLEANKeyword_2_1());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalSQL.g:365:3: ( () otherlv_9= 'TINYINT' )
                    {
                    // InternalSQL.g:365:3: ( () otherlv_9= 'TINYINT' )
                    // InternalSQL.g:366:4: () otherlv_9= 'TINYINT'
                    {
                    // InternalSQL.g:366:4: ()
                    // InternalSQL.g:367:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getColumnTypeAccess().getColumnTypeAction_3_0(),
                    						current);
                    				

                    }

                    otherlv_9=(Token)match(input,19,FOLLOW_2); 

                    				newLeafNode(otherlv_9, grammarAccess.getColumnTypeAccess().getTINYINTKeyword_3_1());
                    			

                    }


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
    // $ANTLR end "ruleColumnType"


    // $ANTLR start "entryRuleConstraint"
    // InternalSQL.g:382:1: entryRuleConstraint returns [String current=null] : iv_ruleConstraint= ruleConstraint EOF ;
    public final String entryRuleConstraint() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleConstraint = null;


        try {
            // InternalSQL.g:382:50: (iv_ruleConstraint= ruleConstraint EOF )
            // InternalSQL.g:383:2: iv_ruleConstraint= ruleConstraint EOF
            {
             newCompositeNode(grammarAccess.getConstraintRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConstraint=ruleConstraint();

            state._fsp--;

             current =iv_ruleConstraint.getText(); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleConstraint"


    // $ANTLR start "ruleConstraint"
    // InternalSQL.g:389:1: ruleConstraint returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= 'NOT' kw= 'NULL' ) | (kw= 'PRIMARY' kw= 'KEY' ) ) ;
    public final AntlrDatatypeRuleToken ruleConstraint() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalSQL.g:395:2: ( ( (kw= 'NOT' kw= 'NULL' ) | (kw= 'PRIMARY' kw= 'KEY' ) ) )
            // InternalSQL.g:396:2: ( (kw= 'NOT' kw= 'NULL' ) | (kw= 'PRIMARY' kw= 'KEY' ) )
            {
            // InternalSQL.g:396:2: ( (kw= 'NOT' kw= 'NULL' ) | (kw= 'PRIMARY' kw= 'KEY' ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==20) ) {
                alt7=1;
            }
            else if ( (LA7_0==22) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalSQL.g:397:3: (kw= 'NOT' kw= 'NULL' )
                    {
                    // InternalSQL.g:397:3: (kw= 'NOT' kw= 'NULL' )
                    // InternalSQL.g:398:4: kw= 'NOT' kw= 'NULL'
                    {
                    kw=(Token)match(input,20,FOLLOW_12); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getConstraintAccess().getNOTKeyword_0_0());
                    			
                    kw=(Token)match(input,21,FOLLOW_2); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getConstraintAccess().getNULLKeyword_0_1());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalSQL.g:410:3: (kw= 'PRIMARY' kw= 'KEY' )
                    {
                    // InternalSQL.g:410:3: (kw= 'PRIMARY' kw= 'KEY' )
                    // InternalSQL.g:411:4: kw= 'PRIMARY' kw= 'KEY'
                    {
                    kw=(Token)match(input,22,FOLLOW_13); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getConstraintAccess().getPRIMARYKeyword_1_0());
                    			
                    kw=(Token)match(input,23,FOLLOW_2); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getConstraintAccess().getKEYKeyword_1_1());
                    			

                    }


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
    // $ANTLR end "ruleConstraint"


    // $ANTLR start "entryRuleSelectStatement"
    // InternalSQL.g:426:1: entryRuleSelectStatement returns [EObject current=null] : iv_ruleSelectStatement= ruleSelectStatement EOF ;
    public final EObject entryRuleSelectStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelectStatement = null;


        try {
            // InternalSQL.g:426:56: (iv_ruleSelectStatement= ruleSelectStatement EOF )
            // InternalSQL.g:427:2: iv_ruleSelectStatement= ruleSelectStatement EOF
            {
             newCompositeNode(grammarAccess.getSelectStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSelectStatement=ruleSelectStatement();

            state._fsp--;

             current =iv_ruleSelectStatement; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleSelectStatement"


    // $ANTLR start "ruleSelectStatement"
    // InternalSQL.g:433:1: ruleSelectStatement returns [EObject current=null] : (otherlv_0= 'SELECT' ( (lv_selectedColumns_1_0= ruleSelectedColumns ) ) otherlv_2= 'FROM' ( (lv_tableName_3_0= RULE_STRING ) ) ( (lv_whereClause_4_0= ruleWhereClause ) )? ) ;
    public final EObject ruleSelectStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token lv_tableName_3_0=null;
        EObject lv_selectedColumns_1_0 = null;

        EObject lv_whereClause_4_0 = null;



        	enterRule();

        try {
            // InternalSQL.g:439:2: ( (otherlv_0= 'SELECT' ( (lv_selectedColumns_1_0= ruleSelectedColumns ) ) otherlv_2= 'FROM' ( (lv_tableName_3_0= RULE_STRING ) ) ( (lv_whereClause_4_0= ruleWhereClause ) )? ) )
            // InternalSQL.g:440:2: (otherlv_0= 'SELECT' ( (lv_selectedColumns_1_0= ruleSelectedColumns ) ) otherlv_2= 'FROM' ( (lv_tableName_3_0= RULE_STRING ) ) ( (lv_whereClause_4_0= ruleWhereClause ) )? )
            {
            // InternalSQL.g:440:2: (otherlv_0= 'SELECT' ( (lv_selectedColumns_1_0= ruleSelectedColumns ) ) otherlv_2= 'FROM' ( (lv_tableName_3_0= RULE_STRING ) ) ( (lv_whereClause_4_0= ruleWhereClause ) )? )
            // InternalSQL.g:441:3: otherlv_0= 'SELECT' ( (lv_selectedColumns_1_0= ruleSelectedColumns ) ) otherlv_2= 'FROM' ( (lv_tableName_3_0= RULE_STRING ) ) ( (lv_whereClause_4_0= ruleWhereClause ) )?
            {
            otherlv_0=(Token)match(input,24,FOLLOW_14); 

            			newLeafNode(otherlv_0, grammarAccess.getSelectStatementAccess().getSELECTKeyword_0());
            		
            // InternalSQL.g:445:3: ( (lv_selectedColumns_1_0= ruleSelectedColumns ) )
            // InternalSQL.g:446:4: (lv_selectedColumns_1_0= ruleSelectedColumns )
            {
            // InternalSQL.g:446:4: (lv_selectedColumns_1_0= ruleSelectedColumns )
            // InternalSQL.g:447:5: lv_selectedColumns_1_0= ruleSelectedColumns
            {

            					newCompositeNode(grammarAccess.getSelectStatementAccess().getSelectedColumnsSelectedColumnsParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_15);
            lv_selectedColumns_1_0=ruleSelectedColumns();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSelectStatementRule());
            					}
            					set(
            						current,
            						"selectedColumns",
            						lv_selectedColumns_1_0,
            						"org.xtext.example.simple_sql.SQL.SelectedColumns");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,25,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getSelectStatementAccess().getFROMKeyword_2());
            		
            // InternalSQL.g:468:3: ( (lv_tableName_3_0= RULE_STRING ) )
            // InternalSQL.g:469:4: (lv_tableName_3_0= RULE_STRING )
            {
            // InternalSQL.g:469:4: (lv_tableName_3_0= RULE_STRING )
            // InternalSQL.g:470:5: lv_tableName_3_0= RULE_STRING
            {
            lv_tableName_3_0=(Token)match(input,RULE_STRING,FOLLOW_16); 

            					newLeafNode(lv_tableName_3_0, grammarAccess.getSelectStatementAccess().getTableNameSTRINGTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSelectStatementRule());
            					}
            					setWithLastConsumed(
            						current,
            						"tableName",
            						lv_tableName_3_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalSQL.g:486:3: ( (lv_whereClause_4_0= ruleWhereClause ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==26) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalSQL.g:487:4: (lv_whereClause_4_0= ruleWhereClause )
                    {
                    // InternalSQL.g:487:4: (lv_whereClause_4_0= ruleWhereClause )
                    // InternalSQL.g:488:5: lv_whereClause_4_0= ruleWhereClause
                    {

                    					newCompositeNode(grammarAccess.getSelectStatementAccess().getWhereClauseWhereClauseParserRuleCall_4_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_whereClause_4_0=ruleWhereClause();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getSelectStatementRule());
                    					}
                    					set(
                    						current,
                    						"whereClause",
                    						lv_whereClause_4_0,
                    						"org.xtext.example.simple_sql.SQL.WhereClause");
                    					afterParserOrEnumRuleCall();
                    				

                    }


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
    // $ANTLR end "ruleSelectStatement"


    // $ANTLR start "entryRuleSelectedColumns"
    // InternalSQL.g:509:1: entryRuleSelectedColumns returns [EObject current=null] : iv_ruleSelectedColumns= ruleSelectedColumns EOF ;
    public final EObject entryRuleSelectedColumns() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelectedColumns = null;


        try {
            // InternalSQL.g:509:56: (iv_ruleSelectedColumns= ruleSelectedColumns EOF )
            // InternalSQL.g:510:2: iv_ruleSelectedColumns= ruleSelectedColumns EOF
            {
             newCompositeNode(grammarAccess.getSelectedColumnsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSelectedColumns=ruleSelectedColumns();

            state._fsp--;

             current =iv_ruleSelectedColumns; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleSelectedColumns"


    // $ANTLR start "ruleSelectedColumns"
    // InternalSQL.g:516:1: ruleSelectedColumns returns [EObject current=null] : ( ( (lv_columns_0_0= RULE_ID ) ) (otherlv_1= ',' ( (lv_columns_2_0= RULE_ID ) ) )* ) ;
    public final EObject ruleSelectedColumns() throws RecognitionException {
        EObject current = null;

        Token lv_columns_0_0=null;
        Token otherlv_1=null;
        Token lv_columns_2_0=null;


        	enterRule();

        try {
            // InternalSQL.g:522:2: ( ( ( (lv_columns_0_0= RULE_ID ) ) (otherlv_1= ',' ( (lv_columns_2_0= RULE_ID ) ) )* ) )
            // InternalSQL.g:523:2: ( ( (lv_columns_0_0= RULE_ID ) ) (otherlv_1= ',' ( (lv_columns_2_0= RULE_ID ) ) )* )
            {
            // InternalSQL.g:523:2: ( ( (lv_columns_0_0= RULE_ID ) ) (otherlv_1= ',' ( (lv_columns_2_0= RULE_ID ) ) )* )
            // InternalSQL.g:524:3: ( (lv_columns_0_0= RULE_ID ) ) (otherlv_1= ',' ( (lv_columns_2_0= RULE_ID ) ) )*
            {
            // InternalSQL.g:524:3: ( (lv_columns_0_0= RULE_ID ) )
            // InternalSQL.g:525:4: (lv_columns_0_0= RULE_ID )
            {
            // InternalSQL.g:525:4: (lv_columns_0_0= RULE_ID )
            // InternalSQL.g:526:5: lv_columns_0_0= RULE_ID
            {
            lv_columns_0_0=(Token)match(input,RULE_ID,FOLLOW_17); 

            					newLeafNode(lv_columns_0_0, grammarAccess.getSelectedColumnsAccess().getColumnsIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSelectedColumnsRule());
            					}
            					addWithLastConsumed(
            						current,
            						"columns",
            						lv_columns_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalSQL.g:542:3: (otherlv_1= ',' ( (lv_columns_2_0= RULE_ID ) ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==15) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalSQL.g:543:4: otherlv_1= ',' ( (lv_columns_2_0= RULE_ID ) )
            	    {
            	    otherlv_1=(Token)match(input,15,FOLLOW_14); 

            	    				newLeafNode(otherlv_1, grammarAccess.getSelectedColumnsAccess().getCommaKeyword_1_0());
            	    			
            	    // InternalSQL.g:547:4: ( (lv_columns_2_0= RULE_ID ) )
            	    // InternalSQL.g:548:5: (lv_columns_2_0= RULE_ID )
            	    {
            	    // InternalSQL.g:548:5: (lv_columns_2_0= RULE_ID )
            	    // InternalSQL.g:549:6: lv_columns_2_0= RULE_ID
            	    {
            	    lv_columns_2_0=(Token)match(input,RULE_ID,FOLLOW_17); 

            	    						newLeafNode(lv_columns_2_0, grammarAccess.getSelectedColumnsAccess().getColumnsIDTerminalRuleCall_1_1_0());
            	    					

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getSelectedColumnsRule());
            	    						}
            	    						addWithLastConsumed(
            	    							current,
            	    							"columns",
            	    							lv_columns_2_0,
            	    							"org.eclipse.xtext.common.Terminals.ID");
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);


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
    // $ANTLR end "ruleSelectedColumns"


    // $ANTLR start "entryRuleWhereClause"
    // InternalSQL.g:570:1: entryRuleWhereClause returns [EObject current=null] : iv_ruleWhereClause= ruleWhereClause EOF ;
    public final EObject entryRuleWhereClause() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWhereClause = null;


        try {
            // InternalSQL.g:570:52: (iv_ruleWhereClause= ruleWhereClause EOF )
            // InternalSQL.g:571:2: iv_ruleWhereClause= ruleWhereClause EOF
            {
             newCompositeNode(grammarAccess.getWhereClauseRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleWhereClause=ruleWhereClause();

            state._fsp--;

             current =iv_ruleWhereClause; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleWhereClause"


    // $ANTLR start "ruleWhereClause"
    // InternalSQL.g:577:1: ruleWhereClause returns [EObject current=null] : (otherlv_0= 'WHERE' ( (lv_expression_1_0= ruleExpression ) ) ) ;
    public final EObject ruleWhereClause() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_expression_1_0 = null;



        	enterRule();

        try {
            // InternalSQL.g:583:2: ( (otherlv_0= 'WHERE' ( (lv_expression_1_0= ruleExpression ) ) ) )
            // InternalSQL.g:584:2: (otherlv_0= 'WHERE' ( (lv_expression_1_0= ruleExpression ) ) )
            {
            // InternalSQL.g:584:2: (otherlv_0= 'WHERE' ( (lv_expression_1_0= ruleExpression ) ) )
            // InternalSQL.g:585:3: otherlv_0= 'WHERE' ( (lv_expression_1_0= ruleExpression ) )
            {
            otherlv_0=(Token)match(input,26,FOLLOW_14); 

            			newLeafNode(otherlv_0, grammarAccess.getWhereClauseAccess().getWHEREKeyword_0());
            		
            // InternalSQL.g:589:3: ( (lv_expression_1_0= ruleExpression ) )
            // InternalSQL.g:590:4: (lv_expression_1_0= ruleExpression )
            {
            // InternalSQL.g:590:4: (lv_expression_1_0= ruleExpression )
            // InternalSQL.g:591:5: lv_expression_1_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getWhereClauseAccess().getExpressionExpressionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_expression_1_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getWhereClauseRule());
            					}
            					set(
            						current,
            						"expression",
            						lv_expression_1_0,
            						"org.xtext.example.simple_sql.SQL.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


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
    // $ANTLR end "ruleWhereClause"


    // $ANTLR start "entryRuleExpression"
    // InternalSQL.g:612:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // InternalSQL.g:612:51: (iv_ruleExpression= ruleExpression EOF )
            // InternalSQL.g:613:2: iv_ruleExpression= ruleExpression EOF
            {
             newCompositeNode(grammarAccess.getExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExpression=ruleExpression();

            state._fsp--;

             current =iv_ruleExpression; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalSQL.g:619:1: ruleExpression returns [EObject current=null] : (this_AndExpression_0= ruleAndExpression ( () otherlv_2= 'OR' ( (lv_right_3_0= ruleAndExpression ) ) )* ) ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_AndExpression_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalSQL.g:625:2: ( (this_AndExpression_0= ruleAndExpression ( () otherlv_2= 'OR' ( (lv_right_3_0= ruleAndExpression ) ) )* ) )
            // InternalSQL.g:626:2: (this_AndExpression_0= ruleAndExpression ( () otherlv_2= 'OR' ( (lv_right_3_0= ruleAndExpression ) ) )* )
            {
            // InternalSQL.g:626:2: (this_AndExpression_0= ruleAndExpression ( () otherlv_2= 'OR' ( (lv_right_3_0= ruleAndExpression ) ) )* )
            // InternalSQL.g:627:3: this_AndExpression_0= ruleAndExpression ( () otherlv_2= 'OR' ( (lv_right_3_0= ruleAndExpression ) ) )*
            {

            			newCompositeNode(grammarAccess.getExpressionAccess().getAndExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_18);
            this_AndExpression_0=ruleAndExpression();

            state._fsp--;


            			current = this_AndExpression_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalSQL.g:635:3: ( () otherlv_2= 'OR' ( (lv_right_3_0= ruleAndExpression ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==27) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalSQL.g:636:4: () otherlv_2= 'OR' ( (lv_right_3_0= ruleAndExpression ) )
            	    {
            	    // InternalSQL.g:636:4: ()
            	    // InternalSQL.g:637:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getExpressionAccess().getOrExpressionLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    otherlv_2=(Token)match(input,27,FOLLOW_14); 

            	    				newLeafNode(otherlv_2, grammarAccess.getExpressionAccess().getORKeyword_1_1());
            	    			
            	    // InternalSQL.g:647:4: ( (lv_right_3_0= ruleAndExpression ) )
            	    // InternalSQL.g:648:5: (lv_right_3_0= ruleAndExpression )
            	    {
            	    // InternalSQL.g:648:5: (lv_right_3_0= ruleAndExpression )
            	    // InternalSQL.g:649:6: lv_right_3_0= ruleAndExpression
            	    {

            	    						newCompositeNode(grammarAccess.getExpressionAccess().getRightAndExpressionParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_18);
            	    lv_right_3_0=ruleAndExpression();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getExpressionRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"org.xtext.example.simple_sql.SQL.AndExpression");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);


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


    // $ANTLR start "entryRuleAndExpression"
    // InternalSQL.g:671:1: entryRuleAndExpression returns [EObject current=null] : iv_ruleAndExpression= ruleAndExpression EOF ;
    public final EObject entryRuleAndExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAndExpression = null;


        try {
            // InternalSQL.g:671:54: (iv_ruleAndExpression= ruleAndExpression EOF )
            // InternalSQL.g:672:2: iv_ruleAndExpression= ruleAndExpression EOF
            {
             newCompositeNode(grammarAccess.getAndExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAndExpression=ruleAndExpression();

            state._fsp--;

             current =iv_ruleAndExpression; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleAndExpression"


    // $ANTLR start "ruleAndExpression"
    // InternalSQL.g:678:1: ruleAndExpression returns [EObject current=null] : (this_Comparison_0= ruleComparison ( () otherlv_2= 'AND' ( (lv_right_3_0= ruleComparison ) ) )* ) ;
    public final EObject ruleAndExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_Comparison_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalSQL.g:684:2: ( (this_Comparison_0= ruleComparison ( () otherlv_2= 'AND' ( (lv_right_3_0= ruleComparison ) ) )* ) )
            // InternalSQL.g:685:2: (this_Comparison_0= ruleComparison ( () otherlv_2= 'AND' ( (lv_right_3_0= ruleComparison ) ) )* )
            {
            // InternalSQL.g:685:2: (this_Comparison_0= ruleComparison ( () otherlv_2= 'AND' ( (lv_right_3_0= ruleComparison ) ) )* )
            // InternalSQL.g:686:3: this_Comparison_0= ruleComparison ( () otherlv_2= 'AND' ( (lv_right_3_0= ruleComparison ) ) )*
            {

            			newCompositeNode(grammarAccess.getAndExpressionAccess().getComparisonParserRuleCall_0());
            		
            pushFollow(FOLLOW_19);
            this_Comparison_0=ruleComparison();

            state._fsp--;


            			current = this_Comparison_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalSQL.g:694:3: ( () otherlv_2= 'AND' ( (lv_right_3_0= ruleComparison ) ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==28) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalSQL.g:695:4: () otherlv_2= 'AND' ( (lv_right_3_0= ruleComparison ) )
            	    {
            	    // InternalSQL.g:695:4: ()
            	    // InternalSQL.g:696:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getAndExpressionAccess().getAndExpressionLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    otherlv_2=(Token)match(input,28,FOLLOW_14); 

            	    				newLeafNode(otherlv_2, grammarAccess.getAndExpressionAccess().getANDKeyword_1_1());
            	    			
            	    // InternalSQL.g:706:4: ( (lv_right_3_0= ruleComparison ) )
            	    // InternalSQL.g:707:5: (lv_right_3_0= ruleComparison )
            	    {
            	    // InternalSQL.g:707:5: (lv_right_3_0= ruleComparison )
            	    // InternalSQL.g:708:6: lv_right_3_0= ruleComparison
            	    {

            	    						newCompositeNode(grammarAccess.getAndExpressionAccess().getRightComparisonParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_19);
            	    lv_right_3_0=ruleComparison();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getAndExpressionRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"org.xtext.example.simple_sql.SQL.Comparison");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);


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
    // $ANTLR end "ruleAndExpression"


    // $ANTLR start "entryRuleComparison"
    // InternalSQL.g:730:1: entryRuleComparison returns [EObject current=null] : iv_ruleComparison= ruleComparison EOF ;
    public final EObject entryRuleComparison() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComparison = null;


        try {
            // InternalSQL.g:730:51: (iv_ruleComparison= ruleComparison EOF )
            // InternalSQL.g:731:2: iv_ruleComparison= ruleComparison EOF
            {
             newCompositeNode(grammarAccess.getComparisonRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleComparison=ruleComparison();

            state._fsp--;

             current =iv_ruleComparison; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleComparison"


    // $ANTLR start "ruleComparison"
    // InternalSQL.g:737:1: ruleComparison returns [EObject current=null] : ( ( (lv_column_0_0= RULE_ID ) ) ( (lv_operator_1_0= ruleOperator ) ) ( (lv_value_2_0= ruleValue ) ) ) ;
    public final EObject ruleComparison() throws RecognitionException {
        EObject current = null;

        Token lv_column_0_0=null;
        AntlrDatatypeRuleToken lv_operator_1_0 = null;

        EObject lv_value_2_0 = null;



        	enterRule();

        try {
            // InternalSQL.g:743:2: ( ( ( (lv_column_0_0= RULE_ID ) ) ( (lv_operator_1_0= ruleOperator ) ) ( (lv_value_2_0= ruleValue ) ) ) )
            // InternalSQL.g:744:2: ( ( (lv_column_0_0= RULE_ID ) ) ( (lv_operator_1_0= ruleOperator ) ) ( (lv_value_2_0= ruleValue ) ) )
            {
            // InternalSQL.g:744:2: ( ( (lv_column_0_0= RULE_ID ) ) ( (lv_operator_1_0= ruleOperator ) ) ( (lv_value_2_0= ruleValue ) ) )
            // InternalSQL.g:745:3: ( (lv_column_0_0= RULE_ID ) ) ( (lv_operator_1_0= ruleOperator ) ) ( (lv_value_2_0= ruleValue ) )
            {
            // InternalSQL.g:745:3: ( (lv_column_0_0= RULE_ID ) )
            // InternalSQL.g:746:4: (lv_column_0_0= RULE_ID )
            {
            // InternalSQL.g:746:4: (lv_column_0_0= RULE_ID )
            // InternalSQL.g:747:5: lv_column_0_0= RULE_ID
            {
            lv_column_0_0=(Token)match(input,RULE_ID,FOLLOW_20); 

            					newLeafNode(lv_column_0_0, grammarAccess.getComparisonAccess().getColumnIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getComparisonRule());
            					}
            					setWithLastConsumed(
            						current,
            						"column",
            						lv_column_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalSQL.g:763:3: ( (lv_operator_1_0= ruleOperator ) )
            // InternalSQL.g:764:4: (lv_operator_1_0= ruleOperator )
            {
            // InternalSQL.g:764:4: (lv_operator_1_0= ruleOperator )
            // InternalSQL.g:765:5: lv_operator_1_0= ruleOperator
            {

            					newCompositeNode(grammarAccess.getComparisonAccess().getOperatorOperatorParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_21);
            lv_operator_1_0=ruleOperator();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getComparisonRule());
            					}
            					set(
            						current,
            						"operator",
            						lv_operator_1_0,
            						"org.xtext.example.simple_sql.SQL.Operator");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSQL.g:782:3: ( (lv_value_2_0= ruleValue ) )
            // InternalSQL.g:783:4: (lv_value_2_0= ruleValue )
            {
            // InternalSQL.g:783:4: (lv_value_2_0= ruleValue )
            // InternalSQL.g:784:5: lv_value_2_0= ruleValue
            {

            					newCompositeNode(grammarAccess.getComparisonAccess().getValueValueParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_value_2_0=ruleValue();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getComparisonRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_2_0,
            						"org.xtext.example.simple_sql.SQL.Value");
            					afterParserOrEnumRuleCall();
            				

            }


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
    // $ANTLR end "ruleComparison"


    // $ANTLR start "entryRuleOperator"
    // InternalSQL.g:805:1: entryRuleOperator returns [String current=null] : iv_ruleOperator= ruleOperator EOF ;
    public final String entryRuleOperator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOperator = null;


        try {
            // InternalSQL.g:805:48: (iv_ruleOperator= ruleOperator EOF )
            // InternalSQL.g:806:2: iv_ruleOperator= ruleOperator EOF
            {
             newCompositeNode(grammarAccess.getOperatorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOperator=ruleOperator();

            state._fsp--;

             current =iv_ruleOperator.getText(); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalSQL.g:812:1: ruleOperator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '=' | kw= '<>' | kw= '<' | kw= '<=' | kw= '>' | kw= '>=' ) ;
    public final AntlrDatatypeRuleToken ruleOperator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalSQL.g:818:2: ( (kw= '=' | kw= '<>' | kw= '<' | kw= '<=' | kw= '>' | kw= '>=' ) )
            // InternalSQL.g:819:2: (kw= '=' | kw= '<>' | kw= '<' | kw= '<=' | kw= '>' | kw= '>=' )
            {
            // InternalSQL.g:819:2: (kw= '=' | kw= '<>' | kw= '<' | kw= '<=' | kw= '>' | kw= '>=' )
            int alt12=6;
            switch ( input.LA(1) ) {
            case 29:
                {
                alt12=1;
                }
                break;
            case 30:
                {
                alt12=2;
                }
                break;
            case 31:
                {
                alt12=3;
                }
                break;
            case 32:
                {
                alt12=4;
                }
                break;
            case 33:
                {
                alt12=5;
                }
                break;
            case 34:
                {
                alt12=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // InternalSQL.g:820:3: kw= '='
                    {
                    kw=(Token)match(input,29,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getOperatorAccess().getEqualsSignKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalSQL.g:826:3: kw= '<>'
                    {
                    kw=(Token)match(input,30,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getOperatorAccess().getLessThanSignGreaterThanSignKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalSQL.g:832:3: kw= '<'
                    {
                    kw=(Token)match(input,31,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getOperatorAccess().getLessThanSignKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalSQL.g:838:3: kw= '<='
                    {
                    kw=(Token)match(input,32,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getOperatorAccess().getLessThanSignEqualsSignKeyword_3());
                    		

                    }
                    break;
                case 5 :
                    // InternalSQL.g:844:3: kw= '>'
                    {
                    kw=(Token)match(input,33,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getOperatorAccess().getGreaterThanSignKeyword_4());
                    		

                    }
                    break;
                case 6 :
                    // InternalSQL.g:850:3: kw= '>='
                    {
                    kw=(Token)match(input,34,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getOperatorAccess().getGreaterThanSignEqualsSignKeyword_5());
                    		

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


    // $ANTLR start "entryRuleValue"
    // InternalSQL.g:859:1: entryRuleValue returns [EObject current=null] : iv_ruleValue= ruleValue EOF ;
    public final EObject entryRuleValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValue = null;


        try {
            // InternalSQL.g:859:46: (iv_ruleValue= ruleValue EOF )
            // InternalSQL.g:860:2: iv_ruleValue= ruleValue EOF
            {
             newCompositeNode(grammarAccess.getValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleValue=ruleValue();

            state._fsp--;

             current =iv_ruleValue; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleValue"


    // $ANTLR start "ruleValue"
    // InternalSQL.g:866:1: ruleValue returns [EObject current=null] : (this_BooleanValue_0= ruleBooleanValue | this_NumberValue_1= ruleNumberValue | this_StringValue_2= ruleStringValue ) ;
    public final EObject ruleValue() throws RecognitionException {
        EObject current = null;

        EObject this_BooleanValue_0 = null;

        EObject this_NumberValue_1 = null;

        EObject this_StringValue_2 = null;



        	enterRule();

        try {
            // InternalSQL.g:872:2: ( (this_BooleanValue_0= ruleBooleanValue | this_NumberValue_1= ruleNumberValue | this_StringValue_2= ruleStringValue ) )
            // InternalSQL.g:873:2: (this_BooleanValue_0= ruleBooleanValue | this_NumberValue_1= ruleNumberValue | this_StringValue_2= ruleStringValue )
            {
            // InternalSQL.g:873:2: (this_BooleanValue_0= ruleBooleanValue | this_NumberValue_1= ruleNumberValue | this_StringValue_2= ruleStringValue )
            int alt13=3;
            switch ( input.LA(1) ) {
            case 35:
            case 36:
                {
                alt13=1;
                }
                break;
            case RULE_INT:
                {
                alt13=2;
                }
                break;
            case RULE_STRING:
                {
                alt13=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // InternalSQL.g:874:3: this_BooleanValue_0= ruleBooleanValue
                    {

                    			newCompositeNode(grammarAccess.getValueAccess().getBooleanValueParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_BooleanValue_0=ruleBooleanValue();

                    state._fsp--;


                    			current = this_BooleanValue_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalSQL.g:883:3: this_NumberValue_1= ruleNumberValue
                    {

                    			newCompositeNode(grammarAccess.getValueAccess().getNumberValueParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_NumberValue_1=ruleNumberValue();

                    state._fsp--;


                    			current = this_NumberValue_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalSQL.g:892:3: this_StringValue_2= ruleStringValue
                    {

                    			newCompositeNode(grammarAccess.getValueAccess().getStringValueParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_StringValue_2=ruleStringValue();

                    state._fsp--;


                    			current = this_StringValue_2;
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
    // $ANTLR end "ruleValue"


    // $ANTLR start "entryRuleBooleanValue"
    // InternalSQL.g:904:1: entryRuleBooleanValue returns [EObject current=null] : iv_ruleBooleanValue= ruleBooleanValue EOF ;
    public final EObject entryRuleBooleanValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanValue = null;


        try {
            // InternalSQL.g:904:53: (iv_ruleBooleanValue= ruleBooleanValue EOF )
            // InternalSQL.g:905:2: iv_ruleBooleanValue= ruleBooleanValue EOF
            {
             newCompositeNode(grammarAccess.getBooleanValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBooleanValue=ruleBooleanValue();

            state._fsp--;

             current =iv_ruleBooleanValue; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleBooleanValue"


    // $ANTLR start "ruleBooleanValue"
    // InternalSQL.g:911:1: ruleBooleanValue returns [EObject current=null] : ( ( (lv_value_0_1= 'true' | lv_value_0_2= 'false' ) ) ) ;
    public final EObject ruleBooleanValue() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_1=null;
        Token lv_value_0_2=null;


        	enterRule();

        try {
            // InternalSQL.g:917:2: ( ( ( (lv_value_0_1= 'true' | lv_value_0_2= 'false' ) ) ) )
            // InternalSQL.g:918:2: ( ( (lv_value_0_1= 'true' | lv_value_0_2= 'false' ) ) )
            {
            // InternalSQL.g:918:2: ( ( (lv_value_0_1= 'true' | lv_value_0_2= 'false' ) ) )
            // InternalSQL.g:919:3: ( (lv_value_0_1= 'true' | lv_value_0_2= 'false' ) )
            {
            // InternalSQL.g:919:3: ( (lv_value_0_1= 'true' | lv_value_0_2= 'false' ) )
            // InternalSQL.g:920:4: (lv_value_0_1= 'true' | lv_value_0_2= 'false' )
            {
            // InternalSQL.g:920:4: (lv_value_0_1= 'true' | lv_value_0_2= 'false' )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==35) ) {
                alt14=1;
            }
            else if ( (LA14_0==36) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // InternalSQL.g:921:5: lv_value_0_1= 'true'
                    {
                    lv_value_0_1=(Token)match(input,35,FOLLOW_2); 

                    					newLeafNode(lv_value_0_1, grammarAccess.getBooleanValueAccess().getValueTrueKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getBooleanValueRule());
                    					}
                    					setWithLastConsumed(current, "value", lv_value_0_1, null);
                    				

                    }
                    break;
                case 2 :
                    // InternalSQL.g:932:5: lv_value_0_2= 'false'
                    {
                    lv_value_0_2=(Token)match(input,36,FOLLOW_2); 

                    					newLeafNode(lv_value_0_2, grammarAccess.getBooleanValueAccess().getValueFalseKeyword_0_1());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getBooleanValueRule());
                    					}
                    					setWithLastConsumed(current, "value", lv_value_0_2, null);
                    				

                    }
                    break;

            }


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
    // $ANTLR end "ruleBooleanValue"


    // $ANTLR start "entryRuleNumberValue"
    // InternalSQL.g:948:1: entryRuleNumberValue returns [EObject current=null] : iv_ruleNumberValue= ruleNumberValue EOF ;
    public final EObject entryRuleNumberValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumberValue = null;


        try {
            // InternalSQL.g:948:52: (iv_ruleNumberValue= ruleNumberValue EOF )
            // InternalSQL.g:949:2: iv_ruleNumberValue= ruleNumberValue EOF
            {
             newCompositeNode(grammarAccess.getNumberValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNumberValue=ruleNumberValue();

            state._fsp--;

             current =iv_ruleNumberValue; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleNumberValue"


    // $ANTLR start "ruleNumberValue"
    // InternalSQL.g:955:1: ruleNumberValue returns [EObject current=null] : ( (lv_value_0_0= RULE_INT ) ) ;
    public final EObject ruleNumberValue() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalSQL.g:961:2: ( ( (lv_value_0_0= RULE_INT ) ) )
            // InternalSQL.g:962:2: ( (lv_value_0_0= RULE_INT ) )
            {
            // InternalSQL.g:962:2: ( (lv_value_0_0= RULE_INT ) )
            // InternalSQL.g:963:3: (lv_value_0_0= RULE_INT )
            {
            // InternalSQL.g:963:3: (lv_value_0_0= RULE_INT )
            // InternalSQL.g:964:4: lv_value_0_0= RULE_INT
            {
            lv_value_0_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            				newLeafNode(lv_value_0_0, grammarAccess.getNumberValueAccess().getValueINTTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getNumberValueRule());
            				}
            				setWithLastConsumed(
            					current,
            					"value",
            					lv_value_0_0,
            					"org.eclipse.xtext.common.Terminals.INT");
            			

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
    // $ANTLR end "ruleNumberValue"


    // $ANTLR start "entryRuleStringValue"
    // InternalSQL.g:983:1: entryRuleStringValue returns [EObject current=null] : iv_ruleStringValue= ruleStringValue EOF ;
    public final EObject entryRuleStringValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringValue = null;


        try {
            // InternalSQL.g:983:52: (iv_ruleStringValue= ruleStringValue EOF )
            // InternalSQL.g:984:2: iv_ruleStringValue= ruleStringValue EOF
            {
             newCompositeNode(grammarAccess.getStringValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStringValue=ruleStringValue();

            state._fsp--;

             current =iv_ruleStringValue; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleStringValue"


    // $ANTLR start "ruleStringValue"
    // InternalSQL.g:990:1: ruleStringValue returns [EObject current=null] : ( (lv_value_0_0= RULE_STRING ) ) ;
    public final EObject ruleStringValue() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalSQL.g:996:2: ( ( (lv_value_0_0= RULE_STRING ) ) )
            // InternalSQL.g:997:2: ( (lv_value_0_0= RULE_STRING ) )
            {
            // InternalSQL.g:997:2: ( (lv_value_0_0= RULE_STRING ) )
            // InternalSQL.g:998:3: (lv_value_0_0= RULE_STRING )
            {
            // InternalSQL.g:998:3: (lv_value_0_0= RULE_STRING )
            // InternalSQL.g:999:4: lv_value_0_0= RULE_STRING
            {
            lv_value_0_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            				newLeafNode(lv_value_0_0, grammarAccess.getStringValueAccess().getValueSTRINGTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getStringValueRule());
            				}
            				setWithLastConsumed(
            					current,
            					"value",
            					lv_value_0_0,
            					"org.eclipse.xtext.common.Terminals.STRING");
            			

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
    // $ANTLR end "ruleStringValue"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000001000802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000004020L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x00000000000F0000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000508002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x00000007E0000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000001800000050L});

}