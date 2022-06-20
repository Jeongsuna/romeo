package C8075_GodClass;

import java.util.ArrayList;
import java.util.List;

public class GodClass_GOOD {
    public class RefactoredLoginManager {
        IDecryptHandler decryptHandler;
        IValidateHandler validateHandler;
        public void handleLogin(String hashuserID, String hashuserpw){
            String userID = decryptHandler.decryptionhashString(hashuserID);
            String userPW = decryptHandler.decryptionhashString(hashuserpw);
            if(!validateHandler.validuser(userID, userPW)){ return; }
        }
    }
    public class DecryptHandler implements IDecryptHandler {

        public String decryptionhashString(String hashStr){
            String userID = "";
            //TODO Decrypt hashed string for 150 lines of code...
            return userID;
        }

    }
    public class ValidateHandler implements IValidateHandler {
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

        private boolean isuseridValid(String userID, List<String> userIDList)
        {
            boolean isValidated = false;
            //TODO: Add implementation details
            return isValidated;
        }
    }

    public interface IDecryptHandler {
        String decryptionhashString(String hashStr);
    }
    public interface IValidateHandler {
        boolean validuser(String userID, String userPW);
    }
}