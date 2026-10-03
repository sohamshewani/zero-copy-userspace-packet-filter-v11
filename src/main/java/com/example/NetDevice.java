```java
package com.example;

public class NetDevice {
    private final String name;
    private final RingBuffer ringBuffer;

    public NetDevice(String name, RingBuffer ringBuffer) {
        this.name = name;
        this.ringBuffer = ringBuffer;
    }

    public void sendPacket(Packet packet) {
        ringBuffer.push(packet);
    }
}
```