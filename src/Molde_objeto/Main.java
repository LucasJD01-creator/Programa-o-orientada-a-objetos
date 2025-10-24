package Molde_objeto;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //criando um grampeador apartir do molde
        Molde_Grampeador grampeadorPreto = new Molde_Grampeador();

        //adicionando as propriedades/ ATRIBUTOS
        grampeadorPreto.modelo = "Gramper";
        grampeadorPreto.cor = "Preto";
        grampeadorPreto.trocar_carga = 0;


        //exibindo status // METODOS
        grampeadorPreto.status();

        //mudando o estado e exibindo novamente // Atributo + Metodo
        grampeadorPreto.status();

        grampeadorPreto.grampear();
        grampeadorPreto.grampear();
        grampeadorPreto.grampear();
        grampeadorPreto.grampear();
        grampeadorPreto.grampear();
        grampeadorPreto.grampear();
        grampeadorPreto.grampear();
        grampeadorPreto.grampear();
        grampeadorPreto.grampear();
        grampeadorPreto.grampear();
        grampeadorPreto.grampear();
        grampeadorPreto.trocar_carga(10);

    }
}