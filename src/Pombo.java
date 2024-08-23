public class Pombo extends AnimalVoadorAB {

    private double comidaConsumida;
    private double distanciaVoo;
    private double horasDormidas;

    public Pombo(String nome, int idade, double altura, double peso, int quantidadeAssas, double envergaduraAssa) {
        super(nome, "Pombo", idade, "Cidade", altura, peso, quantidadeAssas, envergaduraAssa);
        this.comidaConsumida = 0;
        this.distanciaVoo = 0.0;
        this.horasDormidas = 0;
    }

    @Override
    public void comer() {
        comidaConsumida += 0.7;
        System.out.println("O " + nome + " comeu " + comidaConsumida + " KG de farelos");
    }

    @Override
    public void moverse() {
        distanciaVoo += 10;
        System.out.println("O " + nome + " voou por " + distanciaVoo + " KM");
    }

    @Override
    public void dormir() {
        horasDormidas += 5.0;
        System.out.println("O " + nome + " dormiu por " + horasDormidas + " horas");
    }
}
