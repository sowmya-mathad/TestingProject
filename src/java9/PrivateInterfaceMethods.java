package java9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class PrivateInterfaceMethods {

    public static void main(String[] args) {
        TestingNames names = new TestingNames();
        System.out.println(names.fetchInitialData());
    }

    public static class TestingNames implements NamesInterface {
        public TestingNames() {
        }
    }


}