package org.xtext.example.simple_sql.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import org.xtext.example.simple_sql.services.SQLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSQLParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'='", "'<>'", "'<'", "'<='", "'>'", "'>='", "'true'", "'false'", "'CREATE'", "'TABLE'", "'('", "')'", "','", "'INT'", "'VARCHAR'", "'BOOLEAN'", "'TINYINT'", "'NOT'", "'NULL'", "'PRIMARY'", "'KEY'", "'SELECT'", "'FROM'", "'WHERE'", "'OR'", "'AND'"
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

    	public void setGrammarAccess(SQLGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleModel"
    // InternalSQL.g:53:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // InternalSQL.g:54:1: ( ruleModel EOF )
            // InternalSQL.g:55:1: ruleModel EOF
            {
             before(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            ruleModel();

            state._fsp--;

             after(grammarAccess.getModelRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalSQL.g:62:1: ruleModel : ( ( rule__Model__StatementsAssignment )* ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:66:2: ( ( ( rule__Model__StatementsAssignment )* ) )
            // InternalSQL.g:67:2: ( ( rule__Model__StatementsAssignment )* )
            {
            // InternalSQL.g:67:2: ( ( rule__Model__StatementsAssignment )* )
            // InternalSQL.g:68:3: ( rule__Model__StatementsAssignment )*
            {
             before(grammarAccess.getModelAccess().getStatementsAssignment()); 
            // InternalSQL.g:69:3: ( rule__Model__StatementsAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==19||LA1_0==32) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalSQL.g:69:4: rule__Model__StatementsAssignment
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__Model__StatementsAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getStatementsAssignment()); 

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
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleStatement"
    // InternalSQL.g:78:1: entryRuleStatement : ruleStatement EOF ;
    public final void entryRuleStatement() throws RecognitionException {
        try {
            // InternalSQL.g:79:1: ( ruleStatement EOF )
            // InternalSQL.g:80:1: ruleStatement EOF
            {
             before(grammarAccess.getStatementRule()); 
            pushFollow(FOLLOW_1);
            ruleStatement();

            state._fsp--;

             after(grammarAccess.getStatementRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleStatement"


    // $ANTLR start "ruleStatement"
    // InternalSQL.g:87:1: ruleStatement : ( ( rule__Statement__Alternatives ) ) ;
    public final void ruleStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:91:2: ( ( ( rule__Statement__Alternatives ) ) )
            // InternalSQL.g:92:2: ( ( rule__Statement__Alternatives ) )
            {
            // InternalSQL.g:92:2: ( ( rule__Statement__Alternatives ) )
            // InternalSQL.g:93:3: ( rule__Statement__Alternatives )
            {
             before(grammarAccess.getStatementAccess().getAlternatives()); 
            // InternalSQL.g:94:3: ( rule__Statement__Alternatives )
            // InternalSQL.g:94:4: rule__Statement__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Statement__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getStatementAccess().getAlternatives()); 

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
    // $ANTLR end "ruleStatement"


    // $ANTLR start "entryRuleCreateTableStatement"
    // InternalSQL.g:103:1: entryRuleCreateTableStatement : ruleCreateTableStatement EOF ;
    public final void entryRuleCreateTableStatement() throws RecognitionException {
        try {
            // InternalSQL.g:104:1: ( ruleCreateTableStatement EOF )
            // InternalSQL.g:105:1: ruleCreateTableStatement EOF
            {
             before(grammarAccess.getCreateTableStatementRule()); 
            pushFollow(FOLLOW_1);
            ruleCreateTableStatement();

            state._fsp--;

             after(grammarAccess.getCreateTableStatementRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleCreateTableStatement"


    // $ANTLR start "ruleCreateTableStatement"
    // InternalSQL.g:112:1: ruleCreateTableStatement : ( ( rule__CreateTableStatement__Group__0 ) ) ;
    public final void ruleCreateTableStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:116:2: ( ( ( rule__CreateTableStatement__Group__0 ) ) )
            // InternalSQL.g:117:2: ( ( rule__CreateTableStatement__Group__0 ) )
            {
            // InternalSQL.g:117:2: ( ( rule__CreateTableStatement__Group__0 ) )
            // InternalSQL.g:118:3: ( rule__CreateTableStatement__Group__0 )
            {
             before(grammarAccess.getCreateTableStatementAccess().getGroup()); 
            // InternalSQL.g:119:3: ( rule__CreateTableStatement__Group__0 )
            // InternalSQL.g:119:4: rule__CreateTableStatement__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__CreateTableStatement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCreateTableStatementAccess().getGroup()); 

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
    // $ANTLR end "ruleCreateTableStatement"


    // $ANTLR start "entryRuleColumnDefinition"
    // InternalSQL.g:128:1: entryRuleColumnDefinition : ruleColumnDefinition EOF ;
    public final void entryRuleColumnDefinition() throws RecognitionException {
        try {
            // InternalSQL.g:129:1: ( ruleColumnDefinition EOF )
            // InternalSQL.g:130:1: ruleColumnDefinition EOF
            {
             before(grammarAccess.getColumnDefinitionRule()); 
            pushFollow(FOLLOW_1);
            ruleColumnDefinition();

            state._fsp--;

             after(grammarAccess.getColumnDefinitionRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleColumnDefinition"


    // $ANTLR start "ruleColumnDefinition"
    // InternalSQL.g:137:1: ruleColumnDefinition : ( ( rule__ColumnDefinition__Group__0 ) ) ;
    public final void ruleColumnDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:141:2: ( ( ( rule__ColumnDefinition__Group__0 ) ) )
            // InternalSQL.g:142:2: ( ( rule__ColumnDefinition__Group__0 ) )
            {
            // InternalSQL.g:142:2: ( ( rule__ColumnDefinition__Group__0 ) )
            // InternalSQL.g:143:3: ( rule__ColumnDefinition__Group__0 )
            {
             before(grammarAccess.getColumnDefinitionAccess().getGroup()); 
            // InternalSQL.g:144:3: ( rule__ColumnDefinition__Group__0 )
            // InternalSQL.g:144:4: rule__ColumnDefinition__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ColumnDefinition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getColumnDefinitionAccess().getGroup()); 

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
    // $ANTLR end "ruleColumnDefinition"


    // $ANTLR start "entryRuleColumnType"
    // InternalSQL.g:153:1: entryRuleColumnType : ruleColumnType EOF ;
    public final void entryRuleColumnType() throws RecognitionException {
        try {
            // InternalSQL.g:154:1: ( ruleColumnType EOF )
            // InternalSQL.g:155:1: ruleColumnType EOF
            {
             before(grammarAccess.getColumnTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleColumnType();

            state._fsp--;

             after(grammarAccess.getColumnTypeRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleColumnType"


    // $ANTLR start "ruleColumnType"
    // InternalSQL.g:162:1: ruleColumnType : ( ( rule__ColumnType__Alternatives ) ) ;
    public final void ruleColumnType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:166:2: ( ( ( rule__ColumnType__Alternatives ) ) )
            // InternalSQL.g:167:2: ( ( rule__ColumnType__Alternatives ) )
            {
            // InternalSQL.g:167:2: ( ( rule__ColumnType__Alternatives ) )
            // InternalSQL.g:168:3: ( rule__ColumnType__Alternatives )
            {
             before(grammarAccess.getColumnTypeAccess().getAlternatives()); 
            // InternalSQL.g:169:3: ( rule__ColumnType__Alternatives )
            // InternalSQL.g:169:4: rule__ColumnType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ColumnType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getColumnTypeAccess().getAlternatives()); 

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
    // $ANTLR end "ruleColumnType"


    // $ANTLR start "entryRuleConstraint"
    // InternalSQL.g:178:1: entryRuleConstraint : ruleConstraint EOF ;
    public final void entryRuleConstraint() throws RecognitionException {
        try {
            // InternalSQL.g:179:1: ( ruleConstraint EOF )
            // InternalSQL.g:180:1: ruleConstraint EOF
            {
             before(grammarAccess.getConstraintRule()); 
            pushFollow(FOLLOW_1);
            ruleConstraint();

            state._fsp--;

             after(grammarAccess.getConstraintRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleConstraint"


    // $ANTLR start "ruleConstraint"
    // InternalSQL.g:187:1: ruleConstraint : ( ( rule__Constraint__Alternatives ) ) ;
    public final void ruleConstraint() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:191:2: ( ( ( rule__Constraint__Alternatives ) ) )
            // InternalSQL.g:192:2: ( ( rule__Constraint__Alternatives ) )
            {
            // InternalSQL.g:192:2: ( ( rule__Constraint__Alternatives ) )
            // InternalSQL.g:193:3: ( rule__Constraint__Alternatives )
            {
             before(grammarAccess.getConstraintAccess().getAlternatives()); 
            // InternalSQL.g:194:3: ( rule__Constraint__Alternatives )
            // InternalSQL.g:194:4: rule__Constraint__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Constraint__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getConstraintAccess().getAlternatives()); 

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
    // $ANTLR end "ruleConstraint"


    // $ANTLR start "entryRuleSelectStatement"
    // InternalSQL.g:203:1: entryRuleSelectStatement : ruleSelectStatement EOF ;
    public final void entryRuleSelectStatement() throws RecognitionException {
        try {
            // InternalSQL.g:204:1: ( ruleSelectStatement EOF )
            // InternalSQL.g:205:1: ruleSelectStatement EOF
            {
             before(grammarAccess.getSelectStatementRule()); 
            pushFollow(FOLLOW_1);
            ruleSelectStatement();

            state._fsp--;

             after(grammarAccess.getSelectStatementRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleSelectStatement"


    // $ANTLR start "ruleSelectStatement"
    // InternalSQL.g:212:1: ruleSelectStatement : ( ( rule__SelectStatement__Group__0 ) ) ;
    public final void ruleSelectStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:216:2: ( ( ( rule__SelectStatement__Group__0 ) ) )
            // InternalSQL.g:217:2: ( ( rule__SelectStatement__Group__0 ) )
            {
            // InternalSQL.g:217:2: ( ( rule__SelectStatement__Group__0 ) )
            // InternalSQL.g:218:3: ( rule__SelectStatement__Group__0 )
            {
             before(grammarAccess.getSelectStatementAccess().getGroup()); 
            // InternalSQL.g:219:3: ( rule__SelectStatement__Group__0 )
            // InternalSQL.g:219:4: rule__SelectStatement__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SelectStatement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSelectStatementAccess().getGroup()); 

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
    // $ANTLR end "ruleSelectStatement"


    // $ANTLR start "entryRuleSelectedColumns"
    // InternalSQL.g:228:1: entryRuleSelectedColumns : ruleSelectedColumns EOF ;
    public final void entryRuleSelectedColumns() throws RecognitionException {
        try {
            // InternalSQL.g:229:1: ( ruleSelectedColumns EOF )
            // InternalSQL.g:230:1: ruleSelectedColumns EOF
            {
             before(grammarAccess.getSelectedColumnsRule()); 
            pushFollow(FOLLOW_1);
            ruleSelectedColumns();

            state._fsp--;

             after(grammarAccess.getSelectedColumnsRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleSelectedColumns"


    // $ANTLR start "ruleSelectedColumns"
    // InternalSQL.g:237:1: ruleSelectedColumns : ( ( rule__SelectedColumns__Group__0 ) ) ;
    public final void ruleSelectedColumns() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:241:2: ( ( ( rule__SelectedColumns__Group__0 ) ) )
            // InternalSQL.g:242:2: ( ( rule__SelectedColumns__Group__0 ) )
            {
            // InternalSQL.g:242:2: ( ( rule__SelectedColumns__Group__0 ) )
            // InternalSQL.g:243:3: ( rule__SelectedColumns__Group__0 )
            {
             before(grammarAccess.getSelectedColumnsAccess().getGroup()); 
            // InternalSQL.g:244:3: ( rule__SelectedColumns__Group__0 )
            // InternalSQL.g:244:4: rule__SelectedColumns__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SelectedColumns__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSelectedColumnsAccess().getGroup()); 

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
    // $ANTLR end "ruleSelectedColumns"


    // $ANTLR start "entryRuleWhereClause"
    // InternalSQL.g:253:1: entryRuleWhereClause : ruleWhereClause EOF ;
    public final void entryRuleWhereClause() throws RecognitionException {
        try {
            // InternalSQL.g:254:1: ( ruleWhereClause EOF )
            // InternalSQL.g:255:1: ruleWhereClause EOF
            {
             before(grammarAccess.getWhereClauseRule()); 
            pushFollow(FOLLOW_1);
            ruleWhereClause();

            state._fsp--;

             after(grammarAccess.getWhereClauseRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleWhereClause"


    // $ANTLR start "ruleWhereClause"
    // InternalSQL.g:262:1: ruleWhereClause : ( ( rule__WhereClause__Group__0 ) ) ;
    public final void ruleWhereClause() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:266:2: ( ( ( rule__WhereClause__Group__0 ) ) )
            // InternalSQL.g:267:2: ( ( rule__WhereClause__Group__0 ) )
            {
            // InternalSQL.g:267:2: ( ( rule__WhereClause__Group__0 ) )
            // InternalSQL.g:268:3: ( rule__WhereClause__Group__0 )
            {
             before(grammarAccess.getWhereClauseAccess().getGroup()); 
            // InternalSQL.g:269:3: ( rule__WhereClause__Group__0 )
            // InternalSQL.g:269:4: rule__WhereClause__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__WhereClause__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getWhereClauseAccess().getGroup()); 

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
    // $ANTLR end "ruleWhereClause"


    // $ANTLR start "entryRuleExpression"
    // InternalSQL.g:278:1: entryRuleExpression : ruleExpression EOF ;
    public final void entryRuleExpression() throws RecognitionException {
        try {
            // InternalSQL.g:279:1: ( ruleExpression EOF )
            // InternalSQL.g:280:1: ruleExpression EOF
            {
             before(grammarAccess.getExpressionRule()); 
            pushFollow(FOLLOW_1);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getExpressionRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalSQL.g:287:1: ruleExpression : ( ( rule__Expression__Group__0 ) ) ;
    public final void ruleExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:291:2: ( ( ( rule__Expression__Group__0 ) ) )
            // InternalSQL.g:292:2: ( ( rule__Expression__Group__0 ) )
            {
            // InternalSQL.g:292:2: ( ( rule__Expression__Group__0 ) )
            // InternalSQL.g:293:3: ( rule__Expression__Group__0 )
            {
             before(grammarAccess.getExpressionAccess().getGroup()); 
            // InternalSQL.g:294:3: ( rule__Expression__Group__0 )
            // InternalSQL.g:294:4: rule__Expression__Group__0
            {
            pushFollow(FOLLOW_2);
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


    // $ANTLR start "entryRuleAndExpression"
    // InternalSQL.g:303:1: entryRuleAndExpression : ruleAndExpression EOF ;
    public final void entryRuleAndExpression() throws RecognitionException {
        try {
            // InternalSQL.g:304:1: ( ruleAndExpression EOF )
            // InternalSQL.g:305:1: ruleAndExpression EOF
            {
             before(grammarAccess.getAndExpressionRule()); 
            pushFollow(FOLLOW_1);
            ruleAndExpression();

            state._fsp--;

             after(grammarAccess.getAndExpressionRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleAndExpression"


    // $ANTLR start "ruleAndExpression"
    // InternalSQL.g:312:1: ruleAndExpression : ( ( rule__AndExpression__Group__0 ) ) ;
    public final void ruleAndExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:316:2: ( ( ( rule__AndExpression__Group__0 ) ) )
            // InternalSQL.g:317:2: ( ( rule__AndExpression__Group__0 ) )
            {
            // InternalSQL.g:317:2: ( ( rule__AndExpression__Group__0 ) )
            // InternalSQL.g:318:3: ( rule__AndExpression__Group__0 )
            {
             before(grammarAccess.getAndExpressionAccess().getGroup()); 
            // InternalSQL.g:319:3: ( rule__AndExpression__Group__0 )
            // InternalSQL.g:319:4: rule__AndExpression__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AndExpression__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAndExpressionAccess().getGroup()); 

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
    // $ANTLR end "ruleAndExpression"


    // $ANTLR start "entryRuleComparison"
    // InternalSQL.g:328:1: entryRuleComparison : ruleComparison EOF ;
    public final void entryRuleComparison() throws RecognitionException {
        try {
            // InternalSQL.g:329:1: ( ruleComparison EOF )
            // InternalSQL.g:330:1: ruleComparison EOF
            {
             before(grammarAccess.getComparisonRule()); 
            pushFollow(FOLLOW_1);
            ruleComparison();

            state._fsp--;

             after(grammarAccess.getComparisonRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleComparison"


    // $ANTLR start "ruleComparison"
    // InternalSQL.g:337:1: ruleComparison : ( ( rule__Comparison__Group__0 ) ) ;
    public final void ruleComparison() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:341:2: ( ( ( rule__Comparison__Group__0 ) ) )
            // InternalSQL.g:342:2: ( ( rule__Comparison__Group__0 ) )
            {
            // InternalSQL.g:342:2: ( ( rule__Comparison__Group__0 ) )
            // InternalSQL.g:343:3: ( rule__Comparison__Group__0 )
            {
             before(grammarAccess.getComparisonAccess().getGroup()); 
            // InternalSQL.g:344:3: ( rule__Comparison__Group__0 )
            // InternalSQL.g:344:4: rule__Comparison__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Comparison__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getComparisonAccess().getGroup()); 

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
    // $ANTLR end "ruleComparison"


    // $ANTLR start "entryRuleOperator"
    // InternalSQL.g:353:1: entryRuleOperator : ruleOperator EOF ;
    public final void entryRuleOperator() throws RecognitionException {
        try {
            // InternalSQL.g:354:1: ( ruleOperator EOF )
            // InternalSQL.g:355:1: ruleOperator EOF
            {
             before(grammarAccess.getOperatorRule()); 
            pushFollow(FOLLOW_1);
            ruleOperator();

            state._fsp--;

             after(grammarAccess.getOperatorRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalSQL.g:362:1: ruleOperator : ( ( rule__Operator__Alternatives ) ) ;
    public final void ruleOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:366:2: ( ( ( rule__Operator__Alternatives ) ) )
            // InternalSQL.g:367:2: ( ( rule__Operator__Alternatives ) )
            {
            // InternalSQL.g:367:2: ( ( rule__Operator__Alternatives ) )
            // InternalSQL.g:368:3: ( rule__Operator__Alternatives )
            {
             before(grammarAccess.getOperatorAccess().getAlternatives()); 
            // InternalSQL.g:369:3: ( rule__Operator__Alternatives )
            // InternalSQL.g:369:4: rule__Operator__Alternatives
            {
            pushFollow(FOLLOW_2);
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


    // $ANTLR start "entryRuleValue"
    // InternalSQL.g:378:1: entryRuleValue : ruleValue EOF ;
    public final void entryRuleValue() throws RecognitionException {
        try {
            // InternalSQL.g:379:1: ( ruleValue EOF )
            // InternalSQL.g:380:1: ruleValue EOF
            {
             before(grammarAccess.getValueRule()); 
            pushFollow(FOLLOW_1);
            ruleValue();

            state._fsp--;

             after(grammarAccess.getValueRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleValue"


    // $ANTLR start "ruleValue"
    // InternalSQL.g:387:1: ruleValue : ( ( rule__Value__Alternatives ) ) ;
    public final void ruleValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:391:2: ( ( ( rule__Value__Alternatives ) ) )
            // InternalSQL.g:392:2: ( ( rule__Value__Alternatives ) )
            {
            // InternalSQL.g:392:2: ( ( rule__Value__Alternatives ) )
            // InternalSQL.g:393:3: ( rule__Value__Alternatives )
            {
             before(grammarAccess.getValueAccess().getAlternatives()); 
            // InternalSQL.g:394:3: ( rule__Value__Alternatives )
            // InternalSQL.g:394:4: rule__Value__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Value__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getValueAccess().getAlternatives()); 

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
    // $ANTLR end "ruleValue"


    // $ANTLR start "entryRuleBooleanValue"
    // InternalSQL.g:403:1: entryRuleBooleanValue : ruleBooleanValue EOF ;
    public final void entryRuleBooleanValue() throws RecognitionException {
        try {
            // InternalSQL.g:404:1: ( ruleBooleanValue EOF )
            // InternalSQL.g:405:1: ruleBooleanValue EOF
            {
             before(grammarAccess.getBooleanValueRule()); 
            pushFollow(FOLLOW_1);
            ruleBooleanValue();

            state._fsp--;

             after(grammarAccess.getBooleanValueRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleBooleanValue"


    // $ANTLR start "ruleBooleanValue"
    // InternalSQL.g:412:1: ruleBooleanValue : ( ( rule__BooleanValue__ValueAssignment ) ) ;
    public final void ruleBooleanValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:416:2: ( ( ( rule__BooleanValue__ValueAssignment ) ) )
            // InternalSQL.g:417:2: ( ( rule__BooleanValue__ValueAssignment ) )
            {
            // InternalSQL.g:417:2: ( ( rule__BooleanValue__ValueAssignment ) )
            // InternalSQL.g:418:3: ( rule__BooleanValue__ValueAssignment )
            {
             before(grammarAccess.getBooleanValueAccess().getValueAssignment()); 
            // InternalSQL.g:419:3: ( rule__BooleanValue__ValueAssignment )
            // InternalSQL.g:419:4: rule__BooleanValue__ValueAssignment
            {
            pushFollow(FOLLOW_2);
            rule__BooleanValue__ValueAssignment();

            state._fsp--;


            }

             after(grammarAccess.getBooleanValueAccess().getValueAssignment()); 

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
    // $ANTLR end "ruleBooleanValue"


    // $ANTLR start "entryRuleNumberValue"
    // InternalSQL.g:428:1: entryRuleNumberValue : ruleNumberValue EOF ;
    public final void entryRuleNumberValue() throws RecognitionException {
        try {
            // InternalSQL.g:429:1: ( ruleNumberValue EOF )
            // InternalSQL.g:430:1: ruleNumberValue EOF
            {
             before(grammarAccess.getNumberValueRule()); 
            pushFollow(FOLLOW_1);
            ruleNumberValue();

            state._fsp--;

             after(grammarAccess.getNumberValueRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleNumberValue"


    // $ANTLR start "ruleNumberValue"
    // InternalSQL.g:437:1: ruleNumberValue : ( ( rule__NumberValue__ValueAssignment ) ) ;
    public final void ruleNumberValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:441:2: ( ( ( rule__NumberValue__ValueAssignment ) ) )
            // InternalSQL.g:442:2: ( ( rule__NumberValue__ValueAssignment ) )
            {
            // InternalSQL.g:442:2: ( ( rule__NumberValue__ValueAssignment ) )
            // InternalSQL.g:443:3: ( rule__NumberValue__ValueAssignment )
            {
             before(grammarAccess.getNumberValueAccess().getValueAssignment()); 
            // InternalSQL.g:444:3: ( rule__NumberValue__ValueAssignment )
            // InternalSQL.g:444:4: rule__NumberValue__ValueAssignment
            {
            pushFollow(FOLLOW_2);
            rule__NumberValue__ValueAssignment();

            state._fsp--;


            }

             after(grammarAccess.getNumberValueAccess().getValueAssignment()); 

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
    // $ANTLR end "ruleNumberValue"


    // $ANTLR start "entryRuleStringValue"
    // InternalSQL.g:453:1: entryRuleStringValue : ruleStringValue EOF ;
    public final void entryRuleStringValue() throws RecognitionException {
        try {
            // InternalSQL.g:454:1: ( ruleStringValue EOF )
            // InternalSQL.g:455:1: ruleStringValue EOF
            {
             before(grammarAccess.getStringValueRule()); 
            pushFollow(FOLLOW_1);
            ruleStringValue();

            state._fsp--;

             after(grammarAccess.getStringValueRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleStringValue"


    // $ANTLR start "ruleStringValue"
    // InternalSQL.g:462:1: ruleStringValue : ( ( rule__StringValue__ValueAssignment ) ) ;
    public final void ruleStringValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:466:2: ( ( ( rule__StringValue__ValueAssignment ) ) )
            // InternalSQL.g:467:2: ( ( rule__StringValue__ValueAssignment ) )
            {
            // InternalSQL.g:467:2: ( ( rule__StringValue__ValueAssignment ) )
            // InternalSQL.g:468:3: ( rule__StringValue__ValueAssignment )
            {
             before(grammarAccess.getStringValueAccess().getValueAssignment()); 
            // InternalSQL.g:469:3: ( rule__StringValue__ValueAssignment )
            // InternalSQL.g:469:4: rule__StringValue__ValueAssignment
            {
            pushFollow(FOLLOW_2);
            rule__StringValue__ValueAssignment();

            state._fsp--;


            }

             after(grammarAccess.getStringValueAccess().getValueAssignment()); 

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
    // $ANTLR end "ruleStringValue"


    // $ANTLR start "rule__Statement__Alternatives"
    // InternalSQL.g:477:1: rule__Statement__Alternatives : ( ( ruleCreateTableStatement ) | ( ruleSelectStatement ) );
    public final void rule__Statement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:481:1: ( ( ruleCreateTableStatement ) | ( ruleSelectStatement ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==19) ) {
                alt2=1;
            }
            else if ( (LA2_0==32) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalSQL.g:482:2: ( ruleCreateTableStatement )
                    {
                    // InternalSQL.g:482:2: ( ruleCreateTableStatement )
                    // InternalSQL.g:483:3: ruleCreateTableStatement
                    {
                     before(grammarAccess.getStatementAccess().getCreateTableStatementParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleCreateTableStatement();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getCreateTableStatementParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSQL.g:488:2: ( ruleSelectStatement )
                    {
                    // InternalSQL.g:488:2: ( ruleSelectStatement )
                    // InternalSQL.g:489:3: ruleSelectStatement
                    {
                     before(grammarAccess.getStatementAccess().getSelectStatementParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleSelectStatement();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getSelectStatementParserRuleCall_1()); 

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
    // $ANTLR end "rule__Statement__Alternatives"


    // $ANTLR start "rule__ColumnType__Alternatives"
    // InternalSQL.g:498:1: rule__ColumnType__Alternatives : ( ( ( rule__ColumnType__Group_0__0 ) ) | ( ( rule__ColumnType__Group_1__0 ) ) | ( ( rule__ColumnType__Group_2__0 ) ) | ( ( rule__ColumnType__Group_3__0 ) ) );
    public final void rule__ColumnType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:502:1: ( ( ( rule__ColumnType__Group_0__0 ) ) | ( ( rule__ColumnType__Group_1__0 ) ) | ( ( rule__ColumnType__Group_2__0 ) ) | ( ( rule__ColumnType__Group_3__0 ) ) )
            int alt3=4;
            switch ( input.LA(1) ) {
            case 24:
                {
                alt3=1;
                }
                break;
            case 25:
                {
                alt3=2;
                }
                break;
            case 26:
                {
                alt3=3;
                }
                break;
            case 27:
                {
                alt3=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalSQL.g:503:2: ( ( rule__ColumnType__Group_0__0 ) )
                    {
                    // InternalSQL.g:503:2: ( ( rule__ColumnType__Group_0__0 ) )
                    // InternalSQL.g:504:3: ( rule__ColumnType__Group_0__0 )
                    {
                     before(grammarAccess.getColumnTypeAccess().getGroup_0()); 
                    // InternalSQL.g:505:3: ( rule__ColumnType__Group_0__0 )
                    // InternalSQL.g:505:4: rule__ColumnType__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ColumnType__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getColumnTypeAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSQL.g:509:2: ( ( rule__ColumnType__Group_1__0 ) )
                    {
                    // InternalSQL.g:509:2: ( ( rule__ColumnType__Group_1__0 ) )
                    // InternalSQL.g:510:3: ( rule__ColumnType__Group_1__0 )
                    {
                     before(grammarAccess.getColumnTypeAccess().getGroup_1()); 
                    // InternalSQL.g:511:3: ( rule__ColumnType__Group_1__0 )
                    // InternalSQL.g:511:4: rule__ColumnType__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ColumnType__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getColumnTypeAccess().getGroup_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalSQL.g:515:2: ( ( rule__ColumnType__Group_2__0 ) )
                    {
                    // InternalSQL.g:515:2: ( ( rule__ColumnType__Group_2__0 ) )
                    // InternalSQL.g:516:3: ( rule__ColumnType__Group_2__0 )
                    {
                     before(grammarAccess.getColumnTypeAccess().getGroup_2()); 
                    // InternalSQL.g:517:3: ( rule__ColumnType__Group_2__0 )
                    // InternalSQL.g:517:4: rule__ColumnType__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ColumnType__Group_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getColumnTypeAccess().getGroup_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalSQL.g:521:2: ( ( rule__ColumnType__Group_3__0 ) )
                    {
                    // InternalSQL.g:521:2: ( ( rule__ColumnType__Group_3__0 ) )
                    // InternalSQL.g:522:3: ( rule__ColumnType__Group_3__0 )
                    {
                     before(grammarAccess.getColumnTypeAccess().getGroup_3()); 
                    // InternalSQL.g:523:3: ( rule__ColumnType__Group_3__0 )
                    // InternalSQL.g:523:4: rule__ColumnType__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ColumnType__Group_3__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getColumnTypeAccess().getGroup_3()); 

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
    // $ANTLR end "rule__ColumnType__Alternatives"


    // $ANTLR start "rule__Constraint__Alternatives"
    // InternalSQL.g:531:1: rule__Constraint__Alternatives : ( ( ( rule__Constraint__Group_0__0 ) ) | ( ( rule__Constraint__Group_1__0 ) ) );
    public final void rule__Constraint__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:535:1: ( ( ( rule__Constraint__Group_0__0 ) ) | ( ( rule__Constraint__Group_1__0 ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==28) ) {
                alt4=1;
            }
            else if ( (LA4_0==30) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalSQL.g:536:2: ( ( rule__Constraint__Group_0__0 ) )
                    {
                    // InternalSQL.g:536:2: ( ( rule__Constraint__Group_0__0 ) )
                    // InternalSQL.g:537:3: ( rule__Constraint__Group_0__0 )
                    {
                     before(grammarAccess.getConstraintAccess().getGroup_0()); 
                    // InternalSQL.g:538:3: ( rule__Constraint__Group_0__0 )
                    // InternalSQL.g:538:4: rule__Constraint__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Constraint__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getConstraintAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSQL.g:542:2: ( ( rule__Constraint__Group_1__0 ) )
                    {
                    // InternalSQL.g:542:2: ( ( rule__Constraint__Group_1__0 ) )
                    // InternalSQL.g:543:3: ( rule__Constraint__Group_1__0 )
                    {
                     before(grammarAccess.getConstraintAccess().getGroup_1()); 
                    // InternalSQL.g:544:3: ( rule__Constraint__Group_1__0 )
                    // InternalSQL.g:544:4: rule__Constraint__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Constraint__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getConstraintAccess().getGroup_1()); 

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
    // $ANTLR end "rule__Constraint__Alternatives"


    // $ANTLR start "rule__Operator__Alternatives"
    // InternalSQL.g:552:1: rule__Operator__Alternatives : ( ( '=' ) | ( '<>' ) | ( '<' ) | ( '<=' ) | ( '>' ) | ( '>=' ) );
    public final void rule__Operator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:556:1: ( ( '=' ) | ( '<>' ) | ( '<' ) | ( '<=' ) | ( '>' ) | ( '>=' ) )
            int alt5=6;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt5=1;
                }
                break;
            case 12:
                {
                alt5=2;
                }
                break;
            case 13:
                {
                alt5=3;
                }
                break;
            case 14:
                {
                alt5=4;
                }
                break;
            case 15:
                {
                alt5=5;
                }
                break;
            case 16:
                {
                alt5=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalSQL.g:557:2: ( '=' )
                    {
                    // InternalSQL.g:557:2: ( '=' )
                    // InternalSQL.g:558:3: '='
                    {
                     before(grammarAccess.getOperatorAccess().getEqualsSignKeyword_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getOperatorAccess().getEqualsSignKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSQL.g:563:2: ( '<>' )
                    {
                    // InternalSQL.g:563:2: ( '<>' )
                    // InternalSQL.g:564:3: '<>'
                    {
                     before(grammarAccess.getOperatorAccess().getLessThanSignGreaterThanSignKeyword_1()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getOperatorAccess().getLessThanSignGreaterThanSignKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalSQL.g:569:2: ( '<' )
                    {
                    // InternalSQL.g:569:2: ( '<' )
                    // InternalSQL.g:570:3: '<'
                    {
                     before(grammarAccess.getOperatorAccess().getLessThanSignKeyword_2()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getOperatorAccess().getLessThanSignKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalSQL.g:575:2: ( '<=' )
                    {
                    // InternalSQL.g:575:2: ( '<=' )
                    // InternalSQL.g:576:3: '<='
                    {
                     before(grammarAccess.getOperatorAccess().getLessThanSignEqualsSignKeyword_3()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getOperatorAccess().getLessThanSignEqualsSignKeyword_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalSQL.g:581:2: ( '>' )
                    {
                    // InternalSQL.g:581:2: ( '>' )
                    // InternalSQL.g:582:3: '>'
                    {
                     before(grammarAccess.getOperatorAccess().getGreaterThanSignKeyword_4()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getOperatorAccess().getGreaterThanSignKeyword_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalSQL.g:587:2: ( '>=' )
                    {
                    // InternalSQL.g:587:2: ( '>=' )
                    // InternalSQL.g:588:3: '>='
                    {
                     before(grammarAccess.getOperatorAccess().getGreaterThanSignEqualsSignKeyword_5()); 
                    match(input,16,FOLLOW_2); 
                     after(grammarAccess.getOperatorAccess().getGreaterThanSignEqualsSignKeyword_5()); 

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


    // $ANTLR start "rule__Value__Alternatives"
    // InternalSQL.g:597:1: rule__Value__Alternatives : ( ( ruleBooleanValue ) | ( ruleNumberValue ) | ( ruleStringValue ) );
    public final void rule__Value__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:601:1: ( ( ruleBooleanValue ) | ( ruleNumberValue ) | ( ruleStringValue ) )
            int alt6=3;
            switch ( input.LA(1) ) {
            case 17:
            case 18:
                {
                alt6=1;
                }
                break;
            case RULE_INT:
                {
                alt6=2;
                }
                break;
            case RULE_STRING:
                {
                alt6=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalSQL.g:602:2: ( ruleBooleanValue )
                    {
                    // InternalSQL.g:602:2: ( ruleBooleanValue )
                    // InternalSQL.g:603:3: ruleBooleanValue
                    {
                     before(grammarAccess.getValueAccess().getBooleanValueParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleBooleanValue();

                    state._fsp--;

                     after(grammarAccess.getValueAccess().getBooleanValueParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSQL.g:608:2: ( ruleNumberValue )
                    {
                    // InternalSQL.g:608:2: ( ruleNumberValue )
                    // InternalSQL.g:609:3: ruleNumberValue
                    {
                     before(grammarAccess.getValueAccess().getNumberValueParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleNumberValue();

                    state._fsp--;

                     after(grammarAccess.getValueAccess().getNumberValueParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalSQL.g:614:2: ( ruleStringValue )
                    {
                    // InternalSQL.g:614:2: ( ruleStringValue )
                    // InternalSQL.g:615:3: ruleStringValue
                    {
                     before(grammarAccess.getValueAccess().getStringValueParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleStringValue();

                    state._fsp--;

                     after(grammarAccess.getValueAccess().getStringValueParserRuleCall_2()); 

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
    // $ANTLR end "rule__Value__Alternatives"


    // $ANTLR start "rule__BooleanValue__ValueAlternatives_0"
    // InternalSQL.g:624:1: rule__BooleanValue__ValueAlternatives_0 : ( ( 'true' ) | ( 'false' ) );
    public final void rule__BooleanValue__ValueAlternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:628:1: ( ( 'true' ) | ( 'false' ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==17) ) {
                alt7=1;
            }
            else if ( (LA7_0==18) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalSQL.g:629:2: ( 'true' )
                    {
                    // InternalSQL.g:629:2: ( 'true' )
                    // InternalSQL.g:630:3: 'true'
                    {
                     before(grammarAccess.getBooleanValueAccess().getValueTrueKeyword_0_0()); 
                    match(input,17,FOLLOW_2); 
                     after(grammarAccess.getBooleanValueAccess().getValueTrueKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSQL.g:635:2: ( 'false' )
                    {
                    // InternalSQL.g:635:2: ( 'false' )
                    // InternalSQL.g:636:3: 'false'
                    {
                     before(grammarAccess.getBooleanValueAccess().getValueFalseKeyword_0_1()); 
                    match(input,18,FOLLOW_2); 
                     after(grammarAccess.getBooleanValueAccess().getValueFalseKeyword_0_1()); 

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
    // $ANTLR end "rule__BooleanValue__ValueAlternatives_0"


    // $ANTLR start "rule__CreateTableStatement__Group__0"
    // InternalSQL.g:645:1: rule__CreateTableStatement__Group__0 : rule__CreateTableStatement__Group__0__Impl rule__CreateTableStatement__Group__1 ;
    public final void rule__CreateTableStatement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:649:1: ( rule__CreateTableStatement__Group__0__Impl rule__CreateTableStatement__Group__1 )
            // InternalSQL.g:650:2: rule__CreateTableStatement__Group__0__Impl rule__CreateTableStatement__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__CreateTableStatement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CreateTableStatement__Group__1();

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
    // $ANTLR end "rule__CreateTableStatement__Group__0"


    // $ANTLR start "rule__CreateTableStatement__Group__0__Impl"
    // InternalSQL.g:657:1: rule__CreateTableStatement__Group__0__Impl : ( 'CREATE' ) ;
    public final void rule__CreateTableStatement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:661:1: ( ( 'CREATE' ) )
            // InternalSQL.g:662:1: ( 'CREATE' )
            {
            // InternalSQL.g:662:1: ( 'CREATE' )
            // InternalSQL.g:663:2: 'CREATE'
            {
             before(grammarAccess.getCreateTableStatementAccess().getCREATEKeyword_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getCreateTableStatementAccess().getCREATEKeyword_0()); 

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
    // $ANTLR end "rule__CreateTableStatement__Group__0__Impl"


    // $ANTLR start "rule__CreateTableStatement__Group__1"
    // InternalSQL.g:672:1: rule__CreateTableStatement__Group__1 : rule__CreateTableStatement__Group__1__Impl rule__CreateTableStatement__Group__2 ;
    public final void rule__CreateTableStatement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:676:1: ( rule__CreateTableStatement__Group__1__Impl rule__CreateTableStatement__Group__2 )
            // InternalSQL.g:677:2: rule__CreateTableStatement__Group__1__Impl rule__CreateTableStatement__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__CreateTableStatement__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CreateTableStatement__Group__2();

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
    // $ANTLR end "rule__CreateTableStatement__Group__1"


    // $ANTLR start "rule__CreateTableStatement__Group__1__Impl"
    // InternalSQL.g:684:1: rule__CreateTableStatement__Group__1__Impl : ( 'TABLE' ) ;
    public final void rule__CreateTableStatement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:688:1: ( ( 'TABLE' ) )
            // InternalSQL.g:689:1: ( 'TABLE' )
            {
            // InternalSQL.g:689:1: ( 'TABLE' )
            // InternalSQL.g:690:2: 'TABLE'
            {
             before(grammarAccess.getCreateTableStatementAccess().getTABLEKeyword_1()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getCreateTableStatementAccess().getTABLEKeyword_1()); 

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
    // $ANTLR end "rule__CreateTableStatement__Group__1__Impl"


    // $ANTLR start "rule__CreateTableStatement__Group__2"
    // InternalSQL.g:699:1: rule__CreateTableStatement__Group__2 : rule__CreateTableStatement__Group__2__Impl rule__CreateTableStatement__Group__3 ;
    public final void rule__CreateTableStatement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:703:1: ( rule__CreateTableStatement__Group__2__Impl rule__CreateTableStatement__Group__3 )
            // InternalSQL.g:704:2: rule__CreateTableStatement__Group__2__Impl rule__CreateTableStatement__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__CreateTableStatement__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CreateTableStatement__Group__3();

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
    // $ANTLR end "rule__CreateTableStatement__Group__2"


    // $ANTLR start "rule__CreateTableStatement__Group__2__Impl"
    // InternalSQL.g:711:1: rule__CreateTableStatement__Group__2__Impl : ( ( rule__CreateTableStatement__TableNameAssignment_2 ) ) ;
    public final void rule__CreateTableStatement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:715:1: ( ( ( rule__CreateTableStatement__TableNameAssignment_2 ) ) )
            // InternalSQL.g:716:1: ( ( rule__CreateTableStatement__TableNameAssignment_2 ) )
            {
            // InternalSQL.g:716:1: ( ( rule__CreateTableStatement__TableNameAssignment_2 ) )
            // InternalSQL.g:717:2: ( rule__CreateTableStatement__TableNameAssignment_2 )
            {
             before(grammarAccess.getCreateTableStatementAccess().getTableNameAssignment_2()); 
            // InternalSQL.g:718:2: ( rule__CreateTableStatement__TableNameAssignment_2 )
            // InternalSQL.g:718:3: rule__CreateTableStatement__TableNameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__CreateTableStatement__TableNameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getCreateTableStatementAccess().getTableNameAssignment_2()); 

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
    // $ANTLR end "rule__CreateTableStatement__Group__2__Impl"


    // $ANTLR start "rule__CreateTableStatement__Group__3"
    // InternalSQL.g:726:1: rule__CreateTableStatement__Group__3 : rule__CreateTableStatement__Group__3__Impl rule__CreateTableStatement__Group__4 ;
    public final void rule__CreateTableStatement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:730:1: ( rule__CreateTableStatement__Group__3__Impl rule__CreateTableStatement__Group__4 )
            // InternalSQL.g:731:2: rule__CreateTableStatement__Group__3__Impl rule__CreateTableStatement__Group__4
            {
            pushFollow(FOLLOW_7);
            rule__CreateTableStatement__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CreateTableStatement__Group__4();

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
    // $ANTLR end "rule__CreateTableStatement__Group__3"


    // $ANTLR start "rule__CreateTableStatement__Group__3__Impl"
    // InternalSQL.g:738:1: rule__CreateTableStatement__Group__3__Impl : ( '(' ) ;
    public final void rule__CreateTableStatement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:742:1: ( ( '(' ) )
            // InternalSQL.g:743:1: ( '(' )
            {
            // InternalSQL.g:743:1: ( '(' )
            // InternalSQL.g:744:2: '('
            {
             before(grammarAccess.getCreateTableStatementAccess().getLeftParenthesisKeyword_3()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getCreateTableStatementAccess().getLeftParenthesisKeyword_3()); 

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
    // $ANTLR end "rule__CreateTableStatement__Group__3__Impl"


    // $ANTLR start "rule__CreateTableStatement__Group__4"
    // InternalSQL.g:753:1: rule__CreateTableStatement__Group__4 : rule__CreateTableStatement__Group__4__Impl rule__CreateTableStatement__Group__5 ;
    public final void rule__CreateTableStatement__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:757:1: ( rule__CreateTableStatement__Group__4__Impl rule__CreateTableStatement__Group__5 )
            // InternalSQL.g:758:2: rule__CreateTableStatement__Group__4__Impl rule__CreateTableStatement__Group__5
            {
            pushFollow(FOLLOW_7);
            rule__CreateTableStatement__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CreateTableStatement__Group__5();

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
    // $ANTLR end "rule__CreateTableStatement__Group__4"


    // $ANTLR start "rule__CreateTableStatement__Group__4__Impl"
    // InternalSQL.g:765:1: rule__CreateTableStatement__Group__4__Impl : ( ( rule__CreateTableStatement__ColumnsAssignment_4 )* ) ;
    public final void rule__CreateTableStatement__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:769:1: ( ( ( rule__CreateTableStatement__ColumnsAssignment_4 )* ) )
            // InternalSQL.g:770:1: ( ( rule__CreateTableStatement__ColumnsAssignment_4 )* )
            {
            // InternalSQL.g:770:1: ( ( rule__CreateTableStatement__ColumnsAssignment_4 )* )
            // InternalSQL.g:771:2: ( rule__CreateTableStatement__ColumnsAssignment_4 )*
            {
             before(grammarAccess.getCreateTableStatementAccess().getColumnsAssignment_4()); 
            // InternalSQL.g:772:2: ( rule__CreateTableStatement__ColumnsAssignment_4 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_ID) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalSQL.g:772:3: rule__CreateTableStatement__ColumnsAssignment_4
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__CreateTableStatement__ColumnsAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getCreateTableStatementAccess().getColumnsAssignment_4()); 

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
    // $ANTLR end "rule__CreateTableStatement__Group__4__Impl"


    // $ANTLR start "rule__CreateTableStatement__Group__5"
    // InternalSQL.g:780:1: rule__CreateTableStatement__Group__5 : rule__CreateTableStatement__Group__5__Impl ;
    public final void rule__CreateTableStatement__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:784:1: ( rule__CreateTableStatement__Group__5__Impl )
            // InternalSQL.g:785:2: rule__CreateTableStatement__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CreateTableStatement__Group__5__Impl();

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
    // $ANTLR end "rule__CreateTableStatement__Group__5"


    // $ANTLR start "rule__CreateTableStatement__Group__5__Impl"
    // InternalSQL.g:791:1: rule__CreateTableStatement__Group__5__Impl : ( ')' ) ;
    public final void rule__CreateTableStatement__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:795:1: ( ( ')' ) )
            // InternalSQL.g:796:1: ( ')' )
            {
            // InternalSQL.g:796:1: ( ')' )
            // InternalSQL.g:797:2: ')'
            {
             before(grammarAccess.getCreateTableStatementAccess().getRightParenthesisKeyword_5()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getCreateTableStatementAccess().getRightParenthesisKeyword_5()); 

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
    // $ANTLR end "rule__CreateTableStatement__Group__5__Impl"


    // $ANTLR start "rule__ColumnDefinition__Group__0"
    // InternalSQL.g:807:1: rule__ColumnDefinition__Group__0 : rule__ColumnDefinition__Group__0__Impl rule__ColumnDefinition__Group__1 ;
    public final void rule__ColumnDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:811:1: ( rule__ColumnDefinition__Group__0__Impl rule__ColumnDefinition__Group__1 )
            // InternalSQL.g:812:2: rule__ColumnDefinition__Group__0__Impl rule__ColumnDefinition__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__ColumnDefinition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ColumnDefinition__Group__1();

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
    // $ANTLR end "rule__ColumnDefinition__Group__0"


    // $ANTLR start "rule__ColumnDefinition__Group__0__Impl"
    // InternalSQL.g:819:1: rule__ColumnDefinition__Group__0__Impl : ( ( rule__ColumnDefinition__ColumnNameAssignment_0 ) ) ;
    public final void rule__ColumnDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:823:1: ( ( ( rule__ColumnDefinition__ColumnNameAssignment_0 ) ) )
            // InternalSQL.g:824:1: ( ( rule__ColumnDefinition__ColumnNameAssignment_0 ) )
            {
            // InternalSQL.g:824:1: ( ( rule__ColumnDefinition__ColumnNameAssignment_0 ) )
            // InternalSQL.g:825:2: ( rule__ColumnDefinition__ColumnNameAssignment_0 )
            {
             before(grammarAccess.getColumnDefinitionAccess().getColumnNameAssignment_0()); 
            // InternalSQL.g:826:2: ( rule__ColumnDefinition__ColumnNameAssignment_0 )
            // InternalSQL.g:826:3: rule__ColumnDefinition__ColumnNameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__ColumnDefinition__ColumnNameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getColumnDefinitionAccess().getColumnNameAssignment_0()); 

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
    // $ANTLR end "rule__ColumnDefinition__Group__0__Impl"


    // $ANTLR start "rule__ColumnDefinition__Group__1"
    // InternalSQL.g:834:1: rule__ColumnDefinition__Group__1 : rule__ColumnDefinition__Group__1__Impl rule__ColumnDefinition__Group__2 ;
    public final void rule__ColumnDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:838:1: ( rule__ColumnDefinition__Group__1__Impl rule__ColumnDefinition__Group__2 )
            // InternalSQL.g:839:2: rule__ColumnDefinition__Group__1__Impl rule__ColumnDefinition__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__ColumnDefinition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ColumnDefinition__Group__2();

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
    // $ANTLR end "rule__ColumnDefinition__Group__1"


    // $ANTLR start "rule__ColumnDefinition__Group__1__Impl"
    // InternalSQL.g:846:1: rule__ColumnDefinition__Group__1__Impl : ( ( rule__ColumnDefinition__ColumnTypeAssignment_1 ) ) ;
    public final void rule__ColumnDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:850:1: ( ( ( rule__ColumnDefinition__ColumnTypeAssignment_1 ) ) )
            // InternalSQL.g:851:1: ( ( rule__ColumnDefinition__ColumnTypeAssignment_1 ) )
            {
            // InternalSQL.g:851:1: ( ( rule__ColumnDefinition__ColumnTypeAssignment_1 ) )
            // InternalSQL.g:852:2: ( rule__ColumnDefinition__ColumnTypeAssignment_1 )
            {
             before(grammarAccess.getColumnDefinitionAccess().getColumnTypeAssignment_1()); 
            // InternalSQL.g:853:2: ( rule__ColumnDefinition__ColumnTypeAssignment_1 )
            // InternalSQL.g:853:3: rule__ColumnDefinition__ColumnTypeAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ColumnDefinition__ColumnTypeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getColumnDefinitionAccess().getColumnTypeAssignment_1()); 

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
    // $ANTLR end "rule__ColumnDefinition__Group__1__Impl"


    // $ANTLR start "rule__ColumnDefinition__Group__2"
    // InternalSQL.g:861:1: rule__ColumnDefinition__Group__2 : rule__ColumnDefinition__Group__2__Impl rule__ColumnDefinition__Group__3 ;
    public final void rule__ColumnDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:865:1: ( rule__ColumnDefinition__Group__2__Impl rule__ColumnDefinition__Group__3 )
            // InternalSQL.g:866:2: rule__ColumnDefinition__Group__2__Impl rule__ColumnDefinition__Group__3
            {
            pushFollow(FOLLOW_10);
            rule__ColumnDefinition__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ColumnDefinition__Group__3();

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
    // $ANTLR end "rule__ColumnDefinition__Group__2"


    // $ANTLR start "rule__ColumnDefinition__Group__2__Impl"
    // InternalSQL.g:873:1: rule__ColumnDefinition__Group__2__Impl : ( ( rule__ColumnDefinition__ConstraintsAssignment_2 )* ) ;
    public final void rule__ColumnDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:877:1: ( ( ( rule__ColumnDefinition__ConstraintsAssignment_2 )* ) )
            // InternalSQL.g:878:1: ( ( rule__ColumnDefinition__ConstraintsAssignment_2 )* )
            {
            // InternalSQL.g:878:1: ( ( rule__ColumnDefinition__ConstraintsAssignment_2 )* )
            // InternalSQL.g:879:2: ( rule__ColumnDefinition__ConstraintsAssignment_2 )*
            {
             before(grammarAccess.getColumnDefinitionAccess().getConstraintsAssignment_2()); 
            // InternalSQL.g:880:2: ( rule__ColumnDefinition__ConstraintsAssignment_2 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==28||LA9_0==30) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalSQL.g:880:3: rule__ColumnDefinition__ConstraintsAssignment_2
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__ColumnDefinition__ConstraintsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getColumnDefinitionAccess().getConstraintsAssignment_2()); 

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
    // $ANTLR end "rule__ColumnDefinition__Group__2__Impl"


    // $ANTLR start "rule__ColumnDefinition__Group__3"
    // InternalSQL.g:888:1: rule__ColumnDefinition__Group__3 : rule__ColumnDefinition__Group__3__Impl ;
    public final void rule__ColumnDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:892:1: ( rule__ColumnDefinition__Group__3__Impl )
            // InternalSQL.g:893:2: rule__ColumnDefinition__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ColumnDefinition__Group__3__Impl();

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
    // $ANTLR end "rule__ColumnDefinition__Group__3"


    // $ANTLR start "rule__ColumnDefinition__Group__3__Impl"
    // InternalSQL.g:899:1: rule__ColumnDefinition__Group__3__Impl : ( ( ',' )? ) ;
    public final void rule__ColumnDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:903:1: ( ( ( ',' )? ) )
            // InternalSQL.g:904:1: ( ( ',' )? )
            {
            // InternalSQL.g:904:1: ( ( ',' )? )
            // InternalSQL.g:905:2: ( ',' )?
            {
             before(grammarAccess.getColumnDefinitionAccess().getCommaKeyword_3()); 
            // InternalSQL.g:906:2: ( ',' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==23) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalSQL.g:906:3: ','
                    {
                    match(input,23,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getColumnDefinitionAccess().getCommaKeyword_3()); 

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
    // $ANTLR end "rule__ColumnDefinition__Group__3__Impl"


    // $ANTLR start "rule__ColumnType__Group_0__0"
    // InternalSQL.g:915:1: rule__ColumnType__Group_0__0 : rule__ColumnType__Group_0__0__Impl rule__ColumnType__Group_0__1 ;
    public final void rule__ColumnType__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:919:1: ( rule__ColumnType__Group_0__0__Impl rule__ColumnType__Group_0__1 )
            // InternalSQL.g:920:2: rule__ColumnType__Group_0__0__Impl rule__ColumnType__Group_0__1
            {
            pushFollow(FOLLOW_12);
            rule__ColumnType__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ColumnType__Group_0__1();

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
    // $ANTLR end "rule__ColumnType__Group_0__0"


    // $ANTLR start "rule__ColumnType__Group_0__0__Impl"
    // InternalSQL.g:927:1: rule__ColumnType__Group_0__0__Impl : ( () ) ;
    public final void rule__ColumnType__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:931:1: ( ( () ) )
            // InternalSQL.g:932:1: ( () )
            {
            // InternalSQL.g:932:1: ( () )
            // InternalSQL.g:933:2: ()
            {
             before(grammarAccess.getColumnTypeAccess().getColumnTypeAction_0_0()); 
            // InternalSQL.g:934:2: ()
            // InternalSQL.g:934:3: 
            {
            }

             after(grammarAccess.getColumnTypeAccess().getColumnTypeAction_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ColumnType__Group_0__0__Impl"


    // $ANTLR start "rule__ColumnType__Group_0__1"
    // InternalSQL.g:942:1: rule__ColumnType__Group_0__1 : rule__ColumnType__Group_0__1__Impl ;
    public final void rule__ColumnType__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:946:1: ( rule__ColumnType__Group_0__1__Impl )
            // InternalSQL.g:947:2: rule__ColumnType__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ColumnType__Group_0__1__Impl();

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
    // $ANTLR end "rule__ColumnType__Group_0__1"


    // $ANTLR start "rule__ColumnType__Group_0__1__Impl"
    // InternalSQL.g:953:1: rule__ColumnType__Group_0__1__Impl : ( 'INT' ) ;
    public final void rule__ColumnType__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:957:1: ( ( 'INT' ) )
            // InternalSQL.g:958:1: ( 'INT' )
            {
            // InternalSQL.g:958:1: ( 'INT' )
            // InternalSQL.g:959:2: 'INT'
            {
             before(grammarAccess.getColumnTypeAccess().getINTKeyword_0_1()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getColumnTypeAccess().getINTKeyword_0_1()); 

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
    // $ANTLR end "rule__ColumnType__Group_0__1__Impl"


    // $ANTLR start "rule__ColumnType__Group_1__0"
    // InternalSQL.g:969:1: rule__ColumnType__Group_1__0 : rule__ColumnType__Group_1__0__Impl rule__ColumnType__Group_1__1 ;
    public final void rule__ColumnType__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:973:1: ( rule__ColumnType__Group_1__0__Impl rule__ColumnType__Group_1__1 )
            // InternalSQL.g:974:2: rule__ColumnType__Group_1__0__Impl rule__ColumnType__Group_1__1
            {
            pushFollow(FOLLOW_6);
            rule__ColumnType__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ColumnType__Group_1__1();

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
    // $ANTLR end "rule__ColumnType__Group_1__0"


    // $ANTLR start "rule__ColumnType__Group_1__0__Impl"
    // InternalSQL.g:981:1: rule__ColumnType__Group_1__0__Impl : ( 'VARCHAR' ) ;
    public final void rule__ColumnType__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:985:1: ( ( 'VARCHAR' ) )
            // InternalSQL.g:986:1: ( 'VARCHAR' )
            {
            // InternalSQL.g:986:1: ( 'VARCHAR' )
            // InternalSQL.g:987:2: 'VARCHAR'
            {
             before(grammarAccess.getColumnTypeAccess().getVARCHARKeyword_1_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getColumnTypeAccess().getVARCHARKeyword_1_0()); 

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
    // $ANTLR end "rule__ColumnType__Group_1__0__Impl"


    // $ANTLR start "rule__ColumnType__Group_1__1"
    // InternalSQL.g:996:1: rule__ColumnType__Group_1__1 : rule__ColumnType__Group_1__1__Impl rule__ColumnType__Group_1__2 ;
    public final void rule__ColumnType__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:1000:1: ( rule__ColumnType__Group_1__1__Impl rule__ColumnType__Group_1__2 )
            // InternalSQL.g:1001:2: rule__ColumnType__Group_1__1__Impl rule__ColumnType__Group_1__2
            {
            pushFollow(FOLLOW_13);
            rule__ColumnType__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ColumnType__Group_1__2();

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
    // $ANTLR end "rule__ColumnType__Group_1__1"


    // $ANTLR start "rule__ColumnType__Group_1__1__Impl"
    // InternalSQL.g:1008:1: rule__ColumnType__Group_1__1__Impl : ( '(' ) ;
    public final void rule__ColumnType__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:1012:1: ( ( '(' ) )
            // InternalSQL.g:1013:1: ( '(' )
            {
            // InternalSQL.g:1013:1: ( '(' )
            // InternalSQL.g:1014:2: '('
            {
             before(grammarAccess.getColumnTypeAccess().getLeftParenthesisKeyword_1_1()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getColumnTypeAccess().getLeftParenthesisKeyword_1_1()); 

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
    // $ANTLR end "rule__ColumnType__Group_1__1__Impl"


    // $ANTLR start "rule__ColumnType__Group_1__2"
    // InternalSQL.g:1023:1: rule__ColumnType__Group_1__2 : rule__ColumnType__Group_1__2__Impl rule__ColumnType__Group_1__3 ;
    public final void rule__ColumnType__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:1027:1: ( rule__ColumnType__Group_1__2__Impl rule__ColumnType__Group_1__3 )
            // InternalSQL.g:1028:2: rule__ColumnType__Group_1__2__Impl rule__ColumnType__Group_1__3
            {
            pushFollow(FOLLOW_14);
            rule__ColumnType__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ColumnType__Group_1__3();

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
    // $ANTLR end "rule__ColumnType__Group_1__2"


    // $ANTLR start "rule__ColumnType__Group_1__2__Impl"
    // InternalSQL.g:1035:1: rule__ColumnType__Group_1__2__Impl : ( ( rule__ColumnType__LengthAssignment_1_2 ) ) ;
    public final void rule__ColumnType__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:1039:1: ( ( ( rule__ColumnType__LengthAssignment_1_2 ) ) )
            // InternalSQL.g:1040:1: ( ( rule__ColumnType__LengthAssignment_1_2 ) )
            {
            // InternalSQL.g:1040:1: ( ( rule__ColumnType__LengthAssignment_1_2 ) )
            // InternalSQL.g:1041:2: ( rule__ColumnType__LengthAssignment_1_2 )
            {
             before(grammarAccess.getColumnTypeAccess().getLengthAssignment_1_2()); 
            // InternalSQL.g:1042:2: ( rule__ColumnType__LengthAssignment_1_2 )
            // InternalSQL.g:1042:3: rule__ColumnType__LengthAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__ColumnType__LengthAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getColumnTypeAccess().getLengthAssignment_1_2()); 

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
    // $ANTLR end "rule__ColumnType__Group_1__2__Impl"


    // $ANTLR start "rule__ColumnType__Group_1__3"
    // InternalSQL.g:1050:1: rule__ColumnType__Group_1__3 : rule__ColumnType__Group_1__3__Impl ;
    public final void rule__ColumnType__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:1054:1: ( rule__ColumnType__Group_1__3__Impl )
            // InternalSQL.g:1055:2: rule__ColumnType__Group_1__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ColumnType__Group_1__3__Impl();

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
    // $ANTLR end "rule__ColumnType__Group_1__3"


    // $ANTLR start "rule__ColumnType__Group_1__3__Impl"
    // InternalSQL.g:1061:1: rule__ColumnType__Group_1__3__Impl : ( ')' ) ;
    public final void rule__ColumnType__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:1065:1: ( ( ')' ) )
            // InternalSQL.g:1066:1: ( ')' )
            {
            // InternalSQL.g:1066:1: ( ')' )
            // InternalSQL.g:1067:2: ')'
            {
             before(grammarAccess.getColumnTypeAccess().getRightParenthesisKeyword_1_3()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getColumnTypeAccess().getRightParenthesisKeyword_1_3()); 

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
    // $ANTLR end "rule__ColumnType__Group_1__3__Impl"


    // $ANTLR start "rule__ColumnType__Group_2__0"
    // InternalSQL.g:1077:1: rule__ColumnType__Group_2__0 : rule__ColumnType__Group_2__0__Impl rule__ColumnType__Group_2__1 ;
    public final void rule__ColumnType__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:1081:1: ( rule__ColumnType__Group_2__0__Impl rule__ColumnType__Group_2__1 )
            // InternalSQL.g:1082:2: rule__ColumnType__Group_2__0__Impl rule__ColumnType__Group_2__1
            {
            pushFollow(FOLLOW_15);
            rule__ColumnType__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ColumnType__Group_2__1();

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
    // $ANTLR end "rule__ColumnType__Group_2__0"


    // $ANTLR start "rule__ColumnType__Group_2__0__Impl"
    // InternalSQL.g:1089:1: rule__ColumnType__Group_2__0__Impl : ( () ) ;
    public final void rule__ColumnType__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:1093:1: ( ( () ) )
            // InternalSQL.g:1094:1: ( () )
            {
            // InternalSQL.g:1094:1: ( () )
            // InternalSQL.g:1095:2: ()
            {
             before(grammarAccess.getColumnTypeAccess().getColumnTypeAction_2_0()); 
            // InternalSQL.g:1096:2: ()
            // InternalSQL.g:1096:3: 
            {
            }

             after(grammarAccess.getColumnTypeAccess().getColumnTypeAction_2_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ColumnType__Group_2__0__Impl"


    // $ANTLR start "rule__ColumnType__Group_2__1"
    // InternalSQL.g:1104:1: rule__ColumnType__Group_2__1 : rule__ColumnType__Group_2__1__Impl ;
    public final void rule__ColumnType__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:1108:1: ( rule__ColumnType__Group_2__1__Impl )
            // InternalSQL.g:1109:2: rule__ColumnType__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ColumnType__Group_2__1__Impl();

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
    // $ANTLR end "rule__ColumnType__Group_2__1"


    // $ANTLR start "rule__ColumnType__Group_2__1__Impl"
    // InternalSQL.g:1115:1: rule__ColumnType__Group_2__1__Impl : ( 'BOOLEAN' ) ;
    public final void rule__ColumnType__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:1119:1: ( ( 'BOOLEAN' ) )
            // InternalSQL.g:1120:1: ( 'BOOLEAN' )
            {
            // InternalSQL.g:1120:1: ( 'BOOLEAN' )
            // InternalSQL.g:1121:2: 'BOOLEAN'
            {
             before(grammarAccess.getColumnTypeAccess().getBOOLEANKeyword_2_1()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getColumnTypeAccess().getBOOLEANKeyword_2_1()); 

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
    // $ANTLR end "rule__ColumnType__Group_2__1__Impl"


    // $ANTLR start "rule__ColumnType__Group_3__0"
    // InternalSQL.g:1131:1: rule__ColumnType__Group_3__0 : rule__ColumnType__Group_3__0__Impl rule__ColumnType__Group_3__1 ;
    public final void rule__ColumnType__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:1135:1: ( rule__ColumnType__Group_3__0__Impl rule__ColumnType__Group_3__1 )
            // InternalSQL.g:1136:2: rule__ColumnType__Group_3__0__Impl rule__ColumnType__Group_3__1
            {
            pushFollow(FOLLOW_9);
            rule__ColumnType__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ColumnType__Group_3__1();

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
    // $ANTLR end "rule__ColumnType__Group_3__0"


    // $ANTLR start "rule__ColumnType__Group_3__0__Impl"
    // InternalSQL.g:1143:1: rule__ColumnType__Group_3__0__Impl : ( () ) ;
    public final void rule__ColumnType__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:1147:1: ( ( () ) )
            // InternalSQL.g:1148:1: ( () )
            {
            // InternalSQL.g:1148:1: ( () )
            // InternalSQL.g:1149:2: ()
            {
             before(grammarAccess.getColumnTypeAccess().getColumnTypeAction_3_0()); 
            // InternalSQL.g:1150:2: ()
            // InternalSQL.g:1150:3: 
            {
            }

             after(grammarAccess.getColumnTypeAccess().getColumnTypeAction_3_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ColumnType__Group_3__0__Impl"


    // $ANTLR start "rule__ColumnType__Group_3__1"
    // InternalSQL.g:1158:1: rule__ColumnType__Group_3__1 : rule__ColumnType__Group_3__1__Impl ;
    public final void rule__ColumnType__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:1162:1: ( rule__ColumnType__Group_3__1__Impl )
            // InternalSQL.g:1163:2: rule__ColumnType__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ColumnType__Group_3__1__Impl();

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
    // $ANTLR end "rule__ColumnType__Group_3__1"


    // $ANTLR start "rule__ColumnType__Group_3__1__Impl"
    // InternalSQL.g:1169:1: rule__ColumnType__Group_3__1__Impl : ( 'TINYINT' ) ;
    public final void rule__ColumnType__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:1173:1: ( ( 'TINYINT' ) )
            // InternalSQL.g:1174:1: ( 'TINYINT' )
            {
            // InternalSQL.g:1174:1: ( 'TINYINT' )
            // InternalSQL.g:1175:2: 'TINYINT'
            {
             before(grammarAccess.getColumnTypeAccess().getTINYINTKeyword_3_1()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getColumnTypeAccess().getTINYINTKeyword_3_1()); 

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
    // $ANTLR end "rule__ColumnType__Group_3__1__Impl"


    // $ANTLR start "rule__Constraint__Group_0__0"
    // InternalSQL.g:1185:1: rule__Constraint__Group_0__0 : rule__Constraint__Group_0__0__Impl rule__Constraint__Group_0__1 ;
    public final void rule__Constraint__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:1189:1: ( rule__Constraint__Group_0__0__Impl rule__Constraint__Group_0__1 )
            // InternalSQL.g:1190:2: rule__Constraint__Group_0__0__Impl rule__Constraint__Group_0__1
            {
            pushFollow(FOLLOW_16);
            rule__Constraint__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Constraint__Group_0__1();

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
    // $ANTLR end "rule__Constraint__Group_0__0"


    // $ANTLR start "rule__Constraint__Group_0__0__Impl"
    // InternalSQL.g:1197:1: rule__Constraint__Group_0__0__Impl : ( 'NOT' ) ;
    public final void rule__Constraint__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:1201:1: ( ( 'NOT' ) )
            // InternalSQL.g:1202:1: ( 'NOT' )
            {
            // InternalSQL.g:1202:1: ( 'NOT' )
            // InternalSQL.g:1203:2: 'NOT'
            {
             before(grammarAccess.getConstraintAccess().getNOTKeyword_0_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getConstraintAccess().getNOTKeyword_0_0()); 

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
    // $ANTLR end "rule__Constraint__Group_0__0__Impl"


    // $ANTLR start "rule__Constraint__Group_0__1"
    // InternalSQL.g:1212:1: rule__Constraint__Group_0__1 : rule__Constraint__Group_0__1__Impl ;
    public final void rule__Constraint__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:1216:1: ( rule__Constraint__Group_0__1__Impl )
            // InternalSQL.g:1217:2: rule__Constraint__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Constraint__Group_0__1__Impl();

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
    // $ANTLR end "rule__Constraint__Group_0__1"


    // $ANTLR start "rule__Constraint__Group_0__1__Impl"
    // InternalSQL.g:1223:1: rule__Constraint__Group_0__1__Impl : ( 'NULL' ) ;
    public final void rule__Constraint__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:1227:1: ( ( 'NULL' ) )
            // InternalSQL.g:1228:1: ( 'NULL' )
            {
            // InternalSQL.g:1228:1: ( 'NULL' )
            // InternalSQL.g:1229:2: 'NULL'
            {
             before(grammarAccess.getConstraintAccess().getNULLKeyword_0_1()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getConstraintAccess().getNULLKeyword_0_1()); 

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
    // $ANTLR end "rule__Constraint__Group_0__1__Impl"


    // $ANTLR start "rule__Constraint__Group_1__0"
    // InternalSQL.g:1239:1: rule__Constraint__Group_1__0 : rule__Constraint__Group_1__0__Impl rule__Constraint__Group_1__1 ;
    public final void rule__Constraint__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:1243:1: ( rule__Constraint__Group_1__0__Impl rule__Constraint__Group_1__1 )
            // InternalSQL.g:1244:2: rule__Constraint__Group_1__0__Impl rule__Constraint__Group_1__1
            {
            pushFollow(FOLLOW_17);
            rule__Constraint__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Constraint__Group_1__1();

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
    // $ANTLR end "rule__Constraint__Group_1__0"


    // $ANTLR start "rule__Constraint__Group_1__0__Impl"
    // InternalSQL.g:1251:1: rule__Constraint__Group_1__0__Impl : ( 'PRIMARY' ) ;
    public final void rule__Constraint__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:1255:1: ( ( 'PRIMARY' ) )
            // InternalSQL.g:1256:1: ( 'PRIMARY' )
            {
            // InternalSQL.g:1256:1: ( 'PRIMARY' )
            // InternalSQL.g:1257:2: 'PRIMARY'
            {
             before(grammarAccess.getConstraintAccess().getPRIMARYKeyword_1_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getConstraintAccess().getPRIMARYKeyword_1_0()); 

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
    // $ANTLR end "rule__Constraint__Group_1__0__Impl"


    // $ANTLR start "rule__Constraint__Group_1__1"
    // InternalSQL.g:1266:1: rule__Constraint__Group_1__1 : rule__Constraint__Group_1__1__Impl ;
    public final void rule__Constraint__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:1270:1: ( rule__Constraint__Group_1__1__Impl )
            // InternalSQL.g:1271:2: rule__Constraint__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Constraint__Group_1__1__Impl();

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
    // $ANTLR end "rule__Constraint__Group_1__1"


    // $ANTLR start "rule__Constraint__Group_1__1__Impl"
    // InternalSQL.g:1277:1: rule__Constraint__Group_1__1__Impl : ( 'KEY' ) ;
    public final void rule__Constraint__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:1281:1: ( ( 'KEY' ) )
            // InternalSQL.g:1282:1: ( 'KEY' )
            {
            // InternalSQL.g:1282:1: ( 'KEY' )
            // InternalSQL.g:1283:2: 'KEY'
            {
             before(grammarAccess.getConstraintAccess().getKEYKeyword_1_1()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getConstraintAccess().getKEYKeyword_1_1()); 

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
    // $ANTLR end "rule__Constraint__Group_1__1__Impl"


    // $ANTLR start "rule__SelectStatement__Group__0"
    // InternalSQL.g:1293:1: rule__SelectStatement__Group__0 : rule__SelectStatement__Group__0__Impl rule__SelectStatement__Group__1 ;
    public final void rule__SelectStatement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:1297:1: ( rule__SelectStatement__Group__0__Impl rule__SelectStatement__Group__1 )
            // InternalSQL.g:1298:2: rule__SelectStatement__Group__0__Impl rule__SelectStatement__Group__1
            {
            pushFollow(FOLLOW_18);
            rule__SelectStatement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SelectStatement__Group__1();

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
    // $ANTLR end "rule__SelectStatement__Group__0"


    // $ANTLR start "rule__SelectStatement__Group__0__Impl"
    // InternalSQL.g:1305:1: rule__SelectStatement__Group__0__Impl : ( 'SELECT' ) ;
    public final void rule__SelectStatement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:1309:1: ( ( 'SELECT' ) )
            // InternalSQL.g:1310:1: ( 'SELECT' )
            {
            // InternalSQL.g:1310:1: ( 'SELECT' )
            // InternalSQL.g:1311:2: 'SELECT'
            {
             before(grammarAccess.getSelectStatementAccess().getSELECTKeyword_0()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getSelectStatementAccess().getSELECTKeyword_0()); 

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
    // $ANTLR end "rule__SelectStatement__Group__0__Impl"


    // $ANTLR start "rule__SelectStatement__Group__1"
    // InternalSQL.g:1320:1: rule__SelectStatement__Group__1 : rule__SelectStatement__Group__1__Impl rule__SelectStatement__Group__2 ;
    public final void rule__SelectStatement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:1324:1: ( rule__SelectStatement__Group__1__Impl rule__SelectStatement__Group__2 )
            // InternalSQL.g:1325:2: rule__SelectStatement__Group__1__Impl rule__SelectStatement__Group__2
            {
            pushFollow(FOLLOW_19);
            rule__SelectStatement__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SelectStatement__Group__2();

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
    // $ANTLR end "rule__SelectStatement__Group__1"


    // $ANTLR start "rule__SelectStatement__Group__1__Impl"
    // InternalSQL.g:1332:1: rule__SelectStatement__Group__1__Impl : ( ( rule__SelectStatement__SelectedColumnsAssignment_1 ) ) ;
    public final void rule__SelectStatement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:1336:1: ( ( ( rule__SelectStatement__SelectedColumnsAssignment_1 ) ) )
            // InternalSQL.g:1337:1: ( ( rule__SelectStatement__SelectedColumnsAssignment_1 ) )
            {
            // InternalSQL.g:1337:1: ( ( rule__SelectStatement__SelectedColumnsAssignment_1 ) )
            // InternalSQL.g:1338:2: ( rule__SelectStatement__SelectedColumnsAssignment_1 )
            {
             before(grammarAccess.getSelectStatementAccess().getSelectedColumnsAssignment_1()); 
            // InternalSQL.g:1339:2: ( rule__SelectStatement__SelectedColumnsAssignment_1 )
            // InternalSQL.g:1339:3: rule__SelectStatement__SelectedColumnsAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__SelectStatement__SelectedColumnsAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSelectStatementAccess().getSelectedColumnsAssignment_1()); 

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
    // $ANTLR end "rule__SelectStatement__Group__1__Impl"


    // $ANTLR start "rule__SelectStatement__Group__2"
    // InternalSQL.g:1347:1: rule__SelectStatement__Group__2 : rule__SelectStatement__Group__2__Impl rule__SelectStatement__Group__3 ;
    public final void rule__SelectStatement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:1351:1: ( rule__SelectStatement__Group__2__Impl rule__SelectStatement__Group__3 )
            // InternalSQL.g:1352:2: rule__SelectStatement__Group__2__Impl rule__SelectStatement__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__SelectStatement__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SelectStatement__Group__3();

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
    // $ANTLR end "rule__SelectStatement__Group__2"


    // $ANTLR start "rule__SelectStatement__Group__2__Impl"
    // InternalSQL.g:1359:1: rule__SelectStatement__Group__2__Impl : ( 'FROM' ) ;
    public final void rule__SelectStatement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:1363:1: ( ( 'FROM' ) )
            // InternalSQL.g:1364:1: ( 'FROM' )
            {
            // InternalSQL.g:1364:1: ( 'FROM' )
            // InternalSQL.g:1365:2: 'FROM'
            {
             before(grammarAccess.getSelectStatementAccess().getFROMKeyword_2()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getSelectStatementAccess().getFROMKeyword_2()); 

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
    // $ANTLR end "rule__SelectStatement__Group__2__Impl"


    // $ANTLR start "rule__SelectStatement__Group__3"
    // InternalSQL.g:1374:1: rule__SelectStatement__Group__3 : rule__SelectStatement__Group__3__Impl rule__SelectStatement__Group__4 ;
    public final void rule__SelectStatement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:1378:1: ( rule__SelectStatement__Group__3__Impl rule__SelectStatement__Group__4 )
            // InternalSQL.g:1379:2: rule__SelectStatement__Group__3__Impl rule__SelectStatement__Group__4
            {
            pushFollow(FOLLOW_20);
            rule__SelectStatement__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SelectStatement__Group__4();

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
    // $ANTLR end "rule__SelectStatement__Group__3"


    // $ANTLR start "rule__SelectStatement__Group__3__Impl"
    // InternalSQL.g:1386:1: rule__SelectStatement__Group__3__Impl : ( ( rule__SelectStatement__TableNameAssignment_3 ) ) ;
    public final void rule__SelectStatement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:1390:1: ( ( ( rule__SelectStatement__TableNameAssignment_3 ) ) )
            // InternalSQL.g:1391:1: ( ( rule__SelectStatement__TableNameAssignment_3 ) )
            {
            // InternalSQL.g:1391:1: ( ( rule__SelectStatement__TableNameAssignment_3 ) )
            // InternalSQL.g:1392:2: ( rule__SelectStatement__TableNameAssignment_3 )
            {
             before(grammarAccess.getSelectStatementAccess().getTableNameAssignment_3()); 
            // InternalSQL.g:1393:2: ( rule__SelectStatement__TableNameAssignment_3 )
            // InternalSQL.g:1393:3: rule__SelectStatement__TableNameAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__SelectStatement__TableNameAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getSelectStatementAccess().getTableNameAssignment_3()); 

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
    // $ANTLR end "rule__SelectStatement__Group__3__Impl"


    // $ANTLR start "rule__SelectStatement__Group__4"
    // InternalSQL.g:1401:1: rule__SelectStatement__Group__4 : rule__SelectStatement__Group__4__Impl ;
    public final void rule__SelectStatement__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:1405:1: ( rule__SelectStatement__Group__4__Impl )
            // InternalSQL.g:1406:2: rule__SelectStatement__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SelectStatement__Group__4__Impl();

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
    // $ANTLR end "rule__SelectStatement__Group__4"


    // $ANTLR start "rule__SelectStatement__Group__4__Impl"
    // InternalSQL.g:1412:1: rule__SelectStatement__Group__4__Impl : ( ( rule__SelectStatement__WhereClauseAssignment_4 )? ) ;
    public final void rule__SelectStatement__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:1416:1: ( ( ( rule__SelectStatement__WhereClauseAssignment_4 )? ) )
            // InternalSQL.g:1417:1: ( ( rule__SelectStatement__WhereClauseAssignment_4 )? )
            {
            // InternalSQL.g:1417:1: ( ( rule__SelectStatement__WhereClauseAssignment_4 )? )
            // InternalSQL.g:1418:2: ( rule__SelectStatement__WhereClauseAssignment_4 )?
            {
             before(grammarAccess.getSelectStatementAccess().getWhereClauseAssignment_4()); 
            // InternalSQL.g:1419:2: ( rule__SelectStatement__WhereClauseAssignment_4 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==34) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalSQL.g:1419:3: rule__SelectStatement__WhereClauseAssignment_4
                    {
                    pushFollow(FOLLOW_2);
                    rule__SelectStatement__WhereClauseAssignment_4();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSelectStatementAccess().getWhereClauseAssignment_4()); 

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
    // $ANTLR end "rule__SelectStatement__Group__4__Impl"


    // $ANTLR start "rule__SelectedColumns__Group__0"
    // InternalSQL.g:1428:1: rule__SelectedColumns__Group__0 : rule__SelectedColumns__Group__0__Impl rule__SelectedColumns__Group__1 ;
    public final void rule__SelectedColumns__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:1432:1: ( rule__SelectedColumns__Group__0__Impl rule__SelectedColumns__Group__1 )
            // InternalSQL.g:1433:2: rule__SelectedColumns__Group__0__Impl rule__SelectedColumns__Group__1
            {
            pushFollow(FOLLOW_21);
            rule__SelectedColumns__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SelectedColumns__Group__1();

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
    // $ANTLR end "rule__SelectedColumns__Group__0"


    // $ANTLR start "rule__SelectedColumns__Group__0__Impl"
    // InternalSQL.g:1440:1: rule__SelectedColumns__Group__0__Impl : ( ( rule__SelectedColumns__ColumnsAssignment_0 ) ) ;
    public final void rule__SelectedColumns__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:1444:1: ( ( ( rule__SelectedColumns__ColumnsAssignment_0 ) ) )
            // InternalSQL.g:1445:1: ( ( rule__SelectedColumns__ColumnsAssignment_0 ) )
            {
            // InternalSQL.g:1445:1: ( ( rule__SelectedColumns__ColumnsAssignment_0 ) )
            // InternalSQL.g:1446:2: ( rule__SelectedColumns__ColumnsAssignment_0 )
            {
             before(grammarAccess.getSelectedColumnsAccess().getColumnsAssignment_0()); 
            // InternalSQL.g:1447:2: ( rule__SelectedColumns__ColumnsAssignment_0 )
            // InternalSQL.g:1447:3: rule__SelectedColumns__ColumnsAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__SelectedColumns__ColumnsAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getSelectedColumnsAccess().getColumnsAssignment_0()); 

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
    // $ANTLR end "rule__SelectedColumns__Group__0__Impl"


    // $ANTLR start "rule__SelectedColumns__Group__1"
    // InternalSQL.g:1455:1: rule__SelectedColumns__Group__1 : rule__SelectedColumns__Group__1__Impl ;
    public final void rule__SelectedColumns__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:1459:1: ( rule__SelectedColumns__Group__1__Impl )
            // InternalSQL.g:1460:2: rule__SelectedColumns__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SelectedColumns__Group__1__Impl();

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
    // $ANTLR end "rule__SelectedColumns__Group__1"


    // $ANTLR start "rule__SelectedColumns__Group__1__Impl"
    // InternalSQL.g:1466:1: rule__SelectedColumns__Group__1__Impl : ( ( rule__SelectedColumns__Group_1__0 )* ) ;
    public final void rule__SelectedColumns__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:1470:1: ( ( ( rule__SelectedColumns__Group_1__0 )* ) )
            // InternalSQL.g:1471:1: ( ( rule__SelectedColumns__Group_1__0 )* )
            {
            // InternalSQL.g:1471:1: ( ( rule__SelectedColumns__Group_1__0 )* )
            // InternalSQL.g:1472:2: ( rule__SelectedColumns__Group_1__0 )*
            {
             before(grammarAccess.getSelectedColumnsAccess().getGroup_1()); 
            // InternalSQL.g:1473:2: ( rule__SelectedColumns__Group_1__0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==23) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalSQL.g:1473:3: rule__SelectedColumns__Group_1__0
            	    {
            	    pushFollow(FOLLOW_22);
            	    rule__SelectedColumns__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getSelectedColumnsAccess().getGroup_1()); 

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
    // $ANTLR end "rule__SelectedColumns__Group__1__Impl"


    // $ANTLR start "rule__SelectedColumns__Group_1__0"
    // InternalSQL.g:1482:1: rule__SelectedColumns__Group_1__0 : rule__SelectedColumns__Group_1__0__Impl rule__SelectedColumns__Group_1__1 ;
    public final void rule__SelectedColumns__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:1486:1: ( rule__SelectedColumns__Group_1__0__Impl rule__SelectedColumns__Group_1__1 )
            // InternalSQL.g:1487:2: rule__SelectedColumns__Group_1__0__Impl rule__SelectedColumns__Group_1__1
            {
            pushFollow(FOLLOW_18);
            rule__SelectedColumns__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SelectedColumns__Group_1__1();

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
    // $ANTLR end "rule__SelectedColumns__Group_1__0"


    // $ANTLR start "rule__SelectedColumns__Group_1__0__Impl"
    // InternalSQL.g:1494:1: rule__SelectedColumns__Group_1__0__Impl : ( ',' ) ;
    public final void rule__SelectedColumns__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:1498:1: ( ( ',' ) )
            // InternalSQL.g:1499:1: ( ',' )
            {
            // InternalSQL.g:1499:1: ( ',' )
            // InternalSQL.g:1500:2: ','
            {
             before(grammarAccess.getSelectedColumnsAccess().getCommaKeyword_1_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getSelectedColumnsAccess().getCommaKeyword_1_0()); 

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
    // $ANTLR end "rule__SelectedColumns__Group_1__0__Impl"


    // $ANTLR start "rule__SelectedColumns__Group_1__1"
    // InternalSQL.g:1509:1: rule__SelectedColumns__Group_1__1 : rule__SelectedColumns__Group_1__1__Impl ;
    public final void rule__SelectedColumns__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:1513:1: ( rule__SelectedColumns__Group_1__1__Impl )
            // InternalSQL.g:1514:2: rule__SelectedColumns__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SelectedColumns__Group_1__1__Impl();

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
    // $ANTLR end "rule__SelectedColumns__Group_1__1"


    // $ANTLR start "rule__SelectedColumns__Group_1__1__Impl"
    // InternalSQL.g:1520:1: rule__SelectedColumns__Group_1__1__Impl : ( ( rule__SelectedColumns__ColumnsAssignment_1_1 ) ) ;
    public final void rule__SelectedColumns__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:1524:1: ( ( ( rule__SelectedColumns__ColumnsAssignment_1_1 ) ) )
            // InternalSQL.g:1525:1: ( ( rule__SelectedColumns__ColumnsAssignment_1_1 ) )
            {
            // InternalSQL.g:1525:1: ( ( rule__SelectedColumns__ColumnsAssignment_1_1 ) )
            // InternalSQL.g:1526:2: ( rule__SelectedColumns__ColumnsAssignment_1_1 )
            {
             before(grammarAccess.getSelectedColumnsAccess().getColumnsAssignment_1_1()); 
            // InternalSQL.g:1527:2: ( rule__SelectedColumns__ColumnsAssignment_1_1 )
            // InternalSQL.g:1527:3: rule__SelectedColumns__ColumnsAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__SelectedColumns__ColumnsAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getSelectedColumnsAccess().getColumnsAssignment_1_1()); 

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
    // $ANTLR end "rule__SelectedColumns__Group_1__1__Impl"


    // $ANTLR start "rule__WhereClause__Group__0"
    // InternalSQL.g:1536:1: rule__WhereClause__Group__0 : rule__WhereClause__Group__0__Impl rule__WhereClause__Group__1 ;
    public final void rule__WhereClause__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:1540:1: ( rule__WhereClause__Group__0__Impl rule__WhereClause__Group__1 )
            // InternalSQL.g:1541:2: rule__WhereClause__Group__0__Impl rule__WhereClause__Group__1
            {
            pushFollow(FOLLOW_18);
            rule__WhereClause__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WhereClause__Group__1();

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
    // $ANTLR end "rule__WhereClause__Group__0"


    // $ANTLR start "rule__WhereClause__Group__0__Impl"
    // InternalSQL.g:1548:1: rule__WhereClause__Group__0__Impl : ( 'WHERE' ) ;
    public final void rule__WhereClause__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:1552:1: ( ( 'WHERE' ) )
            // InternalSQL.g:1553:1: ( 'WHERE' )
            {
            // InternalSQL.g:1553:1: ( 'WHERE' )
            // InternalSQL.g:1554:2: 'WHERE'
            {
             before(grammarAccess.getWhereClauseAccess().getWHEREKeyword_0()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getWhereClauseAccess().getWHEREKeyword_0()); 

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
    // $ANTLR end "rule__WhereClause__Group__0__Impl"


    // $ANTLR start "rule__WhereClause__Group__1"
    // InternalSQL.g:1563:1: rule__WhereClause__Group__1 : rule__WhereClause__Group__1__Impl ;
    public final void rule__WhereClause__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:1567:1: ( rule__WhereClause__Group__1__Impl )
            // InternalSQL.g:1568:2: rule__WhereClause__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__WhereClause__Group__1__Impl();

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
    // $ANTLR end "rule__WhereClause__Group__1"


    // $ANTLR start "rule__WhereClause__Group__1__Impl"
    // InternalSQL.g:1574:1: rule__WhereClause__Group__1__Impl : ( ( rule__WhereClause__ExpressionAssignment_1 ) ) ;
    public final void rule__WhereClause__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:1578:1: ( ( ( rule__WhereClause__ExpressionAssignment_1 ) ) )
            // InternalSQL.g:1579:1: ( ( rule__WhereClause__ExpressionAssignment_1 ) )
            {
            // InternalSQL.g:1579:1: ( ( rule__WhereClause__ExpressionAssignment_1 ) )
            // InternalSQL.g:1580:2: ( rule__WhereClause__ExpressionAssignment_1 )
            {
             before(grammarAccess.getWhereClauseAccess().getExpressionAssignment_1()); 
            // InternalSQL.g:1581:2: ( rule__WhereClause__ExpressionAssignment_1 )
            // InternalSQL.g:1581:3: rule__WhereClause__ExpressionAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__WhereClause__ExpressionAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getWhereClauseAccess().getExpressionAssignment_1()); 

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
    // $ANTLR end "rule__WhereClause__Group__1__Impl"


    // $ANTLR start "rule__Expression__Group__0"
    // InternalSQL.g:1590:1: rule__Expression__Group__0 : rule__Expression__Group__0__Impl rule__Expression__Group__1 ;
    public final void rule__Expression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:1594:1: ( rule__Expression__Group__0__Impl rule__Expression__Group__1 )
            // InternalSQL.g:1595:2: rule__Expression__Group__0__Impl rule__Expression__Group__1
            {
            pushFollow(FOLLOW_23);
            rule__Expression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalSQL.g:1602:1: rule__Expression__Group__0__Impl : ( ruleAndExpression ) ;
    public final void rule__Expression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:1606:1: ( ( ruleAndExpression ) )
            // InternalSQL.g:1607:1: ( ruleAndExpression )
            {
            // InternalSQL.g:1607:1: ( ruleAndExpression )
            // InternalSQL.g:1608:2: ruleAndExpression
            {
             before(grammarAccess.getExpressionAccess().getAndExpressionParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleAndExpression();

            state._fsp--;

             after(grammarAccess.getExpressionAccess().getAndExpressionParserRuleCall_0()); 

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
    // InternalSQL.g:1617:1: rule__Expression__Group__1 : rule__Expression__Group__1__Impl ;
    public final void rule__Expression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:1621:1: ( rule__Expression__Group__1__Impl )
            // InternalSQL.g:1622:2: rule__Expression__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalSQL.g:1628:1: rule__Expression__Group__1__Impl : ( ( rule__Expression__Group_1__0 )* ) ;
    public final void rule__Expression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:1632:1: ( ( ( rule__Expression__Group_1__0 )* ) )
            // InternalSQL.g:1633:1: ( ( rule__Expression__Group_1__0 )* )
            {
            // InternalSQL.g:1633:1: ( ( rule__Expression__Group_1__0 )* )
            // InternalSQL.g:1634:2: ( rule__Expression__Group_1__0 )*
            {
             before(grammarAccess.getExpressionAccess().getGroup_1()); 
            // InternalSQL.g:1635:2: ( rule__Expression__Group_1__0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==35) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalSQL.g:1635:3: rule__Expression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_24);
            	    rule__Expression__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

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
    // InternalSQL.g:1644:1: rule__Expression__Group_1__0 : rule__Expression__Group_1__0__Impl rule__Expression__Group_1__1 ;
    public final void rule__Expression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:1648:1: ( rule__Expression__Group_1__0__Impl rule__Expression__Group_1__1 )
            // InternalSQL.g:1649:2: rule__Expression__Group_1__0__Impl rule__Expression__Group_1__1
            {
            pushFollow(FOLLOW_23);
            rule__Expression__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalSQL.g:1656:1: rule__Expression__Group_1__0__Impl : ( () ) ;
    public final void rule__Expression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:1660:1: ( ( () ) )
            // InternalSQL.g:1661:1: ( () )
            {
            // InternalSQL.g:1661:1: ( () )
            // InternalSQL.g:1662:2: ()
            {
             before(grammarAccess.getExpressionAccess().getOrExpressionLeftAction_1_0()); 
            // InternalSQL.g:1663:2: ()
            // InternalSQL.g:1663:3: 
            {
            }

             after(grammarAccess.getExpressionAccess().getOrExpressionLeftAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group_1__0__Impl"


    // $ANTLR start "rule__Expression__Group_1__1"
    // InternalSQL.g:1671:1: rule__Expression__Group_1__1 : rule__Expression__Group_1__1__Impl rule__Expression__Group_1__2 ;
    public final void rule__Expression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:1675:1: ( rule__Expression__Group_1__1__Impl rule__Expression__Group_1__2 )
            // InternalSQL.g:1676:2: rule__Expression__Group_1__1__Impl rule__Expression__Group_1__2
            {
            pushFollow(FOLLOW_18);
            rule__Expression__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Expression__Group_1__2();

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
    // InternalSQL.g:1683:1: rule__Expression__Group_1__1__Impl : ( 'OR' ) ;
    public final void rule__Expression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:1687:1: ( ( 'OR' ) )
            // InternalSQL.g:1688:1: ( 'OR' )
            {
            // InternalSQL.g:1688:1: ( 'OR' )
            // InternalSQL.g:1689:2: 'OR'
            {
             before(grammarAccess.getExpressionAccess().getORKeyword_1_1()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getExpressionAccess().getORKeyword_1_1()); 

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


    // $ANTLR start "rule__Expression__Group_1__2"
    // InternalSQL.g:1698:1: rule__Expression__Group_1__2 : rule__Expression__Group_1__2__Impl ;
    public final void rule__Expression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:1702:1: ( rule__Expression__Group_1__2__Impl )
            // InternalSQL.g:1703:2: rule__Expression__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Expression__Group_1__2__Impl();

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
    // $ANTLR end "rule__Expression__Group_1__2"


    // $ANTLR start "rule__Expression__Group_1__2__Impl"
    // InternalSQL.g:1709:1: rule__Expression__Group_1__2__Impl : ( ( rule__Expression__RightAssignment_1_2 ) ) ;
    public final void rule__Expression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:1713:1: ( ( ( rule__Expression__RightAssignment_1_2 ) ) )
            // InternalSQL.g:1714:1: ( ( rule__Expression__RightAssignment_1_2 ) )
            {
            // InternalSQL.g:1714:1: ( ( rule__Expression__RightAssignment_1_2 ) )
            // InternalSQL.g:1715:2: ( rule__Expression__RightAssignment_1_2 )
            {
             before(grammarAccess.getExpressionAccess().getRightAssignment_1_2()); 
            // InternalSQL.g:1716:2: ( rule__Expression__RightAssignment_1_2 )
            // InternalSQL.g:1716:3: rule__Expression__RightAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__Expression__RightAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getExpressionAccess().getRightAssignment_1_2()); 

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
    // $ANTLR end "rule__Expression__Group_1__2__Impl"


    // $ANTLR start "rule__AndExpression__Group__0"
    // InternalSQL.g:1725:1: rule__AndExpression__Group__0 : rule__AndExpression__Group__0__Impl rule__AndExpression__Group__1 ;
    public final void rule__AndExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:1729:1: ( rule__AndExpression__Group__0__Impl rule__AndExpression__Group__1 )
            // InternalSQL.g:1730:2: rule__AndExpression__Group__0__Impl rule__AndExpression__Group__1
            {
            pushFollow(FOLLOW_25);
            rule__AndExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AndExpression__Group__1();

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
    // $ANTLR end "rule__AndExpression__Group__0"


    // $ANTLR start "rule__AndExpression__Group__0__Impl"
    // InternalSQL.g:1737:1: rule__AndExpression__Group__0__Impl : ( ruleComparison ) ;
    public final void rule__AndExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:1741:1: ( ( ruleComparison ) )
            // InternalSQL.g:1742:1: ( ruleComparison )
            {
            // InternalSQL.g:1742:1: ( ruleComparison )
            // InternalSQL.g:1743:2: ruleComparison
            {
             before(grammarAccess.getAndExpressionAccess().getComparisonParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleComparison();

            state._fsp--;

             after(grammarAccess.getAndExpressionAccess().getComparisonParserRuleCall_0()); 

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
    // $ANTLR end "rule__AndExpression__Group__0__Impl"


    // $ANTLR start "rule__AndExpression__Group__1"
    // InternalSQL.g:1752:1: rule__AndExpression__Group__1 : rule__AndExpression__Group__1__Impl ;
    public final void rule__AndExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:1756:1: ( rule__AndExpression__Group__1__Impl )
            // InternalSQL.g:1757:2: rule__AndExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AndExpression__Group__1__Impl();

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
    // $ANTLR end "rule__AndExpression__Group__1"


    // $ANTLR start "rule__AndExpression__Group__1__Impl"
    // InternalSQL.g:1763:1: rule__AndExpression__Group__1__Impl : ( ( rule__AndExpression__Group_1__0 )* ) ;
    public final void rule__AndExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:1767:1: ( ( ( rule__AndExpression__Group_1__0 )* ) )
            // InternalSQL.g:1768:1: ( ( rule__AndExpression__Group_1__0 )* )
            {
            // InternalSQL.g:1768:1: ( ( rule__AndExpression__Group_1__0 )* )
            // InternalSQL.g:1769:2: ( rule__AndExpression__Group_1__0 )*
            {
             before(grammarAccess.getAndExpressionAccess().getGroup_1()); 
            // InternalSQL.g:1770:2: ( rule__AndExpression__Group_1__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==36) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalSQL.g:1770:3: rule__AndExpression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_26);
            	    rule__AndExpression__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getAndExpressionAccess().getGroup_1()); 

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
    // $ANTLR end "rule__AndExpression__Group__1__Impl"


    // $ANTLR start "rule__AndExpression__Group_1__0"
    // InternalSQL.g:1779:1: rule__AndExpression__Group_1__0 : rule__AndExpression__Group_1__0__Impl rule__AndExpression__Group_1__1 ;
    public final void rule__AndExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:1783:1: ( rule__AndExpression__Group_1__0__Impl rule__AndExpression__Group_1__1 )
            // InternalSQL.g:1784:2: rule__AndExpression__Group_1__0__Impl rule__AndExpression__Group_1__1
            {
            pushFollow(FOLLOW_25);
            rule__AndExpression__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AndExpression__Group_1__1();

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
    // $ANTLR end "rule__AndExpression__Group_1__0"


    // $ANTLR start "rule__AndExpression__Group_1__0__Impl"
    // InternalSQL.g:1791:1: rule__AndExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__AndExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:1795:1: ( ( () ) )
            // InternalSQL.g:1796:1: ( () )
            {
            // InternalSQL.g:1796:1: ( () )
            // InternalSQL.g:1797:2: ()
            {
             before(grammarAccess.getAndExpressionAccess().getAndExpressionLeftAction_1_0()); 
            // InternalSQL.g:1798:2: ()
            // InternalSQL.g:1798:3: 
            {
            }

             after(grammarAccess.getAndExpressionAccess().getAndExpressionLeftAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndExpression__Group_1__0__Impl"


    // $ANTLR start "rule__AndExpression__Group_1__1"
    // InternalSQL.g:1806:1: rule__AndExpression__Group_1__1 : rule__AndExpression__Group_1__1__Impl rule__AndExpression__Group_1__2 ;
    public final void rule__AndExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:1810:1: ( rule__AndExpression__Group_1__1__Impl rule__AndExpression__Group_1__2 )
            // InternalSQL.g:1811:2: rule__AndExpression__Group_1__1__Impl rule__AndExpression__Group_1__2
            {
            pushFollow(FOLLOW_18);
            rule__AndExpression__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AndExpression__Group_1__2();

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
    // $ANTLR end "rule__AndExpression__Group_1__1"


    // $ANTLR start "rule__AndExpression__Group_1__1__Impl"
    // InternalSQL.g:1818:1: rule__AndExpression__Group_1__1__Impl : ( 'AND' ) ;
    public final void rule__AndExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:1822:1: ( ( 'AND' ) )
            // InternalSQL.g:1823:1: ( 'AND' )
            {
            // InternalSQL.g:1823:1: ( 'AND' )
            // InternalSQL.g:1824:2: 'AND'
            {
             before(grammarAccess.getAndExpressionAccess().getANDKeyword_1_1()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getAndExpressionAccess().getANDKeyword_1_1()); 

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
    // $ANTLR end "rule__AndExpression__Group_1__1__Impl"


    // $ANTLR start "rule__AndExpression__Group_1__2"
    // InternalSQL.g:1833:1: rule__AndExpression__Group_1__2 : rule__AndExpression__Group_1__2__Impl ;
    public final void rule__AndExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:1837:1: ( rule__AndExpression__Group_1__2__Impl )
            // InternalSQL.g:1838:2: rule__AndExpression__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AndExpression__Group_1__2__Impl();

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
    // $ANTLR end "rule__AndExpression__Group_1__2"


    // $ANTLR start "rule__AndExpression__Group_1__2__Impl"
    // InternalSQL.g:1844:1: rule__AndExpression__Group_1__2__Impl : ( ( rule__AndExpression__RightAssignment_1_2 ) ) ;
    public final void rule__AndExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:1848:1: ( ( ( rule__AndExpression__RightAssignment_1_2 ) ) )
            // InternalSQL.g:1849:1: ( ( rule__AndExpression__RightAssignment_1_2 ) )
            {
            // InternalSQL.g:1849:1: ( ( rule__AndExpression__RightAssignment_1_2 ) )
            // InternalSQL.g:1850:2: ( rule__AndExpression__RightAssignment_1_2 )
            {
             before(grammarAccess.getAndExpressionAccess().getRightAssignment_1_2()); 
            // InternalSQL.g:1851:2: ( rule__AndExpression__RightAssignment_1_2 )
            // InternalSQL.g:1851:3: rule__AndExpression__RightAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__AndExpression__RightAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getAndExpressionAccess().getRightAssignment_1_2()); 

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
    // $ANTLR end "rule__AndExpression__Group_1__2__Impl"


    // $ANTLR start "rule__Comparison__Group__0"
    // InternalSQL.g:1860:1: rule__Comparison__Group__0 : rule__Comparison__Group__0__Impl rule__Comparison__Group__1 ;
    public final void rule__Comparison__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:1864:1: ( rule__Comparison__Group__0__Impl rule__Comparison__Group__1 )
            // InternalSQL.g:1865:2: rule__Comparison__Group__0__Impl rule__Comparison__Group__1
            {
            pushFollow(FOLLOW_27);
            rule__Comparison__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Comparison__Group__1();

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
    // $ANTLR end "rule__Comparison__Group__0"


    // $ANTLR start "rule__Comparison__Group__0__Impl"
    // InternalSQL.g:1872:1: rule__Comparison__Group__0__Impl : ( ( rule__Comparison__ColumnAssignment_0 ) ) ;
    public final void rule__Comparison__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:1876:1: ( ( ( rule__Comparison__ColumnAssignment_0 ) ) )
            // InternalSQL.g:1877:1: ( ( rule__Comparison__ColumnAssignment_0 ) )
            {
            // InternalSQL.g:1877:1: ( ( rule__Comparison__ColumnAssignment_0 ) )
            // InternalSQL.g:1878:2: ( rule__Comparison__ColumnAssignment_0 )
            {
             before(grammarAccess.getComparisonAccess().getColumnAssignment_0()); 
            // InternalSQL.g:1879:2: ( rule__Comparison__ColumnAssignment_0 )
            // InternalSQL.g:1879:3: rule__Comparison__ColumnAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Comparison__ColumnAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getComparisonAccess().getColumnAssignment_0()); 

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
    // $ANTLR end "rule__Comparison__Group__0__Impl"


    // $ANTLR start "rule__Comparison__Group__1"
    // InternalSQL.g:1887:1: rule__Comparison__Group__1 : rule__Comparison__Group__1__Impl rule__Comparison__Group__2 ;
    public final void rule__Comparison__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:1891:1: ( rule__Comparison__Group__1__Impl rule__Comparison__Group__2 )
            // InternalSQL.g:1892:2: rule__Comparison__Group__1__Impl rule__Comparison__Group__2
            {
            pushFollow(FOLLOW_28);
            rule__Comparison__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Comparison__Group__2();

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
    // $ANTLR end "rule__Comparison__Group__1"


    // $ANTLR start "rule__Comparison__Group__1__Impl"
    // InternalSQL.g:1899:1: rule__Comparison__Group__1__Impl : ( ( rule__Comparison__OperatorAssignment_1 ) ) ;
    public final void rule__Comparison__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:1903:1: ( ( ( rule__Comparison__OperatorAssignment_1 ) ) )
            // InternalSQL.g:1904:1: ( ( rule__Comparison__OperatorAssignment_1 ) )
            {
            // InternalSQL.g:1904:1: ( ( rule__Comparison__OperatorAssignment_1 ) )
            // InternalSQL.g:1905:2: ( rule__Comparison__OperatorAssignment_1 )
            {
             before(grammarAccess.getComparisonAccess().getOperatorAssignment_1()); 
            // InternalSQL.g:1906:2: ( rule__Comparison__OperatorAssignment_1 )
            // InternalSQL.g:1906:3: rule__Comparison__OperatorAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Comparison__OperatorAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getComparisonAccess().getOperatorAssignment_1()); 

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
    // $ANTLR end "rule__Comparison__Group__1__Impl"


    // $ANTLR start "rule__Comparison__Group__2"
    // InternalSQL.g:1914:1: rule__Comparison__Group__2 : rule__Comparison__Group__2__Impl ;
    public final void rule__Comparison__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:1918:1: ( rule__Comparison__Group__2__Impl )
            // InternalSQL.g:1919:2: rule__Comparison__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Comparison__Group__2__Impl();

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
    // $ANTLR end "rule__Comparison__Group__2"


    // $ANTLR start "rule__Comparison__Group__2__Impl"
    // InternalSQL.g:1925:1: rule__Comparison__Group__2__Impl : ( ( rule__Comparison__ValueAssignment_2 ) ) ;
    public final void rule__Comparison__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:1929:1: ( ( ( rule__Comparison__ValueAssignment_2 ) ) )
            // InternalSQL.g:1930:1: ( ( rule__Comparison__ValueAssignment_2 ) )
            {
            // InternalSQL.g:1930:1: ( ( rule__Comparison__ValueAssignment_2 ) )
            // InternalSQL.g:1931:2: ( rule__Comparison__ValueAssignment_2 )
            {
             before(grammarAccess.getComparisonAccess().getValueAssignment_2()); 
            // InternalSQL.g:1932:2: ( rule__Comparison__ValueAssignment_2 )
            // InternalSQL.g:1932:3: rule__Comparison__ValueAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Comparison__ValueAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getComparisonAccess().getValueAssignment_2()); 

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
    // $ANTLR end "rule__Comparison__Group__2__Impl"


    // $ANTLR start "rule__Model__StatementsAssignment"
    // InternalSQL.g:1941:1: rule__Model__StatementsAssignment : ( ruleStatement ) ;
    public final void rule__Model__StatementsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:1945:1: ( ( ruleStatement ) )
            // InternalSQL.g:1946:2: ( ruleStatement )
            {
            // InternalSQL.g:1946:2: ( ruleStatement )
            // InternalSQL.g:1947:3: ruleStatement
            {
             before(grammarAccess.getModelAccess().getStatementsStatementParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleStatement();

            state._fsp--;

             after(grammarAccess.getModelAccess().getStatementsStatementParserRuleCall_0()); 

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
    // $ANTLR end "rule__Model__StatementsAssignment"


    // $ANTLR start "rule__CreateTableStatement__TableNameAssignment_2"
    // InternalSQL.g:1956:1: rule__CreateTableStatement__TableNameAssignment_2 : ( RULE_STRING ) ;
    public final void rule__CreateTableStatement__TableNameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:1960:1: ( ( RULE_STRING ) )
            // InternalSQL.g:1961:2: ( RULE_STRING )
            {
            // InternalSQL.g:1961:2: ( RULE_STRING )
            // InternalSQL.g:1962:3: RULE_STRING
            {
             before(grammarAccess.getCreateTableStatementAccess().getTableNameSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getCreateTableStatementAccess().getTableNameSTRINGTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__CreateTableStatement__TableNameAssignment_2"


    // $ANTLR start "rule__CreateTableStatement__ColumnsAssignment_4"
    // InternalSQL.g:1971:1: rule__CreateTableStatement__ColumnsAssignment_4 : ( ruleColumnDefinition ) ;
    public final void rule__CreateTableStatement__ColumnsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:1975:1: ( ( ruleColumnDefinition ) )
            // InternalSQL.g:1976:2: ( ruleColumnDefinition )
            {
            // InternalSQL.g:1976:2: ( ruleColumnDefinition )
            // InternalSQL.g:1977:3: ruleColumnDefinition
            {
             before(grammarAccess.getCreateTableStatementAccess().getColumnsColumnDefinitionParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleColumnDefinition();

            state._fsp--;

             after(grammarAccess.getCreateTableStatementAccess().getColumnsColumnDefinitionParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__CreateTableStatement__ColumnsAssignment_4"


    // $ANTLR start "rule__ColumnDefinition__ColumnNameAssignment_0"
    // InternalSQL.g:1986:1: rule__ColumnDefinition__ColumnNameAssignment_0 : ( RULE_ID ) ;
    public final void rule__ColumnDefinition__ColumnNameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:1990:1: ( ( RULE_ID ) )
            // InternalSQL.g:1991:2: ( RULE_ID )
            {
            // InternalSQL.g:1991:2: ( RULE_ID )
            // InternalSQL.g:1992:3: RULE_ID
            {
             before(grammarAccess.getColumnDefinitionAccess().getColumnNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getColumnDefinitionAccess().getColumnNameIDTerminalRuleCall_0_0()); 

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
    // $ANTLR end "rule__ColumnDefinition__ColumnNameAssignment_0"


    // $ANTLR start "rule__ColumnDefinition__ColumnTypeAssignment_1"
    // InternalSQL.g:2001:1: rule__ColumnDefinition__ColumnTypeAssignment_1 : ( ruleColumnType ) ;
    public final void rule__ColumnDefinition__ColumnTypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:2005:1: ( ( ruleColumnType ) )
            // InternalSQL.g:2006:2: ( ruleColumnType )
            {
            // InternalSQL.g:2006:2: ( ruleColumnType )
            // InternalSQL.g:2007:3: ruleColumnType
            {
             before(grammarAccess.getColumnDefinitionAccess().getColumnTypeColumnTypeParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleColumnType();

            state._fsp--;

             after(grammarAccess.getColumnDefinitionAccess().getColumnTypeColumnTypeParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__ColumnDefinition__ColumnTypeAssignment_1"


    // $ANTLR start "rule__ColumnDefinition__ConstraintsAssignment_2"
    // InternalSQL.g:2016:1: rule__ColumnDefinition__ConstraintsAssignment_2 : ( ruleConstraint ) ;
    public final void rule__ColumnDefinition__ConstraintsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:2020:1: ( ( ruleConstraint ) )
            // InternalSQL.g:2021:2: ( ruleConstraint )
            {
            // InternalSQL.g:2021:2: ( ruleConstraint )
            // InternalSQL.g:2022:3: ruleConstraint
            {
             before(grammarAccess.getColumnDefinitionAccess().getConstraintsConstraintParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleConstraint();

            state._fsp--;

             after(grammarAccess.getColumnDefinitionAccess().getConstraintsConstraintParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__ColumnDefinition__ConstraintsAssignment_2"


    // $ANTLR start "rule__ColumnType__LengthAssignment_1_2"
    // InternalSQL.g:2031:1: rule__ColumnType__LengthAssignment_1_2 : ( RULE_INT ) ;
    public final void rule__ColumnType__LengthAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:2035:1: ( ( RULE_INT ) )
            // InternalSQL.g:2036:2: ( RULE_INT )
            {
            // InternalSQL.g:2036:2: ( RULE_INT )
            // InternalSQL.g:2037:3: RULE_INT
            {
             before(grammarAccess.getColumnTypeAccess().getLengthINTTerminalRuleCall_1_2_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getColumnTypeAccess().getLengthINTTerminalRuleCall_1_2_0()); 

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
    // $ANTLR end "rule__ColumnType__LengthAssignment_1_2"


    // $ANTLR start "rule__SelectStatement__SelectedColumnsAssignment_1"
    // InternalSQL.g:2046:1: rule__SelectStatement__SelectedColumnsAssignment_1 : ( ruleSelectedColumns ) ;
    public final void rule__SelectStatement__SelectedColumnsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:2050:1: ( ( ruleSelectedColumns ) )
            // InternalSQL.g:2051:2: ( ruleSelectedColumns )
            {
            // InternalSQL.g:2051:2: ( ruleSelectedColumns )
            // InternalSQL.g:2052:3: ruleSelectedColumns
            {
             before(grammarAccess.getSelectStatementAccess().getSelectedColumnsSelectedColumnsParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleSelectedColumns();

            state._fsp--;

             after(grammarAccess.getSelectStatementAccess().getSelectedColumnsSelectedColumnsParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__SelectStatement__SelectedColumnsAssignment_1"


    // $ANTLR start "rule__SelectStatement__TableNameAssignment_3"
    // InternalSQL.g:2061:1: rule__SelectStatement__TableNameAssignment_3 : ( RULE_STRING ) ;
    public final void rule__SelectStatement__TableNameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:2065:1: ( ( RULE_STRING ) )
            // InternalSQL.g:2066:2: ( RULE_STRING )
            {
            // InternalSQL.g:2066:2: ( RULE_STRING )
            // InternalSQL.g:2067:3: RULE_STRING
            {
             before(grammarAccess.getSelectStatementAccess().getTableNameSTRINGTerminalRuleCall_3_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getSelectStatementAccess().getTableNameSTRINGTerminalRuleCall_3_0()); 

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
    // $ANTLR end "rule__SelectStatement__TableNameAssignment_3"


    // $ANTLR start "rule__SelectStatement__WhereClauseAssignment_4"
    // InternalSQL.g:2076:1: rule__SelectStatement__WhereClauseAssignment_4 : ( ruleWhereClause ) ;
    public final void rule__SelectStatement__WhereClauseAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:2080:1: ( ( ruleWhereClause ) )
            // InternalSQL.g:2081:2: ( ruleWhereClause )
            {
            // InternalSQL.g:2081:2: ( ruleWhereClause )
            // InternalSQL.g:2082:3: ruleWhereClause
            {
             before(grammarAccess.getSelectStatementAccess().getWhereClauseWhereClauseParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleWhereClause();

            state._fsp--;

             after(grammarAccess.getSelectStatementAccess().getWhereClauseWhereClauseParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__SelectStatement__WhereClauseAssignment_4"


    // $ANTLR start "rule__SelectedColumns__ColumnsAssignment_0"
    // InternalSQL.g:2091:1: rule__SelectedColumns__ColumnsAssignment_0 : ( RULE_ID ) ;
    public final void rule__SelectedColumns__ColumnsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:2095:1: ( ( RULE_ID ) )
            // InternalSQL.g:2096:2: ( RULE_ID )
            {
            // InternalSQL.g:2096:2: ( RULE_ID )
            // InternalSQL.g:2097:3: RULE_ID
            {
             before(grammarAccess.getSelectedColumnsAccess().getColumnsIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSelectedColumnsAccess().getColumnsIDTerminalRuleCall_0_0()); 

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
    // $ANTLR end "rule__SelectedColumns__ColumnsAssignment_0"


    // $ANTLR start "rule__SelectedColumns__ColumnsAssignment_1_1"
    // InternalSQL.g:2106:1: rule__SelectedColumns__ColumnsAssignment_1_1 : ( RULE_ID ) ;
    public final void rule__SelectedColumns__ColumnsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:2110:1: ( ( RULE_ID ) )
            // InternalSQL.g:2111:2: ( RULE_ID )
            {
            // InternalSQL.g:2111:2: ( RULE_ID )
            // InternalSQL.g:2112:3: RULE_ID
            {
             before(grammarAccess.getSelectedColumnsAccess().getColumnsIDTerminalRuleCall_1_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSelectedColumnsAccess().getColumnsIDTerminalRuleCall_1_1_0()); 

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
    // $ANTLR end "rule__SelectedColumns__ColumnsAssignment_1_1"


    // $ANTLR start "rule__WhereClause__ExpressionAssignment_1"
    // InternalSQL.g:2121:1: rule__WhereClause__ExpressionAssignment_1 : ( ruleExpression ) ;
    public final void rule__WhereClause__ExpressionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:2125:1: ( ( ruleExpression ) )
            // InternalSQL.g:2126:2: ( ruleExpression )
            {
            // InternalSQL.g:2126:2: ( ruleExpression )
            // InternalSQL.g:2127:3: ruleExpression
            {
             before(grammarAccess.getWhereClauseAccess().getExpressionExpressionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getWhereClauseAccess().getExpressionExpressionParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__WhereClause__ExpressionAssignment_1"


    // $ANTLR start "rule__Expression__RightAssignment_1_2"
    // InternalSQL.g:2136:1: rule__Expression__RightAssignment_1_2 : ( ruleAndExpression ) ;
    public final void rule__Expression__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:2140:1: ( ( ruleAndExpression ) )
            // InternalSQL.g:2141:2: ( ruleAndExpression )
            {
            // InternalSQL.g:2141:2: ( ruleAndExpression )
            // InternalSQL.g:2142:3: ruleAndExpression
            {
             before(grammarAccess.getExpressionAccess().getRightAndExpressionParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleAndExpression();

            state._fsp--;

             after(grammarAccess.getExpressionAccess().getRightAndExpressionParserRuleCall_1_2_0()); 

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
    // $ANTLR end "rule__Expression__RightAssignment_1_2"


    // $ANTLR start "rule__AndExpression__RightAssignment_1_2"
    // InternalSQL.g:2151:1: rule__AndExpression__RightAssignment_1_2 : ( ruleComparison ) ;
    public final void rule__AndExpression__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:2155:1: ( ( ruleComparison ) )
            // InternalSQL.g:2156:2: ( ruleComparison )
            {
            // InternalSQL.g:2156:2: ( ruleComparison )
            // InternalSQL.g:2157:3: ruleComparison
            {
             before(grammarAccess.getAndExpressionAccess().getRightComparisonParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleComparison();

            state._fsp--;

             after(grammarAccess.getAndExpressionAccess().getRightComparisonParserRuleCall_1_2_0()); 

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
    // $ANTLR end "rule__AndExpression__RightAssignment_1_2"


    // $ANTLR start "rule__Comparison__ColumnAssignment_0"
    // InternalSQL.g:2166:1: rule__Comparison__ColumnAssignment_0 : ( RULE_ID ) ;
    public final void rule__Comparison__ColumnAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:2170:1: ( ( RULE_ID ) )
            // InternalSQL.g:2171:2: ( RULE_ID )
            {
            // InternalSQL.g:2171:2: ( RULE_ID )
            // InternalSQL.g:2172:3: RULE_ID
            {
             before(grammarAccess.getComparisonAccess().getColumnIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getComparisonAccess().getColumnIDTerminalRuleCall_0_0()); 

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
    // $ANTLR end "rule__Comparison__ColumnAssignment_0"


    // $ANTLR start "rule__Comparison__OperatorAssignment_1"
    // InternalSQL.g:2181:1: rule__Comparison__OperatorAssignment_1 : ( ruleOperator ) ;
    public final void rule__Comparison__OperatorAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:2185:1: ( ( ruleOperator ) )
            // InternalSQL.g:2186:2: ( ruleOperator )
            {
            // InternalSQL.g:2186:2: ( ruleOperator )
            // InternalSQL.g:2187:3: ruleOperator
            {
             before(grammarAccess.getComparisonAccess().getOperatorOperatorParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleOperator();

            state._fsp--;

             after(grammarAccess.getComparisonAccess().getOperatorOperatorParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Comparison__OperatorAssignment_1"


    // $ANTLR start "rule__Comparison__ValueAssignment_2"
    // InternalSQL.g:2196:1: rule__Comparison__ValueAssignment_2 : ( ruleValue ) ;
    public final void rule__Comparison__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:2200:1: ( ( ruleValue ) )
            // InternalSQL.g:2201:2: ( ruleValue )
            {
            // InternalSQL.g:2201:2: ( ruleValue )
            // InternalSQL.g:2202:3: ruleValue
            {
             before(grammarAccess.getComparisonAccess().getValueValueParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleValue();

            state._fsp--;

             after(grammarAccess.getComparisonAccess().getValueValueParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Comparison__ValueAssignment_2"


    // $ANTLR start "rule__BooleanValue__ValueAssignment"
    // InternalSQL.g:2211:1: rule__BooleanValue__ValueAssignment : ( ( rule__BooleanValue__ValueAlternatives_0 ) ) ;
    public final void rule__BooleanValue__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:2215:1: ( ( ( rule__BooleanValue__ValueAlternatives_0 ) ) )
            // InternalSQL.g:2216:2: ( ( rule__BooleanValue__ValueAlternatives_0 ) )
            {
            // InternalSQL.g:2216:2: ( ( rule__BooleanValue__ValueAlternatives_0 ) )
            // InternalSQL.g:2217:3: ( rule__BooleanValue__ValueAlternatives_0 )
            {
             before(grammarAccess.getBooleanValueAccess().getValueAlternatives_0()); 
            // InternalSQL.g:2218:3: ( rule__BooleanValue__ValueAlternatives_0 )
            // InternalSQL.g:2218:4: rule__BooleanValue__ValueAlternatives_0
            {
            pushFollow(FOLLOW_2);
            rule__BooleanValue__ValueAlternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getBooleanValueAccess().getValueAlternatives_0()); 

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
    // $ANTLR end "rule__BooleanValue__ValueAssignment"


    // $ANTLR start "rule__NumberValue__ValueAssignment"
    // InternalSQL.g:2226:1: rule__NumberValue__ValueAssignment : ( RULE_INT ) ;
    public final void rule__NumberValue__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:2230:1: ( ( RULE_INT ) )
            // InternalSQL.g:2231:2: ( RULE_INT )
            {
            // InternalSQL.g:2231:2: ( RULE_INT )
            // InternalSQL.g:2232:3: RULE_INT
            {
             before(grammarAccess.getNumberValueAccess().getValueINTTerminalRuleCall_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getNumberValueAccess().getValueINTTerminalRuleCall_0()); 

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
    // $ANTLR end "rule__NumberValue__ValueAssignment"


    // $ANTLR start "rule__StringValue__ValueAssignment"
    // InternalSQL.g:2241:1: rule__StringValue__ValueAssignment : ( RULE_STRING ) ;
    public final void rule__StringValue__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:2245:1: ( ( RULE_STRING ) )
            // InternalSQL.g:2246:2: ( RULE_STRING )
            {
            // InternalSQL.g:2246:2: ( RULE_STRING )
            // InternalSQL.g:2247:3: RULE_STRING
            {
             before(grammarAccess.getStringValueAccess().getValueSTRINGTerminalRuleCall_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getStringValueAccess().getValueSTRINGTerminalRuleCall_0()); 

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
    // $ANTLR end "rule__StringValue__ValueAssignment"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000100080002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000400020L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x000000000F000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000050800000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000050000002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x000000000001F800L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000060050L});

}