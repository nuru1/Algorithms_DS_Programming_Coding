package programs;

interface s {
	void m();
}

abstract class p implements s{}


class b implements p{
	public void method() {
		public void m() {;}
	}
}
public class Test extends c implements b{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			/*t a = new t("A");
			t b = new t("B");
			
			b.start();
			a.start();*/
		/*try {
		Float f1 = new Float("3.0");
		int x = f1.intValue();
		byte b = f1.byteValue();
		double d = f1.doubleValue();
		System.out.println(x+b+d);
		}catch (NumberFormatException e) {
			e.printStackTrace();
		}*/
		
		(new Test()).method();
	}
	
	
	
}
