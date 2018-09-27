package DAL;

import java.sql.*;

public class Conexao
{
    static private Connection conexaoDB = null;
    static public String mensagem;
    
    public static Connection Conectar()
    {
        
        mensagem = "";
        try
        {
            if(conexaoDB == null || conexaoDB.isClosed())
            {
                conexaoDB = DriverManager.getConnection("jdbc:sqlserver://SERVERHERE;databaseName=CrudPessoasJava", "USERNAME", "PASSWORD");
            }
        }
        catch(SQLException e)
        {
            mensagem = e.getMessage();
        }
        return conexaoDB;
    }
    public static void Desconectar()
    {
        try
        {
            if(!conexaoDB.isClosed())
            {
                conexaoDB.close();
            }
        }
        catch(SQLException e)
        {
            mensagem = e.getMessage();
        }
    }
}
