package hospital_app.service;

import java.util.List;

import hospital_app.dao.BranchDao;
import hospital_app.dto.Branch;
import hospital_app.dto.Hospital;

public class BranchService {
	BranchDao branchDao=new BranchDao();
	public Branch saveBranch(int id,Branch branch) {
		
		return branchDao.saveBranch(id,branch);
	}

	public Branch getBranchBYId(int id) {
		return branchDao.getBranchBYId(id);
	}

	public List<Branch> getAllBranch() {
		return branchDao.getAllBranch();
	}

	public Branch updateBranchById(Branch branch, int id) {
		return branchDao.updateBranchById(branch, id);
	}

	public boolean deleteBranchById(int id) {
		return branchDao.deleteBranchById(id);
	}

	public List<Branch> getBranchByName(String name) {
		return branchDao.getBranchByName(name);
	}

}
