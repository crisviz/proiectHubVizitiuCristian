public class Array_1 {
    public static void main(String[] args) {

        int [] arr = {90, 80, 70, 60, 50, 40, 30, 20, 10};

        System.out.println("Afisam array incepand cu ultimul element");
        for (int i =arr.length-1;i>=0;i--){
            System.out.print(arr[i]+" ");
        }
    }
}
