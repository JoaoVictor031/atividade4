public class Main {
    public static void main(String[] args) {

        Cachorro cachorro = new Cachorro("Cachorrin", 5, 0.60, 30.0, 4);
        Peixe peixe = new Peixe("Peixin", 2, 0.25, 0.2);
        Leao leao = new Leao("Simba", 8, 1.2, 180.0, 4);
        Gato gato = new Gato("Gatin", 3, 0.30, 4.0, 4);

        System.out.println("Sobre o Cachorro:");
        cachorro.comer();
        cachorro.moverse();
        cachorro.dormir();
        System.out.println();

        System.out.println("Sobre o Peixe:");
        peixe.comer();
        peixe.moverse();
        peixe.dormir();
        System.out.println();

        System.out.println("Sobre o Leão:");
        leao.comer();
        leao.moverse();
        leao.dormir();
        System.out.println();

        System.out.println("Sobre o Gato:");
        gato.comer();
        gato.moverse();
        gato.dormir();
    }
}
