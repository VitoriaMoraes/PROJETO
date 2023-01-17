/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MysqlConexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Conexao {
    //Caminho do banco de dados; conexão jdbc(padrão de integração), mysql, localhost(porta 3306), acessa ao banco de dados 'Conta';
    private static final String DRIVER = "com.mysql.jdbc.Driver";
    private static final String url = "jdbc:mysql://localhost:3306/conta";
    //Nome do usuário do mysql;
    private static final String usuario = "root";
    //senha do mysql
    private static final String senha = "";
    Statement sqlmgr;

    //conexão

    //abrir conexão com mysql
    public static Connection abrirConexao() throws SQLException, ClassNotFoundException{
        Class.forName("com.mysql.jdbc.Driver");
        Connection conexao = DriverManager.getConnection(url, usuario, senha);
        return conexao;
    }
    public static void main (String [] args) throws ClassNotFoundException, SQLException{
        Connection conexao = abrirConexao();

        if(conexao!=null){
            System.out.println("conexão realizada!");
            conexao.close();
        }

    }
}
