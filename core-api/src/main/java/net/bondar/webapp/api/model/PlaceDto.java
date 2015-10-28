package net.bondar.webapp.api.model;

/**
 * Created by AzeraL on 16.09.2015.
 */
public class PlaceDto extends ModelDto{

    private String title;
    private String description;
    private double latitude;
    private double longitude;

    public PlaceDto(){
        super();
    }

    public PlaceDto(long id){
        super(id);
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

        PlaceDto placeDto = (PlaceDto) o;

        if (Double.compare(placeDto.latitude, latitude) != 0) return false;
        if (Double.compare(placeDto.longitude, longitude) != 0) return false;
        if (title != null ? !title.equals(placeDto.title) : placeDto.title != null) return false;
        return !(description != null ? !description.equals(placeDto.description) : placeDto.description != null);

    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = title != null ? title.hashCode() : 0;
        result = 31 * result + (description != null ? description.hashCode() : 0);
        temp = Double.doubleToLongBits(latitude);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(longitude);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return "PlaceDto{" +
                "title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", latitude=" + latitude +
                ", longitude=" + longitude +
                '}';
    }
}
