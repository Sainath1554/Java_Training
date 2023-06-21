package Week4.Day2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

class Student
{
    String firstName,lastName;
    double gpa;

    public Student(String firstName, String lastName, double gpa) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", gpa=" + gpa +
                '}';
    }
}
public class MapIteration {
    public static void main(String[] args) {
        HashMap<String,Student> map = new HashMap<>();
        map.put("Sai",new Student("Sai","K",3.56));
        map.put("Santosh",new Student("Santosh","P",3.78));
        map.put("Pavan",new Student("Pavan","G",4));

        //Entry set
        for(Map.Entry<String,Student> entry:map.entrySet())
        {
            System.out.println(entry.getKey()+" :"+entry.getValue());
        }
        System.out.println("---");
        //entry set
        map.entrySet().forEach(entry->System.out.println(entry.getKey()+" :"+entry.getValue()));
        System.out.println("---");

        //Iterator and keyset
        Iterator<String> itr = map.keySet().iterator();
        while(itr.hasNext())
        {
            String key = itr.next();
            System.out.println(key+" :"+map.get(key));
        }
    }
}
