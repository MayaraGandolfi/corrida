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
            } else {
                System.out.println("Não é possível acelear a velocidade escolhida, pois irá ultrapassar a velocidade máxima");
            }
        } else {
            System.out.println("Não é possível acelerar pois carro está desligado");
        }
    }

    public void frear(float velocidadeFrear) {
        if (ligado) {
            this.velocidadeAtual -= velocidadeFrear;
            if (velocidadeAtual < 0) {
                this.velocidadeAtual = 0;
            }
        } else {
            System.out.println("Não é possível frear pois o carro está desligado.");
        }
    }

    public void ligar() {
        if (!ligado) {
            ligado = true;
        } else {
            System.out.println("Carro já está ligado");
        }
    }

    public void desligar() {
        if (getVelocidadeAtual() == 0) {
            ligado = false;
        } else {
            System.out.println("É necessário parar o carro para desliga-lo");
        }
    }

    public void parar(){
        this.velocidadeAtual = 0;
    }


    @Override
    public String toString() {
        return "Carro de Corrida:" +
                "\n Numero do Carro=" + numeroCarro +
                "\n" + piloto +
                "\n Velocidade Maxima=" + velocidadeMaxima +
                "\n Velocidade Atual=" + velocidadeAtual +
                "\n Ligado=" + ligado + "\n";
    }
}
