package hospital_app.controller_Branch;

import java.util.List;

import hospital_app.dto.Branch;
import hospital_app.service.BranchService;

public class GetBranchByName {
	public static void main(String[] args) {
		BranchService branchService = new BranchService();
		List<Branch> list = branchService.getBranchByName("bbbccc");
		if (list != null) {
			for (Branch b : list) {
				System.out.println("" + b.getName());
				System.out.println("" + b.getEmail());
			}
		} else {
			System.out.println("No such Branch is present of this Name");
		}

	}

}
