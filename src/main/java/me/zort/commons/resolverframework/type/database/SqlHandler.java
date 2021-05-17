package me.zort.commons.resolverframework.type.database;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface SqlHandler {

    String colKey();
    String colValue();
    String table();

}
