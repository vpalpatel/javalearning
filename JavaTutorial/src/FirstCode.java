
public class FirstCode 
{
	public static void main(String args[])
	{
		int a = 50_00000;// 4 byte --> 32 bit-->-2,147,483,648 to 2,147,483,647
		int _$abc4 = 4;
		a =4;
		System.out.println(a);
		
		float f = 5.5f; // 4 byte
		double percent = 5.5; //8 byte
		long l =50000000000000l; //8 byte
		short s =5;//2 byte --> 16 bits-->-32768 to 32767
		byte b =5 ;// 1byte --> -128 to 127
		char c ='A'; // 'A' = 65 in ascii value
		c = 66;
		 System.out.println(c);
		 
		 double d1 = 5; // implicit conversion
		 int k = (int)5.6;//type casting
		 System.out.println(k);
		 System.out.println(d1);
	}

}
