package EnumPrograms;


// We can not extends enum because internally enum is extends with java.lang.enum.
/*enum Days{
	Mon, Tue, Fri;
}
public class EnumWithEXtendsKeyword extends Days {}	*/ 		//it will throw CE:

/*enum A{}
public extends java.lang.enum {}*/		//it will throw CE:

/*class EnumWithEXtendsKeyword{			//it will throw CE:
	
}
enum A extends EnumWithEXtendsKeyword{
	
}*/


/* Enum with implementation*/

/*interface EnumWithEXtendsKeyword{	
}
enum A implements EnumWithEXtendsKeyword{
	a,b,c
}*/

