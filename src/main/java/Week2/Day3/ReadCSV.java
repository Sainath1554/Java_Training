package Week2.Day3;

import java.io.*;
import java.util.*;

public class ReadCSV {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("src/Week2/Day3/students.csv"));
        String line;
        List<Student> students = new ArrayList<>();
        while((line = br.readLine())!=null)
        {
            String[] temp = line.split(",");
            students.add(new Student(temp[0],temp[1],temp[2]));
        }
        br.close();
        Collections.sort(students,Comparator.comparing(Student::getLastName));

//        Collections.sort(students);
        System.out.println(students);
        File file = new File("src/Week2/Day3/updatedStudents.csv");
        FileWriter fw = new FileWriter(file);
        line = "";
        for (Student student:students)
        {
            line+=student.firstName+","+student.lastName+","+student.gpa+"\n";
        }
        System.out.println(line);
        fw.append(line);
        fw.close();
    }
}

class Student implements Comparable<Student>
{
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getGpa() {
        return gpa;
    }

    public void setGpa(String gpa) {
        this.gpa = gpa;
    }

    String firstName;
    String lastName;
    String gpa;
    Student(String firstName,String lastName,String gpa)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gpa = gpa;
    }

    @Override
    public int compareTo(Student o) {
        if(this.lastName.compareTo(o.lastName)>0)
        {
            return 1;
        }
        else
        {
            return -1;
        }
    }
    @Override
    public String toString() {
        return this.lastName +" "+ this.firstName;
    }
}
