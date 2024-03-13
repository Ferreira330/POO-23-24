import java.util.List;
import java.util.ArrayList;
import java.util.Date;

public class EncEficiente 
{
    private String nome_cliente;
    private String nif_cliente;
    private String morada_cliente;
    private int num_enc;
    private Date data_enc;
    private List<LinhaEncomenda> linhas;
    
    public EncEficiente()
    {
        this.nome_cliente = new String();
        this.nif_cliente = new String();
        this.morada_cliente = new String();
        this.num_enc = 0;
        this.data_enc = new Date();
        this.linhas = new ArrayList();
    }
    public EncEficiente(String nome, String nif, String morada, int num, Date data, List<LinhaEncomenda> linhas)
    {
        this.nome_cliente = nome;
        this.nif_cliente = nif;
        this.morada_cliente = morada;
        this.num_enc = num;
        this.data_enc = data;
        this.linhas = new ArrayList<LinhaEncomenda>();
        for(LinhaEncomenda l: linhas)
        {
            this.linhas.add(l.clone());
        }
    }
    public EncEficiente(EncEficiente e)
    {
        this.nome_cliente = e.getNome();
        this.nif_cliente = e.getNif();
        this.morada_cliente = e.getMorada();
        this.num_enc = e.getNum();
        this.data_enc = e.getData();
        this.linhas = e.getLinhas();
    }
    public String getNome()
    {
        return this.nome_cliente;
    }
    public String getNif()
    {
        return this.nif_cliente;
    }
    public String getMorada()
    {
        return this.morada_cliente;
    }
    public int getNum()
    {
        return this.num_enc;
    }
    public Date getData()
    {
        return this.data_enc;
    }
    public List<LinhaEncomenda> getLinhas()
    {
        List<LinhaEncomenda> res = new ArrayList<LinhaEncomenda>();
        for(LinhaEncomenda l: this.linhas)
        {
            res.add(l.clone());
        }
        return res;
    }
    public double calculaValorTotal()
    {
        double valor = 0;
        for(LinhaEncomenda l: this.linhas)
        {
            valor += l.calculaValorLinhaEnc();
        }
        return valor;
    }
    public double calculaValorDesconto()
    {
        double valor = 0;
        for(LinhaEncomenda l: this.linhas)
        {
            valor += l.calculaValorDesconto();
        }
        return valor;
    }
    public int numeroTotalProdutos()
    {
        int total = 0;
        for(LinhaEncomenda l: this.linhas)
        {
            //cada linhaEnconmenda só tem um produto
            total += l.getQuantidade();
        }
        return total;
    }
    public boolean existeProdutoEncomenda(String refProduto)
    {
        for(LinhaEncomenda l: this.linhas)
        {
            if(l.getReferencia().equals(refProduto))
            {
                return true;
            }
        }
        return false;
    }
    public void adicionaLinha(LinhaEncomenda linha)
    {
        this.linhas.add(linha.clone());
    }
    public void removeProduto(String codProd)
    {
        for(LinhaEncomenda l: this.linhas)
        {
            if(l.getReferencia().equals(codProd))
            {
                this.linhas.remove(l);
                break;
            }
        }
    }
}
