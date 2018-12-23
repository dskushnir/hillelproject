package ua.hillel.dskushnir.lesson06;

public class Lesson {
    protected int number;
    protected Topics topics;

    public Lesson(int number, Topics topics) {
        this.number = number;
        this.topics = topics;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Topics getTopics() {
        return topics;
    }

    public void setTopics(Topics topics) {
        this.topics = topics;
    }
}





