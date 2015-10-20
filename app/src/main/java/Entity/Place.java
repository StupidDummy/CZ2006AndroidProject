package Entity;
import java.util.*;
/**
 * Created by dbakti7 on 10/19/2015.
 */
public class Place {
    // entity class
    private String name;
    private String category;
    private Weather weather;
    private String description;
    private String image;
    Place() {
        name = null;
        category = null;
        weather = null;
        description = null;
        image = null;
    }
    public Place(String name, String category, String description, String image) throws Exception{
        this.name = name;
        this.category = category;
        this.setDetails();
        this.description = description;
        this.image = image;
    }
    public void setDetails() throws Exception{
        this.weather.setWeather();
    }
    public List getDetails() {
        List details = new ArrayList();
        details.add(name);
        details.add(category);
        details.add(weather);
        details.add(description);
        details.add(image);
        return details;
    }
}
