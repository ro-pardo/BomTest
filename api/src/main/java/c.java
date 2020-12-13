import org.joda.time.DateTime;
import org.joda.time.Duration;

import java.util.Date;

public class c {
    public static void main(String[] args) {

        java.util.Date juDate = new Date();
        DateTime dt = new DateTime(juDate);

        long i = 32;
        Duration d = new Duration(i);

        Duration dd = d.dividedBy(3);
        System.out.println(dt.minus(dd));
    }
}
