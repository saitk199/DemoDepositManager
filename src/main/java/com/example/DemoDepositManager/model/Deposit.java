package com.example.DemoDepositManager.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Deposit {

    private String id;

    private String idClient;

    private double amount;

    private double percent;

    private double pretermPercent;

    private int termDays;

    private Date startDate;

    private boolean withPercentCapitalization;

}
