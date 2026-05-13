public abstract class ProvaUniversidade {
    protected double av1;
    protected double av2;
    protected double av3;

    protected double peso1;
    protected double peso2;
    protected double peso3;

    protected double mediaMinima;
    protected boolean realizouProvaFinal = false;

    public void setAv1(double av1) { this.av1 = av1; }
    public void setAv2(double av2) { this.av2 = av2; }
    public void setAv3(double av3) { this.av3 = av3; }

    public double getAv1() { return av1; }
    public double getAv2() { return av2; }
    public double getAv3() { return av3; }

    public boolean isRealizouProvaFinal() { return realizouProvaFinal; }

    public abstract double calcularMedia();
    public abstract ProvaFinalUniversidade getProvaFinalUniversidade();

    public boolean aprovado() {
        return calcularMedia() >= mediaMinima;
    }
}
