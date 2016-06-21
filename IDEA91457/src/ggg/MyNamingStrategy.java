package ggg;


import org.hibernate.cfg.ImprovedNamingStrategy;

/**
 * Created by Olga Pavlova on 10/22/2015.
 */
public class MyNamingStrategy  extends ImprovedNamingStrategy {
    private static final String PLURAL_SUFFIX = "s";

    /**
     * Transforms class names to table names by using the described naming conventions.
     * @param className
     * @return  The constructed table name.
     */
    @Override
    public String classToTableName(String className) {
        String tableNameInSingularForm = super.classToTableName(className);
        return transformToPluralForm(tableNameInSingularForm);
    }

    private String transformToPluralForm(String tableNameInSingularForm) {
        StringBuilder pluralForm = new StringBuilder();

        pluralForm.append(tableNameInSingularForm);
        int lastIndex = pluralForm.length();
        pluralForm.delete(lastIndex-1, lastIndex); //append(PLURAL_SUFFIX);

        return pluralForm.toString().toUpperCase();

    }

    @Override
    public String columnName(String columnName  ){
        String colName = super.columnName(columnName);
        return  colName.toUpperCase();
    }



    /*SessionFactory sf = new Configuration()
            .setNamingStrategy(ImprovedNamingStrategy.INSTANCE)
            .addFile("Item.hbm.xml")
            .addFile("Bid.hbm.xml")
            .buildSessionFactory();*/



}
