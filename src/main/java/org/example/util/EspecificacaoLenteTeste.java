package org.example.util;

import org.example.DAO.EspecificacaoLenteDAO;
import org.example.model.EspecificacaoLente;

public class EspecificacaoLenteTeste {

    public static void main(String[] agrs) {

        EspecificacaoLenteDAO especificacaoLenteDAO = new EspecificacaoLenteDAO();

        //INSERT
        EspecificacaoLente especificacaoLente = new EspecificacaoLente(1, 12.50f, 1, 1);
        especificacaoLenteDAO.insertEspecificacaoLente(especificacaoLente);

        //SELECT

        for(EspecificacaoLente el: especificacaoLenteDAO.selectAllEspecificacaoLente()) {
            System.out.println("Id: " +el.getId());
            System.out.println("Valor: " +el.getValor());
            System.out.println("EstruturaID: " +el.getEstruturaLenteId());
            System.out.println("Atributo: " +el.getEstruturaLenteId());
        }

        //UPDATE
        EspecificacaoLente el = new EspecificacaoLente(1, 13.45f, 1, 1);
        especificacaoLenteDAO.updateEspecificacaoLente(el);

        //DELETE
        especificacaoLenteDAO.updateEspecificacaoLente(el);
    }
    
}
