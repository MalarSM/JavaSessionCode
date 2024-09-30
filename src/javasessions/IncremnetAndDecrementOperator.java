package javasessions;

public class IncremnetAndDecrementOperator {

	public static void main(String[] args) {
		//++ and --
		//1. post increment:
		int a=1;
		int b=a++;
		System.out.println(a);//2
		System.out.println(b);//1
		
		int c=-98;
		int d=c++;
		System.out.println(c);//-97
		System.out.println(d);//-98
		
		//2.Pre Increment
		int g = 1;
		int h = ++g;
		System.out.println(g);//2
		System.out.println(h);//2
		
		int e = -48;
		int f = ++e;
		System.out.println(e);//-47
		System.out.println(f);//-47
		
		int r = -100;
		int t = ++r;
		System.out.println(r);//-99
		System.out.println(t);//-99
		
		//3.Post decrement:
		int m = 2;
		int n = m--;
		System.out.println(m);//1
		System.out.println(n);//2
		
		//Assignment
		int i = 0;
		i = i++ - --i + ++i - i--;
		System.out.println(i);
		
		//boolean p = true;
		//p++; this is not correct program 
		//System.out.println(p);
		
		int p=1; int q = 2; r =3;
		int sum = p-- - q-- - r--;
		System.out.println(sum);
		System.out.println("p="+p);
		System.out.println("q="+q);
		System.out.println("r="+r);
		
		int k= 1; int l =2;
		System.out.println(--l - ++k + ++l - --k);
		
		
	}

}
