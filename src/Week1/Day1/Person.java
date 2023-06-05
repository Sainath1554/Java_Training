package Week1.Day1;

public class Person {
    private int age;
    private float weight;
    private float height;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }
    public double calculator()
    {
        return (weight/height*height);
    }
    void walk()
    {
        System.out.println("Week1.Day1.Person is walking");
    }
}
