public abstract class ProvaFinalUniversidade {
    // ...existing code...
    protected double notaProvaFinal;
    protected double pesoProvaFinal;
    protected boolean realizou = false;
    protected ProvaUniversidade prova;

    public ProvaFinalUniversidade(ProvaUniversidade prova) {
        this.prova = prova;
    }

    public void setNotaProvaFinal(double nota) { this.notaProvaFinal = nota; }
    public double getNotaProvaFinal() { return notaProvaFinal; }
    public boolean isRealizou() { return realizou; }

    public abstract boolean habilitadoRealizarProva();
    public abstract void aplicarProvaFinal();
}
