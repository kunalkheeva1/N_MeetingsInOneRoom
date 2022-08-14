import java.util.*;


//pair to keep the track of start and end points of the meetings
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

        // Pair array, I am still confused that how is it even possible, Object array??
        // but any ways we are taking array and putting start and end point pairs in it
        Pair []arr = new Pair[n];
        for(int i=0;i<n; i++){
            Pair p = new Pair(start[i],end[i]);
            arr[i]= p;
        }
        // I do not know it either, as I have not even declared p1 and p2
        // this sort is confusing but the rest is easy to understand
        Arrays.sort(arr,(p1,p2)-> p1.end-p2.end);
        // I am assuming that one meeting is already taking place so count starts with 1
        // taking end of the first meeting
        int count =1;
        int current = arr[0].end;
        // run a loop from second index i.e. 1 as 0th meeting is already taking place
        // if the starting time is greater(means after) than the ending time of previous
        // then new meeting can take place so do count++ and update the current with the new end
        // and return count
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
