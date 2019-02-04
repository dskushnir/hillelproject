package ua.hillel.dskushnir.lesson16;

import ua.hillel.dskushnir.lesson12.model.*;

import javax.xml.bind.annotation.XmlRootElement;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;
import java.util.Objects;

@XmlRootElement

public class NewCourse {
    int id;
    String description;

    public NewCourse() {

    }

    public NewCourse(int id, String description) {
        this.id = id;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


    @Override
    public String toString() {
        return "NewCourse{" +
                "id=" + id +
                ", description='" + description + '\'' +
                '}';
    }
}


