import java.util.*;


class Pair{
    int start;
    int end;
    Pair(int start, int end){
        this.start = start;
        this.end = end;
    }
}


public class N_MeetingsInOneRoom {
    static int n_MeetingsInOneRoom(int []start, int [] end, int n){

        Pair []arr = new Pair[n];
        for(int i=0;i<n; i++){
            Pair p = new Pair(start[i],end[i]);
            arr[i]= p;
        }
        Arrays.sort(arr,(p1,p2)-> p1.end-p2.end);
        int count =1;
        int current = arr[0].end;
        for(int i=1; i<n; i++){
            if(arr[i].start >current){
                count ++;
                current = arr[i].end;
            }
        }return count;


    }


    public static void main(String[] args) {

    }
}
