```java
package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class PacketTest {
    @Test
    public void testPacket() {
        Packet packet = new Packet(new byte[]{1, 2, 3}, 3);
        assertEquals(3, packet.getLength());
    }
}
```