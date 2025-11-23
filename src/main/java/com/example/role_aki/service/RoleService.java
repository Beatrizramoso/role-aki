package com.example.role_aki.service;

import com.example.role_aki.converter.RoleConverter;
import com.example.role_aki.dto.RoleDTO;
import com.example.role_aki.exception.BadRequestException;
import com.example.role_aki.repository.RoleRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class RoleService {

    private final RoleRepository repository;

    public RoleDTO criar(RoleDTO roleDTO) {
        if (roleDTO.getId() != null) {
            throw new BadRequestException("Atributo inválido: id");
        }

        return RoleConverter.toDTO(repository.save(RoleConverter.toModel(roleDTO)));
    }

    public RoleDTO atualizar(RoleDTO roleDTO) {
        if (repository.findById(roleDTO.getId()).isEmpty()) {
            throw new BadRequestException("Role não encontrado");
        }

        return RoleConverter.toDTO(repository.save(RoleConverter.toModel(roleDTO)));
    }

    public RoleDTO buscar(Long id) {
        return RoleConverter.toDTO(repository.findById(id)
                .orElseThrow(() -> new BadRequestException("Role não encontrada")));
    }

    public List<RoleDTO> buscarTodos() {
        return repository.findAll()
                .stream()
                .map(RoleConverter::toDTO)
                .collect(Collectors.toList());
    }

}
