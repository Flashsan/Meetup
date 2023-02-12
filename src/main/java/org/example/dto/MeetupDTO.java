package org.example.dto;

import org.example.entity.Meetup;

public class MeetupDTO {

    Integer id;
    String name;

    public MeetupDTO() {

    }

    public MeetupDTO(Meetup entity) {
        this.id = entity.getId();
        this.name = entity.getName();
    }

    public Meetup toEntity() {
        Meetup entity = new Meetup();

        entity.setId(this.id);
        entity.setName(this.name);

        return entity;
    }


}

