package com.alura.WebServices.controller;

import com.alura.WebServices.dto.CompraDto;
import com.alura.WebServices.service.CompraServise;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/compra")
public class CompraController {

    @Autowired
    private CompraServise compraServise;


    @PostMapping
    public void  realizaCompra(@RequestBody CompraDto compraDto){
        compraServise.realizaCompra(compraDto);
    }
}
