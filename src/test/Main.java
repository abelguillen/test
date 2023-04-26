package test;

import test.model.Estudiante;

public class Main {

	public static void main(String[] args) {
		Estudiante estudiantesArr[] = new Estudiante[8];
		estudiantesArr[0] = new Estudiante("Abel", 8);
		estudiantesArr[1] = new Estudiante("Nara", 10);
		estudiantesArr[2] = new Estudiante("Alejandro", 7);
		estudiantesArr[3] = new Estudiante("Natalia", 6);
		estudiantesArr[4] = new Estudiante("Ariel", 9);
		estudiantesArr[5] = new Estudiante("Cristian", 5);
		estudiantesArr[6] = new Estudiante("Martin", 8);
		estudiantesArr[7] = new Estudiante("Matias", 4);
		
		double promedio = calcularPromedio(estudiantesArr);
		
		Estudiante notaMayorArr[] = calcularNotaMayorAlPromedio(estudiantesArr, promedio);
		
		mostrarAlumnosMayorPromedio(notaMayorArr);
		
	}
	
	private static void mostrarAlumnosMayorPromedio(Estudiante[] notaMayorArr) {
		for(int i=0;i<notaMayorArr.length;i++) {
			if(notaMayorArr[i] != null) {
				Estudiante estudiante = notaMayorArr[i];
				System.out.println(estudiante.toString());
			}
		}
	}

	private static Estudiante[] calcularNotaMayorAlPromedio(Estudiante estudiantesArr[], double promedio) {
		Estudiante mayorPromedio[] = new Estudiante[8];
		for(int i=0;i<estudiantesArr.length;i++) {
			double nota = estudiantesArr[i].getNota();
			if(nota>promedio) {
				mayorPromedio[i] = estudiantesArr[i];
			}
		}
		return mayorPromedio;
	}

	private static double calcularPromedio(Estudiante estudiantesArr[]) {
		double sumatoria = 0;
		double promedio = 0;
		for(int i=0;i<estudiantesArr.length;i++) {
			double nota = estudiantesArr[i].getNota();
			sumatoria += nota;
		}
		promedio = sumatoria / 8;
		System.out.println("El promedio de notas de todo el curso es: " + promedio);
		return promedio;
	}

}
