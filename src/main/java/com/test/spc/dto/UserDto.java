package com.test.spc.dto;

import lombok.Data;
import lombok.ToString;

import java.math.BigDecimal;

@Data
@ToString
public class UserDto {

    private Integer id;
    private String name;
    private String company;
    private BigDecimal salary;

}
