import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class MainTest {
    Orbital e = new Planet("Planet", "Earth", "Sun", "5.972E24", 6371, 149600000);
    Orbital m = new Moon("Moon", "Moon", "Earth", "7.348E22", 1737, 384400);
    Orbital mars = new Planet("Planet","Mars", "Sun", "6.39E23", 3390, 227940000);
    Orbital phobos = new Moon("Moon", "Phobos", "Mars", "10.60E15", 11, 6800);
    Orbital deimos = new Moon("Moon", "Deimos", "Mars", "1.48E15", 6, 20069);
    ArrayList<Orbital> orbList = new ArrayList<>();
    Main test = new Main();


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
        assertEquals("Moon", m.getType());
        assertEquals("Moon", m.getName());
        assertEquals(m.getOrbit(), e.getName());
        assertEquals("7.348E22", m.getMass());
        assertEquals(1737, m.getSizeInRadius());
        assertEquals(384400, m.getDistanceToOrbitKM());
    }

    @Test
    void testPlant(){

        orbList.add(e);
        orbList.add(m);
        assertEquals(1,test.moonsForPlanet(e));
    }

    @Test
    void distPlanets(){
        orbList.add(e);
        orbList.add(mars);
       // assertEquals(149215600, test.distanceBetweenPlanets(e,mars));
        assertEquals(mars.getDistanceToOrbitKM()-e.getDistanceToOrbitKM(), test.distanceBetweenPlanets(e,mars));


    }



}