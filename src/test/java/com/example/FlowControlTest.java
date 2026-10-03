```java
package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FlowControlTest {
    @Test
    public void testFlowControl() {
        FlowControl flowControl = new FlowControl(5);
        for (int i = 0; i < 5; i++) {
            flowControl.deliver(new Packet(new byte[]{}, 0));
        }
        assertEquals(5, flowControl.deliveredPackets);
    }
}
```