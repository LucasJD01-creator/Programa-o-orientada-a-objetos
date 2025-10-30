package Molde_objeto;

public class Molde_Grampeador {
    //Observação: this. = nomeDoProprioObjeto
    //Quando quero alterar algum atributo da propria classe, utilizo this.AquiAPropriedade

    //atributos
   public String modelo;
    public String cor;
    private int carga = 10;

    public Molde_Grampeador(int carga, String cor, String modelo) {
        this.carga = carga;
        this.cor = cor;
        this.modelo = modelo;
    }

    //metodos
   public void grampear(){
        if(this.carga <= 0){
            System.out.println("Não é possível grampear as folhas");
        }
        else{
            System.out.println("Carga atual de grampos é: " + this.carga);
            System.out.println("Grampeando");
            this.carga = this.carga - 1;
            System.out.println("Carga atual do grampeador após o uso é: " + this.carga);
        }
    }

    public void trocar_carga(int Nova_carga){
       this.carga = Nova_carga;
        System.out.println("Carregando ");
        System.out.println("Carga atual é de 10 grampos ");
        System.out.println("Pronto para grampear novamente ");
    }

   private void carregar(int quantidadeCarga){
        this.carga = quantidadeCarga;
        System.out.println("Carregando ");
        System.out.println("Carga atual é de 10 grampos ");
        System.out.println("Pronto para grampear novamente ");
    }

    //metodo para mostrar o estado do objeto
   public void status() {
        System.out.println("Um grampeador " + this.cor);
        if (this.carga <= 0) {
            System.out.println("O grampeador esta sem grampos");
        } else {
            System.out.println("O grampeador está carregado");
        }
        System.out.println("Modelo: " + this.modelo);
    }
}
