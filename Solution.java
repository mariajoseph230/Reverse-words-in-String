class Solution {
    public String reverseWords(String s) {
        String str[]=s.trim().split(" ");
        int st=0;
        int e=str.length-1;
        while(st<e){
String t=str[st];
            str[st]=str[e];
            str[e]=t;
            st++;
            e--;

}
        String result="";
        String delimiter = " ";
     for (int i = 0; i < str.length; i++) {
            result += str[i];
            if (i <str.length - 1) {
                result += delimiter;
            }
        }
        return result;

    }
}
