
package uf5.pkg6.projecte.basedades;

import uf5.pkg6.projecte.streamin.model.Serie;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
public class SerieDAO {
    
    public Serie consultaSerieBD(int id){
        Connection con = ConexioBDSingleton.getConnection();
        
        Serie s = null;
        
        String senteciaSql = " SELECT COUNT(e.id_produccio) numcapitols, SUM(e.durada) duradatotal FROM series s, episodis e "
                + "WHERE s.id_produccio = ? AND s.id_produccio = e.id_produccio";
        
        try( PreparedStatement ps = con.prepareStatement(senteciaSql)){
                
                ps.setInt(1, id);
                ResultSet rs = ps.executeQuery();
                if (rs.next()) {
                    s = dadesBDSerie(id,rs);
                }

    
    }   catch (SQLException sqle) {
            sqle.printStackTrace();
        }
        return s;
}
    
    private Serie dadesBDSerie(int id, ResultSet rs) throws SQLException{
        Serie s = new Serie();
        s.setId(id);
        s.setDuradaTotal(rs.getDouble("duradatotal"));
        s.setNumCapitols(rs.getInt("numcapitols"));
        
        s.afegirCategoria(obtenirCategoria(id));
        s.afegirDirector(obtenirDirector(id));
        s.afegirActor(obtenirActor(id));
        
        return s;
    }
    
    private String obtenirCategoria(int idProduccio){
    
        Connection con = ConexioBDSingleton.getConnection();
        
        String categoria = " ";
        
        String sentenciaSql = "SELECT d.nom FROM genere dp, categoria d "
                + "WHERE dp.id_categoria = ? AND dp.id_categoria = d.id_categoria";
        
        try (PreparedStatement ps = con.prepareStatement(sentenciaSql)){
            
            ps.setInt(1, idProduccio);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                    return rs.getString("nom_categoria");
            }
        } catch (SQLException ex) {
            Logger.getLogger(SerieDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return categoria;
    }
    
    private String obtenirDirector(int idProduccio){
    
        Connection con = ConexioBDSingleton.getConnection();
        
        String director = " ";
        
        String sentenciaSql = "SELECT d.nom_director FROM dirigeix_pelicula dp, director d"
                + "WHERE dp.id_director = ? AND dp.id_director = d.id_director";;
        
        try (PreparedStatement ps = con.prepareStatement(sentenciaSql)){
            
            ps.setInt(1, idProduccio);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                    return rs.getString("nom_director");
            }
        } catch (SQLException ex) {
            Logger.getLogger(SerieDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return director;
    }
    
    private String obtenirActor(int idProduccio){
    
        Connection con = ConexioBDSingleton.getConnection();
        
        String actor = " ";
        
        String sentenciaSql = "SELECT d.nom_actor FROM actors dp, actor d"
                + "WHERE dp.id_actor = ? AND dp.id_actor = d.id_actor";
        
        try (PreparedStatement ps = con.prepareStatement(sentenciaSql)){
            
            ps.setInt(1, idProduccio);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                    return rs.getString("nom_actor");
            }
        } catch (SQLException ex) {
            Logger.getLogger(SerieDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return actor;
    }
}



