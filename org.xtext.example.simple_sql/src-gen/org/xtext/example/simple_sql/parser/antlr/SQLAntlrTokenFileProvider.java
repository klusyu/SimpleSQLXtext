/*
 * generated by Xtext 2.33.0
 */
package org.xtext.example.simple_sql.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class SQLAntlrTokenFileProvider implements IAntlrTokenFileProvider {

	@Override
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
		return classLoader.getResourceAsStream("org/xtext/example/simple_sql/parser/antlr/internal/InternalSQL.tokens");
	}
}
