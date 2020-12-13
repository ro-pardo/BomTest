package org.test.core;
import org.joda.time.DateTime;
import org.joda.time.Duration;
import org.json.JSONObject;

import java.math.RoundingMode;
import java.util.Date;

public class a {
    public static void main(String[] args) {
        JSONObject jo = new JSONObject("{ \"abc\" : \"def\" }");

        System.out.println(jo.toString());

        java.util.Date juDate = new Date();
        DateTime dt = new DateTime(juDate);

        long i = 32;
        Duration d = new Duration(i);

        Duration dd = d.dividedBy(3, RoundingMode.DOWN);
        System.out.println(dt.minus(dd));
    }
}
