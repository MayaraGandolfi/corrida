public class CarroCorrida {
    private Integer numeroCarro;
    private Piloto piloto;
    private float velocidadeMaxima;
    private float velocidadeAtual;
    private boolean ligado;


    public CarroCorrida() {

    }

    public CarroCorrida(Integer numeroCarro, Piloto piloto, float velocidadeMaxima) {
        this.numeroCarro = numeroCarro;
        this.piloto = piloto;
        this.velocidadeMaxima = velocidadeMaxima;
        this.velocidadeAtual = 0;
        this.ligado = false;
    }

    public Integer getNumeroCarro() {
        return numeroCarro;
    }

    public void setNumeroCarro(Integer numeroCarro) {
        this.numeroCarro = numeroCarro;
    }

    public Piloto getPiloto() {
        return piloto;
    }

    public void setPiloto(Piloto piloto) {
        this.piloto = piloto;
    }

    public float getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(float velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public float getVelocidadeAtual() {
        return velocidadeAtual;
    }

    public void setVelocidadeAtual(float velocidadeAtual) {
        this.velocidadeAtual = velocidadeAtual;
    }

    public boolean isLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    public void acelerar(float velocidadeSomar) {
        if (ligado) {
            float novaVelocidade = velocidadeAtual + velocidadeSomar;
            if (novaVelocidade <= velocidadeMaxima) {
                this.velocidadeAtual += velocidadeSomar;
                System.out.println("Acelerando o carro " + getNumeroCarro() + ", velocidade atual: " + getVelocidadeAtual() + " Km/h.");
            } else {
                System.out.println("Não é possível acelear mais " + velocidadeSomar + " Km/h ao carro " + getNumeroCarro() +
                        " pois a velocidade atual é de " + getVelocidadeAtual() + " Km/h e iria ultrapassar" +
                        " a velocidade máxima que é de " + getVelocidadeMaxima() + " Km/h.");
                System.out.println("Velocidade do carro " + getNumeroCarro() + " continua: " + getVelocidadeAtual() + " Km/h.");
            }
        } else {
            System.out.println("Não é possível acelerar o carro " + getNumeroCarro() + " pois está desligado.");
        }
    }

    public void frear(float velocidadeFrear) {
        if (ligado) {
            this.velocidadeAtual -= velocidadeFrear;
            if (velocidadeAtual <= 0) {
                System.out.println("Freando o carro" + getNumeroCarro() + ", velocidade atual: 0 Km/h.");
                parar();
            } else {
                System.out.println("Freando o carro " + getNumeroCarro() + ", velocidade atual: " + getVelocidadeAtual() + " Km/h.");
            }
        } else {
            System.out.println("Não é possível frear o carro " + getNumeroCarro() + " pois está desligado.");
        }
    }

    public void ligar() {
        if (!ligado) {
            ligado = true;
            System.out.println("Ligando o carro " + getNumeroCarro() + ".");

        } else {
            System.out.println("O carro " + getNumeroCarro() + " já está ligado, não é possível liga-lo novamente");
        }
    }

    public void desligar() {
        if (ligado) {
            if (getVelocidadeAtual() == 0) {
                ligado = false;
                System.out.println("Desligando o carro " + getNumeroCarro() + ".");
            } else {
                System.out.println("Carro " + getNumeroCarro() + " em movimento, é necessário parar para desliga-lo");
            }
        } else {
            System.out.println("Carro " + getNumeroCarro() + " já está desligado");
        }
    }

    public void parar() {
        if (ligado) {
            this.velocidadeAtual = 0;
            System.out.println("Parando o carro " + getNumeroCarro() + ".");

        } else {
            System.out.println("O carro " + getNumeroCarro() + " está desligado.");
        }

    }


    @Override
    public String toString() {
        return "Carro de Corrida número: " + numeroCarro +
                ", Velocidade Maxima: " + velocidadeMaxima +
                ", Velocidade Atual: " + velocidadeAtual +
                ", Ligado: " + ligado +
                "\nComandado pelo " + piloto + "\n";
    }
}
