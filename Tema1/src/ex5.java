//Scrieți un program pentru a verifica dacă un număr dat este prim sau nu.
public class ex5 {
    public static void main(String[] args) {
        int num =29;
        boolean prim = true;

        for(int i=2;i<num;i++){
            if(num%i==0){
                prim = false ;
                break;
            }
        }
        if(prim){
            System.out.println("Este un numar prim: " + num);
        }
    }
}
