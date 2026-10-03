```java
package com.example;

public interface PacketFilterRule {
    boolean apply(Packet packet) throws ParsingException, FilteringException;

    class ParsingException extends RuntimeException {
        public ParsingException(String message) {
            super(message);
        }
    }

    class FilteringException extends RuntimeException {
        public FilteringException(String message) {
            super(message);
        }
    }
}
```