package avaj.weather;

public class Coordinates {
    private int longitude;
    private int latitude;
    private int height;

    Coordinates() {};
    
    Coordinates(int longitude, int latitude, int height) {
        this.longitude = longitude;
        this.latitude = latitude;
        if (height > 100)
            this.height = 100;
        else if (height < 1)
            this.height = 0;
        else
            this.height = height;
    }

    public static Coordinates coordinateMaker(int longitude, int latitude, int height) {
        return new Coordinates(longitude, latitude, height);
    }

    public int getLongitude() {
        return this.longitude;
    }

    public int getLatitude() {
        return this.latitude;
    }
    
    public int getHeight() {
        return this.height;
    }

    public int getSum() {
        return (this.longitude + this.latitude + this.height);
    }
}