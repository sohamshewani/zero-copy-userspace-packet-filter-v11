```java
package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ErrorHandlingTest {
    @Test
    public void testHandleException() {
        ErrorHandling.handleException(new RuntimeException("Test exception"), 1);
        // No assert, as it only prints to stderr
    }
}
```