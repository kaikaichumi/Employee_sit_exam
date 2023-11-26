package com.example.demo.service;

import com.example.demo.model.Seat;
import com.example.demo.repository.SeatRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SeatService {
    @Autowired
    private SeatRepository seatRepository;

    public Iterable<Seat> findAll() {
        return seatRepository.findAll();
    }

    public Seat getById(Integer id) {
        return seatRepository.findById(id).orElse(null);
    }

    public Seat save(long floorNum, long seatNum) {
        Seat seat = new Seat(floorNum, seatNum);
        seatRepository.save(seat);
        return seat;
    }
}
