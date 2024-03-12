/**
 * generated by Xtext 2.33.0
 */
package org.xtext.example.simple_sql.sQL;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Where Clause</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.simple_sql.sQL.WhereClause#getExpression <em>Expression</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.simple_sql.sQL.SQLPackage#getWhereClause()
 * @model
 * @generated
 */
public interface WhereClause extends EObject
{
  /**
   * Returns the value of the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expression</em>' containment reference.
   * @see #setExpression(Expression)
   * @see org.xtext.example.simple_sql.sQL.SQLPackage#getWhereClause_Expression()
   * @model containment="true"
   * @generated
   */
  Expression getExpression();

  /**
   * Sets the value of the '{@link org.xtext.example.simple_sql.sQL.WhereClause#getExpression <em>Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expression</em>' containment reference.
   * @see #getExpression()
   * @generated
   */
  void setExpression(Expression value);

} // WhereClause
