package Day35;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Generic class to represent a Key-Value pair
class Pair<K, V> {
    private K key;
    private V value;

    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "{" + key + ": " + value + "}";
    }
}

// Worker class implementing Runnable for Multithreading
class EmailProcessor implements Runnable {
    private final List<Pair<String, String>> emails;

    public EmailProcessor(List<Pair<String, String>> emails) {
        this.emails = emails;
    }

    @Override
    public void run() {
        for (Pair<String, String> email : emails) {
            System.out.println(Thread.currentThread().getName() + " processing " + email);
            try {
                Thread.sleep(1000); // Simulate processing delay
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                System.out.println(Thread.currentThread().getName() + " was interrupted.");
            }
        }
    }
}

public class GenericDemo {
    public static void main(String[] args) {
        // Input text for regex matching
        String text = """
            Contact support@example.com for help.
            You can also reach out to sales@example.org for deals.
            Follow us at info@company.com for updates!
            Invalid emails like not-an-email@ or hello@domain won't be matched.
            """;

        // Regex pattern to find valid email addresses
        String emailRegex = "[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}";
        Pattern pattern = Pattern.compile(emailRegex);
        Matcher matcher = pattern.matcher(text);

        // Using Generics to store matched emails
        List<Pair<String, String>> emailMatches = new ArrayList<>();
        while (matcher.find()) {
            emailMatches.add(new Pair<>("Email", matcher.group()));
        }

        // Print all matches found
        System.out.println("Matched Emails:");
        for (Pair<String, String> email : emailMatches) {
            System.out.println(email);
        }

        // Concurrency: Using ExecutorService to process matches in threads
        System.out.println("\nStarting Multithreaded Processing...");
        ExecutorService executor = Executors.newFixedThreadPool(3); // Pool of 3 threads

        // Divide matches into smaller chunks for each thread
        int chunkSize = emailMatches.size() / 2 + 1;
        List<Pair<String, String>> chunk1 = emailMatches.subList(0, Math.min(chunkSize, emailMatches.size()));
        List<Pair<String, String>> chunk2 = emailMatches.subList(chunkSize, emailMatches.size());

        // Assign each chunk to a separate thread
        executor.execute(new EmailProcessor(chunk1));
        executor.execute(new EmailProcessor(chunk2));

        // Shut down executor service
        executor.shutdown();
        while (!executor.isTerminated()) {
            // Wait for threads to finish
        }
        System.out.println("\nAll threads finished processing.");

        // Demonstrating Generics further: A Pair with different types
        Pair<Integer, String> errorCode = new Pair<>(404, "Not Found");
        System.out.println("\nExample of Generics with different types:");
        System.out.println("Error Code: " + errorCode);
    }
}
