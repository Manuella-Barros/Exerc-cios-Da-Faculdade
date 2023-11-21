public abstract class Sala implements Obstaculo
{
    public int interageComPersonagem(Object personagem, String nome, String acao)
    {
        Maria m;
        Joao j;

        if(nome.equals("Maria"))
        {
            m = (Maria) personagem;
            switch(acao)
            {
                case "soma":
                    return (m.getPaciencia()+1);
                case "subtrai":
                    return (m.getPaciencia()-1);
            }
        }
        else
        {
            j = (Joao) personagem;
            switch (acao)
            {
                case "soma":
                    return (j.getPaciencia() + 1);
                case "subtrai":
                    return (j.getPaciencia() - 1);
            }
        }
        return 0;
    }
}
