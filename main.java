class main
{   public static void main(String[] agrs)
	{
	  StringBuilder s1 = new StringBuilder("Hello");
	  StringBuilder s2= new StringBuilder("bansal");
	  String s3= String.format("%s%s",s1,s2);
	  System.out.println(s3);
	  System.out.printf("%s%s",s1,s2);
	  
	}  
	
}