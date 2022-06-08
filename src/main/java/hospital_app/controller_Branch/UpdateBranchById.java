package hospital_app.controller_Branch;

import hospital_app.dto.Branch;
import hospital_app.service.BranchService;

public class UpdateBranchById {
	public static void main(String[] args) {
		Branch branch = new Branch();
		branch.setName("SumBanaras");
		branch.setPhone(99999999);
		BranchService branchService = new BranchService();
		Branch branch2 = branchService.updateBranchById(branch, 1);
		if (branch2 != null) {
			System.out.println("Data Updated");
		} else {
			System.out.println("Data not updated");
		}
	}

}
