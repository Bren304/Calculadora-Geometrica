public class Circulos extends FigurasGeometricas{

    double radio, diagonal;

    @Override
    public final double calcularArea (){
        area = Math.PI*Math.pow(radio, 2);
        return area;
    }

    @Override
    public final double calcularPerimetro(){
        perimetro = 2*Math.PI*radio;
        return perimetro;
    }

    public final double calcularDiagonal(){
        diagonal = 2*radio;
        return diagonal;
    }
}
