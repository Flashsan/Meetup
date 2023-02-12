package org.example.dao.impl;

import org.example.dao.MeetupDAO;
import org.example.entity.Meetup;
import org.example.utils.GetConnection;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import static org.example.utils.ConstantData.*;

public class MeetupDAOImpl implements MeetupDAO {

    @Override
    public List<Meetup> getAll() throws SQLException {
        GetConnection getConnection = new GetConnection();
        List<Meetup> meetups = new ArrayList<>();
        try (Connection connection = getConnection.getConnection_With_DB_PostgreSQL();) {
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery(SELECT_ALL_MEETUPS);
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                meetups.add(new Meetup(id, name));
                System.out.println("\n_______________");
                System.out.println("id:" + id);
                System.out.println("name: " + name);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return meetups;
    }

    @Override
    public boolean save(Meetup meetup) throws SQLException {
        GetConnection getConnection = new GetConnection();
        boolean flag = false;
        try (Connection connection = getConnection.getConnection_With_DB_PostgreSQL();
             PreparedStatement preparedStatement = connection.prepareStatement(INSERT_MEETUP);) {
            preparedStatement.setInt(1, meetup.getId());
            preparedStatement.setString(2, meetup.getName());
            preparedStatement.executeUpdate();
            flag = true;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return flag;
    }

    @Override
    public void update(Meetup meetup) throws SQLException {
        GetConnection getConnection = new GetConnection();
        try (Connection connection = getConnection.getConnection_With_DB_PostgreSQL();) {
            PreparedStatement preparedStatement = connection.prepareStatement(UPDATE_MEETUP);
            preparedStatement.setString(1, meetup.getName());
            preparedStatement.setInt(1, meetup.getId());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public int delete(Meetup meetup) throws SQLException {
        GetConnection getConnection = new GetConnection();
        try (Connection connection = getConnection.getConnection_With_DB_PostgreSQL();
             PreparedStatement preparedStatement = connection.prepareStatement(DELETE_MEETUP);) {
            preparedStatement.setInt(1, meetup.getId());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return 0;
    }

    @Override
    public void getById(int idMeetup) throws SQLException {
        GetConnection getConnection = new GetConnection();
        try (Connection connection = getConnection.getConnection_With_DB_PostgreSQL();
             PreparedStatement preparedStatement = connection.prepareStatement(SELECT_BY_ID_MEETUP)) {
            preparedStatement.setInt(1, idMeetup);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                System.out.println("\n_______________");
                System.out.println("id:" + id);
                System.out.println("name: " + name);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}