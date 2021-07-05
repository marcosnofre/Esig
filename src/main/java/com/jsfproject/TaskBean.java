package com.jsfproject;


import lombok.Builder;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Builder

@Entity
@Table(name = "tarefa")
public class TaskBean {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String titulo;
    String prioridade;
    String descricao;
    String responsavel;
    String deadLine;
    String situacao;


}
