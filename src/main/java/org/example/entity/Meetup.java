package org.example.entity;

import javax.persistence.Entity;
import java.io.Closeable;
import java.io.IOException;
import java.io.Serializable;
import java.util.Objects;

//@Entity
public class Meetup implements Serializable
//        , Closeable
{

    int id;
    String name;

    public Meetup() {

    }

    public Meetup(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Meetup meetup = (Meetup) o;
        return id == meetup.id && Objects.equals(name, meetup.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    //    @Override
//    public void close() throws IOException {
//
//    }
}
