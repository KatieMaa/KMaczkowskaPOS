package java.pos.devices.output;

/**
 * Display i Printer to może być jeden interfejs do wyświetlania wiadomości
 *
 * LCSImpl i PrinterImpl - klasy, które obbsługują wyświetlacz lub drukarkę
 */
public interface Display {

    void showMessage(String message);
}
