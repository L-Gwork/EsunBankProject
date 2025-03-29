package com.example.EsunBankProject.service;

import com.example.EsunBankProject.SeatingChart;
import com.example.EsunBankProject.repository.SeatingChartRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class SeatingChartService {
    @Autowired
    private SeatingChartRepository seatingChartRepository;

    @Transactional
    public void createSeatingChart(SeatingChart seatingChart) {
        // 插入或更新 SeatingChart
        seatingChartRepository.save(seatingChart);
    }
}
