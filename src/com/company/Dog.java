package com.company;

public class Dog {
    String name;
    int age;
    boolean hasColor;

    //без аргументов, с параметрами
    public Dog(){
        this.name = "Subway";
        this.age = 10;
    }
    //с аргументами, с параметрами
    public Dog(String name, int age){
        this.name = name;
        this.age = age;
    }
    //с аргументами, с параметрами
    public Dog(String name, int age, boolean hasColor){
        this.name = name;
        this.age = age;
        this.hasColor = true;
    }

   // без аргументов
    public void sayWoof(){
        System.out.println("Гав!");
    }

    // без аргументов, возвращает стрингу
    public String sayAuu(){
        return "Ауу!";
    }

  // с аргументами
    public void multipleNumbers(int one, int two){
        System.out.println("Результат умножения: " + one * two);
    }
    // с аргументами
    public int returnMultipleNumbers(int one, int two) {
        return one * two;
    }

}
