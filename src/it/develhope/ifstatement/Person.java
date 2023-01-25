package it.develhope.ifstatement;
public class Person {

    public int age;

    public Person() {
        int min = 5;
        int max = 80;
        int age = (int) Math.floor(Math.random() * (max - min + 1) + min);
        System.out.println("Generated age: " + age);
        this.age = age;
    }

    public String getLifeStage() {
        if (this.age <= 12) {
            return "Child";
        } else if (this.age >= 13 && this.age <= 19) {
            return "Teen";
        } else if (this.age >= 20 && this.age <= 59) {
            return "Adult";
        } else {
            return "Senior Adult";
        }
    }
}

        