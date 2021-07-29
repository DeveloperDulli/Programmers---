
public class MultiplicationTable {

	public static void main(String[] args) {
		int[][] array = {{1,2,3,4,5,6,7,8,9}, {1,2,3,4,5,6,7,8,9}
		};
		
		for(int i = 0; i <array[0].length ; i++) {
			System.out.println((i+1) + "´Ü");
			
		for(int j = 0; j < array[1].length; j++) {
			System.out.println(array[0][i] + "X" + array[1][j]
					+ "=" + +array[0][i] * array[1][j] );
				
				}
		System.out.println("");
			}
		}
		
	}


