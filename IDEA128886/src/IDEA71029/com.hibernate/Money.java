package IDEA71029.com.hibernate;

import java.math.BigDecimal;

/**
 * Created by IntelliJ IDEA.
 * User: ihannur
 * Date: 6/14/11
 * Time: 4:52 PM
 * To change this template use File | Settings | File Templates.
 */
public class Money extends BigDecimal {

    public Money(String val) {
        super(val);
    }

    public Money(double val) {
        super(val);
    }

    public Money(int val) {
        super(val);
    }

    public Money(long val) {
        super(val);
    }

}
