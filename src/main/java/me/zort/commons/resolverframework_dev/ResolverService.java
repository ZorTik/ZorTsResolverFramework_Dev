package me.zort.commons.resolverframework_dev;

public interface ResolverService {

    <T> void setSpecialObject(T o, Class<T> type);
    boolean resolve();

}
