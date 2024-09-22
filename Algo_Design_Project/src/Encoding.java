import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Encoding {
    public static void main(String[] args) {
        String filePath = "C:\\Users\\Ujjwal\\Desktop\\Projects\\Ujjwal_Eclipse\\Algo_Design_Project\\src\\Encoding.java"; // Replace with the actual file path

        // Create a map to store byte frequencies
        Map<Byte, Integer> frequencyMap = new HashMap<>();

        try (FileInputStream fis = new FileInputStream(filePath)) {
            // Read the file byte by byte
            int byteRead;
            while ((byteRead = fis.read()) != -1) {
                // Update the frequency map
                frequencyMap.merge((byte) byteRead, 1, Integer::sum);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Display the frequency of each byte
        for (Map.Entry<Byte, Integer> entry : frequencyMap.entrySet()) {
            byte b = entry.getKey();
            int frequency = entry.getValue();
            System.out.println("Byte: " + b + ", Frequency: " + frequency);
        }
    }
}

