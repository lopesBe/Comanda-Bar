import java.util.Scanner;

public class ComandaBar {
    public static void main(String[] args) throws Exception {
        
        Scanner scan=new Scanner (System.in);
        String sexo;
        int numClinetes;
    
    String[] produtos = {"cerveja", "refrigerante", "espetinho", };
    double[] preços = {5.00 , 3.00, 7.00, 4.00};
    int[]quantidades = new int[produtos.length];
    double total=0.0;
    double totalIngresso = 0.0;
    double totalProdutos = 0.0;
    double couvert= 4.00;
    boolean couvertAdicionado = false;

    System.out.println("=====================================");
    System.out.println("Quantos clientes estão na mesa ");
    System.out.println("-------------------------------------");
    numClinetes = scan.nextInt();
    scan.nextLine();
  
    /////////////////////////////////// COMEÇO INFORMÇÃO DO CLIENTE /////////////////////////

   for(int i = 0; i < numClinetes; i++){
    System.out.println("-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/");
    System.out.println("Informe o sexo dos clientes " +  ( i + 1 ) + "(masculino/femenino):");
   
//  -------- HOMEM ---------
    
   System.out.println("informe o sexo dos clientes (maculino/femenino)");
   System.out.println("-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/");
   sexo= scan.nextLine();


       if (sexo.equalsIgnoreCase("masculino" )) {
        System.out.println("cliente masculino");
        
    totalIngresso += 10.00;

 // -------- MULHER --------
  
} else if (sexo.equalsIgnoreCase("Femenino")) {
        System.out.println("cliente femenino");
        totalIngresso += 8.00;
       }
         
     }
      /////////////////////////////////// FIM INFORMÇÃO DO CLIENTE /////////////////////////

     
     
     //--------------------------------- COMEÇO INFORMÇÃO DOS PRODUTOS -----------------------
      System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
       System.out.println("informe o produtos consumidos");
       System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

      for(int i = 0 ; i < produtos.length; i++){
        System.out.printf("%s (custo R$%.2f por unidade): \n", produtos[i], preços[i]);
        System.out.println("Quantidade consumida");
        quantidades[i] = scan.nextInt(); // Recebe a quantidade consumida de cada produto
        totalProdutos += quantidades[i] * preços[i];  // Soma o valor dos produtos consumidos
        
      }
       //------------------------------- FIM INFORMÇÃO DOS PRODUTOS ------------------------


       //_________ Adiciona couvert se o total dos produtos for menor ou igual a R$30,00 _______
    
       if (totalProdutos <= 30.00) {
        System.out.println("\n O valor total sem couvert é menor ou igual a R$30. O couvert será adicionado automaticamente.");
        total += couvert; 
        couvertAdicionado = true;
      } 
  
      //__________________________________ - RESUMO DO CONSUMO - ________________________________
     
      System.out.println("\n=====================================");
      System.out.println("\nResumo do consumo: ");
      System.out.println("-------------------------------------");
      
      for(int i = 0; i < produtos.length; i ++) {
        if (quantidades[i] > 0 ){
            System.out.println(quantidades[i] + "x" + produtos[i] + " - R$" + (quantidades[i] * preços[i]));
        }
      }

      if (couvertAdicionado) {
        System.out.printf("1x couvert - R$%.2f\n", couvert);
      }

     
      //  Calcula o total final (produtos + ingresso + couvert) 
     
      total+= totalProdutos + totalIngresso; 

      //  Exibe o valor total dos ingressos e o valor total a pagar 
      System.out.printf("entrada total para %d clientes : R$%.2f\n",numClinetes, totalIngresso);
      System.out.println("-------------------------------------");
      

       System.out.printf("Total a pagar : R$%.2f\n", total);
       System.out.println("=====================================");

     scan.close();
     
    }
}