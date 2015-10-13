package net.bondar.webapp.api.model;

/**
 * Created by AzeraL on 16.09.2015.
 */
public class Place {
    private static long ID=1;
    private long place_id;
    private String title;
    private String description;
    private double latitude;
    private double longitude;

    public Place(){}
    public Place(String title, String description, double latitude, double longitude) {
        this.place_id=ID++;
        this.title = title;
        this.description = description;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public long getPlace_id() {
        return place_id;
    }

    public void setPlace_id(long place_id) {
        this.place_id = place_id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Place place = (Place) o;

        if (place_id != place.place_id) return false;
        if (Double.compare(place.latitude, latitude) != 0) return false;
        if (Double.compare(place.longitude, longitude) != 0) return false;
        if (title != null ? !title.equals(place.title) : place.title != null) return false;
        return !(description != null ? !description.equals(place.description) : place.description != null);

    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = (int) (place_id ^ (place_id >>> 32));
        result = 31 * result + (title != null ? title.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        temp = Double.doubleToLongBits(latitude);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(longitude);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return "Place{" +
                "place_id=" + place_id +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", latitude=" + latitude +
                ", longitude=" + longitude +
                '}';
    }
}
