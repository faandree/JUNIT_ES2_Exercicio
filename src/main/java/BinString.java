public class BinString{


    public String convert(String s){
        return binarise(sum(s));
    }

    public int sum(String s1){
        if(s1 == "") return 0;
        if (s1.length() == 1) return ((int) s1.charAt(0));
        return (((int) s1.charAt(0))) + sum(s1.substring(1));
    }

    public String binarise(int x){
        if(x==0) return "";
        if(x%2 == 1) return "1" + binarise(x/2) ;
        return "0" + binarise(x/2);
    }
}
