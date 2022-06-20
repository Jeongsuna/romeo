package C8075_GodClass;

import java.util.ArrayList;
import java.util.List;

public class GodClass_BAD {

    public void handleLogin(String hashuserID, String hashuserpw){
        String userID = decryptionhashString(hashuserID);
        String userPW = decryptionhashString(hashuserpw);
        if(!validuser(userID, userPW)){ return; }
    }

    public String decryptionhashString(String hashStr){
        String userID = "";
        //TODO Decrypt hashed string for 150 lines of code...
        return userID;
    }

    public boolean validuser(String userID, String userPW){
        //validate for 100 lines of code...
        List<String> userIDList = getIDList();
        if(!isuseridValid(userID,userIDList)){return false;}
        return true;
    }

    private List<String> getIDList() {
        List<String> userIDList = new ArrayList<>();
        //TODO: Add implementation details
        return userIDList;
    }

    private boolean isuseridValid(String userID, List<String> userIDList) {
        boolean isValidated = false;
        //TODO: Add implementation details
        return isValidated;
    }
}
