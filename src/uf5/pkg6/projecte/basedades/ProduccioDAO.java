
package uf5.pkg6.projecte.basedades;
import uf5.pkg6.projecte.streamin.model.Produccio;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
     * Consulta una producció a la base de dades per ID.
     *
     * @param Id ID de la producció a consultar
     * @return La producció consultada
     */
public class ProduccioDAO {
    /**
     * Mètode que consulta una producció a la base de dades a partir d'un identificador.
     * 
     * @param Id L'identificador de la producció a consultar.
     * @return La producció consultada o null si no s'ha trobat cap producció amb l'identificador proporcionat.
     */
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
    /**
     * Mètode que converteix les dades de la base de dades en un objecte de la classe Produccio.
     * 
     * @param rs El ResultSet amb les dades de la producció.
     * @return L'objecte de la classe Produccio amb les dades convertides.
     * @throws SQLException Si es produeix un error en accedir a les dades de la base de dades.
     */
    private Produccio dadesBDProduccio(ResultSet rs) throws SQLException {
        Produccio p = new Produccio();
    
        p.setId(rs.getInt("id_produccio"));
        p.setNom(rs.getString("Nom"));
        p.setAny(rs.getInt("any"));
        p.setNacionalitat(rs.getString("nacionalitat"));
        p.setPreferit(rs.getInt("preferit"));
       
        return p;
    }
    /**
     * Mètode que assigna les dades d'una producció a un PreparedStatement per a l'execució d'una consulta o actualització.
     * 
     * @param ps El PreparedStatement on s'assignaran les dades.
     * @param p La producció amb les dades a assignar.
     * @throws SQLException Si es produeix un error en assignar les dades al PreparedStatement.
     */
    private void dadesProduccioBD(PreparedStatement ps, Produccio p) throws SQLException{
        
        ps.setInt(1,p.getId());
        ps.setString(2, p.getNom());
        ps.setString(3, p.getNacionalitat());
        ps.setInt(4, p.getAny());
        ps.setInt(5, p.getPreferit());
    }
}
