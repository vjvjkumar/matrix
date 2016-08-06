package Pack1;

public class Matrix4by4VJ {

	public static void main(String[] args) {
		
		for (int i=1; i<=16; i=i+4){
			for (int j=i; j<=i+3; j++){
				System.out.print(j+" ");
			}
			System.out.println();	
		}

	}

}
