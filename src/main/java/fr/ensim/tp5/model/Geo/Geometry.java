package fr.ensim.tp5.model.Geo;

import java.util.ArrayList;

public class Geometry {
    private String type;

    public ArrayList<Double> getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(ArrayList<Double> coordinates) {
        this.coordinates = coordinates;
    }

    ArrayList <Double> coordinates = new ArrayList<>();


    // Getter Methods

    public String getType() {
        return type;
    }

    // Setter Methods

    public void setType(String type) {
        this.type = type;
    }
}
