public abstract class Estagiarios implements Reembolso{

    private String professorEstagiario;
    private double bolsa;


    public Estagiarios(String professorEstagiario, double bolsa) {
        this.professorEstagiario = professorEstagiario;
        this.bolsa = bolsa;
    }
    @Override
    public double calculoReembolso() {
        System.out.println(" o reembolso foi efetuado com Sucesso");
        return 0;
    }

    public String getProfessorEstagiario() {
        return professorEstagiario;
    }

    public void setProfessorEstagiario(String professorEstagiario) {
        this.professorEstagiario = professorEstagiario;
    }

    public double getBolsa() {
        return bolsa;
    }

    public void setBolsa(double bolsa) {
        this.bolsa = bolsa;
    }
}
