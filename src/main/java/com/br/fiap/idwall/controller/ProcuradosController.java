package com.br.fiap.idwall.controller;

import com.br.fiap.idwall.service.ProcuradosService;
import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping(value ="/procurados")
public class ProcuradosController {

    private final ProcuradosService service;

    @GetMapping()
    public List<String> buscaUrl(
            @RequestParam("parteDoNome") String parteDoNome){
        return service.buscarUrlPorParteDoNome(parteDoNome);
    }
}
