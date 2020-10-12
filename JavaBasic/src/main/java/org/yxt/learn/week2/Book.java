package org.yxt.learn.week2;


import lombok.*;
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
@ToString
public class Book {
    private String name;
    private String author;
    private Integer price;
    private Date publishDate;


}