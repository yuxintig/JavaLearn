package org.yxt.learn.week2;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @ClassName Group
 * @Description TODO
 * @Author 余欣婷
 * @Date 2020/10/12
 **/
@AllArgsConstructor
@Setter
@Getter
@ToString

public class Group {
    private String groupId;
    private Student[] student;
}