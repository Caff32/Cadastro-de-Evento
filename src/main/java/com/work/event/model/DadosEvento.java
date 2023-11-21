package com.work.event.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.validation.constraints.NotBlank;

import java.util.Date;

public record DadosEvento(long id, @NotBlank String title, String description, @JsonFormat(pattern = "dd/mm/yyyy") Date data, String local, String maxpeople) {

    public DadosEvento(Event event){
        this(event.getId(), event.getTitle(), event.getDescription(),event.getData(), event.getLocal(), event.getMaxpeople());
    }

}
