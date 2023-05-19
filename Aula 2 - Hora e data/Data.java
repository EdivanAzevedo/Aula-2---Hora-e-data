package aula2;

public class Data {

  private int dia, mes, ano;

  public Data(int dia, int mes, int ano) throws Exception {
    if (
      ano < 1 || mes < 1 || mes > 12 || dia < 1 || dia > diasDoMes(mes, ano)
    ) {
      throw new Exception("Data inválida");
    }
    this.dia = dia;
    this.mes = mes;
    this.ano = ano;
  }

  private int diasDoMes(int mes, int ano) {
    if (mes == 2) {
      return bissextos(ano) ? 29 : 28;
    } else if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
      return 30;
    } else {
      return 31;
    }
  }

  private boolean bissextos(int ano) {
    return ano % 4 == 0 && ano % 100 != 0 || ano % 400 == 0;
  }

  public int getDia() {
    return dia;
  }

  public int getMes() {
    return mes;
  }

  public int getAno() {
    return ano;
  }
}
