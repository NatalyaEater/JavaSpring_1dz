package gk.example;
import com.google.gson.Gson;


/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {

    Person person = new Person("mia", "alber", 20);

    Gson gson = new Gson();

    String json = gson.toJson(person);
    System.out.println(json);

    Person deserializedPerson = gson.fromJson(json, Person.class);
    System.out.println(deserializedPerson);
}
}
