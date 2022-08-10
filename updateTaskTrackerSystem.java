package com.example.day9hw;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class updateTaskTrackerSystem {
    private String ID;
    private String title;
    private String description;
    private boolean status;
}