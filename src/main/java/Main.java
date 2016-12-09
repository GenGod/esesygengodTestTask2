import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Богдан on 10.12.2016.
 */
public class Main {

    public static Map<String, ArrayList<String>> phoneBook;

    public static ArrayList<String> search(String name) {
        return phoneBook.get(name);
    }

    public static void main(String[] args) {
        phoneBook = new HashMap<String, ArrayList<String>>();
        ArrayList<String> phones = new ArrayList<String>();
        phones.add("+8 800 2000 500");
        phones.add("+8 800 200 600");
        phoneBook.put("Иванов И.И.", phones);
        phones = new ArrayList<String>();
        phones.add("+8 800 2000 700");
        phoneBook.put("Петров П.П.", phones);
        phones = new ArrayList<String>();
        phones.add("+8 800 2000 800");
        phones.add("+8 800 2000 900");
        phones.add("+8 800 2000 000");
        phoneBook.put("Сидоров С.С.", phones);

        System.out.println(search("Сидоров С.С.").toString());
    }
}
