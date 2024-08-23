public class Leao extends AnimalTerrestreAB {

    private double comidaConsumida;
    private double distanciaPercorrida;
    private double horasDormidas;

    public Leao(String nome, int idade, double altura, double peso, int quantidadePatas) {
        super(nome, "Elefante", idade, "Selva", altura, peso, quantidadePatas);
        this.comidaConsumida = 0;
        this.distanciaPercorrida = 0.0;
        this.horasDormidas = 0;
    }

    @Override
    public void comer() {
        comidaConsumida += 20.4;
        System.out.println("O " + nome + " comeu " + comidaConsumida + " KG de carne");
    }

    @Override
    public void moverse() {
        distanciaPercorrida += 6.8;
        System.out.println("O " + nome + " andou por " + distanciaPercorrida + " KM");
    }

    @Override
    public void dormir() {
        horasDormidas += 8.0;
        System.out.println("O " + nome + " dormiu por " + horasDormidas + " horas");
    }
}
