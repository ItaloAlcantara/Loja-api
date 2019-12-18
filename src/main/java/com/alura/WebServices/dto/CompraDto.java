package com.alura.WebServices.dto;

import lombok.*;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class CompraDto {

    private List<ItemDaCompraDTO> itens;
    private EnderecoDTO endereco;
}
