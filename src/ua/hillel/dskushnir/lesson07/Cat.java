package ua.hillel.dskushnir.lesson07;

@MyAnn({"This is", "my", "Cat"})
public class Cat {
    private String name;
    private String bride;
    private String color;

    public Cat(String name, String bride, String color) {
        this.name = name;
        this.bride = bride;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public String getBride() {
        return bride;
    }

    public String getColor() {
        return color;
    }
    protected String getInfo() {
        return getName() + "," + getBride() + "," + getColor();
    }
}




