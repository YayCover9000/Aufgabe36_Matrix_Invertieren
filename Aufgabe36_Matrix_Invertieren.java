
public class Aufgabe36_Matrix_Invertieren {

	public static void main(String[] args) {
		
		char[][] matrix = { 
				
				{ ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ' },
				{ ' ', ' ', ' ', ' ', ' ', 'X', ' ', ' ', ' ', ' ', ' ' },
				{ ' ', ' ', ' ', ' ', 'X', 'X', 'X', ' ', ' ', ' ', ' ' },
				{ ' ', ' ', ' ', 'X', 'X', 'X', 'X', 'X', ' ', ' ', ' ' },
				{ ' ', ' ', 'X', 'X', 'X', 'X', 'X', 'X', 'X', ' ', ' ' },
				{ ' ', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', ' ' },
				{ 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X' },
				{ ' ', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', ' ' },
				{ ' ', ' ', 'X', 'X', 'X', 'X', 'X', 'X', 'X', ' ', ' ' },
				{ ' ', ' ', ' ', 'X', 'X', 'X', 'X', 'X', ' ', ' ', ' ' },
				{ ' ', ' ', ' ', ' ', 'X', 'X', 'X', ' ', ' ', ' ', ' ' },
				{ ' ', ' ', ' ', ' ', ' ', 'X', ' ', ' ', ' ', ' ', ' ' },
				{ ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ' } 
				
				};
		
		System.out.println("befor\n");
		for(int i = 0;i<matrix.length;i++) {
			for(int j = 0; j<matrix[i].length;j++) {
			System.out.print(" " + matrix[i][j]);
			}
			System.out.println();
		}
		
		for (int i = 0; i < matrix.length; i++) {
			for( int j = 0; j < matrix[i].length; j++) {
				if(matrix[i][j] == ' ') {
					matrix[i][j] = 'X';
				}else if(matrix[i][j] == 'X'){
					matrix[i][j] = ' ';
				}
			}
		}
		System.out.println("after\n");

		for(int i = 0;i<matrix.length;i++) {
			for(int j = 0; j<matrix[i].length;j++) {
			System.out.print(" " + matrix[i][j]);
			}
			System.out.println();
		}
	}

}
