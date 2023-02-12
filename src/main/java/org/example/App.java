package org.example;

import org.example.dao.impl.MeetupDAOImpl;
import org.example.entity.Meetup;
import org.example.utils.GetConnection;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.ResourceBundle;

import static org.example.utils.ConstantData.SELECT_ALL_MEETUPS;

public class App {


    public static void main(String[] args) throws SQLException {


        GetConnection getConnection = new GetConnection();
        getConnection.getConnection_With_DB_PostgreSQL();


        try (Connection connection = getConnection.getConnection_With_DB_PostgreSQL();) {
            Statement statement = connection.createStatement();
            ResultSet resultSets = statement.executeQuery(SELECT_ALL_MEETUPS);
            while (resultSets.next()) {
                int id = resultSets.getInt("id");
                String name = resultSets.getString("name");
                // meetups.add(new Meetup(id, name));
                System.out.println("\n_______________");
                System.out.println("id:" + id);
                System.out.println("name: " + name);
            }


 //       MeetupDAOImpl meetupDAO = new MeetupDAOImpl();



//meetupDAO.save(new Meetup(3,"Rust developer"));
  //   meetupDAO.getById(3);
//        meetupDAO.getAll();
//    meetupDAO.delete(new Meetup);
        }
    }}
//}