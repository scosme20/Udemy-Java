package entities;

public class Retangulo {
    public double largura;
   public  double altura;

    public double area(){
        double areaR = largura * altura;
        return areaR;
    }

    public double perimetro(){
        double perimetroR = 2 * (largura + altura);
        return perimetroR;
    }

    public  double diagonal(){
        double diagonalR = Math.sqrt((largura * largura) + (altura * altura));
        return diagonalR;
    }
}
