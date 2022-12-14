import java.util.*;
class Rolldie{
	public static void main(String args[]){
Scanner in = new Scanner(System.in);
int space =20;
int current =0;
int maximumrolls = 5;
Random random = new Random();


 for(int i=1; i<=maximumrolls; i++)
{
	int die = random.nextInt(6) + 1;
	current = current+die;
	System.out.println("You have rolled::" + die);

	if (current == space)
	{
		System.out.println(" You're on space " +current +"  Congrats, you win! ");
		break;
	}
	              else if(current > space)
	          {
		             int left = space - current;
		            System.out.println(" You are now on space " + current + "and have " + left +" more to go.");
		            break;
	           }
	                       else if(i == maximumrolls && current < space)
	                       {
	                     	System.out.println("You are now on space " + current + " and unfortunately you have not reached on a space " );
		                    break;
		                    }

			                else{
			                int togo = space - current;
			                System.out.println("You are now on space " + current +
			                "  and have " + togo + " more to go.");


		                         }
		                         System.out.println();
	                         }
                        }
                  	}

