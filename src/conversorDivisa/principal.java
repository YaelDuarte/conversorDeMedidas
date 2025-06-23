package conversorDivisa;

import javax.swing.UIManager;

public class principal {
	public static void main(String[] args) {
		try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception ignored) {}
        new ConversionGUI();
	}
}
