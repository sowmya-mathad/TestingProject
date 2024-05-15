package DataStructure;

import org.w3c.dom.ls.LSOutput;
import pojo.Employee;
import pojo.Gender;

import java.util.*;
import java.util.stream.Collectors;

public class HashMapTest {
    public static void main(String[] args) {
        HashMap<Integer,String> hashMaps = new HashMap<>();
        hashMaps.put(1, "sowmya");
        hashMaps.put(12, "Girish");
        hashMaps.put(38, "Bethleny");
        hashMaps.put(74, "Shreyansh");
        hashMaps.put(521, "James");
        hashMaps.put(177, "Shreyansh");
        System.out.print("HashMap : ");
        hashMaps.put(null, null);

        System.out.println(hashMaps);


            ArrayList<String> skills = new ArrayList<>();
            Employee emp1 = new Employee(1, "AAAA", skills, 10500, "charlotte", Gender.FEMALE, 25);
            Employee emp2 = new Employee(24, "CCC", skills, 3000, "charlotte", Gender.MALE, 30);
            Employee emp3 = new Employee(3, "GG", skills, 17000, "NY", Gender.FEMALE, 40);
            Employee emp4 = new Employee(14, "ZZZ", skills, 61000, "ATL", Gender.MALE, 45);
            Employee emp5 = new Employee(16, "HHHH", skills, 12000, "NY", Gender.FEMALE, 30);
            Employee emp6 = new Employee(15, "XXX", skills, 61000, "ATL", Gender.FEMALE, 35);
            Employee emp7 = new Employee(17, "ZZZ", skills, 61000, "ATL", Gender.MALE, 45);
            HashMap<Employee, String> hashMapEmp = new HashMap<>();
            hashMapEmp.put(emp1, "sdsdsad9as");
            hashMapEmp.put(emp2, "sdsdsad8as");
            hashMapEmp.put(emp3, "sdsdsad8as");
            hashMapEmp.put(emp4, "sdsdsad7as");
            hashMapEmp.put(emp5, "sdsdsad4as");
            hashMapEmp.put(emp6, "sdsdsada4s");
            hashMapEmp.put(emp7, "sdsdsadas95");
            Map<Employee, String> mapEle = hashMapEmp.entrySet().stream()
                    .filter(x->x.getKey().getId() == 1)
                    .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
            System.out.println(mapEle);
        HashMap<String, Employee> ahashMapEmp = new HashMap<>();
        ahashMapEmp.put("sdsdsad9as",emp1);
        ahashMapEmp.put("sdsdsad8as", emp4);
        ahashMapEmp.put( "sdsdsad8as",emp2);
        ahashMapEmp.put( "sdsdsad7as",emp5);
        ahashMapEmp.put( "sdsdsad4as",emp6);
        ahashMapEmp.put( "sdsdsada4s",emp7);
        ahashMapEmp.put( "sdsdsadas95",emp3);
        Map<String, Employee> mapEl = ahashMapEmp.entrySet().stream()
                .filter(x->x.getKey().equals("Employee"))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
        System.out.println(mapEle);


    }
}
