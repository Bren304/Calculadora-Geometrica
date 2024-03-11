public class Cuadrados extends Rectangulos{

    @Override
    public final double calcularArea(){
        area = Math.pow(base, 2);
        return area;
    }

    @Override
    public final double calcularPerimetro(){
        perimetro = 4*base;
        return perimetro;
    }

    @Override
    public final double calcularDiagonal(){
        diagonal = Math.sqrt(2*Math.pow(base, 2));
        return diagonal;
    }
}
