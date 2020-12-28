package fr.ensim.tp5.controller;

import fr.ensim.tp5.model.Geo.APIAdresse;
import fr.ensim.tp5.model.Meteo.APIMeteo;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;

@Controller
public class MeteoController {

    @PostMapping("/meteo")
    public String meteo(@RequestParam(name="address") String adresseSaisie, Model model) {
        model.addAttribute("adresseSaisie", adresseSaisie);
        //Appel API
        RestTemplate restTemplate = new RestTemplate();
        String fooResourceUrl = "https://api-adresse.data.gouv.fr/search/?q="+adresseSaisie;
        ResponseEntity<APIAdresse> responseAdresse = restTemplate.getForEntity(fooResourceUrl, APIAdresse.class);

        Double latitude = responseAdresse.getBody().getFeatures().get(0).getGeometry().getCoordinates().get(1);
        Double longitude = responseAdresse.getBody().getFeatures().get(0).getGeometry().getCoordinates().get(0);

        model.addAttribute("latitude", latitude); // C'est inversé
        model.addAttribute("longitude", longitude);

        fooResourceUrl = "http://api.openweathermap.org/data/2.5/weather?lat="+latitude+"&lon="+longitude+"&appid=75fc5ee8b7b1b66ca7a543164c52d70d";
        ResponseEntity<APIMeteo> responseMeteo = restTemplate.getForEntity(fooResourceUrl, APIMeteo.class);

        model.addAttribute("temps", responseMeteo.getBody().getWeather().get(0).getMain());
        model.addAttribute("temperature", responseMeteo.getBody().getMain().getTemp() - 273.15);
        model.addAttribute("speedWind", responseMeteo.getBody().getWind().getSpeed());
        model.addAttribute("Cloudiness", responseMeteo.getBody().getClouds().getAll());

        return "meteo";
    }
}
