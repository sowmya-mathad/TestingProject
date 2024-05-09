package pojo;

public class User {
    String name;
    Integer id;
    int age;
    // int age = 25;

    public User(Integer id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }
    public User(Integer id, String name) {
        this.id = id;
        this.name = name;
    }
    public String getName() {
        return this.name;
    }
    public Integer getId() {
        return this.id;
    }
    public int getAge() {
        return this.age;
    }
    public void setName(String name) {
        this.name= name;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User Details :" + "Id: " + id + "Name: " + name + "Age: "+ age;
    }
}