package assignment.contact;
import java.util.*;
import java.util.logging.Logger;
public class MainContact 
{
    public static void main( String[] args )
    {
    	Scanner sc = new Scanner(System.in);
    	Logger logger = Logger.getLogger("hi");
    	LinkedList obj = new LinkedList();
    	while(true)
    	{
    		logger.info("Choose Option:\n1.Add\n2.Add Position\n3.Remove\n4.Search\n5.Print\n6.exit");
    		int op = sc.nextInt();
    		switch(op)
    		{
    			case 1:
    			{
    	    		logger.info("Enter Name:");
    	    		String name = sc.next();
    	    		logger.info("Enter Your Mobile Number:");
    	    		long phone = sc.nextLong();
    	    		logger.info("Enter Email ID:");
    	    		String email = sc.next();
    				obj.addElement(name,phone,email);
    				break;
    			}
    			case 2:
    			{
    				logger.info("Enter index::");
    				int index = sc.nextInt();
    				logger.info("Enter Name:");
    	    		String name = sc.next();
    	    		logger.info("Enter Your Mobile Number:");
    	    		long phone = sc.nextLong();
    	    		logger.info("Enter Email ID:");
    	    		String email = sc.next();
    				obj.addElements(name,phone,email,index);
    				break;
    			}
    			case 3:
    			{
    				logger.info("Enter index::");
    				int index = sc.nextInt();
    				obj.removeElement(index);
    				break;
    				
    			}
    			case 5:
    			{
    				obj.print();
    				break;
    			}
    			case 4:
    			{
    				logger.info("Enter Name or Mail to search::");
    				String search = sc.next();
    				obj.search(search);
    				break;
    			}
    			case 6:
    			{
    				System.exit(0);
    				break;
    			}
    			default:
    			{
    				logger.info("Invalid Option");
    				break;
    			}
    		}
    	}
    }
}
