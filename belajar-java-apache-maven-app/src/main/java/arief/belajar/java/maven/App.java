package arief.belajar.java.maven;

import com.google.gson.Gson;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Gson gson = new Gson();

        Person person = new Person("ARIEF KARDITYA HERMAWAN");
        String json = gson.toJson(person);

        System.out.println(json);
    }
}
