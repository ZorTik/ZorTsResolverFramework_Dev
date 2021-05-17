package me.zort.commons.resolverframework_dev;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class MySQLCredentials {

    private final String host;
    private final String database;
    private final String user;
    private final String password;
    private final int port;

}
