import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    Orbital e = new Planet("Planet", "Earth", "Sun", "5.972E24", 6371, 149600000);
    @Test
    void testEarthObject() {

        assertEquals("Planet", e.getType());
        assertEquals("Earth", e.getName());
        assertEquals("Sun", e.getOrbit());
        assertEquals("5.972E24", e.getMass());
        assertEquals(6371, e.getSizeInRadius());
        assertEquals(149600000, e.getDistanceToOrbitKM());
    }

    @Test
    void testMoonObject(){
        Orbital m = new Moon("Moon", "Moon", e.getName(), "7.348E22", 1737, 384400);
        assertEquals("Moon", m.getType());
        assertEquals("Moon", m.getName());
        assertEquals(m.getOrbit(), e.getName());
        assertEquals("7.348E22", m.getMass());
        assertEquals(1737, m.getSizeInRadius());
        assertEquals(384400, m.getDistanceToOrbitKM());
    }
}