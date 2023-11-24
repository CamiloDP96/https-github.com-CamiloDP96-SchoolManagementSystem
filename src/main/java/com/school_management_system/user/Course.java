package main.java.com.school_management_system.user;

public class Course {
    int id;
    String name;
    String description;
    int creditsValue;
    String version;

    Course( int id, String name, String description, int creditsValue, String version){
        this.id = id;
        this.name = name;
        this.description = description;
        this.creditsValue = creditsValue;
        this.version = version;
    }

    //getter
    public int getId() {
        return id;
    }

    public int getCreditsValue() {
        return creditsValue;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getVersion() {
        return version;
    }

    //setter
    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setCreditsValue(int creditsValue) {
        this.creditsValue = creditsValue;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    @Override
    public String toString() {
        return "Course{" +
        "id=" + id +
        ", name='" + name + '\'' +
        ", description='" + description + '\'' +
        ", creditsValue=" + creditsValue +
        ", version='" + version + '\'' +
        '}';
    }
}
