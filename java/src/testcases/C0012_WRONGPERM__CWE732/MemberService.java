package testcases.C0012_WRONGPERM__CWE732;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

@Service
public class MemberService {
  
	@Resource(name="memberDao")
	private MemberDao dao;
	
    public void deleteMember(MemberModel memberModel){
    	dao.deleteMember(memberModel);
    }
    
    public boolean modifyMember(MemberModel memberModel){
    	try {
    	    dao.updateMember(memberModel);
    	}catch(Exception e){
    		return false;
    	}
    	return true; 	    
    }
    
	public int addMember(MemberModel memberModel) {
		if ( dao.selectMember(memberModel.getUserId()) != null ) {
			return 1;
		} else {
		           try {
		                   dao.insertMember(memberModel);
		                   return 3;
		           }catch(Exception e ){
			               return 2;
		           }
		}
	}
	
	public MemberModel findMember(String userId ) {
		return dao.selectMember(userId);
	}

	
}
