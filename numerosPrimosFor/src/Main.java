public class Main {
    public static void main(String[] args) {
        for(int x = 2; x < 50; x++){
            int i;
            for(i = 2; i<= x / 2; i++){
                if(x % i == 0){
                    break;
                }
            }
            if (i > x / 2) {
                System.out.println(x);
            }
        }
    }
}