package br.com.debora;

public class BreastTissue extends Dados {
	
public int epoca = 0; // na parte de treinar, épocas que irão treinar
	
BreastTissue(){
	
	
	//double w2[][] = new double [data.length][atributos];

	byte i,j;
	
	for(i=0; i<w1.length;i++)
	{
		for(j=0; j<w1[i].length;j++)
		{
	      w1[i][j]= Math.random()*0.8+0.1;
		}
	 
	}
	
	
}
/*RNB(){
		byte i, j;
		
		// Initialize weights randomly between 0.1 and 0.9
		for(i=0; i<w1.length; i++)
			for(j=0; j<w1[i].length; j++)
				w1[i][j] = Math.random()*0.8+0.1;
		
		for(i=0; i<w2.length; i++)
			for(j=0; j<w2[i].length; j++)
				w2[i][j] = Math.random()*0.8+0.1;
	}*/
	
	public static void normaliza(double [][]dados){	
		double maior[] = {0,0,0,0,0,0,0,0,0}; // para converter tem que variar de 0 e 1
		double menor[] = {500000,500000,500000,500000,500000,500000,500000,500000,500000};
	
		int x = 0;
		//Encontra maior e menor valor de cada coluna e jogar na fórmula
		for(int i = 0; i < atributos; i++){
			for(int j = 0; j < dados.length; j++){	
				if(dados[j][i] > maior[x]){
					maior[x] = dados[j][i];
				}
				if(dados[j][i] < menor[x]){
					menor[x] = dados[j][i];
				}
			}
			x++;
		}
		
		//teste
		for(int i = 0; i < atributos; i++){
			System.out.println(" Maior : "+maior[i]);
			System.out.println(" Menor : "+menor[i]);
			System.out.println("");
		}
		
		//Função de normalização
		// x- menor / maior - menor
		for(int i = 0; i < dados.length; i++){
			for(int j = 0; j < atributos; j++){
				dados[i][j] = (dados[i][j] - menor[j])/(maior[j] - menor[j]);
				//System.out.print("    "+dados[i][j]);
			}	
			//System.out.println("");
		}
		
		
	}
	
	/*public void train() {
		// Call method learn with training data
		
		for (int i = 0; i < (data.length)-1; i++) {
			learn(data[i][0], data[i][1]);
		}

		epoca++;
	}
	*/
	public static void main(String[] args){
		normaliza(data); //Normaliza matriz data
		normaliza(teste); //Normaliza matriz test
		
		
		for(int i = 0; i < data.length; i++){
			for(int j = 0; j < atributos; j++){
				System.out.print("    "+data[i][j]);
			}	
			System.out.println("");
		}
		
		System.out.println("");
		
		for(int i = 0; i < teste.length; i++){
			for(int j = 0; j < atributos; j++){
				System.out.print("    "+teste[i][j]);
			}	
			System.out.println("");
		}
         
    }  
     

}
