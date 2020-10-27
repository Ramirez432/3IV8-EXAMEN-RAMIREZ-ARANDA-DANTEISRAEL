import java.util.Scanner;

class Menu{

   
    public static void main(String[]args) {
        
        Scanner entrada=new Scanner(System.in);
        int opcion,id1,fuerza1=122,id2=0,fuerza2=100,id3,fuerza3=132,defensa1=122,defensa2=211,defensa3=355;
        String ataque1="",ataque2="",nombre1="",nombre2="",nombre3="",ataque12="",ataque22="",ataque13="",ataque23="";
        char dec;
        //cuerpoo
        //repetir hacer mientras
        do{
            System.out.println("3IV8 Ramírez Aranda Dante Israel");
            System.out.println("Elija al Pokemon a registrar:");
            System.out.println("1.Charmander");
            System.out.println("2.Bulbasor");
            System.out.println("3.Squartle");
            System.out.println("4.Batalla pokemon");
            System.out.println("5.Salir");
            opcion=entrada.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Ingresa el ID de tu Charmander");
                    id1=entrada.nextInt();
                    System.out.println("Ingresa el nombre de tu Charmander");
                    nombre1=entrada.next();
                    System.out.println("Ingresa el ataque principal de tu Charmander");
                    ataque1=entrada.next();
                    System.out.println("Ingresa el ataque secundario de tu Charmander");
                    ataque2=entrada.next();
                break;
                case 2:
                    System.out.println("Ingresa el ID de tu Bulbasor");
                    id2=entrada.nextInt();
                    System.out.println("Ingresa el nombre de tu Bulbasor");
                    nombre2=entrada.next();
                    System.out.println("Ingresa la fuerza de tu Bulbasor");
                    System.out.println("Ingresa el ataque principal de tu Bulbasor ");
                    ataque12=entrada.next();
                    System.out.println("Ingresa el ataque secundario de tu Bulbasor");
                    ataque22=entrada.next();
                break;    
                case 3:
                    System.out.println("Ingresa el ID de tu Squartle");
                    id3=entrada.nextInt();
                    System.out.println("Ingresa el nombre de tu Squartle");
                    nombre3=entrada.next();
                    System.out.println("Ingresa el ataque principal de tu Squartle ");
                    ataque13=entrada.next();
                    System.out.println("Ingresa el ataque secundario de tu Squartle");
                    ataque23=entrada.next();
                break; 
                case 4:
                    int oponente1=(int)(Math.random()*3+1);
                    // 3 es el numero hasta el cual debe llegar
                    //porque solo hay 3 pokemones
                    //el cero es para que no se llegue
                    int oponente2=(int)(Math.random()*2+1);
                    if(oponente1==1 && oponente2==1){
                        System.out.println("Se enfrentan"+oponente1+" contra"+oponente2);
                        System.out.println("Empate");
                    } 
                    if(oponente1==2 && oponente2==2){
                        System.out.println("Se enfrentan"+oponente1+" contra"+oponente2);
                        System.out.println("Empate");
                    } 
                    if(oponente1==3 && oponente2==3){
                        System.out.println("Se enfrentan"+oponente1+" contra"+oponente2);
                        System.out.println("Empate");
                    } 
                    if(oponente1==1 && oponente2==2){
                         System.out.println("Se enfrentan"+oponente1+" contra"+oponente2);
                        int vida1=7033;
                        int impacto2=(fuerza2*defensa2)/3;
                        int perdidida1=vida1-impacto2;
                        System.out.println("A Charmander le queda"+perdidida1+" de vida,esta derrotado ");
                    }            
                    if(oponente1==1 && oponente2==3){
                        System.out.println("Se enfrentan"+oponente1+" contra"+oponente2);
                        int vida3=15621;
                        int impacto2=(fuerza3*defensa3)/3;
                        int perdidida1=vida3-impacto2;
                        System.out.println("A Charmander le queda"+perdidida1+" de vida, esta derrotado ");
                    } 
                    if(oponente1==2 && oponente2==1){
                        System.out.println("Se enfrentan"+oponente1+" contra"+oponente2);
                        int vida1=7033;
                        int impacto2=(fuerza2*defensa2)/3;
                        int perdidida1=vida1-impacto2;
              
                        System.out.println("A Charmander le queda"+perdidida1+" de vida,esta derrotado ");
                    } 
                    if(oponente1==2 && oponente2==3){
                        System.out.println("Se enfrentan"+oponente1+" contra"+oponente2);
                        int vida3=15621;
                        int impacto2=(fuerza3*defensa3)/3; 
                        int perdidida1=vida3-impacto2;
                        System.out.println("A Bulbasor le queda"+perdidida1+" de vida, esta derrotado ");
                    }   
                    if(oponente1==3 && oponente2==2){
                        System.out.println("Se enfrentan"+oponente1+" contra"+oponente2);
                        int vida3=15621;
                        int impacto2=(fuerza3*defensa3)/3; 
                        int perdidida1=vida3-impacto2;
                        System.out.println("A Bulbasor le queda"+perdidida1+" de vida, esta derrotado ");
                    }       
                    if(oponente1==3 && oponente2==1){
                        System.out.println("Se enfrentan"+oponente1+" contra"+oponente2);
                        int vida3=15621;
                        int impacto2=(fuerza3*defensa3)/3;
                        int perdidida1=vida3-impacto2;
                        System.out.println("A Charmander le queda"+perdidida1+" de vida, esta derrotado ");
                    } 
                                                                        
                break;
                default:
                    System.out.println("Gracias");
                    break;
            }
                System.out.println("¿Deseas repetir el programa?, si lo desea escriba s");
                dec=entrada.next().charAt(0);
        }while(dec =='s');
            
       
    }
}