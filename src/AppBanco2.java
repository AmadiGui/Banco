import model.ContaBancaria;
public class AppBanco2 {
		public static void main(String args[]) {
			ContaBancaria[] contas;
			contas = new ContaBancaria[10];
			
			
			for (int pos=0; pos <= contas.length-1;pos++ ) {
				contas[pos] = new ContaBancaria("111.111.111-1"+pos,10000+pos,pos);
				contas[pos].creditar(1000 + (pos*100));
			}
			
//			for (int pos=0; pos < contas.length; pos++) {
//				System.out.println(contas[pos].exibirInfo());
//			}
						
//			System.out.println(contas[3].getNumeroConta());
			
			for (int pos=0; pos < contas.length; pos++) {
				if ( contas[pos].getNumeroConta() == 10003) {
					System.out.println(contas[pos].exibirInfo());	
				}
			}
		}
	}