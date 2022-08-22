package entities;

public class Candidatos {
    
    private String nome;
    private Integer numeroVotos;
    
    public Candidatos(String nome, Integer numeroVotos) {
        this.nome = nome;
        this.numeroVotos = numeroVotos;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getNumeroVotos() {
        return numeroVotos;
    }

    public void setNumeroVotos(Integer numeroVotos) {
        this.numeroVotos = numeroVotos;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((nome == null) ? 0 : nome.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Candidatos other = (Candidatos) obj;
        if (nome == null) {
            if (other.nome != null)
                return false;
        } else if (!nome.equals(other.nome))
            return false;
        return true;
    }
}
