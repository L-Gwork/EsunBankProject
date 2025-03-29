package com.example.EsunBankProject.controller;

import com.example.EsunBankProject.service.ChooseEmpSeatService;
import com.example.EsunBankProject.dto.SeatingUpdateRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/seatingchart")
public class ChooseEmpSeatController {

    @Autowired
    private ChooseEmpSeatService chooseempseatService;

    @PostMapping("/updateEmpSeating")
    public ResponseEntity<String> updateEmpSeating(@RequestBody SeatingUpdateRequest request) {
        chooseempseatService.updateEmpSeating(request);
        return ResponseEntity.ok("座位更新成功");
    }
}
