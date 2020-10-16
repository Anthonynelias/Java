
public class ExercicioMultiplode3 {
	public static void main(String[] args) {
			for(int contador = 0;contador <= 100; contador += 3) {
				System.out.print(contador + " ");
			}
			// ou
			System.out.println();
			for(int contador = 0;contador <= 100; contador++) {
				if(contador % 3 == 0) {
					System.out.print(contador + " ");
				}
			}
	}

}
