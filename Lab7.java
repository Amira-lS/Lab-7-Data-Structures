
package lab7;


public class Lab7 {

    public static void main(String[] args) {
        ArrayStack<Integer> arrayStack = new ArrayStack<>();
        arrayStack.push(1);
        arrayStack.push(2);
        arrayStack.push(3);
        arrayStack.push(4);
        System.out.println("The string presentation of the array-based stack:" + arrayStack);
        System.out.println("The top element is " + arrayStack.top());
        arrayStack.pop();
        System.out.println("The resultant stack after pop() is :" + arrayStack);

        LinkedStack<String> linkedListStack = new LinkedStack<>();
        linkedListStack.push("Ali");
        linkedListStack.push("Ahmad");
        linkedListStack.push("Khaled");
        linkedListStack.push("Mohammad");
        System.out.println("The string presentation of the linked list-based stack: " + linkedListStack);
        System.out.println("The top element is " + linkedListStack.top());
        linkedListStack.pop();
        System.out.println("The resultant stack after pop() is :" + linkedListStack);
    }
}

