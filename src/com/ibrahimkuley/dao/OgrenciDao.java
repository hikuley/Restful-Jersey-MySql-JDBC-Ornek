package com.ibrahimkuley.dao;

import com.ibrahimkuley.model.Ogrenci;
import com.mysql.jdbc.PreparedStatement;

import javax.servlet.ServletContext;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by halil on 15.08.2014.
 */
public class OgrenciDao {

    private static Connection connection;

    public static Connection getConnection(ServletContext context) {

        if (connection == null) {
            connection = (Connection) context.getAttribute("getConnection");
        }
        return connection;

    }

    public static List<Ogrenci> ogrenciList(ServletContext context) throws SQLException {
        Connection connection = getConnection(context); //Bağlantı nesnesi oluşturduk

        String sql = "select * from Ogrenci";
        PreparedStatement preparedStatement = (PreparedStatement) connection.prepareStatement(sql);
        ResultSet resultSet = preparedStatement.executeQuery();
        List<Ogrenci> ogrenciList = new ArrayList<Ogrenci>();

        while (resultSet.next()) {
            Ogrenci ogrenci = new Ogrenci();
            ogrenci.setId(Integer.parseInt(resultSet.getString("id")));
            ogrenci.setName(resultSet.getString("name"));
            ogrenci.setFirstName(resultSet.getString("firstName"));
            ogrenci.setGender(resultSet.getString("gender"));
            ogrenci.setLanguages(resultSet.getString("languages"));
            ogrenciList.add(ogrenci);
        }

        return ogrenciList;
    }


}
