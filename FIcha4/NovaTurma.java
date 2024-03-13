import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

public class NovaTurma {
    private String designacao;
    private List<Aluno> alunos;

    public NovaTurma()
    {
        this.designacao = new String();
        this.alunos = new ArrayList();
    }
    public void insereAluno(Aluno a)
    {
        Aluno novo = a.clone();
        this.alunos.add(novo);
    }

    public List<Aluno> getAlunos()
    {
        List res = new ArrayList();
        /*
        for(Aluno a: this.alunos)
        {
            res.add(a.clone());
        }
        */

        Iterator<Aluno> it = this.alunos.iterator();
        
        while(it.hasNext())
        {
            Aluno al = it.next();
            res.add(al.clone());

        }
        return res;
    }
}