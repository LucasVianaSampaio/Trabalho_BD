package org.example.util;

import org.example.DAO.EspecialidadeMedicaDAO;
import org.example.model.EspecialidadeMedica;

import java.time.LocalDate;

public class EspecialidadeMedicaTeste {

    public static void main(String[] agrs){

        EspecialidadeMedicaDAO especialidadeMedicaDAO = new EspecialidadeMedicaDAO();

        //INSERT
        EspecialidadeMedica especialidadeMedica = new EspecialidadeMedica(1, "ObsTeste", LocalDate.now(), 1, 1);
        especialidadeMedicaDAO.insertEspecialidadeMedica(especialidadeMedica);

        //SELECT

        for(EspecialidadeMedica espm: especialidadeMedicaDAO.selectAllEspecialidadeMedica()) {
            System.out.println("Id: " +espm.getId());
            System.out.println("OBS" +espm.getObservacao());
            System.out.println("DATA: " +espm.getDtConclusao());
            System.out.println("EspecialidadeID: " +espm.getEspecialidadeID());
            System.out.println("MedicoID: " +espm.getMedicoID());
        }

        //UPDATE
        EspecialidadeMedica espm = new EspecialidadeMedica(1, "OBSTesteUPDATE", LocalDate.now(), 1, 1);
        especialidadeMedicaDAO.updateEspecialidadeMedica(espm);

        //DELETE
        //especialidadeMedicaDAO.deleteEspecialidadeMedica(1);
    }
 
}
