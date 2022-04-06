package decorator.clase.decorator;

import decorator.clase.bilete.PrinterBilet;

public class PrinterMesajPaste extends Decorator{
    public PrinterMesajPaste(PrinterBilet printerBilet) {
        super(printerBilet);
    }

    @Override
    public void afiseazaVerso() {
        System.out.println("Paste Fericit!");
        System.out.println("Am desenat si un iepuras cu un cos de oua!");
    }
}
