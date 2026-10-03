```java
package com.example;

public class ErrorHandling {
    public static void handleException(Exception e, int packetId) {
        System.err.println("Error handling packet ID: " + packetId + ", message: " + e.getMessage());
    }
}
```