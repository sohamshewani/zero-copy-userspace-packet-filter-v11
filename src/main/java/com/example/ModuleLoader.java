```java
package com.example;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

public class ModuleLoader {
    private static final Logger logger = Logger.getLogger(ModuleLoader.class.getName());

    public static <T> List<T> loadModule(Class<T> clazz) {
        List<T> instances = new ArrayList<>();
        try {
            for (Class<?> module : clazz.getClasses()) {
                T instance = (T) module.getDeclaredConstructor().newInstance();
                instances.add(instance);
            }
        } catch (Exception e) {
            logger.severe("Failed to load module: " + e.getMessage());
        }
        return instances;
    }
}
```