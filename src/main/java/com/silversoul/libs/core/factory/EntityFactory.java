package com.silversoul.libs.core.factory;

import java.util.UUID;

public class EntityFactory {

    public static String generateId(Class<?> clazz) {
        String simpleName = clazz.getSimpleName();
        String prefix = simpleName.length() >= 3 
            ? simpleName.substring(0, 3).toLowerCase() 
            : simpleName.toLowerCase();
        
        String uuid = UUID.randomUUID().toString().replace("-", "");
        return String.format("%s-%s", prefix, uuid);
    }
}
