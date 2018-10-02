package Modelo;
import DAL.PessoaDAO;
import java.util.List;

public class Controle
{
    public String mensagem;
    
    public void CadastrarPessoa(List<String> DadosPessoa)
    {
        this.mensagem="";
        Validacao validacao = new Validacao();
        validacao.ValidarDadosPessoa(DadosPessoa);
        if(validacao.mensagem.equals(""))
        {
            Pessoa pessoa = new Pessoa();
            pessoa.id = 0;
            pessoa.nome = DadosPessoa.get(1);
            pessoa.rg = DadosPessoa.get(2);
            pessoa.cpf = DadosPessoa.get(3);
            
            DAL.PessoaDAO pessoaDAO = new PessoaDAO();
            pessoaDAO.CadastrarPessoa(pessoa);
            this.mensagem = pessoaDAO.mensagem;
        }
        else
        {
            this.mensagem = validacao.mensagem; 
        }
    }
    
    public Pessoa PesquisarPessoaPorID(List<String> DadosPessoa)
    {
        this.mensagem="";
        Pessoa pessoa = new Pessoa();
        Validacao validacao = new Validacao();
        validacao.ValidarIDDadosPessoa(DadosPessoa);
        if(validacao.mensagem.equals(""))
        {
            pessoa.id = validacao.id;
            DAL.PessoaDAO pessoaDAO = new PessoaDAO();
            pessoa = pessoaDAO.PesquisarPessoaPorId(pessoa);
            this.mensagem = pessoaDAO.mensagem;
        }
        else
            this.mensagem += validacao.mensagem;
                
        return pessoa;
    }
    
    public void ExcluirPessoa(List<String> DadosPessoa)
    {
        this.mensagem="";
        Validacao validacao = new Validacao();
        validacao.ValidarIDDadosPessoa(DadosPessoa);
        if(validacao.mensagem.equals(""))
        {
            Pessoa pessoa = new Pessoa();
            pessoa.id = validacao.id;
            DAL.PessoaDAO pessoaDAO = new PessoaDAO();
            pessoa = pessoaDAO.PesquisarPessoaPorId(pessoa);
            if(pessoa.nome != null) 
            {
                pessoaDAO.ExcluirPessoa(pessoa);
                this.mensagem =  pessoaDAO.mensagem;
            } 
            else
                this.mensagem = validacao.mensagem;
        }
        else
            this.mensagem = validacao.mensagem;
    }
    
    public void EditarPessoa(List<String> DadosPessoa)
    {
        this.mensagem="";
        Validacao validacao = new Validacao();
        validacao.ValidarDadosPessoa(DadosPessoa);
        if(validacao.mensagem.equals(""))
        {
            Pessoa pessoa = new Pessoa();
            DAL.PessoaDAO pessoaDAO = new PessoaDAO();
            pessoa.id = validacao.id;
            pessoa = pessoaDAO.PesquisarPessoaPorId(pessoa);
            if(pessoa.nome != null)
            {
                pessoa.nome = DadosPessoa.get(1);
                pessoa.rg = DadosPessoa.get(2);
                pessoa.cpf = DadosPessoa.get(3);
                pessoaDAO.EditarPessoa(pessoa);
                this.mensagem = pessoaDAO.mensagem;
            }
            else
                this.mensagem = pessoaDAO.mensagem;
        }
        else
            this.mensagem = validacao.mensagem;
    }
}
