package com.banking.dto;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode

public class BankAccount{
    private int actNumber;
    private String customerName;
    private int actBalance;

}
