package com.example.plantai.controller;

import org.springframework.web.bind.annotation.*;
import com.example.plantai.service.PlantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;

@RestController
@RequestMapping("/api/plants")
public class PlantController {

    @Autowired
    private PlantService plantService;

    @PostMapping("/analyze")
    public ResponseEntity<String> analyzePlant(@RequestBody PlantInput plantInput) {
        String result = plantService.analyzePlantHealth(plantInput);
        return ResponseEntity.ok(result);
    }
}
