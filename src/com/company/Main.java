package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        String name = "Orozbek" ;
        int age = generateRandomAge();
        int temperature = 10;

        System.out.println("Ваш возраст:"+ " "  +age);
        if ( age > 20 && age < 45 && temperature < 30 && temperature > -20 ){
            System.out.println(name + " " + "Можно гулять");
        }else  if (age < 20 && temperature > 0 && temperature < 28){
            System.out.println(name + " " + "Можно гулять");
        }else  if(age > 45 && temperature > -10 && temperature < 25){
            System.out.println(name + " " + "Можно гулять");
        }else {
            System.out.println("Ошибка! Не правильно введены данные");
        }

    }

    public static int generateRandomAge(){
        Random random =new Random();
        int rundomNumber = random.nextInt(107);
        return rundomNumber;
    }
}
