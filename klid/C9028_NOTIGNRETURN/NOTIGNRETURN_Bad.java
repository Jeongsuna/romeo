package C9028_NOTIGNRETURN;

public class NOTIGNRETURN_Bad {

    public void handle(String str){
        str.toLowerCase(); // Noncompliant; result of method thrown away
//  ...
    }

}
