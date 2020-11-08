package com.kiwis.datastructure.list.singlylinkedlist;

import com.kiwis.dataobjects.Employee;

public class SinglyLinkedListMain {

    public static void main(String[] args) {

        //Create Employee instances
        Employee employee1 = new Employee("John","Smith", 36);
        Employee employee2 = new Employee("Sachin","Tendulker", 10);
        Employee employee3 = new Employee("Sourav","Ganguly", 95);
        Employee employee4 = new Employee("Rahul","Dravid", 18);
        Employee employee5 = new Employee("Ajith","Agarker", 89);

        //Instantiate EmployeeSinglyLinkedList
        EmployeeSinglyLinkedList list = new EmployeeSinglyLinkedList();

        System.out.println("List Empty: " + list.isEmpty());

        //Add employee class to list
        list.addToFront(employee1);
        list.addToFront(employee2);
        list.addToFront(employee3);
        list.addToFront(employee4);
        list.addToFront(employee5);

        System.out.println("List Empty: " + list.isEmpty());

        System.out.println("Total Size: " + list.getSize());
        list.printList();

        //Remove employee details one by one from the list
        System.out.println("Removed - " + list.removeFromFront());
        System.out.println(list.getSize());
        System.out.println("Removed - " + list.removeFromFront());
        System.out.println(list.getSize());
        System.out.println("Removed - " + list.removeFromFront());
        System.out.println(list.getSize());
        System.out.println("Removed - " + list.removeFromFront());
        System.out.println(list.getSize());
        System.out.println("Removed - " + list.removeFromFront());
        System.out.println(list.getSize());
        System.out.println("Removed - " + list.removeFromFront());
        System.out.println(list.getSize());
    }
}


