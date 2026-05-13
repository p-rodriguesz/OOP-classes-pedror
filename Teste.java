public class Teste {
    public static void main(String[] args) {
        // Teste UCB
        ProvaUCB ucb = new ProvaUCB();
        ucb.setAv1(7.0);
        ucb.setAv2(6.0);
        ucb.setAv3(8.0); // nota da AV3 caso faça
        System.out.println("UCB - média antes da prova final: " + ucb.calcularMedia());
        ProvaFinalUniversidade finalUcb = ucb.getProvaFinalUniversidade();
        if (finalUcb.habilitadoRealizarProva()) {
            finalUcb.setNotaProvaFinal(ucb.getAv3()); // usar AV3 como substituta
            finalUcb.aplicarProvaFinal();
        }
        double mediaUcb = ucb.calcularMedia();
        System.out.printf("UCB - média final: %.2f - %s%n", mediaUcb, (ucb.aprovado() ? "APROVADO" : "REPROVADO"));

        // Teste Fafifo
        ProvaFafifo fafifo = new ProvaFafifo();
        fafifo.setAv1(4.0);
        fafifo.setAv2(5.0);
        fafifo.setAv3(8.0); // nota da AV3 se fizer
        System.out.println("Fafifo - média antes da prova final: " + fafifo.calcularMedia());
        ProvaFinalUniversidade finalFaf = fafifo.getProvaFinalUniversidade();
        if (finalFaf.habilitadoRealizarProva()) {
            finalFaf.setNotaProvaFinal(fafifo.getAv3());
            finalFaf.aplicarProvaFinal();
        }
        double mediaFaf = fafifo.calcularMedia();
        System.out.printf("Fafifo - média final: %.2f - %s%n", mediaFaf, (fafifo.aprovado() ? "APROVADO" : "REPROVADO"));
    }
}
