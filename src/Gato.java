public class Gato extends AnimalAB{
    private int comidaIngerida;
    private int distanciaPercorrida;
    private int horasDormidas;

    @Override
    public void comer() {
        comidaIngerida += 2;
        System.out.println("A quantidade de comida ingerida foi " + comidaIngerida + " kg");
    }

    @Override
    public void moverse() {
        distanciaPercorrida += 10;
        System.out.println("A distância percorrida foi " + distanciaPercorrida + " kh");
    }

    @Override
    public void dormir() {
        horasDormidas += 10;
        System.out.println("O total de horas dormidas foi " +horasDormidas+ " hr");
    }
}
