public class Peixe extends AnimalMarinhoAB {

    private double comidaConsumida;
    private double distanciaNadada;
    private double horasDormidas;

    public Peixe(String nome, int idade, double altura, double peso) {
        super(nome, "Peixe", idade, "Marinho", altura, peso);
        this.comidaConsumida = 0;
        this.distanciaNadada = 0.0;
        this.horasDormidas = 0;
    }

    @Override
    public void comer() {
        comidaConsumida += 0.9;
        System.out.println("O " + nome + " comeu " + comidaConsumida + " KG de comida");
    }

    @Override
    public void moverse() {
        distanciaNadada += 2.1;
        System.out.println("O " + nome + " nadou por " + distanciaNadada + " KM");
    }

    @Override
    public void dormir() {
        horasDormidas += 6.0;
        System.out.println("O " + nome + " dormiu. Horas dormidas: " + horasDormidas + " horas");
    }
}
