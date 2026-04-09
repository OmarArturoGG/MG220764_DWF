package sv.edu.udb.service;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import sv.edu.udb.repository.ClientRepository;
import sv.edu.udb.repository.InvoiceRepository;
import sv.edu.udb.repository.domain.Client;
import sv.edu.udb.repository.domain.Invoice;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class InvoiceServiceTest {

    @Mock
    private ClientRepository clientRepository;

    @Mock
    private InvoiceRepository invoiceRepository;

    @InjectMocks
    private InvoiceService invoiceService;

    @Test
    void testCalcularImpuesto() {
        Client client = new Client();
        client.setId(1L);

        when(clientRepository.findById(1L)).thenReturn(Optional.of(client));

        when(invoiceRepository.save(any(Invoice.class))).thenAnswer(inv -> inv.getArgument(0));


        Invoice factura = invoiceService.crearFactura(1L, "Compra", 100.0);

        assertEquals(13.0, factura.getTaxAmount());
        assertEquals(113.0, factura.getTotalAmount());
    }
}