package java.pos.devices.input;

import java.pos.listeners.BarcodeScanListener;

/**
 * OK
 * Wzorzec projektowy dekorator
 */
public class BarcodeScannerAdapter implements BarcodeScanner {

    private BarcodeScanner barcodeScanner;

	private BarcodeScanListener barcodeScanListener;

    public BarcodeScannerAdapter(BarcodeScanner barcodeScanner, BarcodeScanListener barcodeScanListener){
        this.barcodeScanner=barcodeScanner;
		this.barcodeScanListener = barcodeScanListener;
    }

    @Override
    public String readBarcode() {
        String barcode = barcodeScanner.readBarcode();
		barcodeScanListener.onBarcodeScan(barcode);
        return barcode;
    }

}