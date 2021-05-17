package me.zort.commons.resolverframework.type;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface Value {

    PresentPosition position() default PresentPosition.FIRST;
    boolean generate() default false;
    String name() default "none";

}
