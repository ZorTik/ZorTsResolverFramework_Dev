package me.zort.commons.resolverframework.type.configuration;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface Data {

    /**
     *  Data Source
     */
    Class<?> source();
    String key();

}
