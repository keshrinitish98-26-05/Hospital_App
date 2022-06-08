package hospital_app.controller_Branch;

import java.util.List;

import hospital_app.dto.Branch;
import hospital_app.service.BranchService;

public class GetAllBranch {

	public static void main(String[] args) {
		BranchService branchService = new BranchService();
		List<Branch> list = branchService.getAllBranch();
		if (list != null) {
			for (Branch b : list) {
				System.out.println("----------------------------");
				System.out.println("" + b.getName());
				System.out.println("" + b.getEmail());
				System.out.println("" + b.getNoOfStaff());
			}
		} else {
			System.out.println("Not a single branch present ");
		}
	}

}
