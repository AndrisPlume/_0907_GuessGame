import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        // definējam datora nejauša skaitļa izvēli un vajadzīgo integer sākumvērtības

        Random Random_number= new Random();
        int right_nr=Random_number.nextInt(100);
        int meginajumi=0;
        Scanner scan=new Scanner(System.in);
        System.out.println("Uzmini skaitli no 1-100, Tev ir 10 mēģinājumi" );


        int guess;
        int m=0;

        // kamēr boolean uzm ir false mēģinam minēt, mēģinājumu skaitu skaitam uz priekšu
        boolean uzm=false;
        while(uzm==false) {
            guess=scan.nextInt();
            meginajumi++;

            // ja skaitlis uzminēts boolean uzm=true
            if(guess==right_nr) {
                uzm=true;
                    }
            // citādi ja beidzas mēģinājumi izvadam paziņojumu

            else if(m>8){
                System.out.println("Tu zaudēji, pareizais skaitlis bija : "+right_nr);
                        return;
            }
            //citādi ja skaitlis ir mazāks izvadam paziņojumu un mēģ. skaitu

            else if(guess<right_nr){
                m++;
                System.out.println("Tavs skaitlis par mazu, atlikuši "+(10-m)+" mēģinājumi!");

            }
            // citādi ja skaitlis ir lielāks izvadam paziņojumu un mēģ. skaitu

            else if(guess>right_nr) {
                m++;
                System.out.println("Tavs skaitlis par lielu, atlikuši "+(10-m)+" mēģinājumi!");

            }


        }
        // beigu paziņojums pēc uzminēšanas

        System.out.println("Tu uzvarēji !!!");
        System.out.println("Pareizais skaitlis ir "+right_nr);
        System.out.println("Tu izmantoji "+meginajumi+" mēģinājumus.");

            }
        }
