public class ProductValidator {
    /*ProductValidator şu anlamda kullanılır: bir ürünü kaydederken veya güncellerken ürününü
    kurallara uygun olup olmadığını anlamak için kullanıcaz.

     */
    static{
        System.out.println("Static Yapıcı bloklar çalıştı.");
    }
    public ProductValidator(){
        System.out.println("Yapıcı bloklar çalıştı.");
    }
    public static boolean isValid(Product product){
if(product.price>0 && !product.name.isEmpty()) {
    //isEmpty değer girilmedi demek
    return true;
}else{
    return false;
}

    }
    public void bisey(){

    }

}
//inner class