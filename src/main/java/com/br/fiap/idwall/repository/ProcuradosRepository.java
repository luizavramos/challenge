package com.br.fiap.idwall.repository;

import com.br.fiap.idwall.model.Procurados;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProcuradosRepository extends JpaRepository<Procurados, String>, JpaSpecificationExecutor<Procurados> {

    List<Procurados> findByNomeContaining(String parteDoNome);

}
