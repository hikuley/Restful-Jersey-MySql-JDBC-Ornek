package com.ibrahimkuley.db;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Created by halil on 15.08.2014.
 */
public class DbConnector implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent) {

        ServletContext context = servletContextEvent.getServletContext();

        String url = context.getInitParameter("url");
        String username = context.getInitParameter("username");
        String password = context.getInitParameter("password");

        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        Connection connection = createConnection(url, username, password);
        context.setAttribute("getConnection", connection);

        System.out.println(" # # # Veri tabanı bağlantısı oluşturuldu. # # #");
    }

    public Connection createConnection(String url, String username, String password) {
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(url, username, password);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }


    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {
        System.out.println(" # # # Connection Destroyed # # #");
    }
}
