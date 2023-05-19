
package uf5.pkg6.projecte.basedades;
import uf5.pkg6.projecte.streamin.model.Produccio;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ProduccioDAO {
    public Produccio consultaProduccioBD(int Id){
    
        Connection con = ConexioBDSingleton.getConnection();
        
        Produccio produccio = null;
        
        String sentenciaSql = "SELECT id_produccio, nom, nacionalitat, any , preferit " + "FROM produccions WHERE id_produccio = ?";
        
            try( PreparedStatement ps = con.prepareStatement(sentenciaSql)){
                
                ps.setInt(1, Id);
                ResultSet rs = ps.executeQuery();
                if (rs.next()) {
                    produccio = dadesBDProduccio(rs);
                }
        } catch (SQLException ex) {
            Logger.getLogger(ProduccioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return produccio;
    }
    
    private Produccio dadesBDProduccio(ResultSet rs) throws SQLException {
        Produccio p = new Produccio();
    
        p.setId(rs.getInt("id_produccio"));
        p.setNom(rs.getString("Nom"));
        p.setAny(rs.getInt("any"));
        p.setNacionalitat(rs.getString("nacionalitat"));
        p.setPreferit(rs.getInt("preferit"));
       
        return p;
    }
    
    private void dadesProduccioBD(PreparedStatement ps, Produccio p) throws SQLException{
        
        ps.setInt(1,p.getId());
        ps.setString(2, p.getNom());
        ps.setString(3, p.getNacionalitat());
        ps.setInt(4, p.getAny());
        ps.setInt(5, p.getPreferit());
    }
}
