```java
package com.example;

import java.util.LinkedList;
import java.util.Queue;

public class RingBuffer {
    private final Queue<Packet> buffer = new LinkedList<>();
    private final int capacity;

    public RingBuffer(int capacity) {
        this.capacity = capacity;
    }

    public void poll() {
        return buffer.poll();
    }

    public void push(Packet packet) {
        if (buffer.size() >= capacity) {
            buffer.poll();
        }
        buffer.offer(packet);
    }

    public void destroy() {
        buffer.clear();
    }
}
```