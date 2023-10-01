package com.br.fiap.idwall.service;


import com.br.fiap.idwall.domain.ProcuradosDTO;
import com.br.fiap.idwall.model.Procurados;
import com.br.fiap.idwall.repository.ProcuradosRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@AllArgsConstructor
@Service
public class ProcuradosService {

    private final ProcuradosRepository repository;

    public List<String> buscarUrlPorParteDoNome(String parteDoNome) {
        List<Procurados> resultados = repository.findByNomeContaining(parteDoNome);
        return resultados.stream()
                .map(Procurados::getUrl)
                .toList();
    }

    public List<Procurados> buscarPorParteDoNome(String parteDoNome) {
        List<Procurados> resultados = repository.findByNomeContaining(parteDoNome);
        return resultados;
    }

    public List<ProcuradosDTO> buscarNomeEUrlPorParteDoNome(String parteDoNome) {
        List<Procurados> resultados = repository.findByNomeContaining(parteDoNome);
        return resultados.stream()
                .map(procurado -> {
                    ProcuradosDTO dto = new ProcuradosDTO();
                    dto.setNome(procurado.getNome());
                    dto.setUrl(procurado.getUrl());
                    return dto;
                })
                .collect(Collectors.toList());
    }

}
