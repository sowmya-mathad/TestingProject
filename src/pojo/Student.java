package pojo;

public class Student {
    int id;
    String name;
    double percentage;
    String specialization;

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
    @Override
    public String toString() {
        return "Id:" + id + " Name:" + name
                + " percentage:" + percentage + " specialization:" + specialization;
    }

    public void setId(int id) {
        this.id = id;
    }
}