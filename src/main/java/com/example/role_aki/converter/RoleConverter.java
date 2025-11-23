package com.example.role_aki.converter;

import com.example.role_aki.dto.RoleDTO;
import com.example.role_aki.model.Role;

public class RoleConverter {

    public static Role toModel(RoleDTO dto) {
        return Role.builder()
                .id(dto.getId())
                .tipo(dto.getTipo())
                .nome(dto.getNome())
                .isGratuito(dto.isGratuito())
                .locais(dto.getLocais()
                        .stream()
                        .map(LocalConverter::toModel)
                        .toList())
                .build();
    }

    public static RoleDTO toDTO(Role model) {
        RoleDTO dto = new RoleDTO();

        dto.setId(model.getId());
        dto.setTipo(model.getTipo());
        dto.setNome(model.getNome());
        dto.setGratuito(model.isGratuito());
        dto.setLocais(model.getLocais()
                .stream()
                .map(LocalConverter::toDTO)
                .toList());

        return dto;
    }

}
