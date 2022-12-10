package dz3;
import java.util.HashMap;
import java.util.Map;
public class hw3 {

    public static void main(String[] args) {
        
        Map<Integer, String> phoneMap = new HashMap<>();
        add(phoneMap, 843456789, "Ivanov");
        add(phoneMap, 542326858, "Safronov");
        add(phoneMap, 465874569, "Bulgakov");
        add(phoneMap, 89000444, "Mishkin");
        add(phoneMap, 111112589, "Oleg");
        add(phoneMap, 11001, "Oleg");
        System.out.println(phoneMap);
        get(phoneMap, "Oleg");
    }
    public static void add(Map<Integer,String> phoneMap, int phoneNumber, String surname) {
        phoneMap.put(phoneNumber, surname);
    }
    public static void get(Map<Integer, String> phoneMap, String surname) {
        for(Map.Entry<Integer, String> entry: phoneMap.entrySet()) {
            int key = entry.getKey();
            String value = entry.getValue();
            if (value == surname){
                System.out.println(value + " " + " номер телефона " + key);
            }
        }
    } 
}
