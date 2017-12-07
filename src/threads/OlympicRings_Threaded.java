package threads;

import org.jointheleague.graphical.robot.Robot;

public class OlympicRings_Threaded {
	// Make A Program that uses Threads and robots to draw the Olympic rings. One
	// robot should draw one ring simultaneously with the other 4 robots.

	public static void main(String[] args) {
		// Thread t1 = new Thread(() -> {
		// for (int i = 0; i < 1000000; i++) {
		// System.out.println(i);
		// }
		// });
		// t1.start();
		//
		// Thread t2 = new Thread(() -> {
		// Robot r = new Robot();
		// for (int i = 0; i < 1000; i++) {
		// r.turn(100);
		// }
		//
		// });
		// t2.start();

		Robot one = new Robot(200, 200);
		Robot two = new Robot(300, 400);
		Robot three = new Robot(400, 200);
		Robot four = new Robot(500, 400);
		Robot five = new Robot(600, 200);

		one.setSpeed(10);
		two.setSpeed(10);
		three.setSpeed(10);
		four.setSpeed(10);
		five.setSpeed(10);

		Thread t1 = new Thread(() -> {
			for (int i = 0; i < 10000; i++) {
				one.move(10);
				one.turn(10);
			}

		});

	}

}
