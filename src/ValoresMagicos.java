public class ValoresMagicos {
    // porcentaje del descuento de 0.15
    //porcentaje del iva de 0.19

    public static void main(String[] args) {
              double precioBase = 100;
              double descuento = precioBase * 0.15; //valor magico 
              double iva =precioBase * 0.19; // valor magico 
              double precioFinal= precioBase - descuento + iva;
              System.out.println("el precio final es: "+ precioFinal);
   
}
    
}