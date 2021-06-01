public class Stack2 {
    public static void main (String[] args) throws Exception {
        StackIntro1 s = new StackIntro1(3);
        //push
        s.push(3);
        s.push(2);
        s.push(1);
        s.display();
        System.out.println( s.peek());
        //pop
        s.pop();
        s.pop();
        s.pop();
        //Empty stack
        s.display();
        s.push(3);
        s.display();
    }
}
