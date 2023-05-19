package aula2;

public class Horario {

  private int hora, min, sec;

  public Horario(int hora, int min, int sec) throws Exception {
    if (hora >= 0 && hora <= 23) {
      this.hora = hora;
    } else {
      throw new Exception("Hora inválida");
    }
    if (min >= 0 && min <= 59) {
      this.min = min;
    } else {
      throw new Exception("Minuto inválido");
    }
    if (sec >= 0 && sec <= 59) {
      this.sec = sec;
    } else {
      throw new Exception("Segundo inválido");
    }
  }

  public int getHora() {
    return hora;
  }

  public int getMin() {
    return min;
  }

  public int getSec() {
    return sec;
  }
}
