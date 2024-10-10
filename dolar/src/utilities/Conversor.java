package utilities;

public class Conversor {
    public static  double precoDollar;
    public static double quantidade;

    public  static double converter(){
        double noIof = precoDollar * quantidade;
        double iof = noIof * 0.06;
        return  noIof + iof;
    }
}
