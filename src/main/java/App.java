import com.google.gson.Gson;

public class App {

    public static void main(String[] args) {
        User user = new User("Dmytro","Stavishchenko");
        String result= new Gson().toJson(user);
        System.out.println(result);
    }
}