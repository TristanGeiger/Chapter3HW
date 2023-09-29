package Problem1;

import javax.lang.model.element.Name;

public abstract class FarmAnimal {

    private String name;
    private String gender;
    private double weight;

    private int age;

    public FarmAnimal(String name, String gender, double weight, int age) {
        this.name = name;
        this.gender = gender;
        this.weight = weight;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
   public String toString(){
       return "[name: " + name  + " gender: " + gender  + " age: " + age + " weight: " + weight + "]";
   }

   public abstract String feedLoadingSchedule();















}