public class Main {
    public static void main(String[] args) {
        Orbital earth = new Planet("Planet", "Earth", "Sun", "5.972E24", 6371, 149600000);
        System.out.println(earth);
        Orbital moon = new Moon("Moon", "Moon", earth.getName(), "7.348E22", 1737, 384400);
        System.out.println(moon);
    }

    public void moonsofplanets(){

    }
}
