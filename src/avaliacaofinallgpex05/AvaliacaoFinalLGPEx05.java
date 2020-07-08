package avaliacaofinallgpex05;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

/**
 * @author Erik
 */
public class AvaliacaoFinalLGPEx05 {
    public static void main(String[] args) {
        int r;
        double P, pi, A, D;
        DecimalFormat f = new DecimalFormat("0.0");
        
        pi = 3.14;
        r = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor para R (raio):"));
        
        P = (2 * pi) * r;
        A = pi * Math.pow(r,2);
        D = 2 * r;
        
        JOptionPane.showMessageDialog(null, "O valor escolhido para o raio é de: "+r
                +"\n---------------------------------------------\n "
                + "O valor do Perímetro é: "+f.format(P)
                +"\n A área do círculo é de: "+f.format(A)
                +"\n O diâmetro é de: "+f.format(D));
    }
    
}
