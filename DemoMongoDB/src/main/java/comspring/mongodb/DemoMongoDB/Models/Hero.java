package comspring.mongodb.DemoMongoDB.Models;

import org.springframework.data.annotation.Id;

public class Hero {

    @Id
    public String _id;
    public String Name;
    public String Alias;
    public String Role;
    public String[] Skills;

    public Hero() {
    }

    public Hero(String _id, String Name, String Alias, String Role, String[] Skills) {
        this._id = _id;
        this.Name = Name;
        this.Alias = Alias;
        this.Role = Role;
        this.Skills = Skills;
    }

    /**
     * @return the _id
     */
    public String get_id() {
        return _id;
    }

    /**
     * @param _id the _id to set
     */
    public void set_id(String _id) {
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
     * @return the alias
     */
    public String getAlias() {
        return Alias;
    }

    /**
     * @param alias the alias to set
     */
    public void setAlias(String alias) {
        Alias = alias;
    }

    /**
     * @return the role
     */
    public String getRole() {
        return Role;
    }

    /**
     * @param role the role to set
     */
    public void setRole(String role) {
        Role = role;
    }

    /**
     * @return the skills
     */
    public String[] getSkills() {
        return Skills;
    }

    /**
     * @param skills the skills to set
     */
    public void setSkills(String[] skills) {
        Skills = skills;
    }
}