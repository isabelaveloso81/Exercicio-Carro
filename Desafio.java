void acelerar() {
    if (ligado) {
        velocidade = velocidade + 10;
    } else {
        System.out.println("Não é possível acelerar com o carro desligado.");
    }
}
