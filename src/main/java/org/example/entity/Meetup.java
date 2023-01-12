package org.example.entity;

import java.io.Serializable;

public class Meetup implements Serializable {

    int id;
    String topic;
    String organization;
    String dateAndTime;
    String location;

    public Meetup() {

    }
    public Meetup(int id, String topic, String organization, String dateAndTime, String location) {
        this.id = id;
        this.topic = topic;
        this.organization = organization;
        this.dateAndTime = dateAndTime;
        this.location = location;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public String getOrganization() {
        return organization;
    }

    public void setOrganization(String organization) {
        this.organization = organization;
    }

    public String getDateAndTime() {
        return dateAndTime;
    }

    public void setDateAndTime(String dateAndTime) {
        this.dateAndTime = dateAndTime;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
