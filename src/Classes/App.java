package Classes;

class APP {
    public static void main(String[] args){
        Stack s1,s2;
        s1=new Stack();
        s2= new Stack();
        s1.push(3);
        s2.push(6);

        System.out.println(" Stack 1 "+s1.pop());
        System.out.println(" Stack 2 "+s2.pop());
    }
}