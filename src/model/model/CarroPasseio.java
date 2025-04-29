package model;
import java.util.Scanner;

public class CarroPasseio extends Veiculo{
    Scanner in = new Scanner(System.in);

    private String cor;
    private String modelo;

    public CarroPasseio() {
        this(null, null);
    }
    public CarroPasseio(String cor, String modelo) {
        this.cor = cor;
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void leitura(){
        super.leitura();
        System.out.println("Digite a Cor: ");
        cor = in.nextLine();
        System.out.println("Digite o Modelo: ");
        modelo = in.nextLine();
    }
    public void imprimir(){
        super.imprimir();
        System.out.println("Modelo: " + modelo + "\nCor: " + cor "\n");
    }
}
