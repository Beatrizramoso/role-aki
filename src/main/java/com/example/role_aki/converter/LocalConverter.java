package com.example.role_aki.converter;

import com.example.role_aki.dto.LocalDTO;
import com.example.role_aki.model.Local;

public class LocalConverter {

    public static Local toModel(LocalDTO dto) {
        return Local.builder()
                .id(dto.getId())
                .endereco(dto.getEndereco())
                .regiao(dto.getRegiao())
                .horaAbertura(dto.getHoraAbertura())
                .horaFechamento(dto.getHoraFechamento())
                .build();
    }

    public static LocalDTO toDTO(Local model) {
        LocalDTO dto = new LocalDTO();

        dto.setId(model.getId());
        dto.setEndereco(model.getEndereco());
        dto.setRegiao(model.getRegiao());
        dto.setHoraAbertura(model.getHoraAbertura());
        dto.setHoraFechamento(model.getHoraFechamento());

        return dto;
    }

}
