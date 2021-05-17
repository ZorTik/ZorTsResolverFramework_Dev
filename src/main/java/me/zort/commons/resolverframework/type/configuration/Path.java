package me.zort.commons.resolverframework.type.configuration;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface Path {

    SourceAccessMoment moment() default SourceAccessMoment.EVERY;
    String value();

}
