/*
 * generated by Xtext 2.33.0
 */
package org.xtext.example.simple_sql.validation;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.validation.AbstractDeclarativeValidator;

public abstract class AbstractSQLValidator extends AbstractDeclarativeValidator {
	
	@Override
	protected List<EPackage> getEPackages() {
		List<EPackage> result = new ArrayList<EPackage>();
		result.add(org.xtext.example.simple_sql.sQL.SQLPackage.eINSTANCE);
		return result;
	}
}