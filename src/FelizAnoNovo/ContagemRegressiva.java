package FelizAnoNovo;

import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class ContagemRegressiva {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite quantos segundos faltam para a contagem regressiva: ");
		int seconds = scanner.nextInt();
		
		Timer timer = new Timer();
		TimerTask task = new TimerTask(){
			int contagemRegressiva = seconds;
			
			@Override
			public void run() {
				if (contagemRegressiva > 0) {
					System.out.println(contagemRegressiva + "...");
					contagemRegressiva--;
				} else {
					System.out.println("Feliz Ano Novo!");
					System.out.println("Que venha 2025");
					timer.cancel();
				}
			}
		};
		
		System.out.println("Iniciando a contagem regressiva!");
		timer.scheduleAtFixedRate(task, 0, 1000);
		
		scanner.close();
	}
}
