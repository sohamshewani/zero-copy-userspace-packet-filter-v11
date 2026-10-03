```java
package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class NetDeviceTest {
    @Test
    public void testSendPacket() {
        RingBuffer buffer = new RingBuffer(10);
        NetDevice device = new NetDevice("Device1", buffer);
        device.sendPacket(new Packet(new byte[]{1, 2, 3}, 3));
        assertEquals(1, buffer.buffer.size());
    }
}
```