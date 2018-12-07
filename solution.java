import java.util.Stack;

public class test {
    public static boolean matching(String element){

        Stack s = new Stack();

        for(int i = 0; i<=element.length(); i++) { //checks for opening brackets
            if (element.charAt(i) == '{' || element.charAt(i) == '[' || element.charAt(i) == '(') {
                s.push(element.charAt(i));
            }
        }
        for(int j = 0; j<=element.length();j++){ //checks for closing brackets
             if(element.charAt(j)=='}'){

                if(s.isEmpty()){
                    return false;
                }
                else if(s.peek().equals('{')) {
                    s.pop();
                }


            }
            else if(element.charAt(j)==']'){

                if(s.isEmpty()){
                    return false;
                }
                else if(s.peek().equals('[')) {
                    s.pop();
                }


            }
            else if(element.charAt(j)==')'){

                if(s.isEmpty()){
                    return false;
                }
                else if(s.peek().equals('(')) {
                    s.pop();
                }


            }

            }

        if(s.isEmpty()){
            return true;
        }
        else {
            return false;

        }
    }
    public static void main(String args[]){
        String s1 = "{}[]";
        String s2 = "({}";
        String s3 = "][";
        String s4 = "{()[]}";
        String s5 ="[)";

        assert(matching(s1)==true);
        assert(matching(s2)==false);
        assert(matching(s3)==false);
        assert(matching(s4)==true);
        assert(matching(s5)==false);
    }
}
