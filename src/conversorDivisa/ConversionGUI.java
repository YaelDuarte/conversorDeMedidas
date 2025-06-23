package conversorDivisa;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

@SuppressWarnings("serial")
public class ConversionGUI extends JFrame {
    private JTextField campoValor;
    private JComboBox<String> comboConversion;
    private JLabel resultado;

    public ConversionGUI() {
        setTitle("Conversor de Unidades");
        setSize(400, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        add(new JLabel("Valor a convertir:"));
        campoValor = new JTextField(10);
        add(campoValor);

        comboConversion = new JComboBox<>(new String[] {
            "D�lar a Peso",
            "Peso a D�lar",
            "Kg a Libras",
            "Libras a Kg",
            "Metros a Kil�metros",
            "Celsius a Fahrenheit",
            "Fahrenheit a Celsius"
        });
        add(comboConversion);

        JButton botonConvertir = new JButton("Convertir");
        add(botonConvertir);

        resultado = new JLabel("Resultado: ");
        add(resultado);

        // Acci�n al presionar el bot�n
        botonConvertir.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                convertir();
            }
        });

        setVisible(true);
    }

    private void convertir() {
        try {
            double valor = Double.parseDouble(campoValor.getText());
            double conversion = 0;
            String tipo = (String) comboConversion.getSelectedItem();

            switch (tipo) {
                case "D�lar a Peso":
                    conversion = metodosConversion.DolarAPeso(valor);
                    break;
                case "Peso a D�lar":
                    conversion = metodosConversion.PesoADolar(valor );
                    break;
                case "Kg a Libras":
                    conversion = metodosConversion.KgALibras(valor);
                    break;
                case "Libras a Kg":
                    conversion = metodosConversion.LibrasAKG(valor );
                    break;
                case "Metros a Kil�metros":
                    conversion = metodosConversion.MetrosAKilo(valor);
                    break;
                case "Celsius a Fahrenheit":
                    conversion = metodosConversion.CentrigradosAFare(valor);
                    break;
                case "Fahrenheit a Celsius":
                    conversion = metodosConversion.FareACentigrados(valor);
                    break;
            }

            resultado.setText("Resultado: " + String.format("%.2f", conversion));

        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Ingresa un n�mero v�lido", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}


