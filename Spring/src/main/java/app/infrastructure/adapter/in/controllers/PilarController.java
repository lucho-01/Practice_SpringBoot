package app.infrastructure.adapter.in.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import app.application.UseCases.PilarUseCase;
import app.domain.models.Pilar;

public class PilarController {
	@RestController
	@RequestMapping("/api/pilar")
	public class AdministratorController {

	    @Autowired
	    private PilarUseCase pilarUseCase;



	    @PostMapping("/pilares")
	    public ResponseEntity<String> createPatient(@RequestBody Pilar pilar) {
	        try {
	            pilarUseCase.createPilar(pilar);
	            return ResponseEntity.status(HttpStatus.CREATED)
	                    .body("pilar rastreado exitosamente");
	        } catch (Exception e) {
	            return ResponseEntity.status(HttpStatus.BAD_REQUEST)
	                    .body("Error al registrar el pilar: " + e.getMessage());
	        }
	    }

	    @PutMapping("/pilares/{id}")
	    public ResponseEntity<String> updatePilar(@PathVariable Long id, @RequestBody Pilar pilar) {
	        try {
	            pilar.setId(id);
	            pilarUseCase.updatePilar(pilar);
	            return ResponseEntity.ok("pilar actualizado exitosamente");
	        } catch (Exception e) {
	            return ResponseEntity.status(HttpStatus.BAD_REQUEST)
	                    .body("Error al actualizar el pilar: " + e.getMessage());
	        }
	    }
	}
}
