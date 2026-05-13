public class ProvaFinalFafifo extends ProvaFinalUniversidade {

    public ProvaFinalFafifo(ProvaUniversidade prova) {
        super(prova);
        this.pesoProvaFinal = 3;
    }

    @Override
    public boolean habilitadoRealizarProva() {
        // só pode realizar se média atual (sem AV3) for menor que a média mínima
        double mediaAtual = (prova.getAv1() + prova.getAv2()) / 2.0;
        return mediaAtual < prova.mediaMinima;
    }

    @Override
    public void aplicarProvaFinal() {
        if (realizou) return;
        // atribui AV3 e sinaliza realização; cálculo usa pesos no ProvaFafifo.calcularMedia()
        prova.setAv3(notaProvaFinal);
        this.realizou = true;
        prova.realizouProvaFinal = true;
    }
}
