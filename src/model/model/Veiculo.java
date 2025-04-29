package model;
import java.util.Scanner;

public class Veiculo {
    Scanner in = new Scanner(System.in);

    private int peso;
    private int velocmax;
    private float preco;

    public Veiculo() {
        this(0, 0, 0);
    }
    public Veiculo(int peso, int velocmax, float preco) {
        this.peso = peso;
        this.velocmax = velocmax;
        this.preco = preco;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public int getVelocmax() {
        return velocmax;
    }

    public void setVelocmax(int velocmax) {
        this.velocmax = velocmax;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public void leitura(){
        System.out.println("Digite o Peso: ");
        peso = in.nextInt();
        System.out.println("Digite o Velocidade maxima: ");
        velocmax = in.nextInt();
        System.out.println("Digite o Preço: ");
        preco = in.nextFloat();
    }
    public void imprimir(){
        System.out.println("Peso: " + peso + "Kg\nVelocidade Máxima:" + velocmax + "Km/h\nPreço: " + preco + "R$");
    }
}
