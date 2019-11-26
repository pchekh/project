package newpcg;

import java.util.Objects;

public class Cat {

        String name;
        int weight;
        int height;
        String type;
        String color;

        public Cat(String name, int weight, int height, String type, String color)
        {
            this.name = name;
            this.weight = weight;
            this.height = height;
            this.type = type;
            this.color = color;

        }


    public String move(String words){

            String phrase = words + " Run...";
            return phrase;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cat cat = (Cat) o;
        return Objects.equals(color, cat.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(color);
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                ", height=" + height +
                ", type='" + type + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}

