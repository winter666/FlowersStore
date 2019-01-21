package ru.itpark.newweb.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Flowers {
    private int id;
    private String name;
    private int price;
    private int amount;
    private int total=price*amount;
}
