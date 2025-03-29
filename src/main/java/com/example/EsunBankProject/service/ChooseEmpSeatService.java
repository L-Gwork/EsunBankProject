package com.example.EsunBankProject.service;

import com.example.EsunBankProject.dto.SeatingUpdateRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

@Service
public class ChooseEmpSeatService {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void updateEmpSeating(SeatingUpdateRequest request) {
        String sql = "EXEC UpdateEmpSeat ?, ?, ?";
        jdbcTemplate.update(sql, request.getEmpId(), request.getFloorNo(), request.getSeatNo());
    }
}
