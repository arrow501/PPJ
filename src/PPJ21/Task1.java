package PPJ21;

public class Task1 {
    public static void main(String[] args) {

    }

    public static void testStackWithArray() {
        // initialize stack
        MyStack students = new MyStack(5);

        // student data
        String[] names = { "Arrow", "Mary", "Jane", "Lisa", "Susan" };
        int sNumber = 30000;

        // push student objects onto the stack
        for (String name : names) {
            students.push(new Student(name, sNumber++));
        }

        // check what happens when pushing onto a full stack
        try {
            students.push(new Student("Buggy", 32137));
        } catch (Exception e) {
            System.out.println("Full stack error");
            System.out.println(e);
        }
        System.out.println("Stack Length:\t" + students.getSize());

        // pop students out of the stack and print to console
        int length = students.getSize();
        for (int i = 0; i < length; i++) {
            students.pop().show();
        }

        // check what happens when there aren't any elements left
        try {
            students.pop();
        } catch (Exception e) {
            System.out.println("Empty stack error:");
            System.out.println(e);
        }
        System.out.println("Stack Length:\t" + students.getSize());
    }

    public static void testStackWithLinkedList() {
        // initialize stack
        MyStackWithList students = new MyStackWithList(5);

        // student data
        String[] names = { "Arrow", "Mary", "Jane", "Lisa", "Susan" };
        int sNumber = 30000;

        // push student objects onto the stack
        for (String name : names) {
            students.push(new Student(name, sNumber++));
        }

        // check what happens when pushing onto a full stack
        try {
            students.push(new Student("Buggy", 32137));
        } catch (Exception e) {
            System.out.println("Full stack error");
            System.out.println(e);
        }
        System.out.println("Stack Length:\t" + students.getSize());

        // pop students out of the stack and print to console
        int length = students.getSize();
        for (int i = 0; i < length; i++) {
            students.pop().show();
        }

        // check what happens when there aren't any elements left
        try {
            students.pop();
        } catch (Exception e) {
            System.out.println("Empty stack error:");
            System.out.println(e);
        }
        System.out.println("Stack Length:\t" + students.getSize());

    }
}
