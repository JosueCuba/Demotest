package demotest;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;

import static org.junit.jupiter.api.Assertions.assertEquals;

@Tag("fast")
class FirstTest {

    @Test
    @DisplayName("¡Mi primera prueba de JUnit 5!  😎")
    void myFirstTest(TestInfo testInfo) {
        Calculator calculator = new Calculator();
        assertEquals(2, calculator.add(1, 1), "1 + 1 debería ser igual 2");
        assertEquals("¡Mi primera prueba de JUnit 5!  😎", testInfo.getDisplayName(), () -> "TestInfo se inyecta correctamente");
    }

}
