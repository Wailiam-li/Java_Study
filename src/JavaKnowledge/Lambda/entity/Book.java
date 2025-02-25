package JavaKnowledge.Lambda.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Book {

    private String name;

    private BigDecimal price;

    private String author;

    private int saleNum;


}
