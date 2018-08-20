package Array;

public class Cont3Quit2 {

    public static void main(String[] args) {
        KidCircle kc = new KidCircle(500);
        Kid k = kc.first;
        int countNum = 0;
        while (kc.count > 1){
            countNum++;
            if (countNum == 3){
                countNum = 0; //置为0数到三
                kc.delete(k);
            }

            k = k.right;
        }

        System.out.println(kc.first.id);
    }

    static class Kid{
        int id;
        Kid left;
        Kid right;
    }

    static class KidCircle{
        int count = 0;
        Kid first,last;

        KidCircle(int n) {
            for (int i = 0; i < n; i++){
            add();
            }
        }

        void add() {
            Kid kid = new Kid();
            kid.id = count;
            if (count <= 0){
                first = kid;
                last = kid;
                kid.left = kid;
                kid.right = kid;
            }else {
                last.right = kid;
                kid.left =  last;
                kid.right = first;
                first.left = kid;
                last = kid;
            }
            count++;
        }

        void delete(Kid k){
            if (count <= 0){
                System.out.println("null kid");
            }else if (count == 1){
                 first = last = null;
            }else{
              k.left.right = k.right;
              k.right.left = k.left;
              if (k == first){
                  first = k.right;
              }else if (k == last){
                  last = k.left;
              }
            }
            count--;
        }
    }

}
