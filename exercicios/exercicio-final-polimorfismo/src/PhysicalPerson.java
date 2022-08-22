public class PhysicalPerson extends Person {

    protected Double gastoSaude;
    double impostoFinal;
    
    public PhysicalPerson(String nome, Double rendaAnual, Double gastoSaude) {
        super(nome, rendaAnual);
        this.gastoSaude = gastoSaude;
    }

    public Double getGastoSaude() {
        return gastoSaude;
    }

    public void setGastoSaude(Double gastoSaude) {
        this.gastoSaude = gastoSaude;
    }

    @Override
    public double calcImposto() {
        if (rendaAnual < 20000.00) {
            imposto = rendaAnual * 0.15;

            if (gastoSaude > 0) {
                impostoFinal = imposto - (gastoSaude * 0.5);
            } else {
                impostoFinal = imposto;
            }
        }

        if (rendaAnual > 20000.00) {
            imposto = rendaAnual * 0.25;

            if (gastoSaude > 0) {
                impostoFinal = imposto - (gastoSaude * 0.5);
            } else {
                impostoFinal = imposto;
            }
        }

        return impostoFinal;
    }







    
    
    

}
