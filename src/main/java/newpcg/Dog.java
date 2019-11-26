package newpcg;

import java.util.Objects;

public class Dog {

    String name;
    int weight;
    int height;
    String type;
    String color;

    public Dog(String name, int weight, int height, String type, String color)
    {
        this.name = name;
        this.weight = weight;
        this.height = height;
        this.type = type;
        this.color = color;

    }

    public String move(String words){

        String phrase = words + " Fun...";
        return phrase;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dog dog = (Dog) o;
        return Objects.equals(color, dog.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(color);
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                ", height=" + height +
                ", type='" + type + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
