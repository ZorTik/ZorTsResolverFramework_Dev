package me.zort.commons.resolverframework.type.configuration;

import me.zort.commons.resolverframework.lifecycle.ResolverConfigurer;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface Configurer {

    Class<? extends ResolverConfigurer> value();

}
