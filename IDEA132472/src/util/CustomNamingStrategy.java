package util;

import org.hibernate.cfg.ImprovedNamingStrategy;

public class CustomNamingStrategy extends ImprovedNamingStrategy {

    private static final String SUFFIX = "32472ENTITY";

    /**
     * Transforms class names to table names by using the described naming conventions.
     * @param className
     * @return  The constructed table name.
     */
    @Override
    public String classToTableName(String className) {
        String tableNameInSingularForm = super.classToTableName(className);
        return transformToTableForm(tableNameInSingularForm);
    }

    private String transformToTableForm(String tableNameInSingularForm) {
        StringBuilder newForm = new StringBuilder();

        newForm.append(tableNameInSingularForm);
        newForm.append(SUFFIX);

        return newForm.toString().toUpperCase();
    }

}