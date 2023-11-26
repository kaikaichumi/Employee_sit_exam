package com.example.demo.web;

import com.example.demo.model.Employee;
import com.example.demo.model.Seat;
import com.example.demo.service.EmployeeService;
import com.example.demo.service.SeatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
public class SeatController {
    @Autowired
    private SeatService seatService;

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/seat")
    public Iterable<Seat> get(){

        return seatService.findAll();
    }

    @GetMapping("seat/test")
    public String getTest(){
        return "hello test";
    }

    @GetMapping("/seat/{id}")
    public Seat get(@PathVariable Integer id) {
        Seat seat = seatService.getById(id);
        if (seat == null) throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        return seat;
    }

    @PostMapping("/seat")
    public Seat create(@RequestPart("floor") String floor, @RequestPart("seatNum") String seat){
        return seatService.save(Long.parseLong(floor), Long.parseLong(seat));
    }
}
