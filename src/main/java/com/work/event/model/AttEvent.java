package com.work.event.model;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public record AttEvent(long id, String description, @JsonFormat(pattern = "dd/mm/yyyy") Date data, String local, String maxpeople) {

    public AttEvent(Event event){
        this(event.getId(), event.getDescription(),event.getData(), event.getLocal(), event.getMaxpeople());
    }
}
