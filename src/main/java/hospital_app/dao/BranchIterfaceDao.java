package hospital_app.dao;

import java.util.List;

import hospital_app.dto.Branch;

public interface BranchIterfaceDao {
	
   public abstract Branch saveBranch(int id,Branch branch);
   public abstract Branch getBranchBYId(int id);
   public abstract List<Branch> getAllBranch();
   public abstract Branch updateBranchById(Branch branch,int id);
   public abstract boolean deleteBranchById(int id);
   public abstract List<Branch> getBranchByName(String name);
}
