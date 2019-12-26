package com.example.DemoDepositManager.controller;

import com.example.DemoDepositManager.model.Deposit;
import com.example.DemoDepositManager.service.DepositManager;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    private final DepositManager depositManager;

    public UserController(DepositManager depositManager) {
        this.depositManager = depositManager;
    }

    @GetMapping("/deposits")
    public List<Deposit> getDeposits() {
        return depositManager.getAll();
    }
}
