package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ApiController {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @GetMapping("/data")
    public List<String> getData() {
        return jdbcTemplate.queryForList("SELECT * FROM your_table_name", String.class);
    }
}
