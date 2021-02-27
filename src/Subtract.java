
public class Subtract {
    
    public static void bigResta(){
        String cadena = "999567730000000000000056454210032311316790023457157000000000000346648646784000000000064621214565587864564"
                + "54210032311310000000000679794649870000000000487946498748346648640000000000678464621214565587864"//200 digitos
                + "999567730000000000000056454210032311316790023457157000000000000346648646784000000000064621214565587864"
                + "56454210032311310000000000679794649870000000000487946498748346648640000000000678464621214565587864"//400
                + "9995677300000000000000564542100323113167900234571570000000000003466486467840000000000646212145655878"
                + "6456454210032311310000000000679794649870000000000487946498748346648640000000000678464621214565587864"//600
                + "999567730000000000000056454210032311316790023457157000000000000346648646784000000000064621214565587864"
                + "56454210032311310000000000679794649870000000000487946498748346648640000000000678464621214565587864"//800
                + "999567730000000000000056454210032311316790023457157000000000000346648646784121211156564621214565587"
                + "86456454210032311319562111010679794649879995841273487946498748000008643333456550678464621214565587864";//1000
        char[] cadenaSeparada = cadena.toCharArray();//Conviertes la cadena en arreglo de tipo char
        int[] number = new int[cadenaSeparada.length];
        for (int i = 0; i < cadenaSeparada.length; i++) {
            number[i] = Character.getNumericValue(cadenaSeparada[i]);//Conviertes el char en int
        }
        System.out.println("La diferencia de");
        for (int i = 0; i < number.length; i++) {
            System.out.print(number[i]);
        }
        //System.out.println("\ntamano =>"+number.length);
        System.out.println("\n-");
        String cadena2 = "12456773000000000000005645421003231131679794649874834664864670000000000846462121456550000000000878640023"
                + "4571574586235971346648646700000000008464621214565580000000000786456454210032311316797946498748"//200
                + "999567730000000000000056454210032311316790023457157000000000000346648646784000000000064621214565587864"
                + "56454210032311314976853159679794649879865274891487946498748346648640000000000678464621214565587864"
                + "99956773000000000000005645421003231131679002345715765984712483466486467846663232115646212145655878"
                + "6456454210032311314884745613679794649879992245710487946498748346648640000000000678464621214565587864"
                + "999567730000000000000056454210032311316790023457157000000000000346648646784000000000064621214565587864"
                + "56454210032311311593574859679794649876565987412148599487946498748346648640000000000678464621214565587864"
                + "9995677300000000000000564542100323113167900234571579584621730346648646784739184625064621214565587"
                + "86456454210032311313217896540679794649875825149674487946498748346648646548127896678464621214565587864";
        char[] cadenaSeparada2 = cadena2.toCharArray();
        int[] subtract = new int[cadenaSeparada2.length];
        for (int i = 0; i < cadenaSeparada2.length; i++) {
            subtract[i] = Character.getNumericValue(cadenaSeparada2[i]);
        }
        
        for (int i = 0; i < subtract.length; i++) {
            System.out.print(subtract[i]);
        }
        System.out.println("\n");
        //int number[] = {1,2,4,5,6,7,7,3,0,0};
        //int subtract[] = {0,0,2,3,4,5,7,1,5,7};
        int res[] = new int[number.length];
        boolean acarreo = false;
        boolean prestar = false;
        
        for(int i=number.length-1;i>-1;i--)
        {
            if(prestar){
                //number[i] = number[i] == 0 ? 9 : number[i]-1;
                subtract[i]+=1;
                prestar = false;
            }
            acarreo =!(number[i] > subtract[i]) &&  number[i] != subtract[i];
            //System.out.println(acarreo);
            if(acarreo){
                number[i]+=10;
                prestar = true;
            }
            res[i]=number[i]-subtract[i];
            //System.out.println(res[i]);
        }
        
        
        System.out.println("El resultado  es: ");
        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i]);
        }
        System.out.println("\n");
    }
    
    public static void main(String[] args) {
        bigResta();
        System.out.println("Tarde 1 dia completo en resolver el problema tal vez un poco mas ");
    }
   
}
