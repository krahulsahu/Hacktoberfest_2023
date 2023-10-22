import java.util.HashMap;

public class HashTableExample {
    public static void main(String[] args) {
        // Create a hash table
        HashMap<String, Integer> hashMap = new HashMap<>();

        // Add key-value pairs
        hashMap.put("Alice", 25);
        hashMap.put("Bob", 30);
        hashMap.put("Charlie", 22);

        // Retrieve values
        int age = hashMap.get("Alice");
        System.out.println("Alice's age: " + age);

        // Check for key existence
        boolean exists = hashMap.containsKey("Bob");
        System.out.println("Bob exists: " + exists);

        // Remove a key-value pair
        hashMap.remove("Charlie");
        System.out.println("Charlie removed.");

        // Print the remaining key-value pairs
        for (String name : hashMap.keySet()) {
            int value = hashMap.get(name);
            System.out.println(name + "'s age: " + value);
        }
    }
}
