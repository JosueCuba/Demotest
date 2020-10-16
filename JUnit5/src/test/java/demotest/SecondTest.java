package demotest;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SecondTest {
    @Test
    @Disabled
    void mySecondTest() {
        assertEquals(2, 1, "2 no es igual a 1");
    }

    @Test
    @Tag("slow")
    void aSlowTest() throws InterruptedException {
        Thread.sleep(1000);
    }
}
