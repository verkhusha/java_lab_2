import com.google.gson.Gson;

public class Main {
    public static void main(String[] args) {
        Student original = new Student("Іван", "Петров", 20, "S12345");
        System.out.println("Оригінал: " + original);

        Gson gson = new Gson();
        String json = gson.toJson(original);
        System.out.println("JSON: " + json);

        Student deserialized = gson.fromJson(json, Student.class);
        System.out.println("Десеріалізований: " + deserialized);

        System.out.println("equals? " + original.equals(deserialized));
    }
}