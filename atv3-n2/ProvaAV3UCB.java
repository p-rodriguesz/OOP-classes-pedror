public class ProvaAV3UCB extends ProvaFinalUniversidade {

    public ProvaAV3UCB(ProvaUniversidade prova) {
        super(prova);
        this.pesoProvaFinal = 1;
    }

    @Override
    public boolean habilitadoRealizarProva() {
        // pode fazer AV3 mesmo já aprovado
        return true;
    }

    @Override
    public void aplicarProvaFinal() {
        if (realizou) return; // já aplicada
        // substitui a menor entre AV1 e AV2 pela notaProvaFinal
        if (prova.getAv1() <= prova.getAv2()) {
            prova.setAv1(notaProvaFinal);
        } else {
            prova.setAv2(notaProvaFinal);
        }
        this.realizou = true;
        prova.realizouProvaFinal = true;
    }
}
