public class Planet extends Orbital{
    public Planet(String type, String name, String orbit, String mass, int sizeInRadius, int distanceToOrbitKM) {
        super(type, name, orbit, mass, sizeInRadius, distanceToOrbitKM);
    }

    @Override
    public String toString() {
        return "The " + type + " is called " +
                name + " and orbits " + orbit + ".\nIt's mass is "+
                mass + " and the radius is " +
                sizeInRadius + " km.\nThe distance to the " + orbit + " is: " + distanceToOrbitKM + "\n\n";
    }


}
