package questao6;

public class Main {
    public static void main (String[] args) {

        ClinicoGeral hermione = new ClinicoGeral("Hermione Granger",   25, "CRM-002", 13000);
        Cirurgiao snape = new Cirurgiao("Severus Snape",         48, "CRM-003", 20000, "Cirurgia Cardíaca");
        Pediatra gina = new Pediatra("Gina Weasley",           23, "CRM-006", 11500, 16);

        Departamento depClinica  = new Departamento("Clínica Geral");
        Departamento depCirurgia = new Departamento("Cirurgia");
        Departamento depPediatria= new Departamento("Pediatria");

        depClinica.adicionarMedico(hermione);
        depCirurgia.adicionarMedico(snape);
        depPediatria.adicionarMedico(gina);

        Hospital hospitalMagico = new Hospital("Hospital St. Mungo");
        hospitalMagico.adicionarDepartamento(depClinica);
        hospitalMagico.adicionarDepartamento(depCirurgia);
        hospitalMagico.adicionarDepartamento(depPediatria);

        hermione.triagem("Rony Weasley");
        hermione.encaminhar("Rony Weasley", "Cirurgia");
        snape.realizarCirurgia("Rony Weasley");
        gina.atenderCrianca("Teddy Lupin", 7);
        gina.atenderCrianca("Neville Longbottom", 21);
        snape.emitirLaudo("Rony Weasley", "Recuperação pós-operatória favorável.");

        hospitalMagico.listarDepartamentos();
        depClinica.removerMedico("CRM-002");
        hospitalMagico.listarDepartamentos();

    }
}
