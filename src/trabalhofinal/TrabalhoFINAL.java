/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package trabalhofinal;
public class TrabalhoFINAL {
    //metodo para barra de progresso da tela inicial
    public static void main(String[] args) {
        //nome do arquivo com a tela inicial, instanciado como uma classe.
        TELAinicial barra = new TELAinicial();
        barra.setVisible(true);
        
        try {
            //for para o carregamento ir de 0 à 100%
             for(int i =0; i<=100; i++){
               Thread.sleep(i);
               TELAinicial.barraProgresso.setValue(i);
               //exibir o carregamento na tela de progresso.
               
            }
             TELAcadastro obj = new TELAcadastro();
             obj.setVisible(true);
        } catch (Exception e) {
           
        }
    }
    
}
