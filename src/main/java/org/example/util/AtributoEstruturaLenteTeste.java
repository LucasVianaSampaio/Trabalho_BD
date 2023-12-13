package org.example.util;

import org.example.DAO.AtributoEstruturaLenteDAO;
import org.example.model.AtributoEstruturaLente;

public class AtributoEstruturaLenteTeste {

    public static void main(String[] args){
        AtributoEstruturaLenteDAO atributoEstruturaLenteDAO = new AtributoEstruturaLenteDAO();

        //INSERT 
        AtributoEstruturaLente atributoEstruturaLente = new AtributoEstruturaLente(1, "descricao", "lado_olho");

        atributoEstruturaLenteDAO.insertAtributoEstruturaLente(atributoEstruturaLente);

        //SELECT ALL
        for(AtributoEstruturaLente atr: atributoEstruturaLenteDAO.selectAllAtributoEstruturaLente()) {
            System.out.println("Id: " +atr.getId());
            System.out.println("Descricao" +atr.getDescricao());
            System.out.println("LadoOlho: " +atr.getLadoOlho());
        }
        
        //UPDATE
        AtributoEstruturaLente atr = new AtributoEstruturaLente(1, "DescricaoUPDATE", "ladoOlhoUPDATE");
        atributoEstruturaLenteDAO.updateAtributoEstruturaLente(atr);

        //DELETE
        //atributoEstruturaLenteDAO.deleteAtributoEstruturaLente(1);

        //DELETE
        //atributoEstruturaLenteDAO.deleteAtributoEstruturaLente(1);
    }
    
}
