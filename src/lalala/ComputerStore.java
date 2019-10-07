package lalala;

public class ComputerStore {
    //属性
    Computer computer;

    public static void main(String[] args) {

        Computer c1 = new Computer();
            c1.setTotalprice(4000);
            System.out.println(c1.getName()+"\t"+"价格是："+c1.getTotalprice());

        Computer.cpu1("CPU","Intel",4,"CPU work");
        Computer.storage1("Storage","Samsung","4G","Storage work");
        Computer.hdd1("HDD","Seagate","500GB","HDD work");
        Computer.motherboard1("MotherBoard","ASUS","quick","MotherBoard work");

        Computer c2= new Computer();
        c2.setTotalprice(5000);
        System.out.println(c2.getName()+"\t"+"价格是:"+c2.getTotalprice());

        Computer.cpu2("CPU","Intel",8,"CPU work");
        Computer.storage2("Storage","Samsung","8G","Storage work");
        Computer.hdd2("HDD","Seagate","400GB","HDD work");
        Computer.motherboard2("MotherBoard","Gigabyte","quick","MotherBoard work");

        Computer c3 = new Computer();
        c3.setTotalprice(6000);
        System.out.println(c3.getName()+"\t"+"价格是:"+c3.getTotalprice());

        Computer.cpu3("CPU","AMD",4,"CPU work");
        Computer.storage3("Storage","Kingston","4G","Storage work");
        Computer.hdd3("HDD","WestDigitals","500GB","HDD work");
        Computer.motherboard3("MotherBoard","ASUS","quick","MotherBoard work");


    }

}
