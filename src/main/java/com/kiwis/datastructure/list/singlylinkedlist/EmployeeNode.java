package com.kiwis.datastructure.list.singlylinkedlist;

import com.kiwis.dataobjects.Employee;
import lombok.*;

/**
 * @RequiredArgsConstructor and @NonNull are two important keys to solve the problem above.
 * Because @RequiredArgsConstructor creates a constructor with fields which are annotated by @NonNull
 * annotation.
 */
@RequiredArgsConstructor
@Getter
@Setter
@ToString(exclude = "next")
public class EmployeeNode {

    @NonNull
    private Employee employee;

    private EmployeeNode next;

}
