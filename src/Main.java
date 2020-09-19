import java.util.ArrayList;

public class Main {
    Orbital earth = new Planet("Planet", "Earth", "Sun", "5.972E24", 6371, 149600000);
    Orbital moon = new Moon("Moon", "Moon", earth.getName(), "7.348E22", 1737, 384400);
    Orbital mars = new Planet("Planet","Mars", "Sun", "6.39E23", 3390, 227940000);
    Orbital phobos = new Moon("Moon", "Phobos", "Mars", "10.60E15", 11, 6800);
    Orbital deimos = new Moon("Moon", "Deimos", "Mars", "1.48E15", 6, 20069);
    public static void main(String[] args) {

        //System.out.println(earth);

        //System.out.println(moon);
    }

    public void moonsofplanets(){


    }

    public int moonsForPlanet(Orbital e) {
        int count = 0;
        ArrayList<Orbital> orbList = new ArrayList<>();
        orbList.add(earth);
        orbList.add(moon);
        for (Orbital s : orbList) {
            if (s.getType().equals("Moon") && s.getOrbit().equals(e.getName())) {
                count++;
            }
        }
        System.out.println(count);
        return count;

    }

    public int distanceBetweenPlanets(Orbital e, Orbital c) {
        int dist = 0;
        if (e.getDistanceToOrbitKM() > c.getDistanceToOrbitKM()) {
            dist = e.getDistanceToOrbitKM() - c.getDistanceToOrbitKM();

        } else {
            dist = c.getDistanceToOrbitKM() - e.getDistanceToOrbitKM();
        }

        System.out.println(dist);
        return dist;
    }


}
