package ua.hillel.dskushnir.lesson12.model;

import java.time.LocalDate;
import java.util.List;

public class Lesson {
    private Integer id;
    private String description;
    private List<Topic> topics;
    private LocalDate airDay;

    public LocalDate getAirDay() {
        return airDay;
    }

    public void setAirDay(LocalDate airDay) {
        this.airDay = airDay;
    }

    public Lesson(Integer id, String description) {
        this.id = id;
        this.description = description;
    }

    public List<Topic> getTopics() {
        return topics;
    }

    public void setTopics(List<Topic> topics) {
        this.topics = topics;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
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
        return "Lesson{" +
                "id=" + id +
                ", description='" + description + '\'' +
                '}';
    }
}