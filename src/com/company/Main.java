package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Student student=new Student(2,"22222");
	System.out.println("Тестируем ArrayList:");
	System.out.println("Создадим ArrayList объектов Student и добавим в него 5 объектов");
        ArrayList<Student> arrayList = new ArrayList<Student>();
        for(int i=0;i<5;i++) arrayList.add(new Student(i,"Student "+i));
	System.out.println("Ваш список: ");
	System.out.println(arrayList);
	System.out.println("Добавим элемент на 3 позицию");
	arrayList.add(3,new Student(6,"New Student"));
	System.out.println("Ваш список:");
	System.out.println(arrayList);
	System.out.println("Создадим новый список, добавим в него 5 элементов, а затем добавим его элементы в первый");
        ArrayList<Student> arrayList1=new ArrayList<Student>();
        for(int i=0;i<5;i++) arrayList1.add(new Student(i+6,"Student "+(i+6)));
        System.out.println("Новый список:");
        System.out.println(arrayList1);
        arrayList.addAll(arrayList1);
        System.out.println("Список после добавления элементов:");
        System.out.println(arrayList);
        arrayList.add(student);
        System.out.println("Создадим объект Student, добавим его в ArrayList, а затем найдем его индекс: "+arrayList.indexOf(student));
        System.out.println("Удалим данный объект из списка:");
        arrayList.remove(student);
        System.out.println("Ваш список:");
        System.out.println(arrayList);
        System.out.println("Получим объект с индексом 3: "+arrayList.get(3));
        System.out.println("Удалим объект с индексом 4: ваш объект: "+arrayList.remove(4));
        System.out.println("Ваш список:");
        System.out.println(arrayList);
        System.out.println("Сохраним в новый список все объекты от 3 до 7:");
        System.out.println("Новый список:");
        System.out.println(arrayList.subList(3,7));
    }

    public static class Student {
        private int id;
        private String name;

        public Student(int id, String name) {
            this.id = id;
            this.name = name;
        }

        public String toString(){
            return "ID: "+id+" Name: "+name;
        }
    }
}
