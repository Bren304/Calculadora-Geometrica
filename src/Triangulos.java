public class Triangulos extends FigurasGeometricas{

    double base, altura, hipotenusa;

    final

    @Override
    public double calcularArea(){
        area = (base*altura)/2;
        return area;
    }

    @Override
    public double calcularPerimetro(){
        perimetro = base+altura+(Math.sqrt(Math.pow(base, 2)+Math.pow(altura, 2)));
        return perimetro;
    }

    public double calcularHipotenusa(){
        hipotenusa = (Math.sqrt(Math.pow(base, 2)+Math.pow(altura, 2)));
        return hipotenusa;
    }
}
