package sv.edu.udb.controller;

import org.springframework.web.bind.annotation.*;
import sv.edu.udb.service.InvoiceService;
import sv.edu.udb.repository.domain.Invoice;
import sv.edu.udb.controller.response.InvoiceResponse;

@RestController
@RequestMapping("/invoices")
public class InvoiceController {

    private final InvoiceService invoiceService;

    public InvoiceController(InvoiceService invoiceService) {
        this.invoiceService = invoiceService;
    }

    @PostMapping("/client/{clientId}")
    public InvoiceResponse createInvoice(
            @PathVariable Long clientId,
            @RequestParam String description,
            @RequestParam Double baseAmount) {

        Invoice invoice = invoiceService.crearFactura(clientId, description, baseAmount);

        if (invoice == null) {
            return null;
        }

        InvoiceResponse response = new InvoiceResponse();
        response.setId(invoice.getId());
        response.setDescription(invoice.getDescription());
        response.setBaseAmount(invoice.getBaseAmount());
        response.setTaxAmount(invoice.getTaxAmount());
        response.setTotalAmount(invoice.getTotalAmount());
        response.setInvoiceDate(invoice.getInvoiceDate().toString());
        response.setClientName(invoice.getClient().getName());

        return response;
    }
}
