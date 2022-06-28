package dao;

import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Produto;

public class DaoProduto {
    public static boolean insert(Produto produto) throws SQLException, NoSuchAlgorithmException, UnsupportedEncodingException{
        Connection con = ConectaBanco.createConnection();
        
        if(con != null){
            String query = "INSERT INTO produtos (nome, preco, tipo, quantidade, status) VALUES (?, ?, ?, ?, ?)";
            
            PreparedStatement st = con.prepareStatement(query);
            
            st.setString(1, produto.getNome());
            st.setFloat(2, produto.getPreco());
            st.setString(3, produto.getTipo());
            st.setInt(4, produto.getQuantidade());
            st.setInt(5, 1);
            st.execute();
            con.close();
            return true;
        }
        con.close();
        return false;
    }
    
    public static List<Produto> getProdutos() throws SQLException{
        Connection con = ConectaBanco.createConnection();
        if(con != null){
            String query = "SELECT * FROM produtos WHERE status != 0";
            
            Statement st = con.createStatement();
         
            ResultSet rs = st.executeQuery(query);
            
            List<Produto> produtos = new ArrayList();
            
            while(rs.next()){
                Produto produto = new Produto();
                produto.setNome(rs.getString("nome"));
                produto.setPreco(rs.getFloat("preco"));
                produto.setQuantidade(rs.getInt("quantidade"));
                produto.setStatus(rs.getInt("status"));
                produto.setTipo(rs.getString("tipo"));
                
                produtos.add(produto);
            }
            con.close();
            return produtos;
        }
        con.close();
        return null;
    }
    
    public static Produto getProduto(String nome, float preco, String tipo, int quantidade) throws SQLException{
        Connection con = ConectaBanco.createConnection();
        if(con != null){
            String query = "SELECT * FROM produtos WHERE status != 0 AND nome = ? AND preco = ? AND tipo = ? AND quantidade = ?";
            
            PreparedStatement st = con.prepareStatement(query);
            
            st.setString(1, nome);
            st.setFloat(2, preco);
            st.setString(3, tipo);
            st.setInt(4, quantidade);
            
            ResultSet rs = st.executeQuery();
            
            if(rs.next()){                
                Produto produto = new Produto(nome, preco, tipo, quantidade, 1);
                produto.setId(rs.getInt("id"));
                con.close();
                return produto;
            }
        }
        con.close();
        return null;
    }
    
    public static boolean delete(Produto produto) throws SQLException{
        Connection con = ConectaBanco.createConnection();
        
        //DELETE FROM produtos WHERE nome = ? AND preco = ? AND tipo = ? AND quantidade = ?
        String query = "UPDATE produtos SET status = 0 WHERE nome = ? AND preco = ? AND tipo = ? AND quantidade = ?";
        
        PreparedStatement st;
        try {
            st = con.prepareStatement(query);
            st.setString(1, produto.getNome());
            st.setFloat(2, produto.getPreco());
            st.setString(3, produto.getTipo());
            st.setInt(4, produto.getQuantidade());
            
            st.execute();
            con.close();
            
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(DaoProduto.class.getName()).log(Level.SEVERE, null, ex);
            con.close();
            return false;
        }   
    }
    
    public static void update(int id,String campo, String valor) throws SQLException{
        Connection con = ConectaBanco.createConnection();
        
        if(con != null){
            String query = "UPDATE produtos SET " + campo + " = ? WHERE id = ?";
            
            try {
                PreparedStatement st = con.prepareStatement(query);
                
                st.setString(1, valor);
                st.setInt(2, id);              
                System.out.println(st);
                
                st.executeUpdate();
                con.close();
            } catch (SQLException ex) {
                Logger.getLogger(DaoProduto.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
        
        con.close();
    }
}
