package er.extensions.qualifiers;

import com.webobjects.eoaccess.EOEntity;
import com.webobjects.eoaccess.EOQualifierSQLGeneration;
import com.webobjects.eoaccess.EOSQLExpression;
import com.webobjects.eocontrol.EOQualifier;

/**
 * SQL generation support for {@link ERXTrueQualifier}.
 * 
 * @author kieran
 * 
 */
public class ERXTrueQualifierSupport extends EOQualifierSQLGeneration.Support {
	public String sqlStringForSQLExpression(EOQualifier qualifier, EOSQLExpression expression) {
		return "1=1";
	}

	public EOQualifier schemaBasedQualifierWithRootEntity(EOQualifier qualifier, EOEntity entity) {
		return qualifier;
	}

	public EOQualifier qualifierMigratedFromEntityRelationshipPath(EOQualifier qualifier, EOEntity entity, String relationshipPath) {
		return qualifier;
	}
}