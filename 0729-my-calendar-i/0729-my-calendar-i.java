class MyCalendar
{
int[][] arr;
int count;

public MyCalendar() {
    arr = new int[1000][2];
    count = 0;
}

public boolean book(int start, int end) {
    for(int i = 0;i < count;i++){
        if(Math.max(start,arr[i][0]) < Math.min(end,arr[i][1])){
            return false;
        }
    }
    arr[count][0] = start;
    arr[count][1] = end;
    count++;
    return true;
}
}

