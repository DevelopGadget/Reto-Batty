package comspring.mongodb.DemoMongoDB.Models;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;

public class Equipo {

    @Id
    public ObjectId _id;

    public String Name;
    public String Stadium;
    public String UrlStadium;
    public String UrlShield;

    public Equipo() {
    }

    public Equipo(ObjectId _id, String Name, String Stadium, String UrlStadium, String UrlShield) {
        this._id = _id;
        this.Name = Name;
        this.Stadium = Stadium;
        this.UrlShield = UrlShield;
        this.UrlStadium = UrlStadium;
    }

    public String get_id() {
        return _id.toHexString();
    }

    /**
     * @param _id the _id to set
     */
    public void set_id(ObjectId _id) {
        this._id = _id;
    }

    /**
     * @return the name
     */
    public String getName() {
        return Name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        Name = name;
    }

    /**
     * @return the stadium
     */
    public String getStadium() {
        return Stadium;
    }

    /**
     * @param stadium the stadium to set
     */
    public void setStadium(String stadium) {
        Stadium = stadium;
    }

    /**
     * @return the urlShield
     */
    public String getUrlShield() {
        return UrlShield;
    }

    /**
     * @param urlShield the urlShield to set
     */
    public void setUrlShield(String urlShield) {
        UrlShield = urlShield;
    }

    /**
     * @return the urlStadium
     */
    public String getUrlStadium() {
        return UrlStadium;
    }

    /**
     * @param urlStadium the urlStadium to set
     */
    public void setUrlStadium(String urlStadium) {
        UrlStadium = urlStadium;
    }
}