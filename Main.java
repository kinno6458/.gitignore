import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        keisann();
    }
    public static void keisann() {
        Scanner sc = new Scanner(System.in);
        System.out.printf("体重が何キロか入力してね");
        try {
            int height = Integer.parseInt(sc.nextLine());
            System.out.println("身長が何ｃｍか入力してね");
            double weight = Integer.parseInt(sc.nextLine());
            double tmp = weight/100;
            double tmp2 = tmp * tmp;
            double BMI = height / tmp2;
            System.out.println("あなたのBMIは・・・");
            System.out.println(String.format("%.1f",BMI ));
            System.out.println("です。");
            if (BMI <= 18.5) {
                System.out.println("いっぱい食べたほうがいいよねやっぱり");
            } else if (BMI >= 25) {
                System.out.println("運動したらいいと思うよ寒いけどね");
            } else {
                System.out.println("正常です。現状維持！！");
            }
        } catch (NumberFormatException e){
            System.out.println(" 数字を入力してください！！！");
            keisann();
        }
    }
}
