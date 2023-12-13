package org.example.util;

import java.time.LocalDate;

import org.example.DAO.PacienteDAO;
import org.example.model.Paciente;

public class PacienteTeste {

    public static void main(String[] args) {

        PacienteDAO pacienteDAO = new PacienteDAO();

        //INSERT
        Paciente paciente = new Paciente(1, "Lucas", "000000000", LocalDate.now());
        pacienteDAO.ins

        //SELECT
        for(Paciente pa: pacienteDAO.selectAllPaciente()) {
            System.out.println("Id: " +pa.getId());
            System.out.println("Nome: " +pa.getNome());
            System.out.println("DATA: " +pa.getDataNascimento());
        }

        //UPDATE
        Paciente pa = new Paciente(1, "Matheus", "1111111", LocalDate.now());
        pacienteDAO.updatePaciente(pa);

        //DELETE
        //pacienteDAO.deletePaciente(1);
    }
}
