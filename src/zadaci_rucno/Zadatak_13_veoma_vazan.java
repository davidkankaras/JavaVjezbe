package zadaci_rucno;

import java.util.Scanner;

// pismo i blago, obavezno pogledaj ovaj
public class Zadatak_13_veoma_vazan
{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
double xh = sc.nextDouble(), yh = sc.nextDouble();
double xk = sc.nextDouble(), yk = sc.nextDouble();
double xb = xk + 2, yb = yk - 3;

double vazdusno = Math.hypot(xh - xb, yh - yb);
double prekokuce = Math.hypot(xk-xh, yk-yh) + Math.hypot(xb-xk, yb - yk);

System.out.printf("b(%.2f, %.2f)%n", xb,yb);
System.out.printf("h->b=%f.6f%n", vazdusno);
System.out.printf("h->k->b =%f.6%n", prekokuce);




	}

}
