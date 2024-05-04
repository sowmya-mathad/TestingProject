package pojo;

import java.util.List;

public class Employee {
    Integer id;
    String name;
    List<String> skillSet;
    Integer salary;
    String location;

    public Employee(Integer id, String name, List<String> skillSet, Integer salary, String location) {
        this.id = id;
        this.name = name;
        this.skillSet = skillSet;
        this.salary = salary;
        this.location = location;
    }


    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", skillSet=" + skillSet +
                ", salary=" + salary +
                ", location='" + location + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getSkillSet() {
        return skillSet;
    }

    public void setSkillSet(List<String> skillSet) {
        this.skillSet = skillSet;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }
}
