package Sessao5.EX1;

public class Retangulo {
    private double largura;
    private double altura;

    public Retangulo() {}

    public void setLargura(double largura) {
        this.largura = largura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getLargura() {
        return largura;
    }

    public double getAltura() {
        return altura;
    }

    public double calcularArea() {
        return largura * altura;
    }

    public double calcularPerimetro() {
        return 2 * (largura + altura);
    }

    public static void main(String[] args) {
        Retangulo retangulo = new Retangulo();
        retangulo.setLargura(5.0);
        retangulo.setAltura(3.0);

        System.out.println("Área do retângulo: " + retangulo.calcularArea());
        System.out.println("Perímetro do retângulo: " + retangulo.calcularPerimetro());
    }
}