package web.Servlet1;


public class MyServletmpl implements IMyServet {

    @Override
    public void init() {
        System.out.println("init");
    }

    @Override
    public void service() {
        System.out.println("service");
    }

    @Override
    public void destory() {
        System.out.println("des");
    }
}

