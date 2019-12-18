package com.alura.WebServices.dto;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class EnderecoDTO {
    private String rua;
    private String numero;
    private String estado;
}
