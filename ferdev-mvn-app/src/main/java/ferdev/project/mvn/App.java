package ferdev.project.mvn;

import com.google.gson.Gson;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Person person1 = new Person("Feri Winarta", 19);
        System.out.println("OBJEK SEBELUM JADI JSON \n" + "nama : " +
                person1.getName() + "\nUmur: " + person1.getUmur());

        // jadi json
        Gson gson = new Gson();
        String jsonPerson1 = gson.toJson(person1);
        System.out.println("\nSESUDAH JADI JSON\n" + jsonPerson1);

    }
}
