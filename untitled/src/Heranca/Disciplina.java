package Heranca;

import java.util.Arrays;
import java.util.Objects;

public class Disciplina {
  public double[] getNota() {
    return nota;
  }

  public void setNota(double[] nota) {
    this.nota = nota;
  }
//Essa classe disciplina servirá para todos os objetos
  // e instancias de notas ou materias


    private double[] nota = new double[3];//4 notas
    private String disciplina;

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Disciplina that = (Disciplina) o;
    return Arrays.equals(nota, that.nota) && disciplina.equals(that.disciplina);
  }

  @Override
  public int hashCode() {
    int result = Objects.hash(disciplina);
    result = 31 * result + Arrays.hashCode(nota);
    return result;
  }

  @Override
    public String toString() {
      return "Disciplina [nota= " + nota + ", disciplina= " + disciplina + "]";
    }

    public String getDisciplina() {
      return disciplina;
    }

    public void setDisciplina(String disciplina) {
      this.disciplina = disciplina;
    }

  public double getMediaNotas() {
    double somaTotal = 0;

    for(int i = 0; i < nota.length; i++) {
      somaTotal += nota[i];
    }
    return somaTotal / 4;
  }


}


