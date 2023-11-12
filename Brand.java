public class Brand {
    private String brandName = "";
    private boolean isInBrandList = false;

    public Brand(String brandName, boolean isInBrandList) {
        this.brandName = brandName;
        this.isInBrandList = isInBrandList;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public void setInBrandList(boolean isInBrandList) {
        this.isInBrandList = isInBrandList;
    }
    private Brand[] brands;
    private int IF=0;
    private boolean isIn(){return IF==brands.length;}
    private boolean notIn(){return IF==0;}
    public boolean add(Brand brand){
        if (isIn()){
            return true;
        }
        else {
            brands[IF]=brand;
            IF++;
            return false;
        }
    }
    public String ListBrands(){
        if (isIn()){
            return "This brand has been involved,so continue";
        }else {
            return "This brand hasn't been stored before." +
                    "If you don't mind,can you help us " +
                    "by giving the information of what you know about this brand?";
        }
    }
}