package com.kiwis.datastructure.list.singlylinkedlist;

import com.kiwis.dataobjects.Employee;
import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class SinglyLinkedListTest {

    private static Employee[] employees = new Employee[5];

    private EmployeeSinglyLinkedList singlyLinkedList = null;

    @BeforeAll
    public static void createEmployeeInstances() {

        //Create Employee instances
        Employee employee1 = new Employee("John", "Smith", 36);
        employees[0] = employee1;

        Employee employee2 = new Employee("Sachin", "Tendulker", 10);
        employees[1] = employee2;

        Employee employee3 = new Employee("Sourav", "Ganguly", 95);
        employees[2] = employee3;

        Employee employee4 = new Employee("Rahul", "Dravid", 18);
        employees[3] = employee4;

        Employee employee5 = new Employee("Ajith", "Agarker", 89);
        employees[4] = employee5;


    }


    @BeforeEach
    public void eachMethod(){
        //Instantiate EmployeeSinglyLinkedList
        singlyLinkedList = new EmployeeSinglyLinkedList();
    }

    @Test
    @Order(1)
    public void singleLinkedListInstantiation() {

        Assertions.assertTrue(singlyLinkedList.getSize() == 0, "Initial size of the linked list should be zero") ;

        Assertions.assertTrue(singlyLinkedList.isEmpty(), "After initialization the list should be empty");
    }

    @Test
    @Order(2)
    public void additionToList(){

        singlyLinkedList.addToFront(employees[0]);
        Assertions.assertTrue(singlyLinkedList.getSize() == 1, "Size after addition should be 1") ;

        singlyLinkedList.addToFront(employees[1]);
        Assertions.assertTrue(singlyLinkedList.getSize() == 2, "Size after addition should be 2") ;

        singlyLinkedList.addToFront(employees[2]);
        Assertions.assertTrue(singlyLinkedList.getSize() == 3, "Size after addition should be 3") ;

        singlyLinkedList.addToFront(employees[3]);
        Assertions.assertTrue(singlyLinkedList.getSize() == 4, "Size after addition should be 4") ;

        singlyLinkedList.addToFront(employees[4]);
        Assertions.assertTrue(singlyLinkedList.getSize() == 5, "Size after addition should be 5") ;

        Assertions.assertFalse(singlyLinkedList.isEmpty(), "List should not be empty");
    }

    @Test
    @Order(3)
    public void removeFromList(){

        singlyLinkedList.addToFront(employees[0]);
        singlyLinkedList.addToFront(employees[1]);
        singlyLinkedList.addToFront(employees[2]);
        singlyLinkedList.addToFront(employees[3]);
        singlyLinkedList.addToFront(employees[4]);

        Assertions.assertTrue(singlyLinkedList.getSize() == 5, "Size after removal should be 5") ;

        singlyLinkedList.removeFromFront();
        Assertions.assertTrue(singlyLinkedList.getSize() == 4, "Size after removal should be 4") ;

        singlyLinkedList.removeFromFront();
        Assertions.assertTrue(singlyLinkedList.getSize() == 3, "Size after removal should be 3") ;

        singlyLinkedList.removeFromFront();
        Assertions.assertTrue(singlyLinkedList.getSize() == 2, "Size after removal should be 2") ;

        singlyLinkedList.removeFromFront();
        Assertions.assertTrue(singlyLinkedList.getSize() == 1, "Size after removal should be 1") ;

        singlyLinkedList.removeFromFront();
        Assertions.assertTrue(singlyLinkedList.getSize() == 0, "Size after removal should be 0") ;

        singlyLinkedList.removeFromFront();
        Assertions.assertTrue(singlyLinkedList.getSize() == 0, "Size after removal should be 0") ;

        Assertions.assertTrue(singlyLinkedList.isEmpty(), "List should be empty");
    }
}
