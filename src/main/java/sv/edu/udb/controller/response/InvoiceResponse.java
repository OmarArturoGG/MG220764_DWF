package sv.edu.udb.controller.response;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class InvoiceResponse {
    private Long id;
    private String description;
    private Double baseAmount;
    private Double taxAmount;
    private Double totalAmount;
    private String invoiceDate;
    private String clientName;
}