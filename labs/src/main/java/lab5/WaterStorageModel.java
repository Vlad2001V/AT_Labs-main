package lab5;

public class WaterStorageModel extends JsonModel<WaterStorageModel>{

    public String name;
    public String city;
    public String coordNorth;
    public String coordSouth;

    public WaterStorageModel(){

    }

    public WaterStorageModel(String name, String city, String coordNorth, String coordSouth) {

        this.name = name;
        this.city = city;
        this.coordNorth = coordNorth;
        this.coordSouth = coordSouth;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCoordNorth() {
        return coordNorth;
    }

    public void setCoordNorth(String coordNorth) {
        this.coordNorth = coordNorth;
    }

    public String getCoordSouth() {
        return coordSouth;
    }

    public void setCoordSouth(String coordSouth) {
        this.coordSouth = coordSouth;
    }
    @Override
    public String toString() {
        return "WaterStorageModel{" +
                "name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", coordNotrh=" + coordNorth +'\''+
                ", coordSouth='" + coordSouth  +
                "}";
    }
}
