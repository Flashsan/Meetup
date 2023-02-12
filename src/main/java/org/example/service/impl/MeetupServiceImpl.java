package org.example.service.impl;

import org.example.dao.impl.MeetupDAOImpl;
import org.example.entity.Meetup;
import org.example.service.MeetupService;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MeetupServiceImpl implements MeetupService {

    @Override
    public List<Meetup> getAllMeetup() throws SQLException {
        MeetupDAOImpl meetupDAO = new MeetupDAOImpl();
        return meetupDAO.getAll()
                .stream().collect(Collectors.toList());
    }

    @Override
    public void insertMeetup(Meetup meetup) {

    }

    @Override
    public void updateMeetup(Meetup meetup) {

    }

    @Override
    public void deleteMeetup(int id) {

    }
}
