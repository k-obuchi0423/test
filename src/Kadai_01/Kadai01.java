package Kadai_01;
import java.util.Scanner;

public class Kadai01 {
	
	
  public static void main(String[] args) {
	  
    System.out.println("入力");
    //インスタンス化
    Scanner scanner = new Scanner(System.in);  
    //scannerを読み取れるように
    int num =scanner.nextInt();
    //scannerを終わる
    scanner.close();
    //入力値の二乗を求める
	int max = num * num;
	//最大桁数を取得
	int total = String.valueOf(max).length();   
    //for文使って掛け算      
    for(int num1=1; num1<=num; num1++) {
      for(int num2=1; num2<=num; num2++) {
        int result = num1 * num2;   
        //表示
    	System.out.printf(" " + "%" + total + "d", result);
      }
      System.out.println();
    }
          
  }		
	 
}	  
	  
	 
