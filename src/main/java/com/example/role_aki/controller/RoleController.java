package com.example.role_aki.controller;

import com.example.role_aki.dto.RoleDTO;
import com.example.role_aki.service.RoleService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/roles")
@RequiredArgsConstructor
public class RoleController {

    private final RoleService service;

    @PostMapping
    public RoleDTO criar(@RequestBody RoleDTO dto) {
        return service.criar(dto);
    }

    @PutMapping
    public RoleDTO atualizar(@RequestBody RoleDTO dto) {
        return service.atualizar(dto);
    }

    @GetMapping("/{id}")
    public RoleDTO buscarPorId(@PathVariable Long id) {
        return service.buscar(id);
    }

    @GetMapping
    public List<RoleDTO> buscarTodos() {
        return service.buscarTodos();
    }

}
