public class Singleton {
    /*
        Ensure a class has one instance and provide a global point of access to it.echo "# DesignPatterns" >> README.md
     */
    private static  Singleton singleton=null;
    private String data;
    private Singleton(){
        this.data="default";
    }
    public static Singleton getInstance() {
        if(singleton==null){
            singleton=new Singleton();
        }
        return singleton;
    }

    public void setData(String data) {
        this.data=data;
    }

    public String getData() {
        return this.data;
    }
}
