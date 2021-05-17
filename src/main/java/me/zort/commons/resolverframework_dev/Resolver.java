package me.zort.commons.resolverframework_dev;

import me.zort.commons.data.sql.MySQL;
import me.zort.commons.resolverframework.lifecycle.ResolverConfigurer_Data;
import me.zort.commons.resolverframework.type.configuration.Configurer;

@Configurer(ResolverConfigurer_Data.class)
public final class Resolver {

    public static ResolverService link(String packageSpace) {
        return me.zort.commons.resolverframework.Resolver.builder(packageSpace)
                .link();
    }

    public static ResolverService link(String packageSpace, MySQLCredentials mySQLCredentials) {
        String hostname = mySQLCredentials.getHost();
        String database = mySQLCredentials.getDatabase();
        String username = mySQLCredentials.getUser();
        String password = mySQLCredentials.getPassword();
        return me.zort.commons.resolverframework.Resolver.builder(packageSpace)
                .withMySQL(new MySQL(hostname, username, password, database))
                .link();
    }

}
