```java
package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ModuleLoaderTest {
    @Test
    public void testLoadModule() {
        List<PacketFilterRule> rules = ModuleLoader.loadModule(PacketFilterRule.class);
        assertEquals(2, rules.size());
    }
}
```