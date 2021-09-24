import java.util.Scanner;

import java.util.Scanner;
public class MyChar {
    char ch;
    MyChar(char ch){
        this.ch=ch;

    }
    
public static void main(String[] args) {
    

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any chactor  :");
      char c = sc.next().charAt(0);

    MyChar myChar = new MyChar(c);
    
     System.out.println(myChar.isVowel());
     
}

public String isVowel(){
    char [] arrToFind = { 'a', 'e', 'i', 'o', 'u'};
    for(int i = 0; i<5 ; i++)
    {
        if(arrToFind[i] == ch){
        return " It is Vowel ";
        }
    } 
    return "It is Consont ";

}

}
