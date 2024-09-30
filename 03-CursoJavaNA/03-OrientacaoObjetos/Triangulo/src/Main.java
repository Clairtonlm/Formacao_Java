import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Cálculo de Área de Triângulos");
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        // Triângulo X
        JLabel labelX = new JLabel("Triângulo X:");
        labelX.setBounds(20, 20, 100, 25);
        frame.add(labelX);

        JLabel lado1XLabel = new JLabel("Lado 1:");
        lado1XLabel.setBounds(20, 50, 100, 25);
        frame.add(lado1XLabel);
        JTextField lado1XField = new JTextField();
        lado1XField.setBounds(120, 50, 100, 25);
        frame.add(lado1XField);

        JLabel lado2XLabel = new JLabel("Lado 2:");
        lado2XLabel.setBounds(20, 80, 100, 25);
        frame.add(lado2XLabel);
        JTextField lado2XField = new JTextField();
        lado2XField.setBounds(120, 80, 100, 25);
        frame.add(lado2XField);

        JLabel lado3XLabel = new JLabel("Lado 3:");
        lado3XLabel.setBounds(20, 110, 100, 25);
        frame.add(lado3XLabel);
        JTextField lado3XField = new JTextField();
        lado3XField.setBounds(120, 110, 100, 25);
        frame.add(lado3XField);

        // Triângulo Y
        JLabel labelY = new JLabel("Triângulo Y:");
        labelY.setBounds(20, 150, 100, 25);
        frame.add(labelY);

        JLabel lado1YLabel = new JLabel("Lado 1:");
        lado1YLabel.setBounds(20, 180, 100, 25);
        frame.add(lado1YLabel);
        JTextField lado1YField = new JTextField();
        lado1YField.setBounds(120, 180, 100, 25);
        frame.add(lado1YField);

        JLabel lado2YLabel = new JLabel("Lado 2:");
        lado2YLabel.setBounds(20, 210, 100, 25);
        frame.add(lado2YLabel);
        JTextField lado2YField = new JTextField();
        lado2YField.setBounds(120, 210, 100, 25);
        frame.add(lado2YField);

        JLabel lado3YLabel = new JLabel("Lado 3:");
        lado3YLabel.setBounds(20, 240, 100, 25);
        frame.add(lado3YLabel);
        JTextField lado3YField = new JTextField();
        lado3YField.setBounds(120, 240, 100, 25);
        frame.add(lado3YField);

        // Botão Calcular
        JButton calcularButton = new JButton("Calcular Áreas");
        calcularButton.setBounds(20, 280, 200, 30);
        frame.add(calcularButton);

        // Resultado
        JTextArea resultadoArea = new JTextArea();
        resultadoArea.setBounds(20, 320, 350, 100);
        resultadoArea.setEditable(false);
        frame.add(resultadoArea);

        // Ação do botão
        calcularButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    // Lados do triângulo X
                    Triangulo x = new Triangulo();
                    x.lado1 = Double.parseDouble(lado1XField.getText());
                    x.lado2 = Double.parseDouble(lado2XField.getText());
                    x.lado3 = Double.parseDouble(lado3XField.getText());

                    // Lados do triângulo Y
                    Triangulo y = new Triangulo();
                    y.lado1 = Double.parseDouble(lado1YField.getText());
                    y.lado2 = Double.parseDouble(lado2YField.getText());
                    y.lado3 = Double.parseDouble(lado3YField.getText());

                    // Cálculo das áreas
                    double areaX = x.area();
                    double areaY = y.area();

                    // Exibir resultados
                    String resultado = "A área do triângulo X é: " + areaX + "\n";
                    resultado += "A área do triângulo Y é: " + areaY + "\n";

                    if (areaX > areaY) {
                        resultado += "O triângulo X é maior.";
                    } else if (areaY > areaX) {
                        resultado += "O triângulo Y é maior.";
                    } else {
                        resultado += "Os triângulos têm a mesma área.";
                    }

                    resultadoArea.setText(resultado);
                } catch (NumberFormatException ex) {
                    resultadoArea.setText("Por favor, insira valores válidos.");
                }
            }
        });

        frame.setVisible(true);
    }
}
