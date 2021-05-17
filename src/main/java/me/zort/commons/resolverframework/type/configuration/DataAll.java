package me.zort.commons.resolverframework.type.configuration;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface DataAll {

    /**
     *  Data Source
     */
    Class<?> source();
    MapColumn col();

}
