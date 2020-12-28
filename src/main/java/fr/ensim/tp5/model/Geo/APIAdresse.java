package fr.ensim.tp5.model.Geo;

import java.util.ArrayList;

public class APIAdresse {
    private String type;
    private String version;
    private ArrayList<Feature> features;


    // Getter Methods

    public String getType() {
        return type;
    }

    public String getVersion() {
        return version;
    }


    // Setter Methods

    public void setType(String type) {
        this.type = type;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public ArrayList<Feature> getFeatures() {
        return features;
    }

    public void setFeatures(ArrayList<Feature> features) {
        this.features = features;
    }
}
