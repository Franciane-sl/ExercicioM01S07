package br.comfuturo.dev.estudantes.controller;

import br.comfuturo.dev.estudantes.model.Database;
import br.comfuturo.dev.estudantes.model.Estudante;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

//Mapeamento de requesição.

@RequestMapping ("/Estudante")

public class EstudanteController {

    @PostMapping
    public ResponseEntity<?> cadastrarEstudante(@RequestBody @Valid Estudante estudante, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return ResponseEntity.badRequest().body(bindingResult.getAllErrors());
        }

        Database.add(estudante);
        return new ResponseEntity<>(estudante, HttpStatus.CREATED);
    }

    // Metodo para listar todos os estudantes

    @GetMapping
    public ResponseEntity<List<Estudante>> listarEstudantes() {
        List<Estudante> estudantes = Database.listarTodosEstudantes();

        if (estudantes.isEmpty()) {
            return ResponseEntity.noContent().build();
        }

        return ResponseEntity.ok(estudantes);
    }

    // Metodo para buscar um estudante pelo registro

    @GetMapping("/{Registro}")
    public ResponseEntity<Estudante> buscarEstudantePorRegistro(@PathVariable Integer Registro) {
        Estudante estudante = Database.recuperarEstudante(Registro);

        if (estudante == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(estudante);
    }

    // Metodo para deletar um estudante pelo registro
    @DeleteMapping("/{Registro}")
    public ResponseEntity<Void> deletarEstudante(@PathVariable Integer Registro) {
        Estudante estudante = Database.recuperarEstudante(Registro);

        if (estudante == null) {
            return ResponseEntity.notFound().build();
        }

        Database.remove(Registro);
        return ResponseEntity.noContent().build();
    }
}
