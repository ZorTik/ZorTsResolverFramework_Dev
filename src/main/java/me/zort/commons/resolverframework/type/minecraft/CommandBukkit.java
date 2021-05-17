package me.zort.commons.resolverframework.type.minecraft;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface CommandBukkit {

    String value();
    String description() default "Basic command description";
    String usageMessage() default "Basic command usage";
    String[] aliases() default {};

}
