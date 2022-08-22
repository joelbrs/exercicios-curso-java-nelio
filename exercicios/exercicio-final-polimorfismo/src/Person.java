public abstract class Person {
    
    protected String nome;
    protected Double rendaAnual;
    protected Double imposto;
    
    public Person(String nome, Double rendaAnual) {
        this.nome = nome;
        this.rendaAnual = rendaAnual;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getRendaAnual() {
        return rendaAnual;
    }

    public abstract double calcImposto();

    

}
