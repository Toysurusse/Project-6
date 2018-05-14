package control;

import static java.lang.Character.isDigit;

public class Control {

    public boolean Isnumeric (String chain){
        boolean result=true;
        for (int i = 0; i<=chain.length();i++){
            if (!isDigit(chain.charAt(i))){
                result=false;
            }
        }
    return result;}
}
