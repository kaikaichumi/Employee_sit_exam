package com.example.demo.repository;

import com.example.demo.model.Seat;
import org.springframework.data.repository.CrudRepository;

public interface SeatRepository extends CrudRepository<Seat, Integer> {
}
