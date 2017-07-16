package com.c5b8.scalacourse.exercises.class1

import java.awt.image.BufferedImage
import java.awt.{Color, GradientPaint, Graphics2D}

import scala.swing._

class Hanoi(val num: Int, speed: Int = 1) {

	require(speed > 0 && speed <= 1000)
	var moves = 0

	val pegs = Array(List.tabulate(num)(i => i + 2), List[Int](), List[Int]())
	val img = new BufferedImage(600, 300, BufferedImage.TYPE_INT_ARGB)
	val g = img.createGraphics

	val panel = new Panel {
		preferredSize = new Dimension(img.getWidth, img.getHeight)

		override def paint(g: Graphics2D) {
			g.drawImage(img, 0, 0, null)
		}
	}

	def renderPegs() {
		g.clearRect(0, 0, img.getWidth, img.getHeight)
		for (i <- pegs.indices) {
			for (j <- pegs(i).indices) {
				val s = pegs(i)(j) * 20
				val x = 100 + i * 200 - s / 2
				val y = img.getHeight - (pegs(i).length - j) * 30
				val w = s
				val h = 28
				val gp1 = new GradientPaint(x, y, Color.RED, x + w, y, new Color(40, 0, 0))
				g.setPaint(gp1)
				g.fillRect(x, y, w, h)
			}
		}
		panel.repaint()
		Thread.sleep(1000 / speed)
	}

	def moveDisk(from: Int, to: Int) {
		require(pegs(to).isEmpty || pegs(from).head < pegs(to).head)
		pegs(to) = pegs(from).head :: pegs(to)
		pegs(from) = pegs(from).tail
		moves = moves + 1
		renderPegs()
	}


	val frame = new MainFrame {
		title = "Hanoi"
		contents = panel
		resizable = false
		peer.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE)
	}

	def finished(): Unit = {
		println(s"$moves moves")
		moves = 0
	}
	frame.visible = true
	renderPegs()

	def close(): Unit = {
		frame.visible = false
		frame.dispose()
	}
}