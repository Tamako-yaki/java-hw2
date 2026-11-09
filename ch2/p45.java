import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class p45 {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("請輸入5個人的分數");

    int test[] = new int[5];
    
    for (int i = 0; i < test.length; i++){
      String str = br.readLine();
      test[i]=Integer.parseInt(str);
    }

    // Sorting
    for (int i = 0; i < test.length; i++){
      for (int j = i+1 ; j < test.length ; j++){
        if (test[j] > test[i]){
          int tmp = test[j];
          test[j]=test[i];
          test[i]=tmp;
        }
      }
    }


    for (int i = 0; i < test.length; i++) {
      System.out.println("第"+ (i+1) + "名的分數是" +test[i]);
    }
  }
}
