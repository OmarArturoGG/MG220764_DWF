package sv.edu.udb.service;

import org.springframework.stereotype.Service;
import sv.edu.udb.repository.InvoiceRepository;
import sv.edu.udb.repository.domain.Invoice;
import sv.edu.udb.repository.domain.Client;
import sv.edu.udb.repository.ClientRepository;
import java.time.LocalDate;


@Service
public class InvoiceService {

    private final InvoiceRepository invoiceRepository;
    private final ClientRepository clientRepository;

    public InvoiceService(InvoiceRepository invoiceRepository, ClientRepository clientRepository) {
        this.invoiceRepository = invoiceRepository;
        this.clientRepository = clientRepository;
    }

    public Invoice crearFactura(Long clientId, String description, Double baseAmount) {
        Client client = clientRepository.findById(clientId).orElse(null);

        if (client == null) {
            return null;
        }

        Double taxAmount = baseAmount * 0.13;
        Double totalAmount = baseAmount + taxAmount;

        Invoice invoice = new Invoice();
        invoice.setDescription(description);
        invoice.setBaseAmount(baseAmount);
        invoice.setTaxAmount(taxAmount);
        invoice.setTotalAmount(totalAmount);
        invoice.setInvoiceDate(LocalDate.now());
        invoice.setClient(client);

        return invoiceRepository.save(invoice);
    }
}