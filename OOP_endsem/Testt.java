public class Testt {
    public static void main(String[] args) {
        
        String mystring = "my name is gaurav";

        System.out.println(mystring);

        String[] stringarray = mystring.split(" ");
        int a = stringarray.length; // for words but requores split 
        int b = mystring.length();// for all letter 
        System.out.println(b);
        System.out.println(a);
        System.out.println(stringarray);
        // its immutable 


        StringBuffer S = new StringBuffer("yo wassup!!");

        S.append(("helloo"));
        
        System.out.println(S);

        StringBuilder S1 = new StringBuilder("chal bsdk!");
        System.out.println(S1);

    }
}
