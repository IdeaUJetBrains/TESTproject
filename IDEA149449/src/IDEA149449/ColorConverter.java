package IDEA149449;



import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

@Converter(autoApply = true)
public class ColorConverter implements AttributeConverter<Double, Boolean> {

    @Override
    public Boolean convertToDatabaseColumn(Double attribute) {
        System.out.println("convertToDatabaseColumn");
        return attribute.isNaN();
    }

    @Override
    public Double convertToEntityAttribute(Boolean dbData) {
        Double doubleVar = 123.0;
        System.out.println("convertToEntityAttribute");
         if(dbData)return doubleVar;
         else return null;
    }




}