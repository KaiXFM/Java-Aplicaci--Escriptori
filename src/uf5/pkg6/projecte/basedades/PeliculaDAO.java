
package uf5.pkg6.projecte.basedades;

import uf5.pkg6.projecte.streamin.model.Pelicula;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 * 
 * @author AX La classe Pelicula DAO serveix per accedir a la taula Pelicula i seleccionar els seus atributs
 */
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
/**
 * Per retornar dades de la Pel·licula
 * @param id id de la peli
 * @param durada durada de la peli
 * @return retorna peli amb durada,categoria,director i actor
 */
    private Pelicula dadesBDPelicula(int id, double durada) {
        Pelicula p = new Pelicula();
        
        p.setDurada(durada);
        
        p.afegirCategoria(obtenirCategoria(id));
        p.afegirDirector(obtenirDirector(id));
        p.afegirActor(obtenirActor(id));
        
        return p;
    }

/**
 * Fa un select el qual agafa el num del director
 * @param idProduccio Accedir al mètode sabent la id de la peli
 * @return Obté el Director
 */
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
    /**
    * Fa un select el qual agafa el nom de la Categoría
    * @param idProduccio Accedir al mètode sabent la id de la peli
    * @return Obté la Categoría
    */
    private String obtenirCategoria(int idProduccio){
    
        Connection con = ConexioBDSingleton.getConnection();
        
        String categoria = " ";
        
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
        
    return categoria;

}
     /**
     * Fa un select el qual agafa el nom del Actor
     * @param idProduccio Accedir al mètode sabent la id de la peli
     * @return Obté Actor
     */
    private String obtenirActor(int idProduccio){
    
        Connection con = ConexioBDSingleton.getConnection();
        
        String actor = " ";
        
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
        
    return actor;

}
    
}
