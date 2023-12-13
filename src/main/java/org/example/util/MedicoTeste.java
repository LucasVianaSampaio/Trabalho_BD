package org.example.util;

import org.example.model.Medico;
import org.example.DAO.MedicoDAO;

public class MedicoTeste {

    public static void main(String[] args){

        MedicoDAO medicoDao = new MedicoDAO();

        //INSERT MEDICO
        Medico medico = new Medico(1, "Matheus", "CRM/SP 123456");

        medicoDao.insertMedico(medico);

        //SELECT ALL MEDICOS
        for(Medico mdc: medicoDao.selectAllMedico()) {
            System.out.println("Id: " +mdc.getId());
            System.out.println("Nome" +mdc.getNome());
            System.out.println("Crm: " +mdc.getCrm());
        }

        //UPDATE MEDICOS
        Medico mdc = new Medico(1, "Lucas", "CRMUpdate");
        medicoDao.updateMedico(mdc);

        //DELETE MEDICO
        //medicoDao.deleteMedico(1);


    }
    
}
