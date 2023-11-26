package com.example.demo.model;

import jakarta.persistence.*;

@Entity
@Table(name = "Seating_Chart")
public class Seat {
    @Id
    @Column(name = "FLOOR_SEAT_SEQ")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long seatID;
    @Column(name = "FLOOR_NO")
    private long floorNum;
    @Column(name = "SEAT_NO")
    private long seatNum;

    public Seat() {
    }

    public Seat(long floorNum, long seatNum) {
        this.floorNum = floorNum;
        this.seatNum = seatNum;
    }

    public Long getSeatID() {
        return seatID;
    }

    public void setSeatID(Long seatID) {
        this.seatID = seatID;
    }

    public long getFloorNum() {
        return floorNum;
    }

    public void setFloorNum(long floorNum) {
        this.floorNum = floorNum;
    }

    public long getSeatNum() {
        return seatNum;
    }

    public void setSeatNum(long seatNum) {
        this.seatNum = seatNum;
    }
}
