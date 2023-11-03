package com.work.event.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.Date;
@Getter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
@Table(name = "event")
@Entity(name = "Event")
public class Event {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String title ;
    private String description;


    private Date data;

    private String local;
    private String maxpeople;

    private boolean enable;

    public Event(DadosEvento dados) {
        this.id = dados.id();
        this.title = dados.title();
        this.description = dados.description();
        this.data = dados.data();
        this.local = dados.local();
        this.maxpeople = dados.maxpeople();
    }

    public void updateEvent(AttEvent dados) {

        if(dados.description() != null){
            this.description = dados.description();
        }
        if(dados.data() != null){
            this.data = dados.data();
        }
        if(dados.local() !=null){
            this.local = dados.local();
        }
        if(dados.maxpeople() != null){
            this.local = dados.local();
        }

    }

    public void desabilitar() {
        this.enable = false;
    }
}
