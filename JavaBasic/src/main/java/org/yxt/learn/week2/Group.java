package org.yxt.learn.week2;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

/**
 * @ClassName Group
 * @Description TODO
 * @Author 余欣婷
 * @Date 2020/10/12
 **/
@AllArgsConstructor
@Setter
@Getter
public class Group {
    private String groupId;
    private Student[] student;
}