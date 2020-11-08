package com.kiwis.datastructure.list.singlylinkedlist;

import com.kiwis.dataobjects.Employee;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@NoArgsConstructor
@Getter
public class EmployeeSinglyLinkedList {

    private EmployeeNode head;
    private int size;

    /**
     * Method to add given employee class to front of the list
     *
     * @param employee instance of {@link Employee}
     */
    public void addToFront(Employee employee) {

        EmployeeNode employeeNode = new EmployeeNode(employee);

        employeeNode.setNext(head);

        head = employeeNode;

        size++;
    }

    /**
     * Method to print full list
     */
    public void printList() {

        EmployeeNode current = head;

        System.out.print("HEAD -> ");

        while (current != null) {

            System.out.print(current + " --> ");

            current = current.getNext();
        }

        System.out.println("null");
    }

    /**
     * Method to check whether the given list is empty or not
     *
     * @return true if the list is empty else false
     */
    public boolean isEmpty() {
        return head == null;
    }

    /**
     * Method to remove employee node from list
     *
     * @return EmployeeNode which removed from list
     */
    public EmployeeNode removeFromFront() {

        EmployeeNode removedNode = null;

        if (!isEmpty()) {
            removedNode = head;
            head = head.getNext();
            size--;
            //for safer side setting next node as null
            removedNode.setNext(null);
        }
        return removedNode;
    }

}

