```java
package com.example;

public class Packet {
    private final byte[] data;
    private final int length;

    public Packet(byte[] data, int length) {
        this.data = data;
        this.length = length;
    }

    public byte[] getData() {
        return data;
    }

    public int getLength() {
        return length;
    }
}
```