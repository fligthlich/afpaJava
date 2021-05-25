package org.exemple.DAL;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProduitDAO extends AbstractDAO{

    private final String SELECT_ALL = "SELECT * FROM produit";


    public List<Produit> getAll(){

        List<Produit> list = new ArrayList<>();
        try {
            PreparedStatement query = con.prepareStatement(SELECT_ALL);
            ResultSet result = query.executeQuery();
            while (result.next()){
                String codart = result.getString("codart");
                String libart = result.getString("libart");
                int stkale = result.getInt("stkale");
                int stkphy = result.getInt("stkphy");
                int qteann  = result.getInt("qteann");
                String unimes = result.getString("unimes");
                Produit produit = new Produit(codart,libart,stkale,stkphy,qteann,unimes);
                list.add(produit);
            }
            query.close();
        }catch (SQLException e){
            System.out.println("une erreur s'est produit");
            e.getMessage();
        }
        return list;
    }
}
