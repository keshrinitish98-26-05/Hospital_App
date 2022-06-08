package hospital_app.controller_Branch;

import hospital_app.dto.Branch;
import hospital_app.service.BranchService;

public class GetBranchById {
	public static void main(String[] args) {
		BranchService branchService = new BranchService();
		Branch branch = branchService.getBranchBYId(2);
		if (branch != null) {
			System.out.println("" + branch.getName());
			System.out.println("" + branch.getEmail());
			System.out.println("" + branch.getPhone());
		} else {
			System.out.println("No such branch present of this Id");
		}
	}

}
