package entity.data;

/**
 * Created by Olga Pavlova on 2/2/2017.
 */
public enum Gender {
    MALE("MALE"),
    FEMALE("FEMALE");

    private final String code;

    private Gender(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }


}
