package com.example.role_aki.dto;

import lombok.*;

import java.time.LocalDateTime;

@ToString
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class LocalDTO {

    private Long id;

    private String endereco;

    private String regiao;

    private LocalDateTime horaAbertura;

    private LocalDateTime horaFechamento;

}
