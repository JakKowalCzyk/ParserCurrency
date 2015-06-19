package com.pars.base;

import java.sql.*;
import java.util.Calendar;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
/**
 * Created by DK on 2015-06-18.
 */
public class MainBase {
    public MainBase() {
        try {
            Class.forName(MainBase.DRIVER);
        }
        catch (ClassNotFoundException e){
            e.printStackTrace();
        }
        try {
            connection = DriverManager.getConnection(DB_URL);
            statement = connection.createStatement();
        }
        catch (SQLException e){
            e.printStackTrace();
        }
        createTables();
    }
    public boolean createTables(){
        String createEUR = "CREATE TABLE IF NOT EXISTS eur (id_eur INTEGER PRIMARY KEY, date DATE, value DOUBLE )";
        try {
            statement.execute(createEUR);
        }
        catch (SQLException e){
            e.printStackTrace();
            return false;
        }
        return true;
    }
    public boolean insertEUR(Double value, Date date) {
        try {
            java.sql.Date sqlDate = new java.sql.Date(date.getTime());
            connection.setAutoCommit(true);
            String sql = "insert into eur values(null,?,?)";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setDate(1, sqlDate);
            preparedStatement.setDouble(2, value);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }
    public List<EURbase> selectEUR() {
        List<EURbase> euRbases = new LinkedList<>();
        try {
            ResultSet resultSet = statement.executeQuery("SELECT * FROM eur");
            int id;
            Double value;
            Date date;
            while (resultSet.next()) {
                id = resultSet.getInt("id_eur");
                date = resultSet.getDate("date");
                value = resultSet.getDouble("value");
                euRbases.add(new EURbase(id, value, date));
            }
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
        return euRbases;
    }
     public boolean isExists() {
        try {
            ResultSet resultSet = connection.createStatement().executeQuery("SELECT * FROM eur");
            int id = resultSet.getInt("id_eur");
            return true;
        } catch (SQLException e) {
            return false;
        }
    }
    public Date getDate(){
        try {
            ResultSet resultSet = connection.createStatement().executeQuery("SELECT * FROM eur WHERE id_eur=(SELECT max(id_eur) FROM EUR)");
            sthDate = resultSet.getDate("date");
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("ehe");
        }
        return sthDate;
    }
    public void closeConnection(){
        try {
            connection.close();
        } catch (SQLException e) {
        }
    }

    private static final String DRIVER = "org.sqlite.JDBC";
    private static final String DB_URL = "jdbc:sqlite:courses.db";
    private Connection connection;
    private Statement statement;
    private Date sthDate;
}
