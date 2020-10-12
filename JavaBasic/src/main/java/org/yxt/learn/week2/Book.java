package org.yxt.learn.week2;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.util.Date;

/**
 * @ClassName book
 * @Description TODO
 * @Author 余欣婷
 * @Date 2020/10/12
 **/
@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
@EqualsAndHashCode()
public class Book {
    private String name;
    private String author;
    private Integer price;
    private Date publishDate;


}