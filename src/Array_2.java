public class Array_2 {
    public static void main(String[] args) {
        int [] arr = {3,1,2,9,5,4,7,6,8};
        int a;

        System.out.println("Afisam cifrele in ordine crescatoare");

        for (int i = 1; i < arr.length; i++) {
            for (int j = i; j > 0; j--) {
                if (arr[j] < arr [j - 1]) {
                    a = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = a;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
    }

