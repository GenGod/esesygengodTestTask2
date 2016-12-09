import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Богдан on 10.12.2016.
 */
public class Main {

    public static Map<String, ArrayList<String>> phoneBook;

    public static int search(String name) {
        try {
            ArrayList<String> result = phoneBook.get(name);
            for (int i = 0; i < result.size(); i++) {
                System.out.println((i+1) + ". " + result.get(i));
            }
            return result.size();
        } catch (NullPointerException e) {
            System.out.println("Data not found!");
            return 0;
        }
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
        search("Сидоров С.С.");
    }
}
