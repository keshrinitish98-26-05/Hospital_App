package hospital_app.controller_Branch;

import hospital_app.dto.Branch;
import hospital_app.service.BranchService;

public class SaveBranch {

	public static void main(String[] args) {
		Branch branch = new Branch();
		branch.setName("dddddd");
		branch.setEmail("ddd@gmail.com");
		branch.setPhone(823545467);
		branch.setNoOfStaff(1500);
		BranchService branchService = new BranchService();
		Branch branch2 = branchService.saveBranch(1, branch);
		if (branch2 != null) {
			System.out.println("data inserted");
		} else {
			System.out.println("Data not inserted");
		}

	}

}
