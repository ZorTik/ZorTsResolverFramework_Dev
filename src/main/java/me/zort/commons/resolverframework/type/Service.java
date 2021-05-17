package me.zort.commons.resolverframework.type;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface Service {

    int constructionCount() default 1;
    String serviceName() default "none";
    boolean scheduled() default false;
    long delay() default 0L;
    long lim() default -1L;
    boolean paused() default false;

    boolean bukkitListener() default false;
    boolean bukkit() default false;

}
