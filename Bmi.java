import java.util.Scanner;

public class Bmi {
    public static void main(String[] args) {

        keisann();


    }
    public static void keisann() {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.printf("体重が何キロか入力してね");
            int weight = Integer.parseInt(sc.nextLine());
            System.out.println("身長が何ｃｍか入力してね");
            double height = Integer.parseInt(sc.nextLine());
            double tmp = height/100;
            double BMI = weight / (tmp * tmp);
            System.out.println("あなたのBMIは・・・");
            System.out.println(String.format("%.2f",BMI ));
            System.out.println("です。");
            if (BMI < 18.5) {
                System.out.println("いっぱい食べたほうがいいよねやっぱり");
            } else if (BMI > 25) {
                System.out.println("運動したらいいと思うよ寒いけどね");
            } else {
                System.out.println("正常です。現状維持！！");
            }
            again();
        } catch (NumberFormatException e){
            System.out.println(" 数字を入力してください！！！");
            keisann();
        }
    }
    public static void again() {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("もう一度計算を実行しますか？　Yes or No");
            String answer = sc.nextLine();
            if (answer.equals("Yes")) {
                keisann();
            } else if (answer.equals("No")) {
                System.out.println("ばいばい！");
            } else {
                System.out.println("YesかNoを打ってね！");
            }
        } catch (NumberFormatException e) {
            System.out.println("YesかNoで頼むわ");
        }
    }
}