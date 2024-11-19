package java9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public interface NamesInterface {
    default List<String> fetchInitialData() {
        try (BufferedReader br = new BufferedReader(
                new InputStreamReader(this.getClass()
                        .getResourceAsStream("D:\\LearningProjects\\TestingProject\\src\\java9\\names.txt")))) {
            return readNames(br);
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    private List<String> readNames(BufferedReader br)
            throws IOException {
        ArrayList<String> names = new ArrayList<>();
        String name;
        while ((name = br.readLine()) != null) {
            names.add(name);
        }
        return names;
    }
}