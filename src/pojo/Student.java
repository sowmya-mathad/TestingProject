package pojo;

import java.util.List;

public class Student {
    int id;
    String name;
    double percentage;
    String specialization;
    List<String> skillSet;
    Integer Salary;

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Integer getSalary() {
        return Salary;
    }

    public void setSalary(Integer salary) {
        Salary = salary;
    }

    public List<String> getSkillSet() {
        return skillSet;
    }

    public void setSkillSet(List<String> skillSet) {
        this.skillSet = skillSet;
    }

    String location;

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", percentage=" + percentage +
                ", specialization='" + specialization + '\'' +
                ", skillSet=" + skillSet +
                ", Salary=" + Salary +
                ", location='" + location + '\'' +
                '}';
    }

    public Student(int id, String name, List<String> skillSet, Integer salary, String location) {
        this.id = id;
        this.name = name;
        this.skillSet = skillSet;
        Salary = salary;
        this.location = location;
    }

    public Student(int id, String name, double percentage, String specialization) {
        this.id = id;
        this.name = name;
        this.percentage = percentage;
        this.specialization = specialization;
    }
    public int getId() {
        return this.id;
    }
    public String getName() {
        return this.name;
    }
    public double getPercentage() {
        return this.percentage;
    }
    public String getSpecialization() {
        return this.specialization;
    }

    public void setId(int id) {
        this.id = id;
    }
}