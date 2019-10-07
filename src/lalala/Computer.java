package lalala;

public class Computer {
    //属性
    private String name = "Dell";
    private double totalprice;

    //setter and getter方法
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getTotalprice() {
        return totalprice;
    }

    public void setTotalprice(double totalprice) {
        this.totalprice = totalprice;
    }


        public static void cpu1(String name,String brand,int coreNum,String work){
        System.out.println(name+"\t"+brand+"\t"+coreNum+"\t"+work);

    }
        public static void storage1(String name,String brand,String volume,String work) {
        System.out.println(name+"\t"+brand+"\t"+volume+"\t"+work);
    }
        public static void hdd1(String name,String brand,String volume,String work){
        System.out.println(name+"\t"+brand+"\t"+volume+"\t"+work);
    }
        public static void motherboard1(String name,String brand,String speed,String work){
        System.out.println(name+"\t"+brand+"\t"+speed+"\t"+work);
    }
        public static void cpu2(String name,String brand,int coreNum,String work){
        System.out.println(name+"\t"+brand+"\t"+coreNum+"\t"+work);

    }
        public static void storage2(String name,String brand,String volume,String work) {
        System.out.println(name+"\t"+brand+"\t"+volume+"\t"+work);
    }
        public static void hdd2(String name,String brand,String volume,String work){
        System.out.println(name+"\t"+brand+"\t"+volume+"\t"+work);
    }
        public static void motherboard2(String name,String brand,String speed,String work){
        System.out.println(name+"\t"+brand+"\t"+speed+"\t"+work);
    }
        public static void cpu3(String name,String brand,int coreNum,String work){
        System.out.println(name+"\t"+brand+"\t"+coreNum+"\t"+work);

    }
        public static void storage3(String name,String brand,String volume,String work) {
        System.out.println(name+"\t"+brand+"\t"+volume+"\t"+work);
    }
        public static void hdd3(String name,String brand,String volume,String work){
        System.out.println(name+"\t"+brand+"\t"+volume+"\t"+work);
    }
        public static void motherboard3(String name,String brand,String speed,String work){
        System.out.println(name+"\t"+brand+"\t"+speed+"\t"+work);
    }
}

