package Week2.Day3;

public class Rotation {
    public static void main(String[] args)
    {
        String s1 = "JavaJ2eeStrutsHibernate";
        String s2 = "StrutsHibernateJavaJ2ee";
        String s3 = s1 + s1;
        if(s3.contains(s2) && s1.length()==s2.length())
        {
            System.out.println("true");
        }
        else
        {
            System.out.println("false");
        }
    }
}
