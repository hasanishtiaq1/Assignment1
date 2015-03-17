package com.ass.www;

public class Assembly {

int stations = 4;
	public void asseblyLine() {


int f1[] = new int[stations];	
int f2[] = new int[stations];
int a1[] = new int[stations];
int a2[] = new int[stations];
int t1[] = new int[stations];
int t2[] = new int[stations];

int l1[] = new int[stations];
int l2[] = new int[stations];
int x1 = 18;
int x2 = 7;
int fs;
int fl;
	
	
	
int e1 = 10;
int e2 = 12;
a1[0] = 4;
a1[1] = 5;
a1[2] = 3;
a1[3] = 2;
a2[0] = 2;
a2[1] = 10;
a2[2] = 1;
a2[3] = 4;
t1[0] = 0;
t1[1] = 7;
t1[2] = 4;
t1[3] = 5;
	t2[0] = 0;
	t2[1] = 9;
	t2[2] = 2;
	t2[3] = 8;
	
	f1[0] = e1 + a1[0];
	f2[0] = e2 + a2[0];
	
	for(int j=1;j<stations;j++) {
		if((f1[j-1]+a1[j])<= (f2[j-1]+t2[j-1]+a1[j])) {
			f1[j] = f1[j-1] + a1[j];
			l1[j] = 1;
		}
		else {
			f1[j] = f2[j-1]+t2[j-1]+a1[j];
			l1[j] = 2;			
		}
		
		if((f2[j-1]+a2[j])<=(f1[j-1]+t1[j-1]+a2[j])){
			f2[j] = f2[j-1] + a2[j];
			l2[j] = 2;
		}
		else {
			f2[j]= f1[j-1]+t1[j-1]+a2[j];
			l2[j] = 1;			
		}
	}
	
	if((f1[stations-1] + x1)<=(f2[stations-1]+x2)) {
		fs = f1[stations-1] + x1;
		fl = 1;
	
	} 		
	else {
		fs = f2[stations-1] + x2;
		fl = 2;
		
	}
	if(fl == 1)
	{
		for(int i=1;i<l1.length;i++)
		{
			System.out.println(l1[i]);
		}
	}
	else
	{
		for(int i=1;i<l2.length;i++)
		{
			System.out.println(l2[i]);
		}
	}
	System.out.println(fl);

	System.out.println("Total Time "+fs);
	System.out.println("Exit Line " + fl);
}

	

	

}
