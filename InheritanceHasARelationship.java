class OS 
{
	OS()
	{
		System.out.println("Operating system of type android is created");
	}
	void checkOS()
	{
		System.out.println("Operating system is running");
	}
} 

class Charger 
{
	Charger()
	{
		System.out.println("Charger created");
	}
	void checkCharger()
	{
		System.out.println("Charger can be acquired");
	}
}

class Mobile 
{
//Composed Object
	OS os=new OS();                           
	
  Mobile()
	{
		System.out.println("Mobile created");
	}
	void hasA(Charger reference) 
	{
		System.out.println("Charger acquired");
		System.out.println("Can be used");
	}
}

class InheritanceHasARelationship 
{
	public static void main(String args[])
	{
  //Main Object
		Mobile m=new Mobile(); 
  
  //Aggregate Object
		Charger c=new Charger();
    
		c.checkCharger();
		m.hasA(c);  
		m.os.checkOS();  
    
		//Mobile is destroyed.....
		m=null;
		System.out.println("Mobile Destroyed");
		c.checkCharger(); 
		try{
		m.os.checkOS(); 
		}
		catch(Exception e){
			System.out.println("OS is also destroyed if Mobile is destroyed...");
		}
    }
}
