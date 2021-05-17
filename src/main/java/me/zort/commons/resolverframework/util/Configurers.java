package me.zort.commons.resolverframework.util;

import me.zort.commons.resolverframework_dev.ResolverService;

public interface Configurers {

    static Configurers load(ResolverService resolverService) {
        return null;
    }

    Configurers_Data getDataConfigurers();

    interface Configurers_Data {

        boolean set(Class<?> configurer, String key, Object value);
        boolean remove(Class<?> configurer, String key);

    }

}
