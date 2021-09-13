public class MyChar {
    char ch;
    MyChar(char ch){
        this.ch=ch;

    }
    

    
public static void main(String[] args) {
    MyChar myChar = new MyChar('c');
    System.out.println( myChar.isVowel());
    System.out.println(myChar.isConstant());
}


public boolean isConstant() {
    if(!isVowel() )
        return true;
    
	return false;
    
}



public boolean isVowel(){
    if ( ch == 'a')
     return true;
    if(  ch == 'e')
    return true;
    if( ch == 'i')
    return true;
    if (ch == 'o')
    return true;

    if (ch == 'u')
    return true;
    if (ch == 'A')
    return true;
    if (ch == 'E')
    return true;
    if (ch == 'I')
    return true;
    if (ch == 'O')
    return true;
    if (ch == 'U')
    return true;

	return false;
     
}

}
