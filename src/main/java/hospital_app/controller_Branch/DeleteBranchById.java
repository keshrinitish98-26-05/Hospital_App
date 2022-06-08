package hospital_app.controller_Branch;

import hospital_app.service.BranchService;

public class DeleteBranchById {
	
	public static void main(String[] args) {
		BranchService branchService=new  BranchService();
		boolean b=branchService.deleteBranchById(3);
		if(b==true)
		{
			System.out.println("Data deleted");
		}
		else
		{
			System.out.println("Data not deleted");
		}
	}

}
