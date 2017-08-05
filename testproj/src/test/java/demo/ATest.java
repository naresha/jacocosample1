package demo;

import org.junit.*;
import org.junit.runner.*;
import org.junit.runners.JUnit4;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

@RunWith(JUnit4.class)
public class ATest {

    @Test
    public void sampleTest() {
        assertEquals("Hello", new A().sayHello());
    }

}

