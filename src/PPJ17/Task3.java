package PPJ17;


public class Task3 {
    public static void main(String[] args) {
        System.out.println(isPalindrome("Anna"));
        System.out.println(isPalindrome("Xanax"));
        System.out.println(isPalindrome("Banana"));
        System.out.println(isPalindrome("Do geese see God"));
    }
    private static boolean sameBackwards(char[] arr, int index){
        if(index > arr.length/2) return true;
        if(arr[index] != arr[arr.length - 1 - index])
            return false;
        return sameBackwards(arr, index+1);
    }
    public static boolean isPalindrome(char[] wordArray) {
        return sameBackwards(wordArray, 0);
    }
    public static boolean isPalindrome(String word) {
        return isPalindrome(word.toLowerCase().toCharArray());
    }
}
