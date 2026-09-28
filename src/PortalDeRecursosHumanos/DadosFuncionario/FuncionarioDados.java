package PortalDeRecursosHumanos.DadosFuncionario;
import java.time.LocalDateTime;

public class FuncionarioDados {

    private String nomeFuncionario;
    private int idFuncionario;
    private LocalDateTime horarioDeEntrada;
    private LocalDateTime horarioDeSaida;

    public FuncionarioDados(String nomeFuncionario, int idFuncionario) {
        this.nomeFuncionario = nomeFuncionario;
        this.idFuncionario = idFuncionario;
    }

    public String getNomeFuncionario() {
        return nomeFuncionario;
    }
    public int getIdFuncionario() {
        return idFuncionario;
    }

    //HORARIO DE ENTRADA
    public void  setHorarioDeEntrada (LocalDateTime horarioDeEntrada) {
        this.horarioDeEntrada = horarioDeEntrada;
    }
    public LocalDateTime getHorarioDeEntrada() {
        return horarioDeEntrada;
    }

    //HORARIO DE SAIDA
    public void setHorarioDeSaida (LocalDateTime horarioDeSaida) {
        this.horarioDeSaida = horarioDeSaida;
    }
    public LocalDateTime getHorarioDeSaida() {
        return horarioDeSaida;
    }
}