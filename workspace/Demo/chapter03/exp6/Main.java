/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter03.exp6;
import java.util.Scanner;
/**
 *
 * @author 喃卿
 */
public class Main {
    public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		while (true)
		{
			int d = sc.nextInt();
			int v = sc.nextInt();

			if (d == 0 && v == 0)
				break;

			double r = Math.cbrt(d * d * d - v * 6 / Math.PI);
			System.out.format("%.3f\n", r);
		}
	}

}
