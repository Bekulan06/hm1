public class Main {
    public static void main(String[] args) {
        SecondClass objectA = new SecondClass(1,"A");
        ThirdClass objectB = new ThirdClass(2,"B");
        ThirdClass objectC = new ThirdClass(3,"C");
        System.out.println(objectA  = new SecondClass(1,"A"));
        System.out.println(objectA);
        System.out.println(objectB);
        System.out.println(objectC);
    }
    public String toString(){
        return " ";
    }
}