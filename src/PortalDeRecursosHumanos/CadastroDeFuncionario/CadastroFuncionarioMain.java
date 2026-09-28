package PortalDeRecursosHumanos.CadastroDeFuncionario;
import PortalDeRecursosHumanos.Cargos.*;
import PortalDeRecursosHumanos.DadosFuncionario.FuncionarioDados;

import java.time.LocalDateTime;
import java.util.Scanner;
import java.util.ArrayList;
import java.time.LocalTime;
import java.time.Duration;

public class CadastroFuncionarioMain {

    public static void main(String[] args) {

        //VARIAVEIS
        String nomeFuncionario;
        int idFuncionario;
        int opcaoMenu;
        int opcaoCargo;
        int idPesquisa;

        System.out.println("\n    Olá, seja bem vindo!");

        //ENTRADA DE DADOS
        Scanner sc = new Scanner(System.in);
        ArrayList<FuncionarioDados> funcionarioDados = new ArrayList<>();

        do {
            System.out.println("\n===PORTAL DE RECURSOS HUMANOS===" +
                    "\n1 - Cadastrar." +
                    "\n2 - Pesquisar." +
                    "\n3 - Remover." +
                    "\n4 - Listar." +
                    "\n5 - Registrar ponto de entrada." +
                    "\n6 - Registrar ponto de saida." +
                    "\n0 - Sair");
            System.out.print("Escolha uma das opções: ");
            opcaoMenu = sc.nextInt();
            sc.nextLine();

            switch (opcaoMenu) {
                case 1:
                    System.out.print("\nDigite o nome do funcionario: ");
                    nomeFuncionario = sc.nextLine();
                    System.out.print("Digite o identificador do funcionario: ");
                    idFuncionario = sc.nextInt();
                    sc.nextLine();

                    System.out.println("\nEscolha o cargo!" +
                            "\n1 - Analista" +
                            "\n2 - Assistente" +
                            "\n3 - Coordenador" +
                            "\n4 - Estagiário" +
                            "\n5 - Gerente");
                    System.out.print("Digite a opção: ");
                    opcaoCargo = sc.nextInt();
                    sc.nextLine();

                    switch (opcaoCargo) {
                        case 1:
                            funcionarioDados.add(new Analista(nomeFuncionario, idFuncionario));
                            System.out.println("Funcionário cadastrado com sucesso!");
                            break;
                        case 2:
                            funcionarioDados.add(new Assistente(nomeFuncionario, idFuncionario));
                            System.out.println("Funcionário cadastrado com sucesso!");
                            break;
                        case 3:
                            funcionarioDados.add(new Coordenador(nomeFuncionario, idFuncionario));
                            System.out.println("Funcionário cadastrado com sucesso!");
                            break;
                        case 4:
                            funcionarioDados.add(new Estagiario(nomeFuncionario, idFuncionario));
                            System.out.println("Funcionário cadastrado com sucesso!");
                            break;
                        case 5:
                            funcionarioDados.add(new Gerente(nomeFuncionario, idFuncionario));
                            System.out.println("Funcionário cadastrado com sucesso!");
                            break;
                    }
                    break;

                case 2:
                    System.out.println("Digite o ID do funcionario: ");
                    idPesquisa = sc.nextInt();
                    sc.nextLine();

                    for (FuncionarioDados funcionario : funcionarioDados) {

                        if (funcionario.getIdFuncionario() == idPesquisa) {
                            System.out.println("Funcionario: " + funcionario.getNomeFuncionario()
                                    + " | ID: " + funcionario.getIdFuncionario());

                            System.out.println("Entrada: " + funcionario.getHorarioDeEntrada());
                            System.out.println("Saída: " + funcionario.getHorarioDeSaida());
                        }
                    }
                    break;

                case 3:
                    System.out.println("Digite o ID do funcionario: ");
                    idPesquisa = sc.nextInt();
                    sc.nextLine();

                    for (int i = 0; i < funcionarioDados.size(); i++) {

                        if (funcionarioDados.get(i).getIdFuncionario() == idPesquisa) {
                            System.out.println("Funcionario: "
                                    + funcionarioDados.get(i).getNomeFuncionario());
                            funcionarioDados.remove(i);
                            break;
                        }
                    }
                    break;

                case 4:
                    System.out.println("\n=== LISTA DE FUNCIONÁRIOS ===");
                    for (FuncionarioDados funcionario : funcionarioDados) {
                        System.out.println("Funcionario: " + funcionario.getNomeFuncionario()
                                + " | ID: " + funcionario.getIdFuncionario());
                        if (funcionario instanceof Analista) {
                            System.out.println("Cargo: Analista");
                        } else if (funcionario instanceof Assistente) {
                            System.out.println("Cargo: Assistente");
                        } else if (funcionario instanceof Coordenador) {
                            System.out.println("Cargo: Coordenador");
                        } else if (funcionario instanceof Estagiario) {
                            System.out.println("Cargo: Estagiario");
                        } else if (funcionario instanceof Gerente) {
                            System.out.println("Cargo: Gerente");
                        }
                    }
                    break;

                case 5:
                    System.out.println("Digite seu ID: ");
                    idPesquisa = sc.nextInt();
                    sc.nextLine();

                    for (int i = 0; i < funcionarioDados.size(); i++) {

                        if (funcionarioDados.get(i).getIdFuncionario() == idPesquisa) {

                            if (funcionarioDados.get(i) instanceof Gerente ||
                                    funcionarioDados.get(i) instanceof Estagiario) {

                                System.out.println("Este funcionário não registra ponto.");

                            } else {

                                if (funcionarioDados.get(i).getHorarioDeEntrada() != null) {
                                    System.out.println("Este funcionário já registrou a entrada.");

                                } else {

                                    LocalDateTime horarioDeEntrada = LocalDateTime.now();

                                    if (horarioDeEntrada.toLocalTime().isBefore(LocalTime.of(6, 0))) {
                                        System.out.println("Entrada não permitida antes das 06:00.");

                                    } else {

                                        funcionarioDados.get(i).setHorarioDeEntrada(horarioDeEntrada);

                                        System.out.println("Funcionario: "
                                                + funcionarioDados.get(i).getNomeFuncionario()
                                                + " bateu o ponto.");

                                        System.out.println("Entrada registrada às: " + horarioDeEntrada);
                                    }
                                }
                            }
                        }
                    }
                    break;

                case 6:
                    System.out.println("Digite seu ID: ");
                    idPesquisa = sc.nextInt();
                    sc.nextLine();

                    for (int i = 0; i < funcionarioDados.size(); i++) {

                        if (funcionarioDados.get(i).getIdFuncionario() == idPesquisa) {

                            if (funcionarioDados.get(i) instanceof Gerente ||
                                    funcionarioDados.get(i) instanceof Estagiario) {

                                System.out.println("Este funcionário não registra ponto.");

                            } else {

                                LocalDateTime horarioDeSaida = LocalDateTime.now();

                                if (horarioDeSaida.toLocalTime().isAfter(LocalTime.of(22, 0))) {
                                    System.out.println("Saída não permitida depois das 22:00.");

                                } else if (funcionarioDados.get(i).getHorarioDeEntrada() == null) {
                                    System.out.println("Não é possível registrar a saída sem registrar a entrada.");

                                } else if (funcionarioDados.get(i).getHorarioDeSaida() != null) {
                                    System.out.println("Este funcionário já registrou a saída.");

                                } else if (!horarioDeSaida.isAfter(funcionarioDados.get(i).getHorarioDeEntrada())) {
                                    System.out.println("Saída deve ser posterior ao horário de entrada.");

                                } else {

                                    Duration duracao = Duration.between(
                                            funcionarioDados.get(i).getHorarioDeEntrada(),
                                            horarioDeSaida);

                                    long minutosTrabalhados = duracao.toMinutes() - 60;

                                    long horasTrabalhadas = minutosTrabalhados / 60;

                                    long horasExtras = horasTrabalhadas - 8;

                                    if (horasExtras < 0) {
                                        horasExtras = 0;
                                    }

                                    if (funcionarioDados.get(i) instanceof Analista ||
                                            funcionarioDados.get(i) instanceof Assistente) {

                                        if (horasExtras > 3) {
                                            System.out.println("Ponto não registrado. " +
                                                    "O limite de 3 horas extras foi ultrapassado.");

                                        } else {
                                            funcionarioDados.get(i).setHorarioDeSaida(horarioDeSaida);

                                            System.out.println("Funcionario: "
                                                    + funcionarioDados.get(i).getNomeFuncionario()
                                                    + " registrou a saída.");

                                            System.out.println("Saída registrada às: " + horarioDeSaida);
                                            System.out.println("Horas trabalhadas: " + horasTrabalhadas);
                                            System.out.println("Horas extras: " + horasExtras);
                                        }

                                    } else if (funcionarioDados.get(i) instanceof Coordenador) {

                                        if (horasExtras > 5) {
                                            System.out.println("Ponto não registrado. " +
                                                    "O limite de 5 horas extras foi ultrapassado.");

                                        } else {
                                            funcionarioDados.get(i).setHorarioDeSaida(horarioDeSaida);

                                            System.out.println("Funcionario: "
                                                    + funcionarioDados.get(i).getNomeFuncionario()
                                                    + " registrou a saída.");

                                            System.out.println("Saída registrada às: " + horarioDeSaida);
                                            System.out.println("Horas trabalhadas: " + horasTrabalhadas);
                                            System.out.println("Horas extras: " + horasExtras);
                                        }
                                    }
                                }
                            }
                        }
                    }
                    break;

                case 0:
                    System.out.println("Saindo do portal...");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }

        }while (opcaoMenu != 0);
    }
}