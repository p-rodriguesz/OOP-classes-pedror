public class ProvaUCB extends ProvaUniversidade {

    private final ProvaAV3UCB provaFinal;

    public ProvaUCB() {
        // pesos iguais
        this.peso1 = 1;
        this.peso2 = 1;
        this.peso3 = 1;
        this.mediaMinima = 7.0; // regra UCB
        this.provaFinal = new ProvaAV3UCB(this);
    }

    @Override
    public double calcularMedia() {
        // Se já realizou prova final, a aplicação da prova final já terá substituído av1/av2.
        // Média calculada com as duas notas (av1 e av2 são as duas que valem após substituição).
        if (realizouProvaFinal) {
            return (av1 + av2) / 2.0;
        }
        // antes da prova final, considera as duas maiores entre av1, av2 e av3 caso av3 tenha sido atribuída informalmente;
        // Implementação simples: média das duas maiores notas (permite AV3 mesmo sem "realizouProvaFinal")
        double a = av1, b = av2, c = av3;
        double soma = a + b + c - Math.min(Math.min(a, b), c);
        return soma / 2.0;
    }

    @Override
    public ProvaFinalUniversidade getProvaFinalUniversidade() {
        return provaFinal;
    }
}
