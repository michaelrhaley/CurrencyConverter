import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class CurrencyConversion 
{

	public static void main(String[] args) 
	{
		
		double usd = 0;
		double euro = 0;
		double yen = 0;
		String currency;
		String toCurrency;
		
		//format to decimal
		DecimalFormat df = new DecimalFormat("#,###,##0.00");
		
		// TODO Auto-generated method stub
		JOptionPane.showMessageDialog(null, "****Currency Conversion****");
//		euro = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter the amount in EURO "));
//		JOptionPane.showMessageDialog(null, "YEN: " + euroToYen(euro));
//		
		currency = JOptionPane.showInputDialog(null, "Enter the currency code you want to convert (USD, YEN, EURO)");
		toCurrency = JOptionPane.showInputDialog(null, "Enter the currency code you want to convert " + currency.toUpperCase() + " into... ");
		
		//convert from usd
		if(currency.toUpperCase().equals("USD"))
		{
			usd = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter the amount in USD "));
			if(toCurrency.toUpperCase().equals("YEN"))
			{
				JOptionPane.showMessageDialog(null, "Amount in YEN " + df.format(usdToYen(usd)));
			}
			else if(toCurrency.toUpperCase().equals("EURO"))
			{
				JOptionPane.showMessageDialog(null, "Amount in EURO " + df.format(usdToEuro(usd)));
			}
		}
//		else
//		{
//			JOptionPane.showMessageDialog(null, "Enter a valid currency and number");
//		}
		
		//convert from yen
		if(currency.toUpperCase().equals("YEN"))
		{
			yen = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter the amount in YEN "));
			if(toCurrency.toUpperCase().equals("USD"))
			{
				JOptionPane.showMessageDialog(null, "Amount in USD " + df.format(yenToUsd(yen)));
			}
			else if(toCurrency.toUpperCase().equals("EURO"))
			{
				JOptionPane.showMessageDialog(null, "Amount in EURO " + df.format(yenToEuro(yen)));
			}
		}
//		else
//		{
//			JOptionPane.showMessageDialog(null, "Enter a valid currency and number");
//		}
		
		//convert from euro
		if(currency.toUpperCase().equals("EURO"))
		{
			euro = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter the amount in EURO "));
			if(toCurrency.toUpperCase().equals("YEN"))
			{
				JOptionPane.showMessageDialog(null, "Amount in YEN " + df.format(euroToYen(euro)));
			}
			else if(toCurrency.toUpperCase().equals("USD"))
			{
				JOptionPane.showMessageDialog(null, "Amount in USD " + df.format(euroToUsd(euro)));
			}
		}
//		else
//		{
//			JOptionPane.showMessageDialog(null, "Enter a valid currency and number");
//		}
		
		
		
		
		
		
	}//end main
	
	public static double euroToYen(double euro)
	{
		double yen;
		yen = euro * 136.08;
		return yen;
	}
	
	public static double euroToUsd(double euro)
	{
		double usd;
		usd = euro * 1.11;
		
		return usd;
	}
	
	public static double yenToUsd(double yen)
	{
		double usd;
		usd = yen * .0081;
		
		return usd;
	}
	
	public static double yenToEuro(double yen)
	{
		double euro;
		euro = yen * .0073;
		
		return euro;
	}
	
	public static double usdToYen(double usd)
	{
		double yen;
		yen = usd * 123.14;
		
		return yen;
	}
	
	public static double usdToEuro(double usd)
	{
		double euro;
		euro = usd * .90;
		
		return euro;
	}

	
	
	

}//end class
