package com.example.role_aki.dto;

import lombok.*;

import java.util.List;

@ToString
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class RoleDTO {

    private Long id;

    private String tipo;

    private String nome;

    private boolean isGratuito;

    private List<LocalDTO> locais;

}
