package questao5;

public class Main {
    public static void main(String[] args) {

        Medico m1 = new Medico("Ana Lima", "Cardiologia", 12345);
        Medico m2 = new Medico("Carlos Souza", "Ortopedia", 67890);
        Medico m3 = new Medico("Beatriz Nunes", "Cardiologia", 11111);

        Paciente p1 = new Paciente("Joao Silva", 1001);
        Paciente p2 = new Paciente("Maria Oliveira", 1002);

        Departamento d1 = new Departamento("Cardiologia");
        Departamento d2 = new Departamento("Ortopedia");

        d1.adicionarMedico(m1);
        d1.adicionarMedico(m3);
        d2.adicionarMedico(m2);

        Hospital h1 = new Hospital("Hospital Sao Lucas", "123.456.789/0001-00");
        h1.adicionarDepartamento(d1);
        h1.adicionarDepartamento(d2);

        // Medico m2 trabalhando em outro hospital
        Hospital h2 = new Hospital("Hospital Central", "987.654.321/0001-00");
        Departamento d3 = new Departamento("Ortopedia");
        d3.adicionarMedico(m2);
        h2.adicionarDepartamento(d3);

        System.out.println("---");
        h1.listarDepartamentos();
        System.out.println("---");
        m1.atenderPaciente(p1);
        m2.atenderPaciente(p2);
        System.out.println("---");
        h2.listarDepartamentos();
    }
}
