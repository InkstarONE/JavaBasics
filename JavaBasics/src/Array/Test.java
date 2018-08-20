package Array;

public class Test {
    static class Date{
        int year,month,day;

        public Date(int year, int month, int day) {
            this.year = year;
            this.month = month;
            this.day = day;
        }

        public int compare(Date date){
            return year > date.year ? 1:
                    year < date.year ? -1:
                    month > date.month ? 1:
                    month < date.month ? -1:
                    day > date.day ? 1:
                    day < date.day ? -1 : 0;
        }

        void print(){
            System.out.println(year + "-" + month +"-"+day);
        }


    }

    public void selectSort(Date a[]){
        for (int i = 0; i < a.length; i++ ){
            for (int j = i+1; j < a.length; j++){
                int t =a[i].compare(a[j]);
                if (t < 0){
                    Date tmp;
                    tmp = a[i];
                    a[j] = a[i];
                    a[j] = tmp;
                }
            }
        }

        for (int i = 0; i < a.length; i++){
            a[i].print();
        }
    }

    public int binaryfind(Date days[],Date day){
        int startpos = 0;
        int endpos = days.length-1;
        int mid = (startpos + endpos)/2;

        if (days.length <= 0)
            return -1;
        while (startpos <= endpos){
            if (days[mid].compare(day) == 0){
                return mid;
            }
            if (day.compare(days[mid]) < 0){
                endpos = mid - 1;
            }
            if (day.compare(days[mid]) > 0){
                startpos = mid + 1;
            }
        }
        return -1;

    }


    public static void main(String[] args) {
        Date days[] = new Date [5];
        days[0] = new Date(2006,5,4);
        days[1] = new Date(2006,7,4);
        days[2] = new Date(2008,5,4);
        days[3] = new Date(2004,5,9);
        days[4] = new Date(2004,5,4);

        Test t = new Test();
        t.selectSort(days);
       // System.out.println(t.binaryfind(days,days[0]));

        System.out.println();
        System.out.println(days[0].compare(days[1]));

    }
}
