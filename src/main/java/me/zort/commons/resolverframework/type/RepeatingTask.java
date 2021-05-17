package me.zort.commons.resolverframework.type;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface RepeatingTask {

    long delay() default 0L;
    long period() default 20L;

}
