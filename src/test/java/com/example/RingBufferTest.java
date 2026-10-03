```java
package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class RingBufferTest {
    @Test
    public void testPushPoll() {
        RingBuffer buffer = new RingBuffer(5);
        buffer.push(new Packet(new byte[]{1, 2, 3}, 3));
        assertEquals(new Packet(new byte[]{1, 2, 3}, 3), buffer.poll());
    }
}
```