package com.project.fintrack2.budget.controller;


import com.project.fintrack2.utility.response.ResponseWrapper;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/budget")
public class BudgetController {


    @GetMapping
    public ResponseWrapper<List<String>> getBudget(){
        return null;
    }
}
