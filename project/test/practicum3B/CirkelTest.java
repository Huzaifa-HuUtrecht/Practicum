package practicum3B;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CirkelTest {

    @Test
    void testCirkelMetNegatieveRadius() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            new Cirkel(-1, 0, 0);
        });
        assertEquals("Radius must be a positive integer", exception.getMessage());
    }

    @Test
    void testCirkelMetRadiusZero() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            new Cirkel(0, 10, 10);
        });
        assertEquals("Radius must be a positive integer", exception.getMessage());
    }

    @Test
    void testCirkelMetGeldigeRadius() {
        Cirkel c = new Cirkel(5, 0, 0);
        assertNotNull(c);
        assertEquals("Cirkel (0, 0) met radius: 5", c.toString());
    }
}