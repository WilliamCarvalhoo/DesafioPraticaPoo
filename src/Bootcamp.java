import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Bootcamp {
    private String nome;
    private String descricao;
    private final Set<Dev> devsInscritos = new HashSet<>();
    private final List<Conteudo> conteudos = new ArrayList<>();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Set<Dev> getDevsInscritos() {
        return devsInscritos;
    }

    public List<Conteudo> getConteudos() {
        return conteudos;
    }
}
