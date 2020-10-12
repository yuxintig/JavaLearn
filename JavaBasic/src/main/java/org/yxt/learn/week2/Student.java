package org.yxt.learn.week2;


import lombok.AllArgsConstructor;
import lombok.ToString;

/**
 * @ClassName Student
 * @Description TODO
 * @Author 余欣婷
 * @Date 2020/10/12
 **/
@AllArgsConstructor
@ToString
public class Student {
    private String id;
    private String studentName;
    private String gender;
    private Phone phone;
    private Book[] books;
}
