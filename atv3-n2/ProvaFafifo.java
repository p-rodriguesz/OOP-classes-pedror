public class ProvaFafifo extends ProvaUniversidade {

    private final ProvaFinalFafifo provaFinal;

    public ProvaFafifo() {
        this.peso1 = 1;
        this.peso2 = 1;
        this.peso3 = 3;
        this.mediaMinima = 6.0; // regra Fafifo
        this.provaFinal = new ProvaFinalFafifo(this);
    }

    @Override
    public double calcularMedia() {
        if (realizouProvaFinal) {
            // inclui av3 com peso 3
            double total = av1 * peso1 + av2 * peso2 + av3 * peso3;
            double somaPesos = peso1 + peso2 + peso3;
            return total / somaPesos;
        } else {
            // sem AV3: média simples entre AV1 e AV2
            return (av1 + av2) / 2.0;
        }
    }

    @Override
    public ProvaFinalUniversidade getProvaFinalUniversidade() {
        return provaFinal;
    }
}
