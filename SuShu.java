package SuShu;
public class SuShu {
    public static int count = 0;
    public static void main(String[] args) {
        for (int i = 1; i < 200; i++) {
            boolean b = true;//默认此数就是素数
            for (int j = 2; j <= Math.sqrt(i);j++){
                if(i%j ==0){
                    b = false;
                    break;
                }
            }
            if(b){
                count++;
                System.out.print(i + " ");
            }
        }
        System.out.println("\n素数的个数："+count);
    }
}