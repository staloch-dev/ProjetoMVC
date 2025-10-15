package com.listatarefas.projetomvc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.listatarefas.projetomvc.model.Tarefa;

@Repository
public interface TarefaRepository extends JpaRepository <Tarefa, Long> {

}
