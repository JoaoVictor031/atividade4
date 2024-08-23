public abstract class AnimalVoadorAB extends AnimalAB {
    protected int quantidadeAssas;
    protected double envergaduraAssa;

    public AnimalVoadorAB(String nome, String tipoAnimal, int idade, String habitat, double altura, double peso, int quantidadeAssas, double envergaduraAssa) {
        super(nome, tipoAnimal, idade, habitat, altura, peso);
        this.quantidadeAssas = quantidadeAssas;
        this.envergaduraAssa = envergaduraAssa;
    }

    @Override
    public abstract void comer();
    @Override
    public abstract void moverse(); // Método voar
    @Override
    public abstract void dormir();
}
