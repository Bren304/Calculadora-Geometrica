public class Rectangulos extends FigurasGeometricas{

    double diagonal, base, altura;

    @Override
    public double calcularArea(){
        area = base*altura;
        return area;
    }

    @Override
    public double calcularPerimetro(){
        perimetro = (base*2)+(altura*2);
        return perimetro;
    }

    public double calcularDiagonal(){
        diagonal = Math.sqrt((Math.pow(base, 2))+(Math.pow(altura, 2)));
        return diagonal;
    }
}
