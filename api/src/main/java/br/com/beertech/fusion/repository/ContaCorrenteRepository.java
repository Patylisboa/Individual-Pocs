package br.com.beertech.fusion.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import br.com.beertech.fusion.domain.ContaCorrente;
import br.com.beertech.fusion.domain.Operacao;

public interface ContaCorrenteRepository extends JpaRepository<ContaCorrente, Long> {

    Optional<ContaCorrente> findByUuid(String uuid);

    @Query("select op from Operacao op inner join op.contaCorrente cc where cc.uuid = :uuid")
    List<Operacao> listOperacoesByContaCorrente(@Param("uuid") String uuid);
}
