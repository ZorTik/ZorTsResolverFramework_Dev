package me.zort.commons.resolverframework.type.configuration;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface DataInit {

    int chance() default 100;

}
