package io.vantiq.extsrc.CSVSource;

import java.util.Map;

public class FieldInfo {
    String charSet;
    boolean reversed;

    public static FieldInfo Create(String field, Object schema) {
        FieldInfo o = new FieldInfo();

        Map<String, String> v = ((Map<String, Map<String, String>>) schema).get(field);

        if (v != null) {

            o.charSet = v.get("charset");
            Object v3 = v.get("reversed");
            if (v3 != null) {
                o.reversed = Boolean.parseBoolean(v3.toString());
            } else {
                o.reversed = false;
            }
        }

        return o;
    }

}
