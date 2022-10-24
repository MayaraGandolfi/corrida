public class Corrida {
    public static void main(String[] args) {

        Piloto piloto = new Piloto("Lewis Hamilton", 37, Sexo.MASCULINO, "Mercedes");
        CarroCorrida carro = new CarroCorrida(44, piloto, 100);

        System.out.println(carro);

        carro.acelerar(50);

        carro.ligar();

        carro.acelerar(60);
        carro.acelerar(60);

        carro.frear(50);

        carro.desligar();
        carro.parar();
        carro.desligar();

        System.out.println();
        System.out.println(carro);

    }
}