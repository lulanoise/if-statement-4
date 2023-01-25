package it.develhope.ifstatement;

public class Start {
    public static void main(String[] args) {
        Person person = new Person();
        String lifeStage = person.getLifeStage();
        System.out.println("The person is in the " + lifeStage + " stage of life.");
    }
    }