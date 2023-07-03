package Practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.IntStream;

class Person
{
    String name;
}

interface InterfaceNew<T>
{
    public void print(T t);
}
public class Lambdas {
    public static void main(String[] args)
    {
        Person p = new Person();
        p.name = "Sai";
        InterfaceNew<Person> personInterface = (person) -> System.out.println(person.name);
        personInterface.print(p);

        Supplier sup = ()->10;
        System.out.println(sup.get());

        Consumer<Person> personConsumer = (per)->System.out.println(per.name);
        personConsumer.accept(p);

        Function<Integer,Integer> func = (x)->x*10;
        System.out.println(func.apply(10));

        Predicate<Integer> predicate = (x)->x==10;
        System.out.println(predicate.test(10));

        int[] values = new int[]{10,20,30,40,50};
        int result = Arrays.stream(values).filter(i->i>20).sum();
        System.out.println(result);
    }
}

