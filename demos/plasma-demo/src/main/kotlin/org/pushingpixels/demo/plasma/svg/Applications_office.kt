package org.pushingpixels.demo.plasma.svg

import java.awt.*
import java.awt.geom.*
import java.awt.image.BufferedImage
import java.io.*
import java.lang.ref.WeakReference
import java.util.Base64
import java.util.Stack
import javax.imageio.ImageIO
import javax.swing.plaf.UIResource

import org.pushingpixels.neon.api.icon.ResizableIcon
import org.pushingpixels.neon.api.icon.ResizableIcon.Factory
import org.pushingpixels.neon.api.icon.ResizableIconUIResource

/**
 * This class has been automatically generated using <a
 * href="https://github.com/kirill-grouchnikov/radiance">Photon SVG transcoder</a>.
 */
class Applications_office private constructor(private var width: Int, private var height: Int)
       : ResizableIcon {
    @Suppress("UNUSED_VARIABLE") private var shape: Shape? = null
    @Suppress("UNUSED_VARIABLE") private var paint: Paint? = null
    @Suppress("UNUSED_VARIABLE") private var stroke: Stroke? = null
    @Suppress("UNUSED_VARIABLE") private var clip: Shape? = null
    private val transformsStack = Stack<AffineTransform>()

    

	private fun _paint0(g : Graphics2D,origAlpha : Float) {
transformsStack.push(g.transform)
// 
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0
g.composite = AlphaComposite.getInstance(3, 0.3186813f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 4.0f))
// _0_0_0
shape = GeneralPath()
(shape as GeneralPath).moveTo(37.625, 37.75)
(shape as GeneralPath).curveTo(37.648037, 39.810402, 34.913227, 41.71825, 30.456121, 42.751118)
(shape as GeneralPath).curveTo(25.999018, 43.78399, 20.500982, 43.78399, 16.043879, 42.751118)
(shape as GeneralPath).curveTo(11.586774, 41.71825, 8.851964, 39.810402, 8.875, 37.75)
(shape as GeneralPath).curveTo(8.851964, 35.689598, 11.586774, 33.78175, 16.043879, 32.748882)
(shape as GeneralPath).curveTo(20.500982, 31.71601, 25.999018, 31.71601, 30.456121, 32.748882)
(shape as GeneralPath).curveTo(34.913227, 33.78175, 37.648037, 35.689598, 37.625, 37.75)
(shape as GeneralPath).closePath()
paint = RadialGradientPaint(Point2D.Double(23.25, 37.75), 14.875f, Point2D.Double(23.25, 37.75), floatArrayOf(0.0f,1.0f), arrayOf(Color(0, 0, 0, 255),Color(0, 0, 0, 0)), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(1.0f, 0.0f, 0.0f, 0.4201680123806f, 0.0f, 21.888660430908203f))
g.paint = paint
g.fill(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 0.6978022f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, -0.125f, 4.75f))
// _0_0_1
shape = GeneralPath()
(shape as GeneralPath).moveTo(33.5, 36.8125)
(shape as GeneralPath).curveTo(33.51372, 37.865097, 31.884726, 38.839756, 29.229843, 39.36742)
(shape as GeneralPath).curveTo(26.574959, 39.89508, 23.300041, 39.89508, 20.645157, 39.36742)
(shape as GeneralPath).curveTo(17.990274, 38.839756, 16.361279, 37.865097, 16.375, 36.8125)
(shape as GeneralPath).curveTo(16.361279, 35.759903, 17.990274, 34.785244, 20.645157, 34.25758)
(shape as GeneralPath).curveTo(23.300041, 33.72992, 26.574959, 33.72992, 29.229843, 34.25758)
(shape as GeneralPath).curveTo(31.884726, 34.785244, 33.51372, 35.759903, 33.5, 36.8125)
(shape as GeneralPath).closePath()
paint = Color(255, 255, 255, 255)
g.paint = paint
g.fill(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 0.78571427f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(0.5739129781723022f, 0.0f, 0.0f, 0.5739129781723022f, 10.906519889831543f, 19.584779739379883f))
// _0_0_2
shape = GeneralPath()
(shape as GeneralPath).moveTo(37.625, 37.75)
(shape as GeneralPath).curveTo(37.648037, 39.810402, 34.913227, 41.71825, 30.456121, 42.751118)
(shape as GeneralPath).curveTo(25.999018, 43.78399, 20.500982, 43.78399, 16.043879, 42.751118)
(shape as GeneralPath).curveTo(11.586774, 41.71825, 8.851964, 39.810402, 8.875, 37.75)
(shape as GeneralPath).curveTo(8.851964, 35.689598, 11.586774, 33.78175, 16.043879, 32.748882)
(shape as GeneralPath).curveTo(20.500982, 31.71601, 25.999018, 31.71601, 30.456121, 32.748882)
(shape as GeneralPath).curveTo(34.913227, 33.78175, 37.648037, 35.689598, 37.625, 37.75)
(shape as GeneralPath).closePath()
paint = RadialGradientPaint(Point2D.Double(23.25, 37.75), 14.875f, Point2D.Double(23.25, 37.75), floatArrayOf(0.0f,1.0f), arrayOf(Color(0, 0, 0, 255),Color(0, 0, 0, 0)), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(1.0f, 0.0f, 0.0f, 0.4201680123806f, 8.187894806610529E-16f, 21.888660430908203f))
g.paint = paint
g.fill(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.005025029182434f, 0.0f, 0.0f, 1.0f, -0.18655799329280853f, 5.625f))
// _0_0_3
shape = GeneralPath()
(shape as GeneralPath).moveTo(37.125, 14.1875)
(shape as GeneralPath).curveTo(37.14493, 16.225508, 34.778725, 18.112616, 30.922361, 19.13426)
(shape as GeneralPath).curveTo(27.065998, 20.155903, 22.309002, 20.155903, 18.452639, 19.13426)
(shape as GeneralPath).curveTo(14.596274, 18.112616, 12.230069, 16.225508, 12.25, 14.1875)
(shape as GeneralPath).curveTo(12.230069, 12.149492, 14.596274, 10.262384, 18.452639, 9.240741)
(shape as GeneralPath).curveTo(22.309002, 8.219097, 27.065998, 8.219097, 30.922361, 9.240741)
(shape as GeneralPath).curveTo(34.778725, 10.262384, 37.14493, 12.149492, 37.125, 14.1875)
(shape as GeneralPath).closePath()
paint = LinearGradientPaint(Point2D.Double(11.75, 14.1875), Point2D.Double(37.625, 14.1875), floatArrayOf(0.0f,0.32894737f,0.65789473f,1.0f), arrayOf(Color(255, 255, 255, 255),Color(255, 255, 255, 176),Color(194, 194, 194, 87),Color(255, 255, 255, 0)), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
g.paint = paint
g.fill(shape)
paint = Color(140, 140, 140, 255)
stroke = BasicStroke(0.99749684f,0,0,4.0f,null,0.0f)
shape = GeneralPath()
(shape as GeneralPath).moveTo(37.125, 14.1875)
(shape as GeneralPath).curveTo(37.14493, 16.225508, 34.778725, 18.112616, 30.922361, 19.13426)
(shape as GeneralPath).curveTo(27.065998, 20.155903, 22.309002, 20.155903, 18.452639, 19.13426)
(shape as GeneralPath).curveTo(14.596274, 18.112616, 12.230069, 16.225508, 12.25, 14.1875)
(shape as GeneralPath).curveTo(12.230069, 12.149492, 14.596274, 10.262384, 18.452639, 9.240741)
(shape as GeneralPath).curveTo(22.309002, 8.219097, 27.065998, 8.219097, 30.922361, 9.240741)
(shape as GeneralPath).curveTo(34.778725, 10.262384, 37.14493, 12.149492, 37.125, 14.1875)
(shape as GeneralPath).closePath()
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, -40.25f, -7.5f))
// _0_0_4
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_4_0
shape = GeneralPath()
(shape as GeneralPath).moveTo(81.18932, 8.851212)
(shape as GeneralPath).lineTo(75.59399, 14.505723)
(shape as GeneralPath).lineTo(60.324795, 46.150494)
(shape as GeneralPath).curveTo(59.091904, 49.407024, 63.727036, 51.320175, 65.33689, 48.436665)
(shape as GeneralPath).lineTo(80.231415, 16.856367)
(shape as GeneralPath).lineTo(81.18932, 8.851212)
(shape as GeneralPath).closePath()
paint = Color(203, 144, 34, 255)
g.paint = paint
g.fill(shape)
paint = Color(92, 65, 12, 255)
stroke = BasicStroke(1.0000008f,0,0,4.0f,null,0.0f)
shape = GeneralPath()
(shape as GeneralPath).moveTo(81.18932, 8.851212)
(shape as GeneralPath).lineTo(75.59399, 14.505723)
(shape as GeneralPath).lineTo(60.324795, 46.150494)
(shape as GeneralPath).curveTo(59.091904, 49.407024, 63.727036, 51.320175, 65.33689, 48.436665)
(shape as GeneralPath).lineTo(80.231415, 16.856367)
(shape as GeneralPath).lineTo(81.18932, 8.851212)
(shape as GeneralPath).closePath()
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_4_1
shape = GeneralPath()
(shape as GeneralPath).moveTo(63.226658, 41.398)
(shape as GeneralPath).curveTo(63.226658, 41.398, 63.32797, 42.834988, 64.58091, 43.390907)
(shape as GeneralPath).curveTo(65.871704, 43.96362, 67.23713, 43.376938, 67.23713, 43.376938)
(shape as GeneralPath).lineTo(64.79487, 48.421104)
(shape as GeneralPath).curveTo(64.79487, 48.421104, 63.92115, 49.877754, 61.95461, 49.092304)
(shape as GeneralPath).curveTo(60.01493, 48.31758, 60.78424, 46.41092, 60.78424, 46.41092)
(shape as GeneralPath).lineTo(63.226658, 41.398)
(shape as GeneralPath).closePath()
paint = LinearGradientPaint(Point2D.Double(48.90625, 17.376184463500977), Point2D.Double(50.98833465576172, 22.250591278076172), floatArrayOf(0.0f,0.5f,1.0f), arrayOf(Color(255, 209, 209, 255),Color(255, 29, 29, 255),Color(111, 0, 0, 255)), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(0.005259571131318808f, 0.999987006187439f, 0.999987006187439f, -0.005259571131318808f, 42.99549865722656f, -2.4962410926818848f))
g.paint = paint
g.fill(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_4_2
shape = GeneralPath()
(shape as GeneralPath).moveTo(63.226658, 41.398)
(shape as GeneralPath).curveTo(63.226658, 41.398, 63.32797, 42.834988, 64.58091, 43.390907)
(shape as GeneralPath).curveTo(65.871704, 43.96362, 67.23713, 43.376938, 67.23713, 43.376938)
(shape as GeneralPath).lineTo(66.24766, 45.38217)
(shape as GeneralPath).curveTo(66.24766, 45.38217, 64.93316, 46.216125, 63.561344, 45.61505)
(shape as GeneralPath).curveTo(62.151825, 44.997456, 62.23719, 43.403233, 62.23719, 43.403233)
(shape as GeneralPath).lineTo(63.226658, 41.398)
(shape as GeneralPath).closePath()
paint = LinearGradientPaint(Point2D.Double(46.0, 19.8125), Point2D.Double(47.6875, 22.625), floatArrayOf(0.0f,1.0f), arrayOf(Color(193, 193, 193, 255),Color(172, 172, 172, 255)), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(0.005259571131318808f, 0.999987006187439f, 0.999987006187439f, -0.005259571131318808f, 42.995521545410156f, -2.4962410926818848f))
g.paint = paint
g.fill(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_4_3
shape = GeneralPath()
(shape as GeneralPath).moveTo(80.47809, 10.282021)
(shape as GeneralPath).lineTo(76.001816, 14.805631)
(shape as GeneralPath).curveTo(76.8222, 16.301338, 78.17004, 17.07551, 79.73038, 16.661047)
(shape as GeneralPath).lineTo(80.47809, 10.282021)
(shape as GeneralPath).closePath()
paint = RadialGradientPaint(Point2D.Double(29.053354263305664, 27.640750885009766), 3.2408545f, Point2D.Double(29.053354263305664, 27.640750885009766), floatArrayOf(0.0f,1.0f), arrayOf(Color(231, 226, 184, 255),Color(231, 226, 184, 0)), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(0.015376700088381767f, 2.9235270023345947f, 2.029690980911255f, -0.010675439611077309f, 20.390979766845703f, -69.72664642333984f))
g.paint = paint
g.fill(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_4_4
shape = GeneralPath()
(shape as GeneralPath).moveTo(79.078926, 11.63315)
(shape as GeneralPath).lineTo(80.66411, 9.999789)
(shape as GeneralPath).lineTo(80.36394, 12.345152)
(shape as GeneralPath).curveTo(79.64635, 12.567679, 79.30047, 12.163243, 79.078926, 11.63315)
(shape as GeneralPath).closePath()
paint = LinearGradientPaint(Point2D.Double(25.71875, 31.046875), Point2D.Double(25.514589309692383, 30.703125), floatArrayOf(0.0f,1.0f), arrayOf(Color(0, 0, 0, 255),Color(201, 201, 201, 255)), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(0.005259571131318808f, 0.999987006187439f, 0.999987006187439f, -0.005259571131318808f, 48.692901611328125f, -14.144909858703613f))
g.paint = paint
g.fill(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_4_5
shape = GeneralPath()
(shape as GeneralPath).moveTo(75.970566, 14.805795)
(shape as GeneralPath).lineTo(77.22877, 16.3617)
(shape as GeneralPath).lineTo(64.439995, 43.31636)
(shape as GeneralPath).curveTo(63.581627, 42.87644, 63.348885, 42.080315, 63.26774, 41.41912)
(shape as GeneralPath).lineTo(75.970566, 14.805795)
(shape as GeneralPath).closePath()
paint = Color(255, 255, 255, 93)
g.paint = paint
g.fill(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_4_6
shape = GeneralPath()
(shape as GeneralPath).moveTo(79.79288, 16.660719)
(shape as GeneralPath).lineTo(79.04388, 16.852161)
(shape as GeneralPath).lineTo(66.49448, 43.620552)
(shape as GeneralPath).curveTo(66.49448, 43.620552, 67.10751, 43.507168, 67.24268, 43.400734)
(shape as GeneralPath).lineTo(79.79288, 16.660719)
(shape as GeneralPath).closePath()
paint = Color(0, 0, 0, 93)
g.paint = paint
g.fill(shape)
g.transform = transformsStack.pop()
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 0.53846157f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_5
paint = Color(255, 255, 255, 255)
stroke = BasicStroke(0.9999996f,0,0,4.0f,null,0.0f)
shape = GeneralPath()
(shape as GeneralPath).moveTo(35.590973, 22.336294)
(shape as GeneralPath).lineTo(33.477154, 40.669163)
(shape as GeneralPath).curveTo(32.63409, 45.449017, 16.730858, 45.501263, 15.772831, 40.669163)
(shape as GeneralPath).lineTo(13.570621, 22.398108)
(shape as GeneralPath).curveTo(15.678392, 27.62852, 34.583355, 26.853544, 35.590973, 22.336294)
(shape as GeneralPath).closePath()
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_6
shape = GeneralPath()
(shape as GeneralPath).moveTo(23.876644, 29.502754)
(shape as GeneralPath).curveTo(24.759054, 28.895351, 27.257458, 31.087465, 29.508623, 34.357876)
(shape as GeneralPath).curveTo(31.759789, 37.62829, 32.227455, 41.218243, 32.03304, 41.35207)
(shape as GeneralPath).curveTo(31.816362, 41.501217, 28.652225, 39.767357, 26.40106, 36.496944)
(shape as GeneralPath).curveTo(24.149895, 33.226536, 22.994232, 30.110155, 23.876644, 29.502754)
(shape as GeneralPath).closePath()
paint = Color(231, 231, 231, 255)
g.paint = paint
g.fill(shape)
paint = Color(125, 125, 125, 255)
stroke = BasicStroke(0.9999996f,0,0,4.0f,null,0.0f)
shape = GeneralPath()
(shape as GeneralPath).moveTo(23.876644, 29.502754)
(shape as GeneralPath).curveTo(24.759054, 28.895351, 27.257458, 31.087465, 29.508623, 34.357876)
(shape as GeneralPath).curveTo(31.759789, 37.62829, 32.227455, 41.218243, 32.03304, 41.35207)
(shape as GeneralPath).curveTo(31.816362, 41.501217, 28.652225, 39.767357, 26.40106, 36.496944)
(shape as GeneralPath).curveTo(24.149895, 33.226536, 22.994232, 30.110155, 23.876644, 29.502754)
(shape as GeneralPath).closePath()
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(0.7960140109062195f, 0.08258056640625f, -0.08258056640625f, 0.7960140109062195f, 1.5307120084762573f, -0.7299680113792419f))
// _0_0_7
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(-0.5625100135803223f, -0.8171939849853516f, 0.825069010257721f, -0.5679309964179993f, -15.220560073852539f, 83.8867416381836f))
// _0_0_7_0
paint = Color(52, 101, 164, 255)
stroke = BasicStroke(1.2535026f,0,0,4.0f,null,0.0f)
shape = GeneralPath()
(shape as GeneralPath).moveTo(32.085888, 57.685642)
(shape as GeneralPath).curveTo(35.617744, 56.50985, 40.33878, 56.182793, 44.579147, 56.820156)
(shape as GeneralPath).curveTo(48.819515, 57.45752, 51.981396, 58.969444, 52.94643, 60.82116)
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(-0.5625100135803223f, -0.8171939849853516f, 0.825069010257721f, -0.5679309964179993f, -14.28555965423584f, 81.45323944091797f))
// _0_0_7_1
shape = GeneralPath()
(shape as GeneralPath).moveTo(36.364517, 54.473244)
(shape as GeneralPath).curveTo(36.846443, 55.27986, 36.010174, 56.13992, 34.47655, 56.414906)
(shape as GeneralPath).curveTo(32.94293, 56.68989, 31.267382, 56.28022, 30.69383, 55.49003)
(shape as GeneralPath).lineTo(33.5, 54.9375)
(shape as GeneralPath).closePath()
paint = Color(114, 159, 207, 255)
g.paint = paint
g.fill(shape)
paint = Color(52, 101, 164, 255)
stroke = BasicStroke(1.2535026f,0,0,4.0f,null,0.0f)
shape = GeneralPath()
(shape as GeneralPath).moveTo(36.364517, 54.473244)
(shape as GeneralPath).curveTo(36.846443, 55.27986, 36.010174, 56.13992, 34.47655, 56.414906)
(shape as GeneralPath).curveTo(32.94293, 56.68989, 31.267382, 56.28022, 30.69383, 55.49003)
(shape as GeneralPath).lineTo(33.5, 54.9375)
(shape as GeneralPath).closePath()
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = transformsStack.pop()
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_8
shape = GeneralPath()
(shape as GeneralPath).moveTo(18.309496, 27.045877)
(shape as GeneralPath).curveTo(21.251305, 31.200586, 24.142324, 34.798885, 26.528053, 37.384544)
(shape as GeneralPath).lineTo(30.395567, 34.722366)
(shape as GeneralPath).curveTo(28.634237, 31.171968, 25.891142, 26.577557, 22.565008, 21.745474)
(shape as GeneralPath).curveTo(16.561094, 13.023205, 10.607438, 6.378291, 8.252501, 5.590012)
(shape as GeneralPath).curveTo(8.18023, 5.5671086, 8.083313, 5.536959, 8.018113, 5.5255275)
(shape as GeneralPath).curveTo(7.9722757, 5.5185456, 7.9043655, 5.52092, 7.862244, 5.5199065)
(shape as GeneralPath).curveTo(7.796054, 5.520212, 7.7111893, 5.533879, 7.6548076, 5.5497823)
(shape as GeneralPath).curveTo(7.641025, 5.554251, 7.598818, 5.55428, 7.5856624, 5.5597405)
(shape as GeneralPath).curveTo(7.572823, 5.565697, 7.5463, 5.58828, 7.534096, 5.5952363)
(shape as GeneralPath).curveTo(7.528154, 5.598964, 7.514095, 5.609004, 7.5083127, 5.6129837)
(shape as GeneralPath).curveTo(7.5025306, 5.616964, 7.488133, 5.626512, 7.4825296, 5.6307316)
(shape as GeneralPath).curveTo(7.471675, 5.639648, 7.4411106, 5.6563606, 7.4309626, 5.6662273)
(shape as GeneralPath).curveTo(7.421165, 5.6765656, 7.4060698, 5.715981, 7.396974, 5.72726)
(shape as GeneralPath).curveTo(7.36199, 5.774247, 7.3189254, 5.8486404, 7.295009, 5.910359)
(shape as GeneralPath).curveTo(7.2809167, 5.9500666, 7.2544537, 6.012654, 7.2446103, 6.0579634)
(shape as GeneralPath).curveTo(7.232011, 6.122947, 7.225572, 6.224241, 7.2211637, 6.299926)
(shape as GeneralPath).curveTo(7.11673, 8.781096, 11.19814, 16.71476, 17.202055, 25.437027)
(shape as GeneralPath).curveTo(17.575632, 25.979746, 17.93728, 26.520197, 18.309496, 27.045877)
(shape as GeneralPath).closePath()
paint = LinearGradientPaint(Point2D.Double(28.24468421936035, 60.44550323486328), Point2D.Double(28.24468421936035, 68.22488403320312), floatArrayOf(0.0f,0.31578946f,1.0f), arrayOf(Color(114, 159, 207, 255),Color(165, 191, 218, 255),Color(55, 108, 164, 255)), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(-0.4933040142059326f, -0.7166540026664734f, 0.7166540026664734f, -0.4933040142059326f, -9.267809867858887f, 79.41919708251953f))
g.paint = paint
g.fill(shape)
paint = Color(52, 101, 164, 255)
stroke = BasicStroke(0.9999997f,0,0,4.0f,null,0.0f)
shape = GeneralPath()
(shape as GeneralPath).moveTo(18.309496, 27.045877)
(shape as GeneralPath).curveTo(21.251305, 31.200586, 24.142324, 34.798885, 26.528053, 37.384544)
(shape as GeneralPath).lineTo(30.395567, 34.722366)
(shape as GeneralPath).curveTo(28.634237, 31.171968, 25.891142, 26.577557, 22.565008, 21.745474)
(shape as GeneralPath).curveTo(16.561094, 13.023205, 10.607438, 6.378291, 8.252501, 5.590012)
(shape as GeneralPath).curveTo(8.18023, 5.5671086, 8.083313, 5.536959, 8.018113, 5.5255275)
(shape as GeneralPath).curveTo(7.9722757, 5.5185456, 7.9043655, 5.52092, 7.862244, 5.5199065)
(shape as GeneralPath).curveTo(7.796054, 5.520212, 7.7111893, 5.533879, 7.6548076, 5.5497823)
(shape as GeneralPath).curveTo(7.641025, 5.554251, 7.598818, 5.55428, 7.5856624, 5.5597405)
(shape as GeneralPath).curveTo(7.572823, 5.565697, 7.5463, 5.58828, 7.534096, 5.5952363)
(shape as GeneralPath).curveTo(7.528154, 5.598964, 7.514095, 5.609004, 7.5083127, 5.6129837)
(shape as GeneralPath).curveTo(7.5025306, 5.616964, 7.488133, 5.626512, 7.4825296, 5.6307316)
(shape as GeneralPath).curveTo(7.471675, 5.639648, 7.4411106, 5.6563606, 7.4309626, 5.6662273)
(shape as GeneralPath).curveTo(7.421165, 5.6765656, 7.4060698, 5.715981, 7.396974, 5.72726)
(shape as GeneralPath).curveTo(7.36199, 5.774247, 7.3189254, 5.8486404, 7.295009, 5.910359)
(shape as GeneralPath).curveTo(7.2809167, 5.9500666, 7.2544537, 6.012654, 7.2446103, 6.0579634)
(shape as GeneralPath).curveTo(7.232011, 6.122947, 7.225572, 6.224241, 7.2211637, 6.299926)
(shape as GeneralPath).curveTo(7.11673, 8.781096, 11.19814, 16.71476, 17.202055, 25.437027)
(shape as GeneralPath).curveTo(17.575632, 25.979746, 17.93728, 26.520197, 18.309496, 27.045877)
(shape as GeneralPath).closePath()
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_9
shape = GeneralPath()
(shape as GeneralPath).moveTo(13.743778, 20.854607)
(shape as GeneralPath).curveTo(14.490825, 21.902176, 15.264732, 22.908716, 15.999685, 23.855883)
(shape as GeneralPath).lineTo(21.414206, 20.128834)
(shape as GeneralPath).curveTo(20.528967, 18.671322, 19.545881, 17.138575, 18.484474, 15.596602)
(shape as GeneralPath).curveTo(13.418672, 8.237188, 8.191582, 2.7719285, 5.9415207, 2.2879093)
(shape as GeneralPath).curveTo(5.921755, 2.284001, 5.8740907, 2.2754467, 5.8547974, 2.2723305)
(shape as GeneralPath).curveTo(5.8357406, 2.2696111, 5.786651, 2.2586727, 5.7680736, 2.2567518)
(shape as GeneralPath).curveTo(5.722229, 2.2529485, 5.654997, 2.249885, 5.612204, 2.2511306)
(shape as GeneralPath).curveTo(5.5953336, 2.2520366, 5.5594306, 2.259366, 5.543059, 2.261089)
(shape as GeneralPath).curveTo(5.494695, 2.2674897, 5.422768, 2.2848985, 5.378985, 2.298754)
(shape as GeneralPath).curveTo(5.364648, 2.3037906, 5.3236556, 2.3028367, 5.3098397, 2.3087125)
(shape as GeneralPath).curveTo(5.289508, 2.3181574, 5.2516346, 2.3506057, 5.2324896, 2.361956)
(shape as GeneralPath).curveTo(5.2262406, 2.365952, 5.212821, 2.3754945, 5.2067056, 2.379704)
(shape as GeneralPath).curveTo(5.2005906, 2.3839133, 5.1868863, 2.3930414, 5.1809225, 2.3974514)
(shape as GeneralPath).curveTo(5.1634846, 2.411283, 5.119654, 2.435075, 5.103572, 2.4506953)
(shape as GeneralPath).curveTo(5.093151, 2.461503, 5.0794067, 2.5001342, 5.069584, 2.5117283)
(shape as GeneralPath).curveTo(5.0410094, 2.5476797, 4.9990687, 2.608651, 4.975823, 2.6515422)
(shape as GeneralPath).curveTo(4.9683685, 2.6662195, 4.948704, 2.6971397, 4.9418344, 2.7125752)
(shape as GeneralPath).curveTo(4.925393, 2.752103, 4.9042516, 2.8159978, 4.8914366, 2.860179)
(shape as GeneralPath).curveTo(4.886598, 2.8782182, 4.87929, 2.9279776, 4.8750267, 2.9467492)
(shape as GeneralPath).curveTo(4.871049, 2.9658837, 4.8620224, 3.0134604, 4.8586164, 3.0333192)
(shape as GeneralPath).curveTo(4.5074186, 5.307897, 7.7463174, 12.141716, 12.812121, 19.50113)
(shape as GeneralPath).curveTo(13.127326, 19.959047, 13.428214, 20.4121, 13.743778, 20.854607)
(shape as GeneralPath).closePath()
paint = LinearGradientPaint(Point2D.Double(28.24468421936035, 60.44550323486328), Point2D.Double(28.24468421936035, 68.22488403320312), floatArrayOf(0.0f,0.31578946f,1.0f), arrayOf(Color(91, 144, 200, 255),Color(143, 176, 209, 255),Color(52, 103, 157, 255)), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(-0.4933040142059326f, -0.7166540026664734f, 0.7166540026664734f, -0.4933040142059326f, -9.267809867858887f, 79.41919708251953f))
g.paint = paint
g.fill(shape)
paint = Color(52, 101, 164, 255)
stroke = BasicStroke(0.9999997f,0,0,4.0f,null,0.0f)
shape = GeneralPath()
(shape as GeneralPath).moveTo(13.743778, 20.854607)
(shape as GeneralPath).curveTo(14.490825, 21.902176, 15.264732, 22.908716, 15.999685, 23.855883)
(shape as GeneralPath).lineTo(21.414206, 20.128834)
(shape as GeneralPath).curveTo(20.528967, 18.671322, 19.545881, 17.138575, 18.484474, 15.596602)
(shape as GeneralPath).curveTo(13.418672, 8.237188, 8.191582, 2.7719285, 5.9415207, 2.2879093)
(shape as GeneralPath).curveTo(5.921755, 2.284001, 5.8740907, 2.2754467, 5.8547974, 2.2723305)
(shape as GeneralPath).curveTo(5.8357406, 2.2696111, 5.786651, 2.2586727, 5.7680736, 2.2567518)
(shape as GeneralPath).curveTo(5.722229, 2.2529485, 5.654997, 2.249885, 5.612204, 2.2511306)
(shape as GeneralPath).curveTo(5.5953336, 2.2520366, 5.5594306, 2.259366, 5.543059, 2.261089)
(shape as GeneralPath).curveTo(5.494695, 2.2674897, 5.422768, 2.2848985, 5.378985, 2.298754)
(shape as GeneralPath).curveTo(5.364648, 2.3037906, 5.3236556, 2.3028367, 5.3098397, 2.3087125)
(shape as GeneralPath).curveTo(5.289508, 2.3181574, 5.2516346, 2.3506057, 5.2324896, 2.361956)
(shape as GeneralPath).curveTo(5.2262406, 2.365952, 5.212821, 2.3754945, 5.2067056, 2.379704)
(shape as GeneralPath).curveTo(5.2005906, 2.3839133, 5.1868863, 2.3930414, 5.1809225, 2.3974514)
(shape as GeneralPath).curveTo(5.1634846, 2.411283, 5.119654, 2.435075, 5.103572, 2.4506953)
(shape as GeneralPath).curveTo(5.093151, 2.461503, 5.0794067, 2.5001342, 5.069584, 2.5117283)
(shape as GeneralPath).curveTo(5.0410094, 2.5476797, 4.9990687, 2.608651, 4.975823, 2.6515422)
(shape as GeneralPath).curveTo(4.9683685, 2.6662195, 4.948704, 2.6971397, 4.9418344, 2.7125752)
(shape as GeneralPath).curveTo(4.925393, 2.752103, 4.9042516, 2.8159978, 4.8914366, 2.860179)
(shape as GeneralPath).curveTo(4.886598, 2.8782182, 4.87929, 2.9279776, 4.8750267, 2.9467492)
(shape as GeneralPath).curveTo(4.871049, 2.9658837, 4.8620224, 3.0134604, 4.8586164, 3.0333192)
(shape as GeneralPath).curveTo(4.5074186, 5.307897, 7.7463174, 12.141716, 12.812121, 19.50113)
(shape as GeneralPath).curveTo(13.127326, 19.959047, 13.428214, 20.4121, 13.743778, 20.854607)
(shape as GeneralPath).closePath()
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_10
shape = GeneralPath()
(shape as GeneralPath).moveTo(6.2003446, 8.018811)
(shape as GeneralPath).lineTo(10.016292, 5.3921294)
(shape as GeneralPath).curveTo(7.991423, 3.1273553, 6.163735, 1.7285397, 5.1772695, 1.7848891)
(shape as GeneralPath).curveTo(5.1709747, 1.7853731, 5.1469803, 1.7864435, 5.1407557, 1.7870493)
(shape as GeneralPath).curveTo(5.1346025, 1.7877759, 5.1103263, 1.7883613, 5.104243, 1.7892089)
(shape as GeneralPath).curveTo(5.098231, 1.7901787, 5.0736694, 1.7902766, 5.0677285, 1.7913684)
(shape as GeneralPath).curveTo(5.032521, 1.7986523, 4.975711, 1.8194528, 4.943135, 1.8311831)
(shape as GeneralPath).curveTo(4.93778, 1.8332626, 4.922632, 1.8467262, 4.9173517, 1.8489307)
(shape as GeneralPath).curveTo(4.9121466, 1.85126, 4.885968, 1.8486359, 4.8808393, 1.8510911)
(shape as GeneralPath).curveTo(4.8757854, 1.8536721, 4.860033, 1.8661321, 4.8550553, 1.8688391)
(shape as GeneralPath).curveTo(4.850154, 1.8716723, 4.834096, 1.8836267, 4.8292723, 1.8865868)
(shape as GeneralPath).curveTo(4.8245244, 1.8896735, 4.8081584, 1.9011205, 4.8034887, 1.9043349)
(shape as GeneralPath).curveTo(4.798819, 1.9075493, 4.7822833, 1.9187498, 4.7777057, 1.9220825)
(shape as GeneralPath).curveTo(4.7732177, 1.9255319, 4.756318, 1.9362636, 4.7519217, 1.9398305)
(shape as GeneralPath).curveTo(4.747616, 1.9435138, 4.7303534, 1.9537793, 4.7261386, 1.9575782)
(shape as GeneralPath).curveTo(4.7220135, 1.961493, 4.7151184, 1.986883, 4.7110844, 1.9909135)
(shape as GeneralPath).curveTo(4.70714, 1.9950587, 4.6891556, 2.0044017, 4.6853013, 2.008661)
(shape as GeneralPath).curveTo(4.6627135, 2.0349023, 4.6230016, 2.080542, 4.603627, 2.1108296)
(shape as GeneralPath).curveTo(4.600487, 2.1159885, 4.5916266, 2.1388962, 4.5885744, 2.1441658)
(shape as GeneralPath).curveTo(4.585611, 2.1495457, 4.5763965, 2.1720133, 4.5735207, 2.177502)
(shape as GeneralPath).curveTo(4.570733, 2.1830995, 4.561167, 2.2051303, 4.5584674, 2.2108374)
(shape as GeneralPath).curveTo(4.1536427, 3.1121736, 4.807748, 5.3188167, 6.2003446, 8.018811)
(shape as GeneralPath).closePath()
paint = LinearGradientPaint(Point2D.Double(28.24468421936035, 60.44550323486328), Point2D.Double(28.24468421936035, 68.22488403320312), floatArrayOf(0.0f,0.31578946f,1.0f), arrayOf(Color(114, 159, 207, 255),Color(165, 191, 218, 255),Color(55, 108, 164, 255)), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(-0.4933040142059326f, -0.7166540026664734f, 0.7166540026664734f, -0.4933040142059326f, -9.267809867858887f, 79.41919708251953f))
g.paint = paint
g.fill(shape)
paint = Color(52, 101, 164, 255)
stroke = BasicStroke(0.9999997f,0,0,4.0f,null,0.0f)
shape = GeneralPath()
(shape as GeneralPath).moveTo(6.2003446, 8.018811)
(shape as GeneralPath).lineTo(10.016292, 5.3921294)
(shape as GeneralPath).curveTo(7.991423, 3.1273553, 6.163735, 1.7285397, 5.1772695, 1.7848891)
(shape as GeneralPath).curveTo(5.1709747, 1.7853731, 5.1469803, 1.7864435, 5.1407557, 1.7870493)
(shape as GeneralPath).curveTo(5.1346025, 1.7877759, 5.1103263, 1.7883613, 5.104243, 1.7892089)
(shape as GeneralPath).curveTo(5.098231, 1.7901787, 5.0736694, 1.7902766, 5.0677285, 1.7913684)
(shape as GeneralPath).curveTo(5.032521, 1.7986523, 4.975711, 1.8194528, 4.943135, 1.8311831)
(shape as GeneralPath).curveTo(4.93778, 1.8332626, 4.922632, 1.8467262, 4.9173517, 1.8489307)
(shape as GeneralPath).curveTo(4.9121466, 1.85126, 4.885968, 1.8486359, 4.8808393, 1.8510911)
(shape as GeneralPath).curveTo(4.8757854, 1.8536721, 4.860033, 1.8661321, 4.8550553, 1.8688391)
(shape as GeneralPath).curveTo(4.850154, 1.8716723, 4.834096, 1.8836267, 4.8292723, 1.8865868)
(shape as GeneralPath).curveTo(4.8245244, 1.8896735, 4.8081584, 1.9011205, 4.8034887, 1.9043349)
(shape as GeneralPath).curveTo(4.798819, 1.9075493, 4.7822833, 1.9187498, 4.7777057, 1.9220825)
(shape as GeneralPath).curveTo(4.7732177, 1.9255319, 4.756318, 1.9362636, 4.7519217, 1.9398305)
(shape as GeneralPath).curveTo(4.747616, 1.9435138, 4.7303534, 1.9537793, 4.7261386, 1.9575782)
(shape as GeneralPath).curveTo(4.7220135, 1.961493, 4.7151184, 1.986883, 4.7110844, 1.9909135)
(shape as GeneralPath).curveTo(4.70714, 1.9950587, 4.6891556, 2.0044017, 4.6853013, 2.008661)
(shape as GeneralPath).curveTo(4.6627135, 2.0349023, 4.6230016, 2.080542, 4.603627, 2.1108296)
(shape as GeneralPath).curveTo(4.600487, 2.1159885, 4.5916266, 2.1388962, 4.5885744, 2.1441658)
(shape as GeneralPath).curveTo(4.585611, 2.1495457, 4.5763965, 2.1720133, 4.5735207, 2.177502)
(shape as GeneralPath).curveTo(4.570733, 2.1830995, 4.561167, 2.2051303, 4.5584674, 2.2108374)
(shape as GeneralPath).curveTo(4.1536427, 3.1121736, 4.807748, 5.3188167, 6.2003446, 8.018811)
(shape as GeneralPath).closePath()
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 0.35714284f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_11
paint = LinearGradientPaint(Point2D.Double(55.87603759765625, 62.4019889831543), Point2D.Double(38.06135559082031, 62.827091217041016), floatArrayOf(0.0f,1.0f), arrayOf(Color(255, 255, 255, 255),Color(255, 255, 255, 0)), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(-0.4933040142059326f, -0.7166540026664734f, 0.7166540026664734f, -0.4933040142059326f, -9.267809867858887f, 79.41919708251953f))
stroke = BasicStroke(1.0f,1,1,4.0f,null,0.0f)
shape = GeneralPath()
(shape as GeneralPath).moveTo(15.417724, 21.244087)
(shape as GeneralPath).curveTo(15.60655, 21.511402, 15.795857, 21.760462, 15.983434, 22.02224)
(shape as GeneralPath).lineTo(19.733027, 19.438211)
(shape as GeneralPath).curveTo(19.219873, 18.65987, 18.496328, 17.390278, 17.956781, 16.581053)
(shape as GeneralPath).curveTo(11.744978, 7.264434, 5.6568522, 2.6091151, 5.40304, 2.7829475)
(shape as GeneralPath).curveTo(5.1238437, 2.974165, 7.567532, 10.260041, 13.900362, 19.06121)
(shape as GeneralPath).curveTo(14.272182, 19.577953, 15.059948, 20.737597, 15.417724, 21.244087)
(shape as GeneralPath).closePath()
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_12
shape = GeneralPath()
(shape as GeneralPath).moveTo(37.125, 20.0)
(shape as GeneralPath).lineTo(34.25, 41.375)
(shape as GeneralPath).curveTo(33.333332, 46.57216, 16.041668, 46.628963, 15.0, 41.375)
(shape as GeneralPath).lineTo(12.036612, 20.007584)
(shape as GeneralPath).curveTo(13.877231, 26.876867, 36.02941, 27.218151, 37.125, 20.0)
(shape as GeneralPath).closePath()
paint = LinearGradientPaint(Point2D.Double(15.375, 26.0846004486084), Point2D.Double(34.25041580200195, 26.0846004486084), floatArrayOf(0.0f,0.2631579f,0.7479224f,1.0f), arrayOf(Color(245, 245, 245, 23),Color(255, 255, 255, 230),Color(199, 199, 199, 117),Color(255, 255, 255, 199)), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 5.625f))
g.paint = paint
g.fill(shape)
paint = LinearGradientPaint(Point2D.Double(30.875, 19.4596004486084), Point2D.Double(15.625, 19.0846004486084), floatArrayOf(0.0f,0.5f,1.0f), arrayOf(Color(149, 151, 145, 255),Color(248, 248, 248, 255),Color(140, 140, 140, 255)), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 5.625f))
stroke = BasicStroke(1.0f,0,0,4.0f,null,0.0f)
shape = GeneralPath()
(shape as GeneralPath).moveTo(37.125, 20.0)
(shape as GeneralPath).lineTo(34.25, 41.375)
(shape as GeneralPath).curveTo(33.333332, 46.57216, 16.041668, 46.628963, 15.0, 41.375)
(shape as GeneralPath).lineTo(12.036612, 20.007584)
(shape as GeneralPath).curveTo(13.877231, 26.876867, 36.02941, 27.218151, 37.125, 20.0)
(shape as GeneralPath).closePath()
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 0.72527474f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_13
shape = GeneralPath()
(shape as GeneralPath).moveTo(40.48186, 2.524195)
(shape as GeneralPath).lineTo(35.708893, 7.3855543)
(shape as GeneralPath).lineTo(27.400389, 24.665476)
(shape as GeneralPath).lineTo(36.10664, 7.8716903)
(shape as GeneralPath).lineTo(40.48186, 2.524195)
(shape as GeneralPath).closePath()
paint = Color(255, 255, 255, 255)
g.paint = paint
g.fill(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 0.41758242f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_14
shape = GeneralPath()
(shape as GeneralPath).moveTo(40.34928, 2.524195)
(shape as GeneralPath).lineTo(39.465397, 9.24171)
(shape as GeneralPath).lineTo(32.70369, 23.64901)
(shape as GeneralPath).lineTo(39.244427, 9.1975155)
(shape as GeneralPath).lineTo(38.714096, 9.285904)
(shape as GeneralPath).lineTo(40.34928, 2.524195)
(shape as GeneralPath).closePath()
paint = Color(255, 255, 255, 255)
g.paint = paint
g.fill(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_15
shape = GeneralPath()
(shape as GeneralPath).moveTo(18.473166, 25.284195)
(shape as GeneralPath).lineTo(19.445436, 44.199303)
(shape as GeneralPath).lineTo(22.715805, 44.72963)
(shape as GeneralPath).lineTo(22.892582, 25.814526)
(shape as GeneralPath).lineTo(18.473166, 25.284195)
(shape as GeneralPath).closePath()
paint = LinearGradientPaint(Point2D.Double(20.06415557861328, 27.140348434448242), Point2D.Double(20.682872772216797, 44.11091232299805), floatArrayOf(0.0f,1.0f), arrayOf(Color(255, 255, 255, 255),Color(255, 255, 255, 0)), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
g.paint = paint
g.fill(shape)
g.transform = transformsStack.pop()
g.transform = transformsStack.pop()
g.transform = transformsStack.pop()
g.transform = transformsStack.pop()

}



	private fun innerPaint(g : Graphics2D) {
        var origAlpha = 1.0f
        val origComposite = g.composite
        if (origComposite is AlphaComposite) {
            if (origComposite.rule == AlphaComposite.SRC_OVER) {
                origAlpha = origComposite.alpha
            }
        }
        
	    _paint0(g, origAlpha)


	    shape = null
	    paint = null
	    stroke = null
	    clip = null
	}
	
    companion object {
        /**
         * Returns the X of the bounding box of the original SVG image.
         *
         * @return The X of the bounding box of the original SVG image.
         */
        fun getOrigX(): Double {
            return 1.2306827306747437
        }

        /**
         * Returns the Y of the bounding box of the original SVG image.
         *
         * @return The Y of the bounding box of the original SVG image.
         */
        fun getOrigY(): Double {
            return 0.0
        }

        /**
         * Returns the width of the bounding box of the original SVG image.
         *
         * @return The width of the bounding box of the original SVG image.
         */
        fun getOrigWidth(): Double {
            return 40.37824249267578
        }

        /**
         * Returns the height of the bounding box of the original SVG image.
         *
         * @return The height of the bounding box of the original SVG image.
         */
        fun getOrigHeight(): Double {
            return 47.78398895263672
        }

        /**
         * Returns a new instance of this icon with specified dimensions.
         *
         * @param width Required width of the icon
         * @param height Required height of the icon
         * @return A new instance of this icon with specified dimensions.
         */
        fun of(width: Int, height: Int): ResizableIcon {
            return Applications_office(width, height)
        }

        /**
         * Returns a new [UIResource] instance of this icon with specified dimensions.
         *
         * @param width Required width of the icon
         * @param height Required height of the icon
         * @return A new [UIResource] instance of this icon with specified dimensions.
         */
        fun uiResourceOf(width: Int, height: Int): ResizableIconUIResource {
            return ResizableIconUIResource(Applications_office(width, height))
        }

        /**
         * Returns a factory that returns instances of this icon on demand.
         *
         * @return Factory that returns instances of this icon on demand.
         */
        fun factory(): Factory {
            return Factory { Applications_office(getOrigWidth().toInt(), getOrigHeight().toInt()) }
        }
    }

    override fun getIconHeight(): Int {
        return width
    }

    override fun getIconWidth(): Int {
        return height
    }

    override fun setDimension(newDimension: Dimension) {
        width = newDimension.width
        height = newDimension.height
    }

    override fun paintIcon(c: Component?, g: Graphics, x: Int, y: Int) {
        val g2d = g.create() as Graphics2D
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON)
        g2d.setRenderingHint(RenderingHints.KEY_INTERPOLATION,
                RenderingHints.VALUE_INTERPOLATION_BICUBIC)
        g2d.translate(x, y)

        val coef1 = this.width.toDouble() / getOrigWidth()
        val coef2 = this.height.toDouble() / getOrigHeight()
        val coef = Math.min(coef1, coef2)
        g2d.clipRect(0, 0, this.width, this.height)
        g2d.scale(coef, coef)
        g2d.translate(-getOrigX(), -getOrigY())
        if (coef1 != coef2) {
            if (coef1 < coef2) {
                val extraDy = ((getOrigWidth() - getOrigHeight()) / 2.0).toInt()
                g2d.translate(0, extraDy)
            } else {
                val extraDx = ((getOrigHeight() - getOrigWidth()) / 2.0).toInt()
                g2d.translate(extraDx, 0)
            }
        }
        val g2ForInner = g2d.create() as Graphics2D
        innerPaint(g2ForInner)
        g2ForInner.dispose()
        g2d.dispose()
    }
}

