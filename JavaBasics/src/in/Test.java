package in;




public class Test {

    static class Student implements Singer{

        @Override
        public void sing() {
            System.out.println("singsing");
        }

        @Override
        public void sleep() {
            System.out.println("sleepsleep");
        }
    }

    static class Teacher implements Painter,Singer{

        @Override
        public void paint() {
            System.out.println("paintpppp");
        }

        @Override
        public void teching() {
            System.out.println("ttteaching");
        }

        @Override
        public void sing() {
            System.out.println("TTTTTSingsing");
        }

        @Override
        public void sleep() {
            System.out.println("TTTTsleepslepp");
        }
    }
//
//    public static void main(String[] args) {
//        Student s = new Student();
////        s.sleep();
////        s.sing();
//
//        Singer s1 = new Student();
//        s.sing();
//
////        Painter ss1 = (Painter) s1;
////        ((Painter) s1).paint();  bug
//
//
//       Singer ss = new Teacher();
//        ss.sing();
//        ss.sleep();
//        //ss.! Paint
//        Painter sss = (Painter) ss;
//
//        ((Painter) ss).paint();
//        ((Painter) ss).teching();
//    }


    public static void main(String[] args) {

    }
}
