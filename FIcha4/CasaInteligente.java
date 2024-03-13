import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.HashSet;

public class CasaInteligente 
{
    private List<Lampada> lampadas;

    public CasaInteligente() {
        this.lampadas = new ArrayList<>();
    }

    public CasaInteligente(List<Lampada> lampadas) {
        this.lampadas = new ArrayList<>();
        for(Lampada l: lampadas) {
            this.lampadas.add(l.clone());
        }
    }
    public CasaInteligente(CasaInteligente c) {
        this.lampadas = c.getLampadas();
    }
    public List<Lampada> getLampadas() {
        List<Lampada> res = new ArrayList<>();
        for(Lampada l: this.lampadas) {
            res.add(l.clone());
        }
        return res;
    }
    public void addLampada(Lampada l)
    {
        this.lampadas.add(l.clone());
    }
    public void ligaLampadaNormal(int index)
    {
        this.lampadas.get(index).lampON();
    }
    public void ligaLampadaEco(int index)
    {
        
        this.lampadas.get(index).lampECO();
    }
    public int qtEmEco()
    {
        int res = 0;
        for(Lampada l: this.lampadas)
        {
            if(l.getModo() == Lampada.Modo.ON) res++;
        }
        return res;
    }
    public void removeLampada(int index)
    {
        this.lampadas.remove(index);
    }
    public void ligaTodasEco()
    {
        for(Lampada l: this.lampadas)
        {
            l.lampECO();
        }
    }
    public double consumoTotal()
    {
        double res = 0;
        for(Lampada l: this.lampadas)
        {
            res += l.totalConsumo();
        }
        return res;
    }
    public Lampada maisGastadora()
    {
        Lampada res = this.lampadas.get(0);
        for(Lampada l: this.lampadas)
        {
            if(l.totalConsumo() > res.totalConsumo()) res = l;
        }
        return res.clone();
    }
    public Set<Lampada> lampadasEmModoEco()
    {
        Set<Lampada> res = new HashSet<>();
        for(Lampada l: this.lampadas)
        {
            if(l.getModo() == Lampada.Modo.ECO) res.add(l.clone());
        }
    }
    public void reset()
    {
        for(Lampada l: this.lampadas)
        {
            l.resetPeriodo();
        }
    }
    public Set<Lampada> podiumEconomia()
    {
        Set<Lampada> res = new HashSet<>();
        for(Lampada l: this.lampadas)
        {
            if(res.size() < 3) res.add(l.clone());
            else
            {
                Lampada min = res.iterator().next();
                for(Lampada r: res)
                {
                    if(r.periodoConsumo() < min.periodoConsumo()) min = r;
                }
            }
        }
        return res;
    }
}
