package Kadai_01;
import java.util.Scanner;

public class Kadai01 {
	
	
  public static void main(String[] args) {
	  
    System.out.println("����");
    //�C���X�^���X��
    Scanner scanner = new Scanner(System.in);  
    //scanner��ǂݎ���悤��
    int num =scanner.nextInt();
    //scanner���I���
    scanner.close();
    //���͒l�̓������߂�
	int max = num * num;
	//�ő包�����擾
	int total = String.valueOf(max).length();   
    //for���g���Ċ|���Z      
    for(int num1=1; num1<=num; num1++) {
      for(int num2=1; num2<=num; num2++) {
        int result = num1 * num2;   
        //�\��
    	System.out.printf(" " + "%" + total + "d", result);
      }
      System.out.println();
    }
          
  }		
	 
}	  
	  
	 
