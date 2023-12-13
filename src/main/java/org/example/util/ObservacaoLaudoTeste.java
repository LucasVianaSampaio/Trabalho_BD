package org.example.util;

import org.example.DAO.ObservacaoLaudoDAO;
import org.example.model.ObservacaoLaudo;

public class ObservacaoLaudoTeste {

    public static void main(String[] agrs) {
        ObservacaoLaudoDAO observacaoLaudoDAO = new ObservacaoLaudoDAO();

        //INSERT
        ObservacaoLaudo observacaoLaudo = new ObservacaoLaudo(1, "descricaoTESTE", 1);
        observacaoLaudoDAO.insertObservacaoLaudo(observacaoLaudo);

        //SELECT
        for(ObservacaoLaudo ol: observacaoLaudoDAO.selectAllObservacaoLaudo()) {
            System.out.println("Id: " +ol.getId());
            System.out.println("Descricao: " +ol.getDescricao());
            System.out.println("Receita: " +ol.getReceitaOculosId());
        }

        //UPDATE
        ObservacaoLaudo ol = new ObservacaoLaudo(1, "descricaoUPDATE", 1);
        observacaoLaudoDAO.updateObservacaoLaudo(ol);

        //DELETE
        observacaoLaudoDAO.deleteObservacaoLaudo(1);
    }
    
}
