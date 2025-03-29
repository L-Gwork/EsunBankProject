package com.example.EsunBankProject;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;

@Entity
@Table(name = "SeatingChart")
public class SeatingChart {
    @Id
    private String floorSeatSeq;
    private String floorNo;
    private String seatNo;
}
