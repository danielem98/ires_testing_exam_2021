package it.euris.ires.business;

import it.euris.ires.dataObject.*;
import it.euris.ires.entity.PaySession;
import it.euris.ires.service.IPaymentSessionService;
import it.euris.ires.util.PaySessionStatus;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;


import static org.mockito.ArgumentMatchers.any;

@ExtendWith(MockitoExtension.class)
class PaySessionBusinessTest {

    PaySessionBusiness paySessionBusiness;

    @Mock
    IPaymentSessionService paymentSessionService;

    @BeforeEach
    void setUp() { this.paySessionBusiness = new PaySessionBusiness(paymentSessionService);
    }

    @Test
    @DisplayName("GIVEN PaySession WHEN create paySessionBusiness THEN return correct response")
    void createPaySession() {
        CreatePaySessionRequest sessionRequest = new CreatePaySessionRequest();
        PaySession paySession = new PaySession();
        paySession.setStatus(PaySessionStatus.CREATED);
        CreatePaySessionResponse expectResponse = new CreatePaySessionResponse();

        paySessionBusiness = new PaySessionBusiness(paymentSessionService);

        Mockito.when(paySessionBusiness.createPaySession(any())).thenReturn(expectResponse);
    }

    @Test
    void getPaySession() {
    }
}