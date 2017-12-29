package com.kairala.course.services;

import com.kairala.course.models.Entrada;
import com.kairala.course.repositories.EntradaRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import static org.mockito.Mockito.*;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class FinancasServiceTest {

    @Mock
    private EntradaRepository entradaRepository;

    @InjectMocks
    private FinancasService financasService;

    @Test
    public void testSalvarEntrada() {
        Entrada entrada = new Entrada();
        financasService.salvarEntrada(entrada);

        verify(entradaRepository, times(1)).save(entrada);
    }
}
