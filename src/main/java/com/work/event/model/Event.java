package com.work.event.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.Date;
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Event {

    private long id;
    private String title ;
    private String description;
    private Date date;
    private String local;
    private String maxpeople;
}
