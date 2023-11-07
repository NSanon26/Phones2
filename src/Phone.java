public class Phone {
    public String brand;
    public String owner;
    public int edition;

    public Phone(String pBrand, String pOwner, int pEdition){
        brand = pBrand;
        owner = pOwner;
        edition = pEdition;

    }
    public void display(){
        System.out.println("The phone is made by "+brand+". This is " + owner + " phone." + " The edition of the phone is " + edition + ".");
    }
}