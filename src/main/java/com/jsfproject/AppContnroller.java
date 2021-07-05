package com.jsfproject;

import lombok.Getter;
import lombok.Setter;
import lombok.SneakyThrows;
import org.hibernate.Session;

import javax.faces.view.ViewScoped;
import javax.inject.Named;
import javax.persistence.Query;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Named("appController")
@ViewScoped
public class AppContnroller implements Serializable {

    @Getter
    List<TaskBean> taskBeanList;
    @Getter @Setter
    TaskBean task;

    @Getter
    List<String> responsaveis = List.of("Select", "João", "Antonio");
    @Getter
    List<String> situacoes = List.of("Select", "Em Andamento", "Concluída");
    @Getter
    List<String> prioridades = List.of("Select", "Baixa", "Média","Alta");

    public AppContnroller() {
        this.task = TaskBean.builder().build();

        this.taskBeanList = new ArrayList<>();

        this.taskBeanList.add(TaskBean.builder().id(1L).descricao("desc 1").titulo("Tarefa 1").responsavel("João").build());
        this.taskBeanList.add(TaskBean.builder().id(2L).descricao("desc 2").titulo("Tarefa 2").responsavel("Antonio").build());
        this.taskBeanList.add(TaskBean.builder().id(3L).descricao("desc 3").titulo("Tarefa 3").responsavel("João").build());
    }

    @SneakyThrows
    public void cadastrar() {
        System.out.println("Cadastrar -----------------------" + this.task);

//        this.save();;

        this.taskBeanList.add(this.task);
        this.task = TaskBean.builder().build();
    }

    @SneakyThrows
    private void save() {
        Session session = HibernateUtil.getSessionFactory().openSession();

        session.beginTransaction();
        session.save(this.task);
        session.getTransaction().commit();

        System.out.println("Saved -----------------------" + this.task);

        Query q = session.createQuery("From Tarefa ");

        List<TaskBean> resultList = q.getResultList();
        System.out.println("num of task:" + resultList.size());
        for (TaskBean next : resultList) {
            System.out.println("next employee: " + next);
        }
    }
    public void editar(TaskBean tarefa) {

        System.out.println("editar -----------------------" + tarefa);
    }

    public void excluir() {

    }

    public void concluir() {

    }

    public List<TaskBean> buscarTarefas() {
        return taskBeanList;
    }

}

