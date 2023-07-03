package empresa;

public class Principal {

    public static void main(String[] args) {
        Conta c1 = new Conta(111, "Mário", 2000, 500);
        Conta c2 = new Conta(222, "João", 1000, 300);
        
        c1.info();
        if (!c1.sacar(2000)) {
            System.out.println("Problema ao sacar!");
        }
        if (!c1.depositar(-500)) {
            System.out.println("Problema ao depositar!");
        }
        System.out.println();
        c1.info();

        boolean transferenciaEfetuada = c1.transferir(1000, c2);
        if (transferenciaEfetuada) {
            System.out.println("Transferência realizada com sucesso!");
        } else {
            System.out.println("Problema ao realizar a transferência!");
        }
        
        System.out.println();
        c1.info();
        c2.info();
    }
}
