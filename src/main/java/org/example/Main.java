package org.example;

import java.sql.Date;
import java.util.List;

import org.example.DAO.EspecialidadeDAO;
import org.example.DAO.EspecialidadeMedicaDAO;
import org.example.DAO.MedicoDAO;
import org.example.model.Especialidade;
import org.example.model.EspecialidadeMedica;
import org.example.model.Medico;

public class Main {
    public static void main(String[] args) {
        EspecialidadeDAO especialidadeDAO = new EspecialidadeDAO();

        //INSERT ESPECIALIDADES
        Especialidade especialidade = new Especialidade(1, "Concentra-se na correção de problemas de visão, como miopia, hipermetropia, astigmatismo e presbiopia, muitas vezes utilizando procedimentos cirúrgicos, como LASIK", "Conselho Brasileiro de Oftalmologia (CBO)");

        especialidadeDAO.insertEspecialidade(especialidade);

        //SELECT ALL ESPECIALIDADES

        for(Especialidade esp: especialidadeDAO.selectAllEspecialidades()){
            System.out.println("Id: " +esp.getId());
            System.out.println("Descreicao: " +esp.getDescricao());
            System.out.println("Conselho: "+esp.getConselho());
        }

        //UPDATE ESPECIALIDADES
        Especialidade esp = new Especialidade(2, "Descrição", "Conselho update teste");
        especialidadeDAO.updateEspecialidade(esp);
        
    }
}
