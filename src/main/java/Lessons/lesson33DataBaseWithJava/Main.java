package Lessons.lesson33DataBaseWithJava;

import Lessons.lesson33DataBaseWithJava.model.Telephone;

import java.sql.*;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        //Подгрузить драйвер
        Class.forName("org.postgresql.Driver");
        //получить соединение
        Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/create_db", "postgres", "root");

        //создать statement обычный
        /* Statement statement = connection.createStatement(); */

//        // сложный statement
//        PreparedStatement statement =  connection.prepareStatement("SELECT * FROM telephone where id>?");
//        statement.setInt(1,1);
//        ResultSet resultSet = statement.executeQuery();
//        ArrayList<Telephone> listPhones = new ArrayList<Telephone>();
//
//
//
//        //Запрашиваем ответ
//        while (resultSet.next()){
//            Telephone telephone = new Telephone();
//            telephone.setId(resultSet.getInt("id"));
//            telephone.setModel(resultSet.getString("model"));
//            telephone.setColor(resultSet.getString("color"));
//            listPhones.add(telephone);
//
//        }
//        System.out.println(listPhones);
        String query = "INSERT INTO telephone (model,color) VALUES (?,?);";

        PreparedStatement statement =  connection.prepareStatement(query);
        statement.setString(1,"horidddxont");
        statement.setString(2,"bladddck");
        int resultSet = statement.executeUpdate();

        System.out.println(resultSet);
        connection.close();

    }
}

