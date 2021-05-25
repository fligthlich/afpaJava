package org.exemple.DAL;

import com.mysql.cj.jdbc.ConnectionImpl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

abstract class AbstractDAO {

    private final String URL = "jdbc:mysql://localhost:3306/papyrus";
    private final String USER = "root";
    private final String PASSWORD = "root";
    protected Connection con = null;

    public AbstractDAO() {
        try{
            this.con = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("Démarrage de la bdd");

        }catch (SQLException e){
            e.getMessage();
        }
    }

//    protected Connection getCon(){
//        try{
//            this.con = DriverManager.getConnection(URL, USER, PASSWORD);
//            System.out.println("Démarrage de la bdd");
//
//        }catch (SQLException e){
//            e.getMessage();
//        }
//
//        return this.con;
//    }
}
