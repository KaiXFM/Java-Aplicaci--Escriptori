
package uf5.pkg6.projecte.basedades;

import uf5.pkg6.projecte.streamin.model.Pelicula;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PeliculaDAO {
    
    public Pelicula consultaPeliculaBD(int id){
        Connection con = ConexioBDSingleton.getConnection();
        
        Pelicula p = null;
        
        String senteciaSql = " SELECT durada FROM pel·licules WHERE id_produccio = ? ";
        
        try( PreparedStatement ps = con.prepareStatement(senteciaSql)){
                
                ps.setInt(1, id);
                ResultSet rs = ps.executeQuery();
                if (rs.next()) {
                    p = dadesBDPelicula(id,rs.getDouble("durada"));
                }

    
    }   catch (SQLException ex) {
            Logger.getLogger(PeliculaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return p;
}

    private Pelicula dadesBDPelicula(int id, double durada) {
        Pelicula p = new Pelicula();
        
        p.setDurada(durada);
        
        p.afegirCategoria(obtenirCategoria(id));
        p.afegirDirector(obtenirDirector(id));
        p.afegirActor(obtenirActor(id));
        
        return p;
    }


    private String obtenirDirector(int idProduccio){
    
        Connection con = ConexioBDSingleton.getConnection();
        
        String director = " ";
        
        String senteciaSql = "SELECT d.nom_director FROM dirigeix_pelicula dp, director d"
                + "WHERE dp.id_director = ? AND dp.id_director = d.id_director";
        
        try( PreparedStatement ps = con.prepareStatement(senteciaSql)){
                
                ps.setInt(1, idProduccio);
                ResultSet rs = ps.executeQuery();
                if (rs.next()) {
                    return rs.getString("nom_director");
                }
    }   catch (SQLException ex) {
            Logger.getLogger(PeliculaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    return director;

}
    
    private String obtenirCategoria(int idProduccio){
    
        Connection con = ConexioBDSingleton.getConnection();
        
        String director = " ";
        
        String senteciaSql = "SELECT d.nom FROM genere dp, categoria d"
                + "WHERE dp.id_categoria = ? AND dp.id_categoria = d.id_categoria";
        
        try( PreparedStatement ps = con.prepareStatement(senteciaSql)){
                
                ps.setInt(1, idProduccio);
                ResultSet rs = ps.executeQuery();
                if (rs.next()) {
                    return rs.getString("nom");
                }
    }   catch (SQLException ex) {
            Logger.getLogger(PeliculaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    return director;

}
    
    private String obtenirActor(int idProduccio){
    
        Connection con = ConexioBDSingleton.getConnection();
        
        String director = " ";
        
        String senteciaSql = "SELECT d.nom_actor FROM actors dp, actor d"
                + "WHERE dp.id_actor = ? AND dp.id_actor = d.id_actor";
        
        try( PreparedStatement ps = con.prepareStatement(senteciaSql)){
                
                ps.setInt(1, idProduccio);
                ResultSet rs = ps.executeQuery();
                if (rs.next()) {
                    return rs.getString("nom_actor");
                }
    }   catch (SQLException ex) {
            Logger.getLogger(PeliculaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    return director;

}
    
}
