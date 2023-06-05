package Week1.Day5.P2;

import Week1.Day5.P2.Parent;

public class Child extends Parent {

    String name;
    public Child(int age,String name)
    {
        this.age = age;
        this.name = name;
    }
    public Child(String name)
    {
        this.name = name;
    }
}
