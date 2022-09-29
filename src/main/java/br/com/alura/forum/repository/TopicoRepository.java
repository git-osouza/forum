package br.com.alura.forum.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.alura.forum.modelo.Topico;

public interface TopicoRepository extends JpaRepository<Topico, Long>{

	/**
	 * Retorna lista de cursos filtrado pelo nome do curso
	 * @param nomeCurso
	 * @return
	 */
	List<Topico> findByCursoNome(String nomeCurso);

}
