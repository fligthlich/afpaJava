package org.exemple.DAL;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

public class EntcomDAO extends AbstractDAO{

    public List<Entcom> getAll(){

        List<Entcom> list = new ArrayList<>();
        try {
            PreparedStatement query = con.prepareStatement("SELECT * FROM entcom");
            ResultSet result = query.executeQuery();
            while (result.next()){
                int numcom = result.getInt("numcom");
                String obscom = result.getString("obscom");
                Timestamp datcom = result.getTimestamp("datcom");
                Entcom entcom= new Entcom(numcom, obscom, datcom);
                list.add(entcom);
            }
            query.close();
        }catch (SQLException e){
            System.out.println("une erreur s'est produit");
            e.getMessage();
        }
        return list;
    }


    public List<Entcom> findCommandByFournis(String nameFou){
        Entcom entcom = null;
        List<Entcom> listCommande = new ArrayList<>();
        try {
            PreparedStatement stmt = con.prepareStatement("" +
                    "SELECT numcom, datcom, obscom FROM fournis " +
                    "INNER JOIN entcom " +
                    "ON entcom.numfou = fournis.numfou WHERE fournis.nomfou = ?");
            stmt.setString(1, nameFou);
            ResultSet result = stmt.executeQuery();
            while (result.next()) {
                int numcom = result.getInt("numcom");
                String obscom = result.getString("obscom");
                Timestamp datcom = result.getTimestamp("datcom");
                entcom = new Entcom(numcom, obscom, datcom);
                listCommande.add(entcom);
            }
        }catch(SQLException e){

        }

        return listCommande;
    }
}
