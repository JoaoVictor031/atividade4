public class Leao extends AnimalAB{
    private int comidaIngerida;
    private int distanciaPercorrida;
    private int horasDormidas;

    @Override
    public void comer() {
        comidaIngerida += 40;
        System.out.println("A quantidade de comida ingerida foi " + comidaIngerida + " kg");
    }

    @Override
    public void moverse() {
        distanciaPercorrida += 15;
        System.out.println("A distância percorrida foi " + distanciaPercorrida + " kh");
    }

    @Override
    public void dormir() {
        horasDormidas += 25;
        System.out.println("O total de horas dormidas foi " +horasDormidas+ " hr");
    }
}
