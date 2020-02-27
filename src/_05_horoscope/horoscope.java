package _05_horoscope;

import javax.swing.JOptionPane;

public class horoscope {
public static void main(String[] args) {
String horoscope = JOptionPane.showInputDialog("What is your star sign!");
if (horoscope.equals ("Aries")) {
JOptionPane.showMessageDialog(null, "Your horoscope means courageous, energetic, willful, commanding, leading. Often leads when following would be best course of action.");
}
if (horoscope.equals ("Taurus")) {
JOptionPane.showMessageDialog(null, "Your horoscope means pleasure seeking, loves control, dependable, grounded, provokes slowly, and highly sensual in nature.");
}
if (horoscope.equals ("Gemini")) {
JOptionPane.showMessageDialog(null, "Your horoscope means cerebral, chatty, loves learning and education, charming, and adventurous.");
}	
if (horoscope.equals ("Cancer")) {
JOptionPane.showMessageDialog(null, "Your horoscope means emotional, group oriented, seeks security, family.");
}	
if (horoscope.equals ("Leo")) {
JOptionPane.showMessageDialog(null, "Your horoscope means generous, organized, protective, beautiful.");
}	
if (horoscope.equals ("Virgo")) {
JOptionPane.showMessageDialog(null, "Your horoscope means particular, logical, practical, sense of duty, critical.");
}	
if (horoscope.equals ("Libra")) {
JOptionPane.showMessageDialog(null, "Your horoscope means balanced, seeks beauty, sense of justice.");
}	
if (horoscope.equals ("Scorpia")) {
JOptionPane.showMessageDialog(null, "Your horoscope means passionate, exacting, loves extremes, combative, reflective.");
}
if (horoscope.equals ("Sagittarius")) {
JOptionPane.showMessageDialog(null, "Your horoscope means happy, absent minded, creative, adventurous.");
}	
if (horoscope.equals ("Capricorn")) {
JOptionPane.showMessageDialog(null, "Your horoscope means timeless, driven, calculating, ambitious.");
}	
if (horoscope.equals ("Aquarius")) {
JOptionPane.showMessageDialog(null, "Your horoscope means forward thinking, communicative, people oriented, stubborn, generous, and dedicated.");
}	
if (horoscope.equals ("Pisces")) {
JOptionPane.showMessageDialog(null, "Your horoscope means likeable, energetic, passionate, sensitive.");
}	else {
	JOptionPane.showMessageDialog(null, "That is not a star sign!");
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
