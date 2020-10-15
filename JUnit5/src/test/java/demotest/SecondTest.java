package demotest;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SecondTest {
    @Test
    @Disabled
    void mySecondTest() {
        assertEquals(2, 1, "2 is not equal to 1");
    }

    @Test
    @Tag("slow")
    void aSlowTest() throws InterruptedException {
        Thread.sleep(1000);
    }
}
