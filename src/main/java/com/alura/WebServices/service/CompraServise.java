package com.alura.WebServices.service;

import com.alura.WebServices.dto.CompraDto;
import com.alura.WebServices.dto.InfoFornecedorDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class CompraServise {

    @Autowired
    private RestTemplate client;

    public void realizaCompra (CompraDto compraDto){

        ResponseEntity <InfoFornecedorDTO> exchange = client.exchange("http://fornecedor-api/info/"+compraDto.getEndereco().getEstado(),
                HttpMethod.GET,null, InfoFornecedorDTO.class);

        System.out.println(exchange.getBody().getEndereco());
    }
}
