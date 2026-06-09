class Sample{
    public static void main(String[] args){
        int arr[] = {1, 2, 9 , 8, 5, 2, 0, 5, 3, 8};
        for(int i = 0 ; i < arr.length ; i ++){
            for(int j = 0 ; j < arr.length-i-1 ; j++ ){
                if(arr[j] < arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        for(int i : arr){
            System.out.print(i + " ");
        }


        String s = "Sony";
        char[] chr = s.toCharArray();
        int n = s.length();
        for(int i = 0 ; i < n/2 ; i++){
            char temp = chr[i];
            chr[i] = chr[n-i-1];
            chr[n-i-1] = temp;
        }
        System.out.println("\n" + new String(chr));


        isPalindrome("wow");

    }
    public static boolean isPalindrome(String s){
            return true;
        }
        
        
}