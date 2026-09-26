public class Carro {

    String marca;
    String cor;
    String modelo;
    int velocidade;

    int ano;
    String combustivel;
    boolean ligado;

    void acelerar() {
        velocidade = velocidade + 10;
    }

    void frear() {
        velocidade = velocidade - 10;
    }

    void ligar() {
        ligado = true;
        System.out.println("Carro ligado.");
    }

    void desligar() {
        ligado = false;
        System.out.println("Carro desligado.");
    }

    void buzinar() {
        System.out.println("Biiiiip!");
    }

    void mostrarDados() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Cor: " + cor);
        System.out.println("Velocidade: " + velocidade);
        System.out.println("Ano: " + ano);
        System.out.println("Combustível: " + combustivel);
        System.out.println("Ligado: " + ligado);
        System.out.println();
    }
}
