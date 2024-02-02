package com.mongle.service.mypage;

import java.util.Scanner;

import com.mongle.view.MongleVisual;

public class QRCode {
	public static int qr() {
		Scanner scan = new Scanner(System.in);
		MongleVisual.menuHeader("결제용 QR코드");
		try {
			ProcessBuilder builder = new ProcessBuilder();
			builder.command("mspaint.exe", "dat\\qr.png");
			builder.start();
		} catch (Exception e) {
			System.out.println("qr.main");
			e.printStackTrace();
		}

		boolean loop = true;
		while (loop) {

			System.out.printf("%22s9. 홈으로\n", " ");
			System.out.printf("%22s0. 이전으로\n", " ");
			System.out.println();

			System.out.printf("%22s선택(번호) :", " ");
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
