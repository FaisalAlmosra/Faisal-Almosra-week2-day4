package com.example.day9hw;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class TaskTrackerSystem {
    ArrayList<updateTaskTrackerSystem> updatetasktrackersystems = new ArrayList<>();

    @GetMapping("/Alltaks")
    public ArrayList<updateTaskTrackerSystem> gettaks() {
        return updatetasktrackersystems;
    }

    @PostMapping("/add")
    public String addtaks(@RequestBody updateTaskTrackerSystem utts) {
        updatetasktrackersystems.add(utts);
        return "new taks added to the list";
    }

    @PutMapping("/put/{index}")
    public String updatetask(@RequestBody updateTaskTrackerSystem uc, @PathVariable int index) {
        updatetasktrackersystems.set(index, uc);
        return "taks update from the list";
    }}






