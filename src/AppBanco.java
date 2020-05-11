import model.ContaBancaria;

public class AppBanco {
	public static void main(String args[]) {
//		System.out.println("hello java");
			ContaBancaria c1,c2;

			c1 = new ContaBancaria("111.111.111-00",10001,2);
			c2 = new ContaBancaria("222.222.222-00",10002,3);
			
			c1.creditar(4000);
			c2.creditar(1000);
			
			System.out.println(c1.exibirInfo());
			System.out.println(c2.exibirInfo());

			
	}
}
//
