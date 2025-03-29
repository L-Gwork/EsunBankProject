package com.example.EsunBankProject.controller;

import com.example.EsunBankProject.SeatingChart;
import com.example.EsunBankProject.service.SeatingChartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/seatingchart")
public class SeatingChartController {

    @Autowired
    private SeatingChartService seatingchartService;

    @PostMapping("/create")
    public void createSeatingChart(@RequestBody SeatingChart seatingChart) {
        seatingchartService.createSeatingChart(seatingChart);
    }
}