package pl.rojek.inheritance;

import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Parent_Inheritance {
	
	public JFrame frame;
	
	public double Apple;
	public double Banana;
	public double Cherry;
	public double Grape;
	public double Mango;
	public double Orange;
	
	public double Syrah;
	public double Merlot;
	public double Riesling;
	public double Pinot;
	public double Chardonnay;
	public double Sauvignon;
	
	public double MilkShake;
	public double VanillaCone;
	public double ClasVanilla;
	public double VanillaMilkShake;
	public double ChocMilkShake;
	public double StrawMilkShake;
	
	public double pApple = 1.20;
	public double pBanana =2.12;
	public double pCherry = 2.50;
	public double pGrape = 2.30;
	public double pMango = 1.89;
	public double pOrange = 1.78;
	
	public double pSyrah = 9.50;
	public double pMerlot= 7.90;
	public double pRiesling= 7.00;
	public double pPinot= 7.50;
	public double pChardonnay =8.70;
	public double pSauvignon = 9.30;
	
	public double pMilkShake = 1.59;
	public double pVanillaCone = 1.94;
	public double pClasVanilla = 2.09;
	public double pVanillaMilkShake = 2.90;
	public double pChocMilkShake = 2.00;
	public double pStrawMilkShake = 3.10;

	
	public double TaxCost;
	public double itemscost1;
	public double itemscost2;
	public double itemscost3;
	public double itemscost4;
	
	public double GetAmount() {
		itemscost1 = Apple + Banana + Cherry + Grape + Mango + Orange;
		itemscost2 = Syrah + Merlot + Riesling + Pinot + Chardonnay + Sauvignon;
		itemscost3 = MilkShake + VanillaCone + ClasVanilla + VanillaMilkShake + ChocMilkShake + StrawMilkShake;
		itemscost4 = itemscost1 + itemscost2 + itemscost3;
		
		return itemscost4;
	}
	
	
	public void iExitSystem() {	
		frame = new JFrame();
		
		if(JOptionPane.showConfirmDialog(frame, "Confirm if u wont to exit", "OO_Inheritance",
				JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION) {
			System.exit(0);
		}
	}
	
	// Tax Calculation
	public double mcTax = 0.99;
	
	public Double cFindTax(double cAmount) {
		double  FindTax = cAmount - (cAmount * mcTax);
		return (FindTax);
	}
	
	// Tax Calculation
	public double GetTax() {
		TaxCost = cFindTax(itemscost4);
		return(TaxCost);
	}
	
	
	// Numbers Only
	public void NumberOnly (java.awt.event.KeyEvent evt) {
		char iNumber = evt.getKeyChar();
		if(!Character.isDigit(iNumber) || (iNumber == KeyEvent.VK_DELETE) || (iNumber == KeyEvent.VK_BACK_SPACE)) {
			evt.consume();
		}
	}
	
	
}
