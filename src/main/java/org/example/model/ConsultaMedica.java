package org.example.model;

import java.time.LocalDate;

public class ConsultaMedica extends GenericModel {
    private String assinatura;
    private LocalDate dataConsulta;
    private Integer pacienteID;
    private  Integer medicoId;

    public ConsultaMedica (Integer id, String assinatura, LocalDate dataConsulta, Integer pacienteID, Integer medicoId) {
        super(id);
        this.assinatura = assinatura;
        this.dataConsulta = dataConsulta;
        this.pacienteID = pacienteID;
        this.medicoId = medicoId;
    }

    public String getAssinatura() {
        return assinatura;
    }

    public void setAssinatura(String assinatura) {
        this.assinatura = assinatura;
    }

    public LocalDate getDataConsulta() {
        return dataConsulta;
    }

    public void setDataConsulta(LocalDate dataConsulta) {
        this.dataConsulta = dataConsulta;
    }

    public Integer getPacienteId() {
        return pacienteID;
    }

    public void setPacienteId(Integer pacienteId) {
        this.pacienteID = pacienteId;
    }

    public Integer getMedicoId() {
        return medicoId;
    }

    public void setMedicoId(Integer medicoId) {
        this.medicoId = medicoId;
    }

    @Override
    public String toString() {
        return String.format("ConsultaMedica {assinatura='%s', dataConsulta='%s', pacienteId='%s', medicoId='%s'}",
                assinatura, dataConsulta, pacienteID, medicoId);
    }

}
