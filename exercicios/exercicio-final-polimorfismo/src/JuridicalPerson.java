public class JuridicalPerson extends Person {
    
    protected Integer numeroFuncionarios;
    
    public JuridicalPerson(String nome, Double rendaAnual, Integer numeroFuncionarios) {
        super(nome, rendaAnual);
        this.numeroFuncionarios = numeroFuncionarios;
    }

    public Integer getNumeroFuncionarios() {
        return numeroFuncionarios;
    }

    public void setNumeroFuncionarios(Integer numeroFuncionarios) {
        this.numeroFuncionarios = numeroFuncionarios;
    }

    @Override
    public double calcImposto() {
        
        if (numeroFuncionarios > 10) {
            imposto = rendaAnual * 0.14;
        } else {
            imposto = rendaAnual * 0.16;
        }

        return imposto;
    }   

    

    

}
