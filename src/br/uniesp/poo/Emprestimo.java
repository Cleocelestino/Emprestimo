package br.uniesp.poo;

public class Emprestimo {
    private String nomeUsuario;
    private int idade;
    private double valorEmprestimo;
    private double percentualJurosMes;
    private int mesesParaPagar;

    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getValorEmprestimo() {
        return valorEmprestimo;
    }

    public void setValorEmprestimo(double valorEmprestimo) {
        this.valorEmprestimo = valorEmprestimo;
    }

    public double getPercentualJurosMes() {
        return percentualJurosMes;
    }

    public void setPercentualJurosMes(double percentualJurosMes) {
        this.percentualJurosMes = percentualJurosMes;
    }

    public int getMesesParaPagar() {
        return mesesParaPagar;
    }

    public void setMesesParaPagar(int mesesParaPagar) {
        this.mesesParaPagar = mesesParaPagar;
    }

    /*
     * Este método não retorna valor e deverá exibir na tela todos os atributos da classe empréstimo.
     * */
    public void imprimir (){
        System.out.println("Nome do usuário: " + this.getNomeUsuario());
        System.out.println("Idade do usuário: " + this.getIdade());
        System.out.println("Valor do emprestimo: " + this.getValorEmprestimo());
        System.out.println("Quantidade de meses a pagar: " + this.getMesesParaPagar());
        System.out.println("Percentual de Juros: " + this.getPercentualJurosMes());

    }
    /*
    * O valor do empréstimo é calculado seguindo a seguintes regras: caso a idade seja maior ou igual a 18 e menor do que 23, use a fórmula: valorEmprestimo += (valorEmprestimo / mesesParaPagar) / * percentualJurosMes, quando for superior a 23 e menor ou igual a 33, use a fórmula (valorEmprestimo * 10)/100
     * */
    public void calcularEmprestimo(){
        if (this.getIdade() >= 18 && this.getIdade() < 23){
            valorEmprestimo += (valorEmprestimo / mesesParaPagar)  * percentualJurosMes;

        }else if(this.getIdade() <= 33){
            valorEmprestimo += (valorEmprestimo * 10) /100;

        }

    }

}


