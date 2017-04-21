package java.pos.listeners;

/**
 * OK
 * Reakcja na jakieś zdarzenie (on scan) - na zeskanowanie kodu
 *
 * ale może to być też kontroler
 */
public interface BarcodeScanListener {

	void onBarcodeScan(String barcode);

}
