package org.example.util;

import org.example.DAO.ConsultaMedicaDAO;
import org.example.model.ConsultaMedica;

import java.time.LocalDate;

public class ConsultaMedicaTeste {

    public static void main(String[] args){

        ConsultaMedicaDAO consultaMedicaDAO = new ConsultaMedicaDAO();

        //INSERT CONSULTA
        ConsultaMedica consultaMedica = new ConsultaMedica(1, "AssinaturaTEste", LocalDate.now(), 1, 1);
        consultaMedicaDAO.insertConsultaMedica(consultaMedica);

        //SELECT ALL
        for(ConsultaMedica cm: consultaMedicaDAO.selectAllConsultaMedica()) {
            System.out.println("Id: " +cm.getId());
            System.out.println("Assinatura: " +cm.getAssinatura());
            System.out.println("Data: " +cm.getDataConsulta());
            System.out.println("PacienteID: " +cm.getPacienteId());
            System.out.println("MedicoID: " +cm.getMedicoId());
        }

        //UPDATE
        ConsultaMedica cm = new ConsultaMedica(1, "AssinaturaUPDATE", LocalDate.now(), 1, 1);
        consultaMedicaDAO.updateConsultaMedica(cm);

        //DELETE
        //consultaMedicaDAO.deleteConsultaMedica(1);
    }
    
}
