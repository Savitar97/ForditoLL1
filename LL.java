import java.util.LinkedList;

public class LL {
    private String inStr;
    private LinkedList<Character> object = new LinkedList<Character>();


    LL(String inStr){
       this.inStr=inStr;

   }
    boolean calculat(){
        object.add('A');
        object.add('B');
        object.add('C');
        StringBuilder sr=new StringBuilder();
        for (int i = 0; i <inStr.length() ; i++) {
            if(inStr.charAt(i)!='a'&&inStr.charAt(i)!='b'&&inStr.charAt(i)!='c'&&inStr.charAt(i)!='d'&&inStr.charAt(i)!='e')
                return false;
        }
        for (int i = 0; i <inStr.length() ; i++) {

            if (inStr.charAt(i)=='a'&&object.peekFirst()=='A') {
                object.removeFirst();
                object.addFirst('a');
                System.out.println(object);
                sr.append("2");
            }
            if (inStr.charAt(i)=='b'&&object.peekFirst()=='A') {
                object.removeFirst();
                object.addFirst('c');
                object.addFirst('b');
                object.addFirst('B');
                System.out.println(object);
                sr.append("3");

            }
            if (inStr.charAt(i)=='c'&&object.peekFirst()=='A') {
                object.removeFirst();
                object.addFirst('c');
                object.addFirst('b');
                object.addFirst('B');
                System.out.println(object);
                sr.append("3");

            }
            if (inStr.charAt(i)=='d'&&object.peekFirst()=='A') {
                object.removeFirst();
                object.addFirst('d');
                object.addFirst('c');
                object.addFirst('C');
                System.out.println(object);
                sr.append("4");

            }
            else if (inStr.charAt(i)=='e'&&object.peekFirst()=='A') {
                object.removeFirst();
                object.addFirst('d');
                object.addFirst('c');
                object.addFirst('C');
                System.out.println(object);
                sr.append("4");

            }
            if (inStr.charAt(i)=='b'&&object.peekFirst()=='B') {
                object.removeFirst();
                object.addFirst('b');
                object.addFirst('B');
                object.addFirst('b');
                System.out.println(object);
                sr.append("5");

            }
            if (inStr.charAt(i)=='c'&&object.peekFirst()=='B') {
                object.removeFirst();
                object.addFirst('c');
                object.addFirst('C');
                object.addFirst('c');
                System.out.println(object);
                sr.append("6");

            }
            if (inStr.charAt(i)=='d'&&object.peekFirst()=='C') {
                object.removeFirst();
                object.addFirst('d');
                object.addFirst('D');
                object.addFirst('d');
                System.out.println(object);
                sr.append("7");


            }
            if (inStr.charAt(i)=='e'&&object.peekFirst()=='C') {
                object.removeFirst();
                object.addFirst('d');
                object.addFirst('D');
                System.out.println(object);
                sr.append("8");
            }
            if (inStr.charAt(i)=='e'&&object.peekFirst()=='D') {
                object.removeFirst();
                object.addFirst('e');
                System.out.println(object);
                sr.append("9");


            }
            System.out.println("--------------------------------");

            System.out.println(sr.toString());
            for (int j = 0; j <object.size() ; j++) {
                if(object.peekFirst() == 'a' || object.peekFirst() == 'b' || object.peekFirst() == 'c' || object.peekFirst() == 'd' || object.peekFirst() == 'e')
                    object.removeFirst();
            }
        }


        return true;
    }


}
