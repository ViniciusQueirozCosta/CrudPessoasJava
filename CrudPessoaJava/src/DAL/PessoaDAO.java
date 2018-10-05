package DAL;
import Modelo.Pessoa;
import java.sql.*;
import java.util.List;

public class PessoaDAO implements intPessoaDAO
{
    public String mensagem = "";
    
    @Override
    public void CadastrarPessoa(Pessoa pessoa)
    { 
        try
        {
            Connection conexaoBD = Conexao.Conectar();
            String instrucaoSql = "insert into Pessoas (nome,rg,cpf) values ( ? , ? , ? )";
            PreparedStatement stmt = conexaoBD.prepareStatement(instrucaoSql);
            stmt.setString(1, pessoa.nome);
            stmt.setString(2, pessoa.rg);
            stmt.setString(3, pessoa.cpf);
            stmt.execute();
            
            Conexao.Desconectar();
            this.mensagem = "Pessoa cadastrada com sucesso!";
        }
        catch(SQLException e)
        {
            this.mensagem = Conexao.mensagem + e.getMessage();
        }
    }
    @Override
    public void EditarPessoa(Pessoa pessoa)
    {
        try
        {
            Connection conexaoBD = Conexao.Conectar();
            String instrucaoSql = "update Pessoas set nome=? , rg=? , cpf=?  where id=?";
            PreparedStatement stmt = conexaoBD.prepareStatement(instrucaoSql);
            stmt.setString(1, pessoa.nome);
            stmt.setString(2, pessoa.rg);
            stmt.setString(3, pessoa.cpf);
            stmt.setInt(4, pessoa.id);
            stmt.execute();
            
            Conexao.Desconectar();
            this.mensagem = "Pessoa modificada com sucesso!";
        }
        catch(SQLException e)
        {
            this.mensagem = Conexao.mensagem + e.getMessage();
        }
    }

    @Override
    public void ExcluirPessoa(Pessoa pessoa)
    {
        try
        {
            Connection conexaoBD = Conexao.Conectar();
            String instrucaoSql = "delete from Pessoas where id = ?";
            PreparedStatement stmt = conexaoBD.prepareStatement(instrucaoSql);
            stmt.setInt(1, pessoa.id);
            stmt.execute();
            
            Conexao.Desconectar();
            this.mensagem = "Pessoa excluida com sucesso!";
        }
        catch(SQLException e)
        {
            this.mensagem = Conexao.mensagem + e.getMessage();
        }
    }

    @Override
    public Pessoa PesquisarPessoaPorId(Pessoa pessoa)
    {
        try
        {
            Connection conexaoBD = Conexao.Conectar();
            String instrucaoSql = "select * from Pessoas where id = ?";
            PreparedStatement stmt = conexaoBD.prepareStatement(instrucaoSql);
            stmt.setInt(1, pessoa.id);
            ResultSet resultset = stmt.executeQuery();
            pessoa.id = 0;
            
            if(resultset.next())
            {
                pessoa.id = resultset.getInt("id");
                pessoa.nome = resultset.getString("nome");
                pessoa.rg = resultset.getString("cpf");
                pessoa.cpf = resultset.getString("rg");
            }
            else
                this.mensagem = "ID inválido.";
            
            Conexao.Desconectar();
        }
        catch(SQLException e)
        {
            this.mensagem = Conexao.mensagem + e.getMessage();
        }
        return pessoa;
    }

    @Override
    public List<Pessoa> PesquisarPessoaPorNome(Pessoa pessoa)
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
