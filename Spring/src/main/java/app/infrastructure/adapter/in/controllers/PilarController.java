package app.infrastructure.adapter.in.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import app.application.UseCases.PilarUseCase;
import app.domain.models.Pilar;

@RestController
@RequestMapping("/api/pilar")
public class PilarController {

    @Autowired
    private PilarUseCase pilarUseCase;

    @PostMapping("/pilares")
    public ResponseEntity<String> createPilar(@RequestBody Pilar pilar) {
        try {
            pilarUseCase.createPilar(pilar);
            return ResponseEntity.status(HttpStatus.CREATED)
                    .body("pilar creado exitosamente");
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST)
                    .body("Error: " + e.getMessage());
        }
    }

    @PutMapping("/pilares/{id}")
    public ResponseEntity<String> updatePilar(@PathVariable Long id,
                                              @RequestBody Pilar pilar) {
        try {
            pilar.setId(id);
            pilarUseCase.updatePilar(pilar);
            return ResponseEntity.ok("pilar actualizado exitosamente");
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST)
                    .body("Error: " + e.getMessage());
        }
    }
}