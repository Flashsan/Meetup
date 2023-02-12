package org.example.utils;

public class ConstantData {

    public static final String SELECT_ALL_MEETUPS = "select * from meetup;";
    public static final String SELECT_BY_ID_MEETUP = "select *from meetup where id =?;";
    public static final String INSERT_MEETUP = "insert into meetup(id, name) values (?,?);";
    public static final String UPDATE_MEETUP = "update meetup set name = ? where id = ?;";
    public static final String DELETE_MEETUP = "delete from meetup where id = ?;";

}
