
package uf5.pkg6.projecte.basedades;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import uf5.pkg6.projecte.streamin.model.Compte;
import java.sql.ResultSet;


public class CompteDAO {
    
    public ArrayList<Compte> obtenirComptesModalitatBD(int id_modalitat){
    
    Connection con = (Connection) ConexioBDSingleton.getConnection();
    
    ArrayList<Compte> comptes = new ArrayList();
    
    String sentenciaSql = null;
    
    if (id_modalitat  ==  0) {
        sentenciaSql = "SELECT compte.id_compte, client.id_client, cl.Nom, client.DNI, compte.data_alta, compte.id_modalitat"
                + "FROM compte compte, clients cl WHERE "
                + "compte.id_client = client.id_client";

    } else {
        sentenciaSql = "SELECT compte.id_compte, client.id_client, cl.Nom, client.DNI, compte.data_alta, compte.id_modalitat"
                + "FROM compte compte, clients cl WHERE "
                + "compte.id_modalitat = ? and "
                + "compte.id_client = client.id_client";
    }
    
    try (java.sql.PreparedStatement ps = con.prepareStatement(sentenciaSql)){
        if (id_modalitat != 0)  ps.setInt(1, id_modalitat);
        ResultSet rs = ps.executeQuery();
            
        while (rs.next()){
            Compte c = new Compte();
            c.setIdCompte(rs.getInt("compte.id_compte"));
            c.setIdClient(rs.getInt("client.id_client"));
            c.setDni(rs.getString("client.DNI"));
            c.setDataAlta(rs.getDate("compte.data_alta"));
            c.setNomClient(rs.getString("client.Nom"));
            c.setIdModalitat(rs.getInt("compte.id_modalitat"));
            comptes.add(c);
        }
    }   catch (SQLException ex) {
            Logger.getLogger(CompteDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    return comptes;
}
}
