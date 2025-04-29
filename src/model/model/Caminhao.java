package model;
import java.util.Scanner;

public class Caminhao extends Veiculo{
    Scanner in = new Scanner(System.in);

    private float cargamax;
    private int alturamax;
    private int comprimento;

    public Caminhao(){
        this(0, 0, 0);
    }

    public Caminhao(float cargamax, int alturamax, int comprimento){
        this.cargamax = cargamax;
        this.alturamax = alturamax;
        this.comprimento = comprimento;
    }

    public float getCargamax() {
        return cargamax;
    }

    public void setCargamax(float cargamax) {
        this.cargamax = cargamax;
    }

    public int getAlturamax() {
        return alturamax;
    }

    public void setAlturamax(int alturamax) {
        this.alturamax = alturamax;
    }

    public int getComprimento() {
        return comprimento;
    }

    public void setComprimento(int comprimento) {
        this.comprimento = comprimento;
    }

    public void leitura(){
        super.leitura();
        System.out.println("Digite a Carga Máxima:");
        cargamax = in.nextFloat();
        System.out.println("Digite a Altura Maxima:");
        alturamax = in.nextInt();
        System.out.println("Digite o Comprimento do Veiculo:");
        comprimento = in.nextInt();
    }
    public void imprimir(){
        super.imprimir();
        System.out.println("Carga máxima:" + cargamax + "Ton\nAltura máxima: " + alturamax + "m\nComprimento: " + comprimento + "m\n");
    }
}
