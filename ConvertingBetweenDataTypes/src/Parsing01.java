public class Parsing01 {
    public static void main(String[] args) {
        //Declare and intitialize 3 Strings: shirtPrice, taxRate, and gibberish
        String shirtPrice = "15";
        String taxRate = "0.05";
        String gibberish = "887ds7nds87dsfs";
        
        //Parse shirtPrice and taxRate, and print the total tax
        double parsedShirtPrice = Integer.parseInt(shirtPrice);
        double parsedTaxRate = Double.parseDouble(taxRate);
        double totalTax = parsedShirtPrice * parsedTaxRate;
        System.out.println("The tota ltax is: "+ totalTax);
        
        //Try to parse taxRate as an int
        int parsedTaxRateDois = Integer.parseInt(taxRate);
        System.out.print("The parsed taxRate is: "+ parsedTaxRate);
        //Try to parse gibberish as an int
        int parsedGibberish = Integer.parseInt(gibberish);
        System.out.println("The parsed gibberish is: "+ parsedGibberish);
        
        
    }
    
}
