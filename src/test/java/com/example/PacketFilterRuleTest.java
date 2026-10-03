```java
package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PacketFilterRuleTest {
    @Test
    public void testApply() throws Exception {
        PacketFilterRule rule = new PacketFilterRule() {
            @Override
            public boolean apply(Packet packet) {
                return packet.getData()[0] == 1;
            }
        };
        Packet packet = new Packet(new byte[]{1, 2, 3}, 3);
        assertTrue(rule.apply(packet));
    }
}
```