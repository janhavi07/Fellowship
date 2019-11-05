package AlogarithmPrograms;
import Utility.*;
public class TaskDetails 
{
  int taskId;
  int taskTime;
  int taskDeadline;
   
   public void getData()
   {
	   System.out.println("Enter the Taskid");
	   taskId=Utility.readInt();
	   System.out.println("Enter the Tasktime");
	   taskTime=Utility.readInt();
	   System.out.println("Enter the Task deadline");
	   taskDeadline=Utility.readInt();
   }

	
    public void putdata()

  {
    System.out.println();
	System.out.print("Job :"+taskId + " ");
	System.out.print(taskTime + " ");
	System.out.print(taskDeadline);
   }
   
}



	


