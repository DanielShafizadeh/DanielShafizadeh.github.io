import java.util.ArrayList;

public class functions {
private String f;
private String[] z;
public int c=0;
public functions(String expr) {
	f=expr;
}

private boolean isDouble(String str) {
    try {
        Double.parseDouble(str);
        return true;
    }
    catch(NumberFormatException e) {
        return false;
    }

}        

public String getExp() {
	return f;
}
public int chaCount(String i, String v) {
	int count=0;
	ArrayList<String> lis=new ArrayList<String>();
	lis.add(v);
for(String d:lis) {
	if(d==i) {
		count++;
	}
}
return count;
}
public String fact(String f) {
	int x=Integer.parseInt(f);
	if ( x== 0)    
	    return String.valueOf(1);    
	  else    
	    return String.valueOf(x * Integer.parseInt(String.valueOf(Integer.parseInt(f)-1)));    
}
/*public String parentheses(String f)
{ String l = new String();
String r= new String();
 for(int i=0;i<chaCount("(",f);i++) {
	 f=f.substring(f.indexOf("(")+1);
	 c++;
 }
	//recursive count needed and then look for closed parentheses
	l=f.substring(f.indexOf("(")+1);
	if(l.indexOf("(")!=-1)
	{
	parentheses(l);
	}
	
	}*/
/*public String emdas(String x) {
	int count=0;
	ArrayList<String> opplist = new ArrayList<String>();
	ArrayList<String> opps = new ArrayList<String>();
	opplist.add("+");
	opplist.add("-");
	opplist.add("*");
	opplist.add("/");
	opplist.add("^");
	for (int i = 0; i < opplist.size(); i++) {
	    for (int j=0; j < x.length(); j++) {
	        if (opplist.get(i).charAt(0) == x.charAt(j)) {
	            opps.add(opplist.get(i));
	            opplist.remove(i);
	        }
	    }
	}
	if(opps.contains("^")) {
		
	}
	String y=
			
}*/
public double expon() {
	z=f.split("^");
	double y=0;
	for(String x:z) {
		if(z[0]==x) {
			y=Double.parseDouble(x);
		}
		else {
		y=Math.pow(y,Double.parseDouble(x));
		}
		
	}
return y;
}
public  double sum()
{
	z=f.split("\\+");
	double y=0;
	for(String x:z) {
		if(z[0]==x) {
			y=Double.parseDouble(x);
		}
		else {
		y+=Double.parseDouble(x);
		}
		
	}
return y;
}
public double diff() {
	double y=0;
	z=f.split("-");
	for(String x:z) {
		if(z[0]==x) {
			y=Double.parseDouble(x);
		}
		else {
		y-=Double.parseDouble(x);
		}
		
	}
	return y;
}
public double quo() {
	double y=0;
	z=f.split("/");
	for(String x:z) {
		if(z[0]==x) {
			y=Double.parseDouble(x);
		}
		else {
		y=y/Double.parseDouble(x);
		}
		
	}
	return y;
}
public double pro() {
	double y=0;
	z=f.split("\\*");
	for(String x:z) {
		if(z[0]==x) {
			y=Double.parseDouble(x);
		}
		else {
		y=y*Double.parseDouble(x);
		}
		
	}
	return y;
}
public static void main(String[]args) {
	functions x= new functions("2+2");
	System.out.println(x.sum());
}
}

