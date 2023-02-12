package org.example.service;

import org.example.entity.Meetup;

import java.sql.SQLException;
import java.util.List;

public interface MeetupService {

    public List<Meetup> getAllMeetup() throws SQLException;

    public void insertMeetup(Meetup meetup);
    public void updateMeetup(Meetup meetup);
    public void deleteMeetup(int id);


}
