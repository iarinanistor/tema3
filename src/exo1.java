import java.util.Random;
public class exo1 {
    /*Sa generati un array random si sa cautati in array numarul de aparitii.
            Ex:
    array -> [1,2,3,4,5,5,5,6,7,6]
            5->3 aparitii
6->2 aparitii

    Exemplu:
    Random rd = new Random();
    int[] arr = new int[10];
      for (int i = 0; i < arr.length; i++) {
        arr[i] = rd.nextInt(); punem numare random in array
    }*/
    static int numaratoare(int []tab,int nr){
        int cpt = 0;
        for (int i = 0;i < tab.length;i++){
            if (tab[i] == nr) cpt++;
        }
        return cpt;
    }

    public static void main(String[] args){
        Random rd = new Random();
        int tab[] = new int[10];
        int i;
        for (i = 0;i < tab.length;i++){
            tab[i] = rd.nextInt(10);
        }
        for (i = 0;i < tab.length;i++){
            System.out.print(tab[i]+"\t");
        }
        System.out.println();
        i = 0;
        int occ,j;
        while (i < tab.length){
            occ = numaratoare(tab,tab[i]);
            j = 0;
            boolean first = false;
            while (j < i){
                if (tab[j] == tab[i]){
                    first = true;
                    break;
                }
                j++;
            }
            if (!first) System.out.println(tab[i] + " a aparut de "+ occ + " ori");
            i++;
        }

    }
}
