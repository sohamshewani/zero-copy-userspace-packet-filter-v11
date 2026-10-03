```java
package com.example;

public class FlowControl {
    private int windowSize;
    private int deliveredPackets;

    public FlowControl(int windowSize) {
        this.windowSize = windowSize;
        this.deliveredPackets = 0;
    }

    public void deliver(Packet packet) throws FlowControlException {
        if (deliveredPackets >= windowSize) {
            throw new FlowControlException("Window size exceeded");
        }
        deliveredPackets++;
    }

    public void destroy() {
        deliveredPackets = 0;
    }

    public class FlowControlException extends RuntimeException {
        public FlowControlException(String message) {
            super(message);
        }
    }
}
```