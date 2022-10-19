import javax.swing.JOptionPane;
import java.util.Scanner;
public class CarlysEventPrice
{
    public static void main(String[] args)
    {
        int numarInvitati, pretTotal, pretOaspete;
        String carlysMotto = "* Carly’s makes the food that makes it a party. *";
        JOptionPane.showMessageDialog(null,"" + carlysMotto);
        Scanner inputDevice = new Scanner(System.in);
        System.out.print("Introduceti  nr de invitati >>>");
        numarInvitati = inputDevice.nextInt();
        pretOaspete = 35;
        pretTotal = numarInvitati * pretOaspete;
        boolean evenimentMare = numarInvitati >= 50;
        System.out.println("Nr invitatiilor este : " + numarInvitati);
        System.out.println("Pretul pentru  oaspete este : " + pretOaspete);
        System.out.println("Pretul total este de: " + pretTotal);
        System.out.println("Este un eveniment mare? " + evenimentMare);
    }
}