package org.exemple.DAL;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class FournisDAO extends AbstractDAO{

    /**
     * méthode qui permet de recupérer dans une liste tous le contenu de la table fournis
     * @return List<Fournis>
     */
    public List<Fournis> getAll(){

        List<Fournis> list = new ArrayList<>();
        try {
            PreparedStatement query = con.prepareStatement("SELECT * FROM fournis");
            ResultSet result = query.executeQuery();
            while (result.next()){
                int numfou = result.getInt("numfou");
                String nomfou = result.getString("nomfou");
                String ruefou = result.getString("ruefou");
                String posfou = result.getString("posfou");
                String vilfou = result.getString("vilfou");
                String confou = result.getString("confou");
                int satisf = result.getInt("satisf");
                Fournis fournis = new Fournis(numfou, nomfou, ruefou, posfou, vilfou, confou, satisf);
                list.add(fournis);
            }
            query.close();
        }catch (SQLException e){
            System.out.println("une erreur s'est produit");
            e.getMessage();
        }
        // On retourne une liste d'objet de Fournis
        return list;
    }


    /**
     * méthode qui permet de recupérer dans une liste tous le contenu de la table fournis avec le paramètre
     * @param numberFournis
     * @return List<Fournis>
     */
    public Fournis getAllByNumFou(int numberFournis){
        Fournis fournis = null;
        try {
            PreparedStatement stmt = con.prepareStatement("SELECT * FROM fournis WHERE numfou LIKE ?");
            stmt.setString(1,numberFournis + "%");
            ResultSet result = stmt.executeQuery();

            while(result.next()){
                int numfou = result.getInt("numfou");
                String nomfou = result.getString("nomfou");
                String ruefou = result.getString("ruefou");
                String posfou = result.getString("posfou");
                String vilfou = result.getString("vilfou");
                String confou = result.getString("confou");
                int satisf = result.getInt("satisf");
                fournis = new Fournis(numfou, nomfou, ruefou, posfou, vilfou, confou, satisf);

            }
        }catch (SQLException e){
            e.getMessage();
        }
        // On retourne un objet de type fournis
        return fournis;
    }

    public void addNewProvider(String nomfou, String ruefou, String posfou, String vilfou, String confou){
        try {
            PreparedStatement stmt = con.prepareStatement("INSERT INTO fournis (`nomfou`, `ruefou`, `posfou`, `vilfou`, `confou`) VALUES (?,?,?,?,?)");
            stmt.setString(1, nomfou);
            stmt.setString(2,ruefou);
            stmt.setString(3, posfou);
            stmt.setString(4, vilfou);
            stmt.setString(5, confou);
            stmt.executeUpdate();

        }catch (SQLException e){
            System.out.println("erreur dans la requête");
        }
    }

}
