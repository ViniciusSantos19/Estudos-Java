package com.dio;

public class PrimeiroPrograma {

	public static void main(String[] args) {
		System.out.println("Olá mundo");
		int A = 1;
		int B = 1;
		int C[] = {1, 2 ,3, 4, 5, 6, 7, 8, 9, 10};
		int D = 0;
		int E = 20;
		int F;
		int G;
		int H;
		int Aux;
		String Texto = "1 2 3 4";
		System.out.println(""+(A + B));
		System.out.println(""+Texto);
		System.out.println("Teste for");
		for(int  i = 0; i < 10; i++){
			System.out.println(""+C[i]);
		}
		System.out.println("Teste while");
		while(D <= 20) {
			System.out.println(""+D);
			D++;
		}
		System.out.println("Teste Do While");
		do {
			System.out.println(""+E);
			E--;
		}while(E >= 1);
		
		for(F = 1; F < 99; F++) {
			if((F % 7) == 0) {
				System.out.println(""+F);
			}
				
		}
		System.out.println("Números primos");
		for(G = 0; G < 100; G++) {
			H = 1;
			Aux = 0;
			while (H <= G && Aux <= 2){
				if((G % H) == 0){
					Aux++;
				}
				H++;
			}
			if(Aux == 2){
				System.out.println(""+G);
			}
		}
		
	}

}

