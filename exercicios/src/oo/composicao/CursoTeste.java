package oo.composicao;

public class CursoTeste {
	
	public static void main(String[] args) {

		Aluno aluno1 = new Aluno("Jo�o");
		Aluno aluno2 = new Aluno("Maria");
		Aluno aluno3 = new Aluno("Pedro");
		
		Curso curso1 = new Curso ("Java Completo");
		Curso curso2 = new Curso ("JavaScript Completo");
		Curso curso3 = new Curso ("Php");
		
		curso1.adicionarAluno(aluno1);
		curso1.adicionarAluno(aluno3);
		
		curso2.adicionarAluno(aluno2);
		curso2.adicionarAluno(aluno3);

		aluno1.adicionarCurso(curso3);
		aluno2.adicionarCurso(curso3);
		aluno3.adicionarCurso(curso3);
		
		for (Aluno aluno: curso1.alunos) {
			System.out.println("Estou Matriculado no Curso " + curso1.nome + " e Meu Nome � "+ aluno.nome);
			System.out.println();
		}
		
		for (Aluno aluno : curso3.alunos) {
			System.out.println(("Estou Matriculado no Curso " + curso3.nome + " e Meu Nome � " + aluno.nome));
			System.out.println();
			
		}
		
		System.out.println(aluno1.cursos.get(0).alunos);
		
		Curso cursoEncontrado = aluno1.obterCursoPorNome("Java Completo");
		  
		if (cursoEncontrado != null) {
			System.out.println(cursoEncontrado.nome);
			System.out.println(cursoEncontrado.alunos);

		
		}
	}

}
