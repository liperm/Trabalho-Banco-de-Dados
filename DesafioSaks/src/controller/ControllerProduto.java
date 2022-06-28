package controller;

import dao.DaoProduto;
import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Produto;

public class ControllerProduto {
    public static boolean insere(Produto produto){
        try {
            DaoProduto.insert(produto);
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(ControllerProduto.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        } catch (NoSuchAlgorithmException ex) {
            Logger.getLogger(ControllerProduto.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        } catch (UnsupportedEncodingException ex) {
            Logger.getLogger(ControllerProduto.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    
    public static List<Produto> getProdutos() throws SQLException{
        return DaoProduto.getProdutos();
    }
    
    public static boolean deletaProduto(Produto produto) throws SQLException{
        return DaoProduto.delete(produto);
    }
    
    public static Produto getProduto(String nome, float preco, String tipo, int quantidade) throws SQLException{
        return DaoProduto.getProduto(nome, preco, tipo, quantidade);
    }
    
    public static void update(int id, String campo, String valor) throws SQLException{
        DaoProduto.update(id, campo, valor);
        return;
    }
}
