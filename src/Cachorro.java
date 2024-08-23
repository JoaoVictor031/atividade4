public class Cachorro extends AnimalTerrestreAB {

    private double comidaConsumida;
    private double distanciaPercorrida;
    private double horasDormidas;

    public Cachorro(String nome, int idade, double altura, double peso, int quantidadePatas) {
        super(nome, "Cachorro", idade, "Doméstico", altura, peso, quantidadePatas);
        this.comidaConsumida = 0;
        this.distanciaPercorrida = 0.0;
        this.horasDormidas = 0;
    }

    @Override
    public void comer() {
        comidaConsumida += 2.0;
        System.out.println("O " + nome + " comeu " + comidaConsumida + " KG");
    }

    @Override
    public void moverse() {
        distanciaPercorrida += 0.9;
        System.out.println("O " + nome + " andou por " + distanciaPercorrida + " KM");
    }

    @Override
    public void dormir() {
        horasDormidas += 7.3;
        System.out.println("O " + nome + " dormiu por " + horasDormidas + " horas");
    }
}
