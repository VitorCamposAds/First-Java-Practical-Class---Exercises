package empresa;

<<<<<<< HEAD
import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) {
		//Aluno a = new Aluno();
		//Scanner teclado = new Scanner(System.in);
		//a.matricula=1001;
		//a.nome="Vitor";
		//a.cpf="059.897.775-80";
		//a.info();
		//Aluno b = new Aluno();
		//b.matricula = 1002;
		//b.nome = "Carlos";
		//b.cpf = "569.998.365-20";
		//b.info();
		
		//Carro c = new Carro();
		//System.out.println(Carro.milhasParaMetros(10));
		
		Turma nova = new Turma();
		
		nova.prof = new Professor();
		nova.prof.nome="Vitor";
		nova.alunos = new ArrayList();
		nova.alunos.add(new Aluno());
		nova.alunos.get(0).nome="Lucas";
		
		//a.info();
		Aluno d = new Aluno(1003, "Trovador Solitário", "111.333.444-3");
        d.info();
        //b.info();
        Aluno c = new Aluno(1004);
        c.info();
        
        ArrayList<Aluno> alunos = new ArrayList();
        alunos.add(c);
        alunos.add(new Aluno(1005, "Jim Morrison", "555.555.55-55"));
		
	}

=======
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
>>>>>>> de65847d1e5528f4935b6a08b5043bd5d37e2e86
}
