package com.br.fiap.idwall.service;


import com.br.fiap.idwall.model.Procurados;
import com.br.fiap.idwall.repository.ProcuradosRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

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

}
