package br.uniesp.poo;

public class Main {

    public static void main(String[] args) {

        Emprestimo emprestimo = new Emprestimo();
        emprestimo.setIdade(18);
        emprestimo.setValorEmprestimo(1050);
        emprestimo.setMesesParaPagar(9);
        emprestimo.setPercentualJurosMes(5);
        emprestimo.setNomeUsuario("Cleo");
        emprestimo.calcularEmprestimo();

        emprestimo.imprimir();

        Emprestimo emprestimo2 = new Emprestimo();
        emprestimo2.setIdade(33);
        emprestimo2.setValorEmprestimo(1050);
        emprestimo2.setMesesParaPagar(9);
        emprestimo2.setPercentualJurosMes(5);
        emprestimo2.setNomeUsuario("Cleo");
        emprestimo2.calcularEmprestimo();

        emprestimo2.imprimir();



    }
}
