package org.example.util;

import org.example.model.Especialidade;
import org.example.DAO.EspecialidadeDAO;

public class EspecialidadeTeste {

    public static void main(String[] args) {
        EspecialidadeDAO especialidadeDAO = new EspecialidadeDAO();

        //INSERT ESPECIALIDADES
        Especialidade especialidade = new Especialidade(1, "Concentra-se na correção de problemas de visão, como miopia, hipermetropia, astigmatismo e presbiopia, muitas vezes utilizando procedimentos cirúrgicos, como LASIK", "Conselho Brasileiro de Oftalmologia (CBO)");

        especialidadeDAO.insertEspecialidade(especialidade);

        //SELECT ALL ESPECIALIDADES

        for(Especialidade esp: especialidadeDAO.selectAllEspecialidades()){
            System.out.println("Id: " +esp.getId());
            System.out.println("Descricao: " +esp.getDescricao());
            System.out.println("Conselho: "+esp.getConselho());
        }

        //UPDATE ESPECIALIDADES
        Especialidade esp = new Especialidade(1, "Descrição update teste", "Conselho update teste");
        especialidadeDAO.updateEspecialidade(esp);

        //DELETE ESPECIALIDADE
        //especialidadeDAO.deleteEspecialidade(1);
    }
    
}
