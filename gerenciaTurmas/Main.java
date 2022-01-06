package gerenciaTurmas;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    static int numTurmas = 0;
    static int numDocentes = 0;
    static ArrayList<Turma> turmas = new ArrayList<>();
    static ArrayList<Docente> docentes = new ArrayList<>();

    public static void criarTurma() {
        scanner.nextLine();
        System.out.println("Digite o nome da turma: ");
        String nome = scanner.nextLine();

        System.out.println("Digite a quantidade de alunos: ");
        int qtdAlunos = scanner.nextInt();

        numTurmas++;
        Turma turma = new Turma(numTurmas, nome, qtdAlunos, LocalDate.now());
        turmas.add(turma);
    }

    public static void criarDisciplina(Turma turma) {
        if (turma.getNumSemana() >= 52) {
            System.out.println("Número máximo de semanas excedido.");
        } else {
            System.out.println("Digite o nome da disciplina: ");
            String nomeDisc = scanner.nextLine();

            Disciplina disciplina = new Disciplina(nomeDisc);
            turma.numSemana++;
            turma.getAssuntos().add(disciplina);
        }
    }

    public static void criarDocente() {
        System.out.println("Digite o nome do docente: ");
        String nome = scanner.nextLine();

        numDocentes++;
        Docente docente = new Docente(numDocentes,nome);
        docentes.add(docente);
    }

    public static Turma obterTurma(int numero) {
        for (Turma t : turmas) {
            if (t.getIdentificacao() == numero) {
                return t;
            }
        }
        return null;
    }

    public static Docente obterDocente(int numero) {
        for (Docente d : docentes) {
            if (d.getIdNum() == numero) {
                return d;
            }
        }
        return null;
    }

    public static void definirDocente(Turma turma, Docente docente, int i) {
        if (turma != null && docente != null) {
            Disciplina disciplina = turma.getAssuntos().get(i);
            disciplina.setDocente(docente.getNome());
        } else {
            System.out.println("Não foi possível efetuar o processo.");
        }
    }

    public static void main(String[] args) {
        System.out.println("Selecione uma opção:");
        System.out.println("1 - Cadastrar turma");
        System.out.println("2 - Criar disciplina");
        System.out.println("3 - Cadastrar docentes");
        System.out.println("4 - Definir docentes para uma determinada turma");
        System.out.println("5 - Listar turmas");
        System.out.println("6 - Listar todos os docentes");
        System.out.println("7 - Listar um docente e suas semanas");
        System.out.println("Digite qualquer outra tecla para sair.");

        int opcao = scanner.nextInt();

        switch (opcao) {
            case 1:
                criarTurma();

                main(null);
                break;
            case 2:
                if (turmas.isEmpty()) {
                    System.out.println("Não há turmas.");
                    main(null);
                    break;
                } else {
                    System.out.println("Digite o número da turma: ");
                    int numero = scanner.nextInt();

                    criarDisciplina(obterTurma(numero));

                    main(null);
                    break;
                }
            case 3:
                criarDocente();

                main(null);
                break;
            case 4:
                System.out.println("Digite o número da turma: ");
                int numeroTurma = scanner.nextInt();

                System.out.println("Digite o número do docente: ");
                int numeroDocente = scanner.nextInt();

                System.out.println("Digite o número da semana: ");
                int numeroSemana = scanner.nextInt();

                definirDocente(obterTurma(numeroTurma), obterDocente(numeroDocente), numeroSemana);

                main(null);
                break;
            case 5:
                for (Turma t : turmas) {
                    System.out.println(t);
                }

                main(null);
                break;
            case 6:
                for (Docente d : docentes) {
                    System.out.println(d.getNome());
                }

                main(null);
                break;
            case 7:
                System.out.println("Digite o número do docente: ");
                int numero = scanner.nextInt();

                for (Docente d : docentes) {
                    if (d.getIdNum() == numero) System.out.println(d);
                }

                main(null);
                break;
            default:
                System.out.println("Até mais!");
        }
    }

}
