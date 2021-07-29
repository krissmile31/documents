package a1_1801040015;

public class a {
	
	public static int relateArray(int[] a, int[] b){
        if (a.length >= b.length){
            return 0;
        }
        int count = 0;
        for (int i = 0; i < a.length;i++){
            for (int j = 0; j < b.length;j++){
                if (a[i] == b[j]){
                    count++;
                    break;
                }
            }
        }
        if (count == a.length){
            return 1;
        }
        return 0;
    }
	
	public static void main(String[] args) {
		int[] a = {5, 6, 7};
		int[] b = {6, 1, 2, 3, 7, 5, 9};
		int c = relateArray(a, b);
		System.out.println(c);
		
	}


}
