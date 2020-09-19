abstract class Orbital {
    String type;
    String name;
    String orbit;
    String mass;
    int sizeInRadius;
    int distanceToOrbitKM;

    public Orbital(String type, String name, String orbit, String mass, int sizeInRadius, int distanceToOrbitKM) {
        this.type = type;
        this.name = name;
        this.orbit = orbit;
        this.mass = mass;
        this.sizeInRadius = sizeInRadius;
        this.distanceToOrbitKM = distanceToOrbitKM;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOrbit() {
        return orbit;
    }

    public void setOrbit(String orbit) {
        this.orbit = orbit;
    }

    public String getMass() {
        return mass;
    }

    public void setMass(String mass) {
        this.mass = mass;
    }

    public int getSizeInRadius() {
        return sizeInRadius;
    }

    public void setSizeInRadius(int sizeInRadius) {
        this.sizeInRadius = sizeInRadius;
    }

    public int getDistanceToOrbitKM() {
        return distanceToOrbitKM;
    }

    public void setDistanceToOrbitKM(int distanceToOrbitKM) {
        this.distanceToOrbitKM = distanceToOrbitKM;
    }
}
