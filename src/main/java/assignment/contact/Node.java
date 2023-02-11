package assignment.contact;
import java.util.logging.Logger;
class LinkedList{
	Logger logger = Logger.getLogger("hio");
    Node rootnode;
    int count = 0;
    
    public class Node {
    	String name;
    	long phone;
    	String email;
    	Node nextnode;
    	Node(String name,long phone,String email){
    		this.name = name;
    		this.phone = phone;
    		this.email = email;
    	}
    }
    LinkedList()
    {
    	rootnode = null;
    }
    
    void addElement(String name,long phone,String email)
    {
    	
            if(rootnode == null)
            {
                rootnode= new  Node(name,phone,email);
                count++;
            }
            else
            {
                Node temp = rootnode;
                while(temp.nextnode != null)
                {
                    temp = temp.nextnode;
                }
                temp.nextnode = new Node(name,phone,email);
                count++;
            }
    }
    
    void addElements(String name,long phone,String email,int index){
        Node n1;
        Node n2;
        n1 = new Node(name,phone,email);
        if(index == 0)
        {
            n1.nextnode = rootnode;
            rootnode = n1;
            
        }
        else{
            n2 = rootnode;
            if(index > count)
            {
                logger.info("invalid");
            }
            else{
                int i =1;
                while(i<index)
                {
                    n2 = n2.nextnode;
                    i++;
                }
                n1.nextnode = n2.nextnode;
                n2.nextnode = n1;
            }

        }
    }
    
    void removeElement(int index){
       Node n1 = rootnode;
       if(index == 0)
       {
            rootnode = n1.nextnode;
           
       }
       else{
        int i =1;
            while(i<index)
            {
                n1 = n1.nextnode;
                i++;
            }
       }
       n1.nextnode = n1.nextnode.nextnode;
    }
    
    void search(String search)
    {
    	int flag = 0;
    	Node searchnode = rootnode;
    	while(searchnode != null)
    	{
    		if(search.equals(searchnode.name))
    		{
    			flag = 1;
        		String a = searchnode.email;
    			long b = searchnode.phone;
    			String c = searchnode.name;
    			logger.info("Name:"+c);
    			logger.info("Phone:"+b);
    			logger.info("Email1:"+a);
    		}
    		searchnode = searchnode.nextnode;
    	}
    	if(flag == 0)
    	{
    		logger.info("No Contact on the List");
    	}
    }

    
    void print()
    {
    	Node temp1 = rootnode;
    	if(temp1 == null)
    	{
    		logger.info("Empty List");
    	}
    	else
    	{
    		while(temp1 != null)
    		{
    			String a = temp1.email;
    			long b = temp1.phone;
    			String c = temp1.name;
    			logger.info("Name:"+c);
    			logger.info("Phone:"+b);
    			logger.info("Email1:"+a);
    			temp1 = temp1.nextnode;
    		}
    		
    	}
    }
}
