package br.com.alura.forum.repository;

import java.util.List;

import org.jboss.logging.Param;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import br.com.alura.forum.modelo.Topico;

public interface TopicoRepository extends JpaRepository<Topico, Long>{

	List<Topico> findByCurso_Nome(String nomeCurso);

//	Caso queria usar query
//	@Query("SELECT t FROM Topico t WHERE t.curso.nome = :nomeCurso")
//	List<Topico> carregaPorNomeDoCurso(@Param("nomeCurso") String nomeCurso);

	

}
