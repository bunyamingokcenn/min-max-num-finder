import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // iki farklı karşılaştırmayla önce süreki büyük olanı atayarak bul, büyük olanı büyük değişenine ata. Sonra aynısını küçüğü bulmak için yap
        int inpCount, inputNum, bigNum= 0, smallNum;

        Scanner input = new Scanner(System.in);

        System.out.print("Kaç tane sayı gireceksiniz:  ");
        inpCount = input.nextInt();

        System.out.print("1. sayıyı giriniz: ");
        inputNum = input.nextInt();
        bigNum = inputNum;
        smallNum = inputNum;;

        for (int i = 2; i <= inpCount; i++){
            System.out.print(i + ". sayıyı giriniz: ");
            inputNum = input.nextInt();

            //Büyük sayı hesaplama
            if(inputNum > bigNum){
                bigNum = inputNum;
            }

            //Küçük sayı hesaplama
            if (inputNum < smallNum ){
                smallNum = inputNum;
            }

        }
        System.out.println("En büyük sayı: " + bigNum);
        System.out.println("En küçük sayı: " + smallNum);
    }
}