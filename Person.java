public class Person
{
    private String firstName;
    private String middleInitial, lastName;
    
    private boolean isFemale;
    
    Person( String f , String m , String l , boolean g )
    {
        this.firstName = f;
        middleInitial = m;
        lastName = l;
        this.isFemale = g;
    }
    
    
    
 
    public String getRank( )
{
return this.rank; 
}

public void setRank( String w )
{
rank = w; 
}

    
 
    public String toString( )
    {
        String a = firstName + " " + middleInitial + " " + lastName + " is ";
        if( isFemale )
        {
            return a + " female";
        }
        else
        {
            return a + " male";
        }
    }
}


public boolean getActiveDuty( ) 
{
return isActiveDuty;
}

public void makeActiveOrInactive( )
{
isActiveDuty = isActiveDuty; 
}

public String toString( )
{

String x = super.toString( ); 
if( isActiveDuty )
{
return x + " and is on active duty";
}
else
{
return x + " and is on reserve";
}
}
}

public class MilitaryPerson extends Person
{
private boolean isActiveDuty;

MilitaryPerson( String firstName , String middleInitial , String lastName , boolean isFemale , boolean isActiveDuty )
{

super( firstName , middleInitial , lastName , isFemale );
this.isActiveDuty = isActiveDuty;
}


public class NavySailor extends MilitaryPerson 
{
private boolean isSurface;
private String rank; 

NavySailor( String fn, String mi , String ln , boolean g , boolean activeDuty , boolean surface , String r )
{
super( fn , mi , ln , g , activeDuty ); 
isSurface = surface;
rank = r;
}

//2 getter, setter

public String getRank( )
{
return this.rank; 
}

public void setRank( String w )
{
rank = w; 
}

public String toString( )
{
String militaryString = super.toString( ); 

if( isSurface )
{
return militaryString + " and is in a surface submarine. Also, their rank is " + this.rank;
}
else
{
return militaryString + " and is in a regular submarine. Also, their rank is " + this.rank;
}
}
}

public class PersonTester
{
    public static void main( String args [] )
    {
        Person a = new Person( "Abraham" , "W" , "Lincoln" , false );
        System.out.println( a );
        
        MilitaryPerson b = new MilitaryPerson( "Joe" , "R" , "Biden" , false , false );
        
        System.out.println( b ); 
        
        NavySailor c;
        c = new NavySailor( "Tom" , "P" , "Milford" , false , false , true , "captain" );
        
        System.out.println( c ); 
        
    } 
 }
 
 
