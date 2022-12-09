package PPJ17;

public class Task4 {
    public static void main(String[] args) {
        System.out.println(isPalindrome("Anna"));
        System.out.println(isPalindrome("Xanax"));
        System.out.println(isPalindrome("Banana"));
        System.out.println(isPalindrome("Do geese see God"));
    }
    private static boolean sameBackwards(char[] arr, int index){
        if(index < 0) {
            for (int i = 1; i <= arr.length/2; i++ ) {
                System.out.print(arr[arr.length - i]);
            }
            System.out.println();
            return true;
        }
        if(
            Character.toLowerCase(arr[index])  !=
            Character.toLowerCase(arr[arr.length - 1 - index])
        ) {
            return false;
        }
        System.out.print(arr[index]);
        return sameBackwards(arr, index-1);
    }
    public static boolean isPalindrome(char[] wordArray) {
        return sameBackwards(wordArray, wordArray.length/2 - 1);
    }
    public static boolean isPalindrome(String word) {
        return isPalindrome(word.toCharArray());
    }
}
