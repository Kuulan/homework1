package com.company;

public class Zoo {
    public static void main(String[] args){
//      String name = "Sabrina";
//        int age= 3;
//        boolean hasColor = true;
//        System.out.println("Мы создали песика с именем " + name + " и возрастом " + age);
//
//        Dog anotherDog = new Dog();
//        System.out.println("Мы создали песика с именем" + anotherDog.name +" и возрастом" + anotherDog.age);
//
        Dog myDog = new Dog();
        Dog anotherDog = new Dog("Subsab",1);
        Dog defaultDog = new Dog();
        myDog.name = "Sabrina";
        myDog.age = 3;
        anotherDog.name = "Subsab";
        anotherDog.age = 1;
        Dog Bobaka = new Dog("Bobaka", 8, true);

        System.out.println("Мы создали песика с именем " + myDog.name +" и возрастом " + myDog.age);
        System.out.println("Мы создали песика с именем " + anotherDog.name +" и возрастом " + anotherDog.age);
        System.out.println("Мы создали песика с именем " + defaultDog.name +" и возрастом " + defaultDog.age);
        myDog.sayWoof();
        String dogVoice = myDog.sayAuu();
        System.out.println(dogVoice);
        myDog.multipleNumbers(2,9);
        anotherDog.sayWoof();
        System.out.println(anotherDog.sayAuu());
        int result = anotherDog.returnMultipleNumbers(5,5);
        System.out.println(result);
        System.out.println("Есть цвет у Бобаки?");
        if (Bobaka.hasColor){
            Bobaka.sayWoof();
        } else {
            Bobaka.sayAuu();
        }
    }


    }

