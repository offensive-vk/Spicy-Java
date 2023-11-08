package Generics;

import java.util.HashMap;
import java.util.Map;

public class Complex {
    public static <T, K> T appendDataToProperty(T obj, K prop, String appendString) {
        try {
            Map<K, Object> updatedObj = new HashMap<>(((Map<K, Object>) obj));
            Object originalValue = updatedObj.get(prop);
            if (originalValue != null && originalValue instanceof String) {
                updatedObj.put(prop, (String) originalValue + appendString);
                return (T) updatedObj;
            }
        } catch (ClassCastException e) {
            // Handle the exception if the casting is not possible.
        }
        return null; // Return null if the property is not a String or doesn't exist.
    }

    public static void main(String[] args) {
        Map<String, Object> boi = new HashMap<>();
        boi.put("name", "John");
        boi.put("age", 30);

        Map<String, Object> item = new HashMap<>();
        item.put("name", "Pizza");
        item.put("price", 19.99);

        Map<String, Object> index = new HashMap<>();
        index.put("start", 1);
        index.put("end", 99);
        index.put("distance", 55);
        index.put("nullable", true);

        Map<String, Object> personWithSuffix = appendDataToProperty(boi, "name", " Wick");
        Map<String, Object> productWithSuffix = appendDataToProperty(item, "price", "$");

        System.out.println(personWithSuffix);
        System.out.println(productWithSuffix);

        System.out.println(appendDataToProperty(index, "distance", " km"));
        System.out.println(appendDataToProperty(index, "nullable", "false")); // Should return null
    }
}

