package ua.hillel.dskushnir.lesson06;

public class School {
    protected String titleOfSchool;
    protected Course[] course;

    public School(String titleOfSchool, Course[] course) {
        this.titleOfSchool = titleOfSchool;
        this.course = course;
    }

    public String getTitleOfSchool() {
        return titleOfSchool;
    }

    public void setTitleOfSchool(String titleOfSchool) {
        this.titleOfSchool = titleOfSchool;
    }

    public Course[] getCourse() {
        return course;
    }

    public void setCourse(Course[] course) {
        this.course = course;
    }
}


