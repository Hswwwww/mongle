package com.mongle.service.mypage;

import java.util.Scanner;

import com.mongle.view.MongleVisual;

public class CreditScore {

	public static int creditScoreService() {

		Scanner scan = new Scanner(System.in);
		boolean loop = true;

		while (loop) {

			MongleVisual.pusher();

			MongleVisual.menuHeader("신용 점수");

			System.out.println();
			System.out.printf("%22s현재 신용 점수: \n", " ");
			System.out.println();

			System.out.printf("%22s9. 홈으로\n", " ");
			System.out.printf("%22s0. 이전으로\n", " ");
			System.out.printf("%22s선택(숫자): ", " ");
			String sel = scan.nextLine();

			if (sel.equals("9")) {
				return 9;
			} else if (sel.equals("0")) {
				return 0;
			}

		}
		return 0;

	}

}
